package com.esh.home.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 상속 안 받고 추가만 하면 됨

@SpringBootTest
class QnaMapperTest {

//	private final Logger log = LoggerFactory.getLogger(this.getClass());
//	
//	@Autowired
//	private QnaMapper qnaMapper;
//	
//	private QnaVO qnaVO;
//	
//	@BeforeAll
//	static void befoAll() {
//		System.out.println("전체 test 실행 전 !!!!!!!!!!!!!!1");
//	}
//	@AfterAll
//	static void befoclass() {
//		System.out.println("전체 test 실행 후 !!!!!!!!");
//	}
//	
//	@BeforeEach
//	void beforeEach() {
//	     System.out.println("Test 메서드 실행 전");
//	     qnaVO = new QnaVO();
//	     qnaVO.setNum(1L);
//	     qnaVO.setContents("contents");
//	 }
//	   
//	   @AfterEach
//	   void afterEach() {
//	      System.out.println("Test 메서드 실행 후");
//	   }
//	
//	@Test
//	void test2() throws Exception {
////		List<QnaVO> ar = qnaMapper.getList();
////	
////		log.info("List {}",ar);
////		
////		assertNotEquals(0, ar.size());
//		QnaVO qnaVO = new QnaVO();
//		int result = 0;
//		for(int i =0; i<100;i++) {
//			qnaVO.setTitle("Test Title" +i);
//			qnaVO.setContents("Test Contentes" + i);
//			qnaVO.setWriter("Test Writer" + i);
//			
//			result = qnaMapper.setQnaList(qnaVO);
//				
//		}
//		
//		assertNotEquals(0, result);
//		
//	}

}
