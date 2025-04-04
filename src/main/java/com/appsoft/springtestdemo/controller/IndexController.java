package com.appsoft.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //use to handle http request
public class IndexController {
	@GetMapping("/")
	public String getIndex() {
		return "Index";
	}
}
