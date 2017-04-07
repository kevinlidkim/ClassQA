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
public class QAController {

  @RequestMapping("/question/{questionId}")
  public ModelAndView loadQAPage(
    @PathVariable long questionId) {

    ModelAndView mv = new ModelAndView("course");

    // load up the course
    Question loadThisQuestion = ObjectifyService.ofy().load().type(Question.class).id(questionId).now();

    if (loadThisQuestion != null) {
      mv.addObject("questionInfo", loadThisQuestion);
    } else {
      // return error
    }

    // added questions field to course so its easier for us to load it
    // we probably don't need the questions field inside QAUser then

    return mv;
  }

  @RequestMapping("/question")
  public ModelAndView loadQA1Page() {

    ModelAndView mv = new ModelAndView("qa");

    // load up the course


    // added questions field to course so its easier for us to load it
    // we probably don't need the questions field inside QAUser then

    return mv;
  }
}
