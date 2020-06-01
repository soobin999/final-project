package com.cook.talk.model.dao;

import java.util.List;


import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dto.RecipeDTO;

public interface RecipeDAO {

	//재료 리스트 받아오기
	public List<IngrVO> allSelectIngrList(IngrVO ingrVO);
	public List<String> getIngrName(String chosung1, String chosung2);

	
	public List<RecipeDTO> getRecipeList(RecipeDTO recipe);

}