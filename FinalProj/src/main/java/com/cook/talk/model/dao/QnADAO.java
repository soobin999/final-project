package com.cook.talk.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cook.talk.model.VO.QnAVO;
import com.cook.talk.model.VO.UserVO;
@Service
public interface QnADAO {
	public void insertReply(UserVO userId, QnAVO qna);
	public List<QnAVO> selectQna();
	

}
