package com.cook.talk.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dao.RecipeDAO;
import com.cook.talk.model.dto.RecipeDTO;
import com.cook.talk.model.service.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@Autowired
	 RecipeDAO recipeDAO;

	@GetMapping("/ingrSelect")
	public String refrigeratorSearch(Model model, IngrVO ingrVO, HttpSession session) {

		if (ingrVO.getIngrName() != null) {
			// DB검색이 아닌 내가 검색한 키워드를 저장하여 이미 있는 리스트에서 검색
			model.addAttribute("ingrName", ingrVO.getIngrName());
		} else {
			model.addAttribute("ingrName", "");
		}

		return "refrigerator/ingrSelect";
	}
	
	@GetMapping(value = "recipe/newlist")
	public String getRecipeList(Model model, RecipeDTO recipe) {
//		List<RecipeDTO> getRecipeList = RecipeService.allSelectRecipeList(recipe);
//		model.addAttribute("getRecipeList", getRecipeList);
		return "recipe/newlist";
	}
	
	@PostMapping(value = "recipe/insertRecipe")
	public String insertRecipeView(Model model) {
		return "recipe/insertRecipe";
	}	
	
	@PostMapping(value = "recipe/recipeView")
	public String recipeView(Model model) {
		return "recipe/recipeView";
	}
	
	@PostMapping(value = "recipe/updateRecipe")
	public String updateRecipe(Model model) {
		return "recipe/updateRecipe";
	}
	
	@GetMapping(value = "recipe/deleteRecipe")
	public String deleteRecipe(Model model) {
		return "recipe/deleteRecipe";
	}
}
