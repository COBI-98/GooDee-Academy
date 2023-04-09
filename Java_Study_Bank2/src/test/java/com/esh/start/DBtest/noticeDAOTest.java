package com.esh.start.DBtest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.notice.NoticeDAO;
import com.esh.start.board.notice.NoticeDTO;
import com.esh.start.board.qna.QnaDAO;
import com.esh.start.board.qna.QnaDTO;





public class noticeDAOTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void setAddTest() throws Exception{
		
		for(int i=0;i<100;i++) {
			QnaDTO qnaDTO = new QnaDTO();
			qnaDTO.setTitle("Title"+i);
			qnaDTO.setContents("Content"+i);
			qnaDTO.setWriter("Writer"+i);	
			int result = qnaDAO.setadd(qnaDTO);
	         
	         
	         if(i%10 ==0) { 
	            Thread.sleep(500);
	            
	            
	         }
		}
	}
	
//	@Test
//	public void getCountTest() throws Exception{
//		NoticeDTO noticeDTO = new NoticeDTO();
//		
//		long count = noticeDAO.getCount();
//		assertEquals(102L, count);
//		
//	}
	
	

	
	

}