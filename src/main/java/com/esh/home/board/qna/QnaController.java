package com.esh.home.board.qna;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.esh.home.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {

	 private final Logger log = LoggerFactory.getLogger(this.getClass());
	   
	   @Autowired
	   private QnaService qnaService;
	   
	  @GetMapping("list")
	  public ModelAndView getList(Pager pager) throws Exception {
		  ModelAndView mv = new ModelAndView();
		  
		  
		  pager.setPerPage(10L);
		  List<QnaVO> ar =  qnaService.getList(pager);
		  System.out.println("list get");
		  mv.addObject("list", ar);
		  mv.setViewName("/qna/list");
		  return mv;
	  }
	
	
}
