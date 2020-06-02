package com.cook.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	
	@GetMapping("/index")
	public String index() {
		return "/main/index";
	}
	@PostMapping
	public String loginIndex() {
		return "/loginIndex";
	}
	@PostMapping
	public String qnaDAO() {
		return "/admin/complain";
		}
}
