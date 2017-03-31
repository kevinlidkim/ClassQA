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
  public String courseName;
  public String department;
  public Date startDate;
  public Date endDate;

  public Course() {
    
  }

  public Course(String courseCode, String department, Date startDate, Date endDate) {
    this.courseCode = courseCode;
    this.department = department;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode() {
    this.courseCode = courseCode;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName() {
    this.courseCode = courseName;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Long getId() {
    return id;
  }

}
