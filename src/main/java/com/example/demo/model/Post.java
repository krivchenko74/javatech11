package com.example.demo.model;

import java.util.Date;

public class Post {
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public Post(long id, String text, Date creationDate) {
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
