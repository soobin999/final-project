package com.cook.talk.ck;

import java.sql.Date;

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
<<<<<<< HEAD

		UserVO user = new UserVO();
		user.setUserId("spd@naver.com");
		user.setUserPw("1234");
		user.setNickName("스파이더");
		user.setBirth(new Date(1994 - 06 - 05));

=======
		UserVO user = new UserVO(null, null, null, null, 0, false, false, null, 0, 0);
		user.setUserId("abcd@naver.com");
		user.setUserPw("1234");
		user.setNickName("유찌");
		user.setBirth(new Date(1994 - 06 - 05));
>>>>>>> 5e97c148f237357ef8d5b0fc786cc65e185d2ef5
		user.setGender(true);
		user.setAccess(true);
		user.setAuth(0);

<<<<<<< HEAD
		userDao.login(user);

	}
}
=======
		userDao.save(user);

	}
}
>>>>>>> 5e97c148f237357ef8d5b0fc786cc65e185d2ef5
