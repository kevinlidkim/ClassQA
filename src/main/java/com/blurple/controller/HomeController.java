package com.blurple.controller;

import com.blurple.models.QAUser;
import com.blurple.models.Course;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.json.*;
import org.json.JSONException;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("sessionUser")
public class HomeController {

  @ModelAttribute("sessionUser")
  public String getInitializeSessionUser() {
    String sessionUser = "default";
    return sessionUser;
  }

  @RequestMapping("/landing")
  public ModelAndView loadLandingPage() {
    ModelAndView mv = new ModelAndView("landing");
    return mv;
  }

  @RequestMapping("/home")
  public ModelAndView loadHomePage(
          @RequestParam(value="user", required=false) String user,
          @RequestParam(value="email", required=false) String email,
          HttpServletRequest request) {

    System.out.println(request.getSession().getAttributeNames());
    System.out.println(request.getSession().getAttribute("sessionUser"));
    request.getSession().setAttribute("sessionUser", user);
    System.out.println(request.getSession().getAttribute("sessionUser"));

//    if (user == null && email == null) {
//      return loadLandingPage();
//    }

//    if(session.getAttribute("sessionUser") == null) {
//      session.setAttribute("sessionUser", user);
//    }

    // add params and checks for login. otherwise, redirect back to landing page
    // create a session upon login
    ModelAndView mv = new ModelAndView("home");
    //mv.addObject("sessionUser", user);

    String userId = "kevin";
    QAUser userObj = ObjectifyService.ofy().load().type(QAUser.class).id(userId).now();

    // load up all user information
    // might need to parse to json
    if (userObj != null) {
      Set<Course> courses = userObj.getCourses();
      mv.addObject("enrolledCourses", courses);
    }

    return mv;

  }
}