package com.cook.talk.model.dao;

import java.util.List;

import com.cook.talk.model.VO.UserVO;
import com.cook.talk.model.dto.UserDTO;

public interface AdUserDAO {
	public List<UserDTO> allSelectUserId();
	public void deleteUserID(UserVO userId);
	public void updateUserNickName(UserVO nickName);
	public void searchUserByEmail(UserVO userEmail);

}
	