package com.blurple.models;

import com.blurple.models.Course;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
public class QAUser {
  @Id public Long id;

  public String firstName;
  public String lastName;
  public boolean isProfessor;
  public Set<Course> courses;
  public List<Post> posts;


  public QAUser() {
    
  }

  public Long getId() {
    return id;
  }

  public Set<Course> getCourses() {
    return courses;
  }

}
