package com.cook.talk.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cook.talk.model.VO.IngrVO;
import com.cook.talk.model.VO.QnAVO;
import com.cook.talk.model.VO.RecipeVO;
import com.cook.talk.model.VO.UserVO;
import com.cook.talk.model.dao.AdIngrDAO;
import com.cook.talk.model.dao.AdRecipeDAO;
import com.cook.talk.model.dao.AdUserDAO;
import com.cook.talk.model.dao.QnADAO;

@RestController
public class AdminRestController {
	@Autowired
	private QnADAO qnaDAO;

	@Autowired
	private AdUserDAO adUserDAO;

	@Autowired
	private AdRecipeDAO adRecipeDAO;

	@Autowired
	private AdIngrDAO adIngrDAO;

	@PostMapping("/admin/complain")
	public void complain() {
		// insertReply(String UserID);
	}

	@PostMapping("/admin/adUser")
	public void adUser() {
		// deleteUserId(UserDTO userID);
		// searchUserByEmail(UserDTO userEmail);
		//
	}

	@PostMapping("/admin/adRecipe")
	public void adRecipe() {
	}

	@PostMapping("/admin/Ingr")
	public void Ingr() {
	}

	@PostMapping("/admin/qna") // qna 답변
	public String insertReply(UserVO userId, QnAVO qna) {

		return "admin";
	}

	@PostMapping("/admin/selectQna") // 모든 qna 뿌려주기 위해
	public String selectQna(Model model) {

		return "admin";
	}

	// 회원정보 관해서
	@PostMapping("/admin/allSelectUserId") // 모든 회원정보 뿌려주기 위해
	public String allSelectUserId(Model model) {

		return "admin";
	}

	@PostMapping("/admin/deleteUserID") // 모든 회원정보 뿌려주기 위해
	public void deleteUserID(Model model, UserVO userId) {

	}

	@PostMapping("/admin/updateUserNickName") // 모든 회원정보 뿌려주기 위해
	public String updateUserNickName(Model model, UserVO nickName) {

		return "admin";
	}

	@PostMapping("/admin/searchUserByEmail") // 모든 회원정보 뿌려주기 위해
	public String searchUserByUserId(Model model, UserVO userId) {

		return "admin";
	}

	@PostMapping("/admin/allSelectRecipe") // 모든 회원정보 뿌려주기 위해
	public String allSelectRecipe(Model model) {

		return "admin";
	}

	@PostMapping("/admin/updateUserNickName") // 모든 회원정보 뿌려주기 위해
	public String updateRecipe(Model model, RecipeVO rcpUpdate) {

		return "admin";
	}

	@PostMapping("/admin/updateUserNickName") // 모든 회원정보 뿌려주기 위해
	public String searchRecipeByNickName(Model model, UserVO userNickName) {

		return "admin";
	}

	@PostMapping("/admin/BiRcpStatic") // 모든 회원정보 뿌려주기 위해
	public String searchRcpByRcpCode(Model model, String rcpCode) {
		/*
		 * searchRcpByRcpCode, selectStaticMonths, selectStaticsAge, selectStaticsGender
		 */
		return "admin";
	}

	// 재료 추가
	@PostMapping("/admin/searchIngr") // 재료 찾기
	public String searchIngr(Model model, IngrVO ingrVO) {

		return "admin";
	}

	@PostMapping("/admin/allSelectIngr") // 재료 찾기
	public String allSelectIngr(Model model) {

		return "admin";
	}

	@PostMapping("/admin/insertIngr") // 재료 찾기
	public String insertIngr(Model model, IngrVO ingrVO) {

		return "admin";
	}

	@PostMapping("/admin/deleteIngr") // 재료 찾기
	public void deleteIngr(Model model, IngrVO ingrVO) {

	}

}
