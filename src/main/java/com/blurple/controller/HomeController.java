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
  public QAUser getInitializeSessionUser() {
    return new QAUser("default", "default", "default", false);
  }

  @RequestMapping("/landing")
  public ModelAndView loadLandingPage(SessionStatus sessionStatus) {
    sessionStatus.setComplete();
    ModelAndView mv = new ModelAndView("landing");
    return mv;
  }

  @RequestMapping("/home")
  public ModelAndView loadHomePage(
          @RequestParam(value="firstName", required=false) String firstName,
          @RequestParam(value="lastName", required=false) String lastName,
          @RequestParam(value="email", required=false) String email,
          @ModelAttribute("sessionUser") QAUser sessionUser,
          SessionStatus sessionStatus) {

    // Accessing home without logging in first redirects to landing page
    if (firstName == null && lastName == null && email == null && sessionUser.getFirstName().equals("default")) {
      return loadLandingPage(sessionStatus);
    }

    // add params and checks for login. otherwise, redirect back to landing page
    // create a session upon login
    ModelAndView mv = new ModelAndView("home");
    if (firstName != null && lastName != null && email != null) {
      //if sesionUser's id already exists, do nothing?
      //else set new sessionUser values

      // Set sessionUser params from google login
      sessionUser.setFirstName(firstName);
      sessionUser.setLastName(lastName);
      sessionUser.setEmail(email);
      // Add sessionUser session attribute to mv
      mv.addObject("sessionUser", sessionUser);

    }

    // userid should be a long
    String userId = "kevin";
    QAUser userObj = ObjectifyService.ofy().load().type(QAUser.class).id(userId).now();

    // load up all user information
    // might need to parse to json
    if (userObj != null) {
      Set<Course> courses = userObj.getCourses();
      mv.addObject("enrolledCourses", courses);
    } else {
      // add an error message here
    }

    return mv;

  }

  @RequestMapping("/addCourse")
  public ModelAndView addCourse() {

    ModelAndView mv = new ModelAndView("home");

    // load up user from session
    // userid should be a long
    String userId = "kevin";
    QAUser userObj = ObjectifyService.ofy().load().type(QAUser.class).id(userId).now();

    // course id should be a parameter
    long courseId = 1234;
    Course addThisCourse = ObjectifyService.ofy().load().type(Course.class).id(courseId).now();

    // check to see if valid course
    if (addThisCourse != null) {
      if (userObj != null) {
        userObj.addCourse(addThisCourse);
        Set<Course> courses = userObj.getCourses();
        mv.addObject("enrolledCourses", courses);

        // will this create a duplicate?
        ObjectifyService.ofy().save().entity(userObj).now();

      } else {
        // add an error message for invalid user?
      }

    } else {
      // add an error message here for invalid course
    }

    return mv;

  }

  @RequestMapping("/createCourse")
  public ModelAndView createCourse() {

    ModelAndView mv = new ModelAndView("home");

    // load up user from session
    // userid should be a long
    String userId = "kevin";
    QAUser userObj = ObjectifyService.ofy().load().type(QAUser.class).id(userId).now();

    if (userObj != null && userObj.isProfessor()) {
      Course createThisCourse = new Course();
      // get parameters from request for this course;
      ObjectifyService.ofy().save().entity(createThisCourse).now();

      // do we add this to professor's enrolled courses?
      userObj.addCourse(createThisCourse);
      ObjectifyService.ofy().save().entity(userObj).now();
      Set<Course> courses = userObj.getCourses();
      mv.addObject("enrolledCourses", courses);

    } else {
      // add an error message here for not being a professor
    }

    return mv;

  }
}