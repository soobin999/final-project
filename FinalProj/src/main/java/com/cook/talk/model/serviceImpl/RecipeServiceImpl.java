package com.cook.talk.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cook.talk.model.dao.RecipeDAO;
import com.cook.talk.model.service.RecipeService;

public class RecipeServiceImpl implements RecipeService{

	@Autowired
	private RecipeDAO recipeDAO;
	
	@Override
	public List<String> ingrNameList(int cs) {
		String[] chosungList = {"가","나","다","라","마","바","사","아","자","차","카","타","파","하"};
		List<String> ingrNameList = recipeDAO.getIngrName(chosungList[cs], chosungList[cs+1]);
		return ingrNameList;
	}

}
