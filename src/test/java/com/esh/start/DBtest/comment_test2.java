package com.esh.start.DBtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.bankbook.BankBookCommentDAO;
import com.esh.start.bankbook.BankBookCommentDTO;

public class comment_test2 extends MyAbstractTest {

	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	@Test
	public void test() throws Exception {
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setBookNum(10L);
		bankBookCommentDTO.setContents("test0906");
		bankBookCommentDTO.setWriter("ESH");
		
		bankBookCommentDAO.setComment(bankBookCommentDTO);
	}

}
