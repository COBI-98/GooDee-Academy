package com.esh.home.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.esh.home.board.qna.QnaFileVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FileManageController {

	@GetMapping("/fileDown/{path}") // RestFul, RestAPI
	public ModelAndView fileDown(@PathVariable String path,QnaFileVO qnaFileVO) throws Exception{
		ModelAndView mv = new ModelAndView();
		//DB에서 정보 조회
		log.info("Path {}",path);
		
		// 경로에 맞는 service 사용 (db)
		if(path.equals("qna")) {
			
		} else if (path.equals("notice")) {
			
		}
		
		qnaFileVO.setFileName("4e36c5a7-4c1a-4841-a1cd-ba5f571e8033_title1.jpg");
		qnaFileVO.setOriName("title1.jpg");
		
		mv.addObject("fileVO", qnaFileVO);
		mv.addObject("path", path);
		mv.setViewName("fileManager");
		
		return mv;
	}
	
//	@GetMapping("/fileDown/notice")
//	public ModelAndView noticeFileDown(QnaFileVO qnaFileVO) throws Exception{
//		ModelAndView mv = new ModelAndView();
//		//DB에서 정보 조회
//		qnaFileVO.setFileName("title6.jpg");
//		qnaFileVO.setOriName("title6.jpg");
//		
//		mv.addObject("fileVO", qnaFileVO);
//		mv.addObject("path", "notice");
//		
//		mv.setViewName("fileManager");
//		
//		return mv;
//	}
}
