package com.appsoft.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.appsoft.springtestdemo.model.User;

@Controller
public class SignUpController {
		
	 @GetMapping("/signup")
	  public String getSignUp() {
	        return "SignupForm"; 
	    }

	    @PostMapping("/signup") 
	    public String postSignUp(@ModelAttribute User user,Model model) {
	        model.addAttribute("uname",user.getUsername());
	        model.addAttribute("unameF",user.getFname());
	        model.addAttribute("unameL",user.getLname());
	        
	    	return "Profile";
	    }
	
}
