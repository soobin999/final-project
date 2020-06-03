package com.cook.talk.model.VO;

import java.sql.Date;

<<<<<<< HEAD

//import lombok.AllArgsConstructor;
=======
import lombok.AllArgsConstructor;
>>>>>>> 5e97c148f237357ef8d5b0fc786cc65e185d2ef5
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.apache.ibatis.type.Alias;

@Alias("userVO")
@Data
public class UserVO {
	private String userId;
	private String userPw;
	private String nickName;
	private Date birth;
	private int auth;
	private boolean gender;
	private boolean access;
	private String userPic;
	private int rcpUploads;
	private int followers;

}
