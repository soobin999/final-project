package com.cook.talk.model.dto;

import com.cook.talk.model.VO.QnAVO;
import com.cook.talk.model.VO.UserVO;

import lombok.Data;

@Data
public class UserDTO {

	private UserVO user;
	private QnAVO qna;
}
