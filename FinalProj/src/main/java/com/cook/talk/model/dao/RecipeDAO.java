package com.cook.talk.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.dto.RecipeDTO;
@Mapper
public interface RecipeDAO {

	//재료 리스트 받아오기
	public List<IngrVO> allSelectIngrList(IngrVO ingrVO);
	
	//재료 검색하는 곳
	public List<String> getIngrName(String chosung1, String chosung2);

	//레시피 목록 조회
	public List<RecipeDTO> allSelectRecipeList();
	
	//레시피 등록
	public int insertRecipe(RecipeDTO params);
	
	//레시피 상세 조회	
	public RecipeDTO recipeView(String rcpCode);
	
	//레시피 수정
	public int updateRecipe(RecipeDTO params);

	//레시피 삭제
	public int deleteRecipe(RecipeDTO params);
	
	
	
}