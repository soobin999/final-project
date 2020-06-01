package com.cook.talk.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.cook.talk.model.dao.RecipeDAO;
import com.cook.talk.model.dto.RecipeDTO;


@Controller
public class RecipeController {
	
	@GetMapping("/newlist")
	public String getRecipeList(Model model, RecipeDTO recipe) {
		List<RecipeDTO> recipeList = RecipeDAO.getRecipeList(recipe);
		
		model.addAttribute("recipeList", recipeList);
		return "newlist";
	}
		
	
	


}
