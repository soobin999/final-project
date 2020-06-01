package com.cook.talk.controller;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.cook.talk.model.dto.RecipeDTO;
import com.cook.talk.model.service.RecipeService;

=======
>>>>>>> 128621f5c9f36128fdceba3430fade71d68ee1a3

@Controller
public class RecipeController {
	
<<<<<<< HEAD
	@GetMapping("/newlist")
	public String getRecipeList(Model model, RecipeDTO recipe) {
		List<RecipeDTO> recipeList = RecipeService.getRecipeList(recipe);
		
		model.addAttribute("recipeList", recipeList);
		return "newlist";
	}
=======
	
//	@GetMapping("/newlist")
//	public String getRecipeList(Model model, RecipeDTO recipe) {
//		List<RecipeDTO> recipeList = RecipeDAO.getRecipeList(recipe);
//		
//		model.addAttribute("recipeList", recipeList);
//		return "newlist";
//	}
>>>>>>> 128621f5c9f36128fdceba3430fade71d68ee1a3
		
	
	

}
