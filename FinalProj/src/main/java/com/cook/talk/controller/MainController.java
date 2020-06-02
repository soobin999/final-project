package com.cook.talk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cook.talk.model.dao.ChefDAO;
import com.cook.talk.model.service.MainService;

@Controller
public class MainController {

	@Autowired(required = false)
	private MainService main;
	@Autowired(required = false)
	private ChefDAO chef;
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("chef",chef.selectChefDetail("zleda9@naver.com"));
		return "/main/index";
	}
	@PostMapping
	public String loginIndex(Model model, String expl) {
		model.addAttribute("",main.recipeList(expl));
		return "/loginIndex";
	}
	@PostMapping
	public String qnaDAO() {
		return "/admin/complain";
		}
}
