package com.cook.talk.model.VO;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

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
	
}
