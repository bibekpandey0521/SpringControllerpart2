package com.appsoft.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactusController {

	@GetMapping("/contact")
	public String getContactUs() {
		return "ContactUs";
	}
}
