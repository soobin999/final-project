package com.cook.talk.model.dto;

import org.apache.ibatis.type.Alias;

import com.cook.talk.model.VO.UserVO;

import lombok.Data;

@Data
@Alias("chefDTO")
public class ChefDTO extends UserVO {

	private int rcpviews;
}
