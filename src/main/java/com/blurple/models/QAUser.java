package com.blurple.models;

import com.blurple.models.Course;
import com.blurple.models.Question;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

@Entity
public class QAUser {
  @Id public Long id;

  public String firstName;
  public String lastName;
  public String email;
  public boolean isProfessor;
  public HashSet<Course> courses;
  public List<Question> questions;

  public QAUser() {
    courses = new HashSet<Course>();
    questions = new ArrayList<Question>();
  }

  public QAUser(String firstName, String lastName, boolean isProfessor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.isProfessor = isProfessor;
    this.courses = new HashSet<Course>();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName() {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName() {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void seEmail(String email) {
    this.email = email;
  }

  public boolean isProfessor() {
    return isProfessor;
  }

  public HashSet<Course> getCourses() {
    return courses;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public void removeCourse(Course course) {
    courses.remove(course);
  };

  public void removeAllCourses() {
    courses.clear();
  }

  public Long getId() {
    return id;
  }

}
