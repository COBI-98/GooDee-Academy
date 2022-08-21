package com.esh.start.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.esh.start.member.BankMembersService;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "list.esh", method = RequestMethod.GET)
	public void list(Model model) throws Exception{
		System.out.println("list GET");
		List<BoardDTO> ar = boardService.getList();
		
		model.addAttribute("list", ar);

	}
	
	@RequestMapping(value = "detail.esh", method = RequestMethod.GET)
	public ModelAndView detail(BoardDTO boardDTO) throws Exception{
		System.out.println("detail GET");
		
		System.out.println(boardDTO.getBoardNum());
		ModelAndView mv = new ModelAndView();
		boardDTO = boardService.getDetail(boardDTO);
		
		mv.setViewName("board/detail");
		mv.addObject("detail", boardDTO);

		return mv;
	}
	
	@RequestMapping(value = "add.esh", method = RequestMethod.GET)
	public void add() throws Exception{
		System.out.println("detail GET");
		
		
	}
	
	@RequestMapping(value = "add.esh", method = RequestMethod.POST)
	public ModelAndView add(BoardDTO boardDTO) throws Exception{
		System.out.println("detail POST");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./list.esh");
		int result =boardService.add(boardDTO);
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		return mv;
	}
	
	@RequestMapping(value = "delete.esh", method = RequestMethod.GET)
	public ModelAndView delete(BoardDTO boardDTO) throws Exception{
		System.out.println("delete GET");
		ModelAndView mv = new ModelAndView();
		int result = boardService.setDelete(boardDTO);
		mv.setViewName("redirect:./list.esh");
		
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		
		return mv;
	}
	
	@RequestMapping(value = "update.esh", method = RequestMethod.GET)
	public void update(BoardDTO boardDTO, Model model) throws Exception{
		System.out.println("UPDATE GET");
		
		System.out.println(boardDTO.getBoardNum());
		
		boardDTO = boardService.getDetail(boardDTO);
		model.addAttribute("update", boardDTO);
		
		
		
	}
	
	@RequestMapping(value = "update.esh", method = RequestMethod.POST)
	public ModelAndView update(BoardDTO boardDTO) throws Exception{
		System.out.println("UPDATE GET");
		ModelAndView mv = new ModelAndView();
		int result = boardService.setUpdate(boardDTO);
		
		
		mv.setViewName("redirect:./list.esh");
		
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		return mv;
		
	}
}
