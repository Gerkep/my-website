package com.mywebapp.personal_website.controller;

import com.mywebapp.personal_website.domain.MyMail;
import com.mywebapp.personal_website.mail.EmailService;
import com.sendgrid.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@Autowired
	EmailService emailService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("email", new MyMail(""));
		return "index";
	}

	@PostMapping("/send")
	public String addArticle(@ModelAttribute MyMail text, Model model) {
		model.addAttribute("email", text);
		Response response = emailService.sendEmail(text);
		return "index";
	}
}
