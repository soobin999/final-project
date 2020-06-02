package com.cook.talk.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dto.RecipeDTO;
@Service
public interface RecipeDAO {

	//재료 리스트 받아오기
	public List<IngrVO> allSelectIngrList(IngrVO ingrVO);
	
	//재료 검색하는 곳
	public List<String> getIngrName(String chosung1, String chosung2);

	//선택한 재료 저장하는 곳
	public List<String> getMySelectedIngrList(IngrVO ingrName);
	
	public List<RecipeDTO> getRecipeList(RecipeDTO recipe);

}