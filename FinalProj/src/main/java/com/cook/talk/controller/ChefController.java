package com.cook.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChefController {

	@PostMapping("/chefRank")
	public String chefRank(Model model) {
		
		return "/chefRank";
	}
	
	@PostMapping("/chefInfo")
	public String chefInfo(Model model) {
		
		return"/chefInfo";
	}
}
