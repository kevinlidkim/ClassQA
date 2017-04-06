package com.blurple.models;

import com.blurple.models.Course;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

@Entity
@Index
public class Answer implements Serializable {
    @Id public Long id;

    public Long questionId;
    public Long userId;
    public String content;
    public Date dateTime;

    public Answer() {
        dateTime = new Date();
    }

    public Answer(Long questionId, Long userId, String content) {
        this.questionId = questionId;
        this.userId = userId;
        this.content = content;
        this.dateTime = new Date();
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
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
