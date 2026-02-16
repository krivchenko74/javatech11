package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostsService {
    private List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post("Post 1", new Date(124750572L)));
        posts.add(new Post("Post 2", new Date(154750572L)));
        posts.add(new Post("Post 3", new Date(164750572L)));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
