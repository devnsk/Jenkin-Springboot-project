package com.nsk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/page2")
	public String page2() {
		return "page2";
	}
}
