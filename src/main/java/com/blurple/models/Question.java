package com.blurple.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


@Entity
public class Question {
  @Id public Long id;

  public Long courseId;
  public Long userId;
  public String content;
  public List<Answer> answers;
  public Date dateTime;


  public Question() {
    dateTime = new Date();
    answers = new ArrayList<Answer>();
  }

  public Question(Long courseId, Long userId, String content) {
    this.courseId = courseId;
    this.userId = userId;
    this.content = content;
    this.dateTime = new Date();
    answers = new ArrayList<Answer>();
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void addAnswer(Answer answer) {
    answers.add(answer);
  }

  public void removeAnswer(Answer answer) {
    answers.remove(answer);
  }

  public void removeAllAnswers() {
    answers.clear();
  }

  public String getDateTime() {
    return dateTime.toString();
  }

  public Long getId() {
    return id;
  }

}
