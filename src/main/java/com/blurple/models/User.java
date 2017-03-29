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


@Entity
public class User {
  @Id public Long id;

  public String firstName;
  public String lastName;
  public boolean isProfessor;
  public List<Course> courses;
  public List<Post> posts;


  public User() {
    
  }

  public Long getId() {
    return id;
  }

}
