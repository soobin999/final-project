package com.cook.talk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cook.talk.model.service.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;

	@GetMapping(value = "recipe/newlist")
	public String getRecipeList(Model model) {
		return "recipe/newlist";
	}
	
	@GetMapping(value = "recipe/insertRecipe")
	public String insertRecipeView(Model model) {
		return "recipe/insertRecipe";
	}
		
	public void insertRecipe(Model model) {
	}
	
	@GetMapping(value = "recipe/recipeView")
	public String recipeView(Model model) {
		return "recipe/recipeView";
	}
	
	@GetMapping(value = "recipe/updateRecipe")
	public String updateRecipe(Model model) {
		return "recipe/updateRecipe";
	}
	
	@GetMapping(value = "recipe/deleteRecipe")
	public String deleteRecipe(Model model) {
		return "recipe/deleteRecipe";
	}
}
