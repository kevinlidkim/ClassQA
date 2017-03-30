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
public class Reply {
    @Id public Long id;

    public Long courseId;
    public Long userId;
    public String content;
    public Date dateTime;

    public Reply() {
        dateTime = new Date();
    }

    public Reply(Long courseId, Long userId, String content) {
        this.courseId = courseId;
        this.userId = userId;
        this.content = content;
        this.dateTime = new Date();
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

    public String getDateTime() {
        return dateTime.toString();
    }

    public Long getId() {
        return id;
    }
}
