package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostsService {
    public List<Post> listAllPosts() {
        Post post1 = new Post("post 1", new Date());
        Post post2 = new Post("post 2", new Date(135235524434L));
        Post post3 = new Post("post 3", new Date(128536563253L));

        return new ArrayList<>(List.of(post1, post2, post3));
    }
}
