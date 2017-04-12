package com.blurple.controller;

import com.blurple.models.QAUser;
import com.blurple.models.Course;
import com.blurple.models.Question;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.json.*;
import org.json.JSONException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
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
public class CourseController {

  @RequestMapping("/course")
  public ModelAndView loadCoursePage() {

    ModelAndView mv = new ModelAndView("course");

    return mv;
  }

  @RequestMapping("/loadCourse")
  public ModelAndView loadCourseInfo(
    @RequestBody String input) throws Exception {

    JSONObject request = new JSONObject(input);
    String courseIdString = request.getString("courseId");

    Long courseId = Long.parseLong(courseIdString);

    ModelAndView mv = new ModelAndView("course");

    // load up the course
    Course loadThisCourse = ObjectifyService.ofy().load().type(Course.class).id(courseId).now();

    if (loadThisCourse != null) {
      System.out.println("Successfully loaded course");
      mv.addObject("courseInfo", loadThisCourse);
    } else {
      System.out.println("Failed to load course");
      // return error
    }

    // added questions field to course so its easier for us to load it
    // we probably don't need the questions field inside QAUser then

    return mv;
  }
}
