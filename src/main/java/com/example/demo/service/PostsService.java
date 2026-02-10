package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {
    public List<Post> listAllPosts() {
        Post post1 = new Post("post 1");
        Post post2 = new Post("post 2");
        Post post3 = new Post("post 3");

        return new ArrayList<>(List.of(post1, post2, post3));
    }
}
