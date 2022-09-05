package com.esh.start.DBtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.bankbook.BankBookCommentDTO;
import com.esh.start.bankbook.BankBookDAO;

public class Comment_Test extends MyAbstractTest {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void Commenttest() throws Exception {
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setBookNum(10L);
		bankBookCommentDTO.setContents("test0905");
		bankBookCommentDTO.setWriter("ESH");
		
		bankBookDAO.setComment(bankBookCommentDTO);
	}

}
