package com.cook.talk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cook.talk.model.VO.UserVO;


@Controller
public class UserController {

	@Autowired
	private UserVO userVO; 
	
	//메인 페이지
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	//회원가입 페이지
	@RequestMapping("/user/join")
	public String join() {
		return"/join";
	}
	
	//회원 가입 처리 
	/*
	 * @RequestMapping("/user/joinup") public String execJoinup(UserVO userVO) {
	 * UserService.joinUser(userVO); return "redirect:/user/login"; }
	 */
	//로그인 페이지 
	@RequestMapping("/user/goLogin")
	public String goLogin() {
		return "login";
	}
	
	
	
	
	//로그아웃 페이지 
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "index";
	}
	
	//Mapper=vo
}
