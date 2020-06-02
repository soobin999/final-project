package com.cook.talk.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.RecipeVO;

@Service
public interface MainDAO {

	public List<RecipeVO> recipeList();
}
