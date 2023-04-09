package com.esh.start.DBtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.bankbook.BankBookCommentDAO;
import com.esh.start.bankbook.BankBookCommentDTO;
import com.esh.start.bankbook.BankBookDAO;

public class Comment_Test extends MyAbstractTest {

	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	
	@Test
	public void Commenttest() throws Exception {
//		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
//		bankBookCommentDTO.setBookNum(10L);
//		bankBookCommentDTO.setContents("test0906");
//		bankBookCommentDTO.setWriter("ESH");
//		
//		int result = bankBookCommentDAO.setComment(bankBookCommentDTO);
//		
//		assertEquals(1, result);
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setNum(661L);
		int result = bankBookCommentDAO.setCommentDelete(bankBookCommentDTO);
		
		
	}

}
