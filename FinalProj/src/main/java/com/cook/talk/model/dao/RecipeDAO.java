package com.cook.talk.model.dao;

import java.util.List;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dto.RecipeDTO;

public interface RecipeDAO {

	//jungmin
	public List<IngrVO> allSelectIngrList(IngrVO ingrVO);

	public List<RecipeDTO> getRecipeList(RecipeDTO recipe);
	
	
}