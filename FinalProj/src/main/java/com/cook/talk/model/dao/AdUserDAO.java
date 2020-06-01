package com.cook.talk.model.dao;

import java.util.List;

import com.cook.talk.model.dto.UserDTO;

public interface AdUserDAO {
	public List<UserDTO> allSelectUserId();
	public void deleteUserID(UserDTO userId);
	public void updateUserNickName(UserDTO userNick);
	public void searchUserByEmail(UserDTO userEmail);

}
	