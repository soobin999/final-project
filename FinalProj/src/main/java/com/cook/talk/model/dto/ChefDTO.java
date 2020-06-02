package com.cook.talk.model.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import com.cook.talk.model.VO.UserVO;


@Alias("chefDTO")
public class ChefDTO extends UserVO {

	public ChefDTO(String userId, String userPw, String nickName, Date birth, int auth, boolean gender, boolean access,
			String userPic, int rcpUploads, int followers) {
		super(userId, userPw, nickName, birth, auth, gender, access, userPic, rcpUploads, followers);
		// TODO Auto-generated constructor stub
	}

	private int rcpviews;
	
	public int getRcpviews() {
		return rcpviews;
	}

	public void setRcpviews(int rcpviews) {
		this.rcpviews = rcpviews;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + rcpviews;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChefDTO other = (ChefDTO) obj;
		if (rcpviews != other.rcpviews)
			return false;
		return true;
	}
	
	
}
