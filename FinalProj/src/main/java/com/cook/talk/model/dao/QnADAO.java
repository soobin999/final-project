package com.cook.talk.model.dao;

import java.util.List;

import com.cook.talk.model.VO.QnAVO;
import com.cook.talk.model.VO.UserVO;

public interface QnADAO {
	public void insertReply(UserVO userId, QnAVO qna);
	public List<QnAVO> selectQna();
	

}
