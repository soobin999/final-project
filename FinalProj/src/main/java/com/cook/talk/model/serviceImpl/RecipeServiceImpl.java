package com.cook.talk.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cook.talk.model.dao.RecipeDAO;
import com.cook.talk.model.dto.RecipeDTO;
import com.cook.talk.model.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{

	@Autowired
	private RecipeDAO recipeDAO;
	
	
	public List<String> ingrNameList(int cs) {
		String[] chosungList = {"가","나","다","라","마","바","사","아","자","차","카","타","파","하"};
		List<String> ingrNameList = recipeDAO.getIngrName(chosungList[cs], chosungList[cs+1]);
		return ingrNameList;
	}
	
	

	@Override
	public List<RecipeDTO> allSelectRecipeList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int registerRecipe(RecipeDTO params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RecipeDTO getRecipeView() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int deleteRecipe(RecipeDTO params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String rcpCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
