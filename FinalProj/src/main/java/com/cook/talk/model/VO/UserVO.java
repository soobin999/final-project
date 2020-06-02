package com.cook.talk.model.VO;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("userVO")
@Data
public class UserVO {

	private String userId;
	private String userPw;
	private String nickName;
	private Date birth;
	private boolean gender;
	private boolean access;
	private String userPic;
	private int rcpUploads;
	private int followers;
	
	
	public static Object toEntity() {
		// TODO Auto-generated method stub
		return null;
	}


	public static CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	} 

	public Object getEmial() {
		// TODO Auto-generated method stub
		return null;
	} 
	}
