package com.example.demo.model;

public class Post {
    private String text;
    private int likes;

    public Post(String text) {
        this.text = text;
        likes = 0;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }
}
