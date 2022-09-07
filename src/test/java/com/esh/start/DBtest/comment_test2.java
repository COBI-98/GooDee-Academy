package com.esh.start.DBtest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.bankbook.BankBookCommentDAO;
import com.esh.start.bankbook.BankBookCommentDTO;
import com.esh.start.util.CommentPager;

public class comment_test2 extends MyAbstractTest {

	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	// @Test
	public void test() throws Exception {
		CommentPager commentPager = new CommentPager();
		commentPager.setBookNum(10L);
		commentPager.setPage(1L);
		commentPager.getRowNum();
		
		List<BankBookCommentDTO> ar = bankBookCommentDAO.getCommentList(commentPager); 
		
		assertNotEquals(0, ar.size());
	}
	

}
