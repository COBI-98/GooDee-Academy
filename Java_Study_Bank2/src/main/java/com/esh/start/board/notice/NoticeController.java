package com.esh.start.board.notice;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.esh.start.board.impl.BoardDTO;
import com.esh.start.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//글목록
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";
	}
	
	@GetMapping("reply.esh")
	public ModelAndView setReply(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("boardDTO", boardDTO);
		mv.setViewName("board/reply");
		
		return mv;
	}
	
	@RequestMapping(value = "list.esh", method = RequestMethod.GET)
	public ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		System.out.println(pager.getKind());
		System.out.println(pager.getSearch());
		List<BoardDTO> ar = noticeService.getList(pager);
//		System.out.println("Page : " +page);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("board/list");
		
		return mv; 
	}
		
		//글상세
		@RequestMapping(value="detail.esh",method = RequestMethod.GET)
		public String getDetail(BoardDTO boardDTO, Model model)throws Exception{
			boardDTO = noticeService.getDetail(boardDTO);
			model.addAttribute("detail", boardDTO);
			
			return "board/detail";
		}
		
		//글작성
		@RequestMapping(value = "add.esh", method = RequestMethod.GET)
		public String setAdd(Model model)throws Exception{
			
			return "board/add";
			
		}
		
		@RequestMapping(value = "add.esh", method = RequestMethod.POST)
		public ModelAndView setAdd(BoardDTO boardDTO, MultipartFile [] files,HttpSession httpsession)throws Exception{
			ModelAndView mv = new ModelAndView();
			int result = noticeService.setadd(boardDTO, files, httpsession.getServletContext());
			
			
			mv.setViewName("redirect:./list.esh");
			return mv;
			
		}
		
		//글수정
		@RequestMapping(value = "update.esh", method = RequestMethod.GET)
		public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv)throws Exception{
			
			boardDTO = noticeService.getDetail(boardDTO);
			
			mv.addObject("update", boardDTO);
			mv.setViewName("board/update");
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
