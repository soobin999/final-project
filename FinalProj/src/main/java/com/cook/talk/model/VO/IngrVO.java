package com.cook.talk.model.VO;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("ingrVO")
@Data
@Getter @Setter @ToString
public class IngrVO {

	private String rcpIngrCode;
	private String ingrPic;
	private String ingrName;
	private String ingrSeason;
	private String ingrCalorie;
	private String ingrTemper;
}
