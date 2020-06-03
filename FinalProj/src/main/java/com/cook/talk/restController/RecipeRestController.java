package com.cook.talk.restController;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dao.RecipeDAO;
import com.cook.talk.model.service.RecipeService;

@RestController
@RequestMapping("/ingrSelect")
public class RecipeRestController {

	@Autowired(required = false)
	RecipeDAO recipeDAO;
	
	@Autowired(required = false)
	RecipeService recipeService;
	
	@GetMapping(value = "/chosung")
	public List<String> chosung(IngrVO ingrVO, HttpSession session, int cs) {
		
		//재료 리스트
		List<String> ingrs = recipeService.ingrNameList(cs);
	
		return ingrs;
	
	}
	

}
