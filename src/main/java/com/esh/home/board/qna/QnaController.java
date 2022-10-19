package com.esh.home.board.qna;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	  
	  @GetMapping("add")
	  public void setAddBoard() throws Exception{
		  
		  System.out.println("list add get");
	  }
	  
	  @PostMapping("add")
	  public String setAddBoard(QnaVO qnaVO, RedirectAttributes redirectAttributes) throws Exception{
		  
		  
		  
		  int result = qnaService.setQnaList(qnaVO);
		  
		  redirectAttributes.addAttribute("result", result);		  
		 
		  
		  
		  
		  return "redirect:./list";
	  }
	
	
}
