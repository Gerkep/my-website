package com.mywebapp.personal_website.controller;

import com.mywebapp.personal_website.domain.MyMail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("email", new MyMail());
        return "index";
    }

}
