package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private int likes;
    private Date creationDate;

    public Post(String text, Date creationDate) {
        this.text = text;
        likes = 0;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
