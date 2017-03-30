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
import java.util.ArrayList;

@Entity
public class User {
  @Id public Long id;

  public String firstName;
  public String lastName;
  public String email;
  public boolean isProfessor;
  public List<Course> courses;
  public List<Post> posts;
  public List<Reply> replies;


  public User() {
    this.courses = new ArrayList<Course>();
    this.posts = new ArrayList<Post>();
  }

  public User(String firstName, String lastName, boolean isProfessor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.isProfessor = isProfessor;
    this.courses = new ArrayList<Course>();
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

  public List<Course> getCourses() {
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

  public List<Post> getPosts() {
    return posts;
  }

  public void addPost(Post post) {
    posts.add(post);
  }

  public void removePost(Post post) {
    posts.remove(post);
  }

  public void removeAllPosts() {
    posts.clear();
  }

  public List<Reply> getReplies() {
    return replies;
  }

  public void addReply(Reply reply) {
    replies.add(reply);
  }

  public void removeReply(Reply reply) {
    replies.remove(reply);
  }

  public void removeAllReplies() {
    replies.clear();
  }

  public Long getId() {
    return id;
  }

}
