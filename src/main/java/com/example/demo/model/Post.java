package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public Post() {
    }

    public Post(final Long id, final String text, final Date creationDate) {
        this.id = id;
        this.text = text;
        likes = 0;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likesAmount) {
        likes = likesAmount;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
