package com.cook.talk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cook.talk.model.dao.ChefDAO;

@Controller
public class ChefController {

	@Autowired(required = false)
	private ChefDAO chefDAO;

	@PostMapping("/chefRank")
	public String chefRank(Model model,String status) {
		
		model.addAttribute("chefList", chefDAO.allSelectChef(status));
		return "/chef/chefRank";
	}

	@PostMapping("/chefInfo")
	public String chefInfo(Model model,String userId,String chefId) {
		model.addAttribute("follow",chefDAO.selectFollow(userId, chefId));
		model.addAttribute("chefInfo",chefDAO.selectRecipe(chefId));
		model.addAttribute("chefDetail",chefDAO.selectChefDetail(chefId));
		return "/chef/chefInfo";
	}
	
}

