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
	
	
//	@Test
//	public void setAddTest() throws Exception{
//		
//		for(int i=0;i<100;i++) {
//			NoticeDTO noticeDTO = new NoticeDTO();
//			noticeDTO.setTitle("Title"+i);
//			noticeDTO.setContents("Content"+i);
//			noticeDTO.setWriter("Writer"+i);	
//			int result = noticeDAO.setadd(noticeDTO);
//	         
//	         
//	         if(i%10 ==0) { 
//	            Thread.sleep(500);
//	            
//	            
//	         }
//		}
//	}
	
	@Test
	public void getCountTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		
		long count = noticeDAO.getCount();
		assertEquals(102L, count);
		
	}
	
	

	
	

}