package com.cook.talk.model.VO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
