package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    PostsService postsService;
    public int like(Long postId) {
        Post post = postsService.listAllPosts().get(postId.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}
