package com.cook.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {


	@RequestMapping("/newlist")
	public String getRecipeList(Model model) {

		model.addAttribute("", "");
		return "";
	}


}
