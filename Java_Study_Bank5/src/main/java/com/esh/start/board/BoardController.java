package com.esh.start.board;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {

	@RequestMapping(value = "list.esh", method = RequestMethod.GET)
	public void list(Model model) throws Exception{
		System.out.println("list GET");
		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardDTO> ar = boardDAO.getList();
		
		model.addAttribute("list", ar);

	}
	
	@RequestMapping(value = "detail.esh", method = RequestMethod.GET)
	public ModelAndView detail(BoardDTO boardDTO) throws Exception{
		System.out.println("detail GET");
		
		System.out.println(boardDTO.getBoardNum());
		ModelAndView mv = new ModelAndView();
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.getDetail(boardDTO);
		
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
		BoardDAO boardDAO = new BoardDAO();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./list.esh");
		int result =boardDAO.add(boardDTO);
		
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
		BoardDAO boardDAO = new BoardDAO();
		ModelAndView mv = new ModelAndView();
		int result = boardDAO.setDelete(boardDTO);
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
		
		BoardDAO boardDAO = new BoardDAO();
		
		boardDTO = boardDAO.getDetail(boardDTO);
		model.addAttribute("update", boardDTO);
		
		
		
	}
	
	@RequestMapping(value = "update.esh", method = RequestMethod.POST)
	public ModelAndView update(BoardDTO boardDTO) throws Exception{
		System.out.println("UPDATE GET");
		BoardDAO boardDAO = new BoardDAO();
		ModelAndView mv = new ModelAndView();
		int result = boardDAO.setUpdate(boardDTO);
		
		
		mv.setViewName("redirect:./list.esh");
		
		
		if(result>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		
		return mv;
		
	}
}
