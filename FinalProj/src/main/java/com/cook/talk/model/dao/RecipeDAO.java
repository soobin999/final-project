package com.cook.talk.model.dao;

import java.util.List;


import com.cook.talk.model.VO.IngrVO;

public interface RecipeDAO {

	//재료 리스트 받아오기
	public List<IngrVO> allSelectIngrList(IngrVO ingrVO);
	public List<String> getIngrName(String chosung1, String chosung2);

<<<<<<< HEAD
	
=======
	public List<RecipeDTO> getRecipeList(RecipeDTO recipe);

>>>>>>> 128621f5c9f36128fdceba3430fade71d68ee1a3
}