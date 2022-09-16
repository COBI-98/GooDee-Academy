package com.esh.start.board.notice;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.esh.start.bankbook.BankBookCommentDTO;
import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.impl.BoardFileDTO;
import com.esh.start.member.BankMembersDTO;
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
	
	@PostMapping("fileDelete")
	//바로 응답으로 보냄
	@ResponseBody
	public int setFileDelete(BoardFileDTO boardFileDTO,HttpSession session) throws Exception{
		int result = noticeService.setFileDelete(boardFileDTO,session.getServletContext());
	
		
	
		return result;
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
		public String setAdd(HttpSession session)throws Exception{
			BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("check");
			if(bankMembersDTO != null) {
				
				return "board/add";
			}else {
				return "redirect:../member/login.esh";
			}
			
		}
		
		
		@RequestMapping(value = "add.esh", method = RequestMethod.POST)
		public ModelAndView setAdd(BoardDTO boardDTO, MultipartFile [] files,HttpSession httpsession)throws Exception{
			ModelAndView mv = new ModelAndView();
			int result = noticeService.setadd(boardDTO, files, httpsession.getServletContext());
			
			int result1 = 0;
			String message = "실패";
			String url = "add.esh";
			
			if(boardDTO != null) {
				message = "성공";
				url = "list.esh";
				result1 = 1;		
			}
			
			mv.addObject("message", message);
			mv.addObject("result", result1);
			mv.addObject("url", url);
			mv.setViewName("common/result");
			
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
		public String setUpdate(BoardDTO boardDTO,MultipartFile [] files,HttpSession session)throws Exception{
			  int result = noticeService.setUpdate(boardDTO,files,session.getServletContext());
			
			return "redirect:./detail.esh?num="+boardDTO.getNum();
		}
		
		
		//글삭제
		@RequestMapping(value = "delete.esh", method = RequestMethod.GET)
		public String setDelete(BoardDTO boardDTO)throws Exception{
			int result = noticeService.setDelete(boardDTO);
			return "redirect:./list.esh";
		}
		
		
}
