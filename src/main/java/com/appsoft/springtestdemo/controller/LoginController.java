package com.appsoft.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.appsoft.springtestdemo.model.User;

@Controller
public class LoginController {
	
	@GetMapping("/login") 
	public String getLogin() {
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user,Model model) {
		if(user.getUsername().equals("hairr") && user.getPassword().equals("123")) {
//		    System.out.println("Received username: " + user.getUsername());  // Debug log
//		    System.out.println("Received password: " + user.getPassword());
			model.addAttribute("uname",user.getUsername());
			return "Home";
			
		}
		model.addAttribute("error","Invalid username or Password");
		return "LoginForm";
	}
}
