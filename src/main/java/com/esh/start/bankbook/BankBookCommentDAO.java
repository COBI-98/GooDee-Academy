package com.esh.start.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.util.CommentPager;

@Repository
public class BankBookCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.esh.start.bankbook.BankBookCommentDAO.";
	
	
	public int setComment(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setComment", bankBookCommentDTO);
	}
	
	public List<BankBookCommentDTO> getCommentList(CommentPager commentPager) throws Exception {
		
		
		return sqlSession.selectList(NAMESPACE+"getCommentList", commentPager);
	}
}
