package com.cook.talk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@PostMapping("/login")
	public String login() {
		return "/login";
	}
	@PostMapping("/login/find_pw")
	public String find_pw() {
		return "/login";
	}
	@PostMapping("/login/userUpdate")
	public String userUpdate() {
		return "/login";
	}
	@PostMapping("/login/userDelete")
	public String userDelete() {
		return "/login";
	}
	@PostMapping("/login/re_pw")
	public String re_pw() {
		return "/login";
	}
	
	@RequestMapping (value = "/gologin",method =RequestMethod.GET)
public String gologin(HttpServletRequest request) throws Exception {
		HttpSession session =request.getSession();
	//re가 null이 아니거나 refer가  null 이 아닌 경우 	
	if(request.getRequestURL() !=null && request.getHeader("referer") != null) {
	//이전 페이지가 로그인겟 이거나 직접 로그인 url에 접속하지 않았을 경우 referer 저장 
		if (!(request.getRequestURL().equals("/login/gologin")&& request.getHeader("referer").equals("http://localhost/login/gologin"))) {
			//dest세션에 이전 페이지 정보 저장 
			session.setAttribute("dest",request.getHeader("referer"));
		}
	}
	return"/user/login";
	
	}
	
	
	
	
}
	
