package com.cook.talk.model.dao;

import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.UserVO;
@Service
public interface UserDAO {
	/*public void insertUser(UserVO user);
public int userIdCheck(String userId);
public int userNickCheck(String nickName);
public int updateUser(UserVO user);
*/
void join(UserVO userVO) throws Exception;
}
