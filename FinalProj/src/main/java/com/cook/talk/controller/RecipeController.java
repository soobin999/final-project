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

	@GetMapping("/newlist")
	public String getRecipeList(Model model, RecipeDTO recipe) {
		List<RecipeDTO> recipeList = RecipeService.getRecipeList(recipe);
		
		model.addAttribute("recipeList", recipeList);
		return "newlist";
	}

	@Autowired
	private RecipeDAO recipeDAO;
	
	@PostMapping("/ingrSelect")
	public String refrigeratorSearch(Model model, IngrVO ingrVO, HttpSession session) {
			
		
		//냉파 재료 검색창 - 검색어 없이 검색했을 때 공백
		if(ingrVO.getIngrName() != null) {
			//DB검색이 아닌 내가 검색한 키워드를 저장하여 이미 있는 리스트에서 검색
			model.addAttribute("ingrName", ingrVO.getIngrName());
		} else {
			model.addAttribute("ingrName","");
		}
		
		//재료 리스트
		List<IngrVO> ingrs = recipeDAO.allSelectIngrList(ingrVO);
		model.addAttribute("ingrs", ingrs);
		
		//재료 담아놓는 곳
		session.setAttribute("mySelectIngr", ingrVO);
		model.addAttribute("ingrList", recipeDAO.getMySelectedIngrList(ingrVO));
		
		return "refrigerator/ingrSelect";
	}
	

}
