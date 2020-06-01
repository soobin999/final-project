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
	
	@PostMapping("/ingrSelect")
	public String refrigeratorSearch(Model model, IngrVO ingrVO) {
			
		
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
		
		return "refrigerator/ingrSelect";
	}
	
}
