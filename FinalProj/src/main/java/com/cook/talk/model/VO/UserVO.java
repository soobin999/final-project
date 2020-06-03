package com.cook.talk.model.VO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.apache.ibatis.type.Alias;

@Alias("userVO")
@Data
@AllArgsConstructor
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
