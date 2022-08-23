package com.esh.start.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.esh.start.board.impl.BoardDTO;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//글목록
	
	
	@RequestMapping(value = "list.esh", method = RequestMethod.GET)
	public ModelAndView getList()throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("list get");
		List<BoardDTO> ar = noticeService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("notice/list");
		System.out.println("list get");
		return mv; 
	}
		
		//글상세
		@RequestMapping(value="detail.esh",method = RequestMethod.GET)
		public String getDetail(BoardDTO boardDTO, Model model)throws Exception{
			boardDTO = noticeService.getDetail(boardDTO);
			model.addAttribute("detail", boardDTO);
			return "notice/detail";
		}
		
		//글작성
		@RequestMapping(value = "add.esh", method = RequestMethod.GET)
		public String setadd()throws Exception{
			return "notice/add";
		}
		
		@RequestMapping(value = "add.esh", method = RequestMethod.POST)
		public ModelAndView setAdd(BoardDTO boardDTO)throws Exception{
			ModelAndView mv = new ModelAndView();
			int result = noticeService.setadd(boardDTO);
			
			
			mv.setViewName("redirect:./list.esh");
			return mv;
			
		}
		
		//글수정
		@RequestMapping(value = "update.esh")
		public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv)throws Exception{
			
			boardDTO = noticeService.getDetail(boardDTO);
			
			mv.addObject("update", boardDTO);
			mv.setViewName("notice/update");
			return mv;
		}
		
		@RequestMapping(value = "update.esh", method = RequestMethod.POST)
		public String setUpdate(BoardDTO boardDTO)throws Exception{
			int result = noticeService.setUpdate(boardDTO);
			return "redirect:./detail.esh?num="+boardDTO.getNum();
		}
		
		
		//글삭제
		@RequestMapping(value = "delete.esh", method = RequestMethod.GET)
		public String setDelete(BoardDTO boardDTO)throws Exception{
			int result = noticeService.setDelete(boardDTO);
			return "redirect:./list.esh";
		}
	
}
