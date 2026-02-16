package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class PostsCreateController
{
    @Autowired
    PostsService postsService;
    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("appName", "Мое супер приложение");
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postsService.create(text);
        return "redirect:/";
    }
}
