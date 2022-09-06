package com.esh.start.bankbook;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.esh.start.bankbook.BankBookCommentDAO.";
	
	
	public int setComment(BankBookCommentDTO bankBookCommentDTO) throws Exception{
	
		return sqlSession.insert(NAMESPACE+"setComment", bankBookCommentDTO);
	}
	
}
