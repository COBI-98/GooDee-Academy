package com.esh.start.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value = "list.esh", method = RequestMethod.GET)
	public void list(Model model) throws Exception{
		System.out.println("list GET");
		List<QnaDTO> ar = qnaService.getList();
		
		model.addAttribute("list", ar);

	}
	
	@RequestMapping(value = "detail.esh", method = RequestMethod.GET)
	public ModelAndView detail(QnaDTO qnaDTO) throws Exception{
		System.out.println("detail GET");
		
		System.out.println(qnaDTO.getQnaNum());
		ModelAndView mv = new ModelAndView();
		qnaDTO = qnaService.getDetail(qnaDTO);
		
		mv.setViewName("qna/detail");
		mv.addObject("detail", qnaDTO);

		return mv;
	}
	
	@RequestMapping(value = "add.esh", method = RequestMethod.GET)
	public void add() throws Exception{
		System.out.println("detail GET");
		
		
	}
	
	@RequestMapping(value = "add.esh", method = RequestMethod.POST)
	public ModelAndView add(QnaDTO qnaDTO) throws Exception{
		System.out.println("detail POST");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./list.esh");
		int result =qnaService.add(qnaDTO);
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		return mv;
	}
	
	@RequestMapping(value = "delete.esh", method = RequestMethod.GET)
	public ModelAndView delete(QnaDTO qnaDTO) throws Exception{
		System.out.println("delete GET");
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setDelete(qnaDTO);
		mv.setViewName("redirect:./list.esh");
		
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		
		return mv;
	}
	
	@RequestMapping(value = "update.esh", method = RequestMethod.GET)
	public void update(QnaDTO qnaDTO, Model model) throws Exception{
		System.out.println("UPDATE GET");
		
		System.out.println(qnaDTO.getQnaNum());
		
		qnaDTO = qnaService.getDetail(qnaDTO);
		model.addAttribute("update", qnaDTO);
		
		
		
	}
	
	@RequestMapping(value = "update.esh", method = RequestMethod.POST)
	public ModelAndView update(QnaDTO qnaDTO) throws Exception{
		System.out.println("UPDATE GET");
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setUpdate(qnaDTO);
		
		
		mv.setViewName("redirect:./list.esh");
		
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		return mv;
		
	}
}
