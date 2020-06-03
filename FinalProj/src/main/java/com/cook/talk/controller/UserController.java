package com.cook.talk.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.elasticsearch.client.security.user.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cook.talk.model.VO.UserVO;
import com.cook.talk.model.dao.UserDAO;
import com.cook.talk.model.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor

public class UserController {
private final UserDAO userDao;

	private final PasswordEncoder passwordEncoder;

	// 메인 페이지
	/*
	 * @GetMapping("/") public String index(@AuthenticationPrincipal User
	 * user,Map<String, Object> model) { List<UserVO> userVO=
	 * userRepository.findAll(); model.put("users", "users");
	 * model.put("currentUserId", user.getUsername()); return "homepage"; }
	 */
@GetMapping
	public String index() {
		return "/index";
	}
	
	
	@GetMapping("/admin")
	public String adminPage(@AuthenticationPrincipal User user, Map<String, Object> model) {
		model.put("currentAdminId", user.getUsername());
		return"adminpage";
	}
	

	// 회원가입 페이지
	@RequestMapping("/user/join")
	public String joinForm(User userForm) {
		return "/join";
	}

	// 회원 가입 처리
	/*
	 * @RequestMapping("/user/joinup") public String execJoinup(UserVO userVO) {
	 * UserService.joinUser(userVO); return "redirect:/user/login"; }
	 */
	// 로그인 페이지
	@RequestMapping("/user/goLogin")
	public String goLogin() {
		return "login";
	}

	@GetMapping("/user/new")
	public String userJoinForm(UserVO userForm) {
		return "userJoinForm";
	}
	
	/*
	 * @PostMapping("/user/new") public String userJoin(UserVO userForm) {
	 * User.setPassword(passwordEncoder.encode(UserDTO.getPassword()));
	 * UserDAO.save(); return "redirect:/index"; }
	 */

	// 로그아웃 페이지
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "index";
	}

	// Mapper=vo
}
