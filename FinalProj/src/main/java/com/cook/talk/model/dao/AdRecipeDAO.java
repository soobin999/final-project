package com.cook.talk.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.RecipeVO;
import com.cook.talk.model.VO.UserVO;

@Service
public interface AdRecipeDAO {

	public List<RecipeVO> allSelectRecipe();
	
	public void updateRecipe(RecipeVO rcpUpdate);
	public List<RecipeVO> searchRecipeByNickName(UserVO userNickName);
	public List<RecipeVO> selectStaticMonths(RecipeVO rcpMonth);
	public List<RecipeVO> selectStaticsGender(RecipeVO rcpGender);
	public List<RecipeVO> selectStaticsAge(RecipeVO rcpAge);
	
}
