package com.blurple.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


@Entity
public class Post {
  @Id public Long id;

  public Long courseId;
  public Long userId;
  public String content;
  public List<Reply> replies;
  public Date dateTime;


  public Post() {
    dateTime = new Date();
    replies = new ArrayList<Reply>();
  }

  public Post(Long courseId, Long userId, String content) {
    this.courseId = courseId;
    this.userId = userId;
    this.content = content;
    this.dateTime = new Date();
    replies = new ArrayList<Reply>();
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

  public String getDateTime() {
    return dateTime.toString();
  }

  public Long getId() {
    return id;
  }

}
