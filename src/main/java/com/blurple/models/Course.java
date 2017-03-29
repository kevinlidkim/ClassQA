package com.blurple.models;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.lang.String;
import java.util.Date;
import java.util.List;


@Entity
public class Course {
  @Id public Long id;

  public String courseCode;
  public String department;
  public Date startDate;
  public Date endDate;

  public Course() {
    
  }

  public Long getId() {
    return id;
  }

}
