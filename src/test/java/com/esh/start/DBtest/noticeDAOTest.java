package com.esh.start.DBtest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.notice.NoticeDAO;
import com.esh.start.board.notice.NoticeDTO;





public class noticeDAOTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getListTest()throws Exception{
		 List<BoardDTO> ar = noticeDAO.getList();
		 assertEquals(0, ar.size());
		
	}
	
	

	
	

}