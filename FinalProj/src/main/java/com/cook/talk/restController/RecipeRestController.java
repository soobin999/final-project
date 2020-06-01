package com.cook.talk.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dao.RecipeDAO;

public class RecipeRestController {

	@Autowired
	private RecipeDAO recipeDAO;
	
	//재료 리스트 받아오기(냉파)
	@PostMapping("/ingrSelect")
	public String refrigeratorSearch(Model model, IngrVO ingrVO) {
			
		List<IngrVO> ingrs = recipeDAO.allSelectIngrList(ingrVO);
		model.addAttribute("ingrs", ingrs);
		
		return "refrigerator/ingrSelect";
	}
	
}
