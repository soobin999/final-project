package com.cook.talk.model.dto;

import org.apache.ibatis.type.Alias;

import com.cook.talk.model.VO.UserVO;


@Alias("chefDTO")
public class ChefDTO extends UserVO {

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
