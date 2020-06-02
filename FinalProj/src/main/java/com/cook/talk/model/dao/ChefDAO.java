package com.cook.talk.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.RecipeVO;
import com.cook.talk.model.dto.ChefDTO;

@Service
public interface ChefDAO {

	public ChefDTO selectChefDetail(String id);

	public int selectFollow(String userId,String chefId);

	public List<RecipeVO> selectRecipe(String userId);

	public List<ChefDTO> allSelectChef(String status);

}