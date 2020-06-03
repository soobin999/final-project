package com.cook.talk.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dao.RecipeDAO;
import com.cook.talk.model.service.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@Autowired
	RecipeDAO recipeDAO;

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

	
	@GetMapping("/ingrSelect")
	public String refrigeratorSearch(Model model) {
		
		model.addAttribute("ingrs", recipeDAO.getIngrName("가", "나"));
		
		return "refrigerator/ingrSelect";
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
