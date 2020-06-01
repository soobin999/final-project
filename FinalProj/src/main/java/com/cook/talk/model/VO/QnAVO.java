package com.cook.talk.model.VO;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("qnaVO")
@Data
public class QnAVO {

	private String qnaTitle;
	private String qnaCont;
	private Date qnaDate;
	private String answer;
}
