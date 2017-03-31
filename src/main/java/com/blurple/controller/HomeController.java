package com.blurple.controller;

import com.blurple.models.QAUser;
import com.blurple.models.Course;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.json.*;
import org.json.JSONException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.SessionAttributes;
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

@Controller
@SessionAttributes("sess")
public class HomeController {

  @RequestMapping("/landing")
  public ModelAndView loadLandingPage() {
    ModelAndView mv = new ModelAndView("landing");
    return mv;
  }

  @RequestMapping("/home")
  public ModelAndView loadHomePage() {
    // add params and checks for login. otherwise, redirect back to landing page
    // create a session upon login
    ModelAndView mv = new ModelAndView("home");

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