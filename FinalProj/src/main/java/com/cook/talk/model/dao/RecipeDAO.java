package com.cook.talk.model.dao;

import java.util.List;

import com.cook.talk.model.VO.IngrVO;

public interface RecipeDAO {

	//jungmin
	public List<IngrVO> allSelectIngrList(IngrVO ingrVO);
	public List<String> getIngrName(String chosung1, String chosung2);
	
}
