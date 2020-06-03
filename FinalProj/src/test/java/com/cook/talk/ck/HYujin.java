package com.cook.talk.ck;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cook.talk.model.VO.UserVO;
import com.cook.talk.model.dao.UserDAO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class HYujin {

	@Autowired
	UserDAO userDao;
	
	@Test
	public void find() {
		log.info(userDao.findUserById("abc@naver.com").toString());
	}
	
	@Test
	public void save() {
		UserVO user = new UserVO(null, null, null, null, 0, false, false, null, 0, 0);
		user.setUserId("abcd@naver.com");
		user.setUserPw("1234");
		user.setNickName("유찌");
		user.getBirth();
		user.setGender(true);
		user.setAccess(true);
		user.setAuth(0);
	}

}
