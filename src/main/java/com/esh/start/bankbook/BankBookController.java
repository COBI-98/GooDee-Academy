package com.esh.start.bankbook;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.esh.start.util.CommentPager;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
	// /bankbook/list Get list
	// /bankbook/detail GET Detail
	
	
	 @RequestMapping(value="commentAdd", method=RequestMethod.POST)
	 @ResponseBody
	 public String setComment(BankBookCommentDTO bankBookCommentDTO, HttpSession session) throws Exception{
	     ModelAndView mv = new ModelAndView();
	     int result = bankBookService.setComment(bankBookCommentDTO);
	     String jsonResult ="{\"result\":\""+result+"\"}";

	     
	     return jsonResult;
	      
	  }
	 
//	@RequestMapping(value="commentAdd", method=RequestMethod.POST)
//	   public ModelAndView setComment(BankBookCommentDTO bankBookCommentDTO, HttpSession session) throws Exception{
//	     ModelAndView mv = new ModelAndView();
//	     int result = bankBookService.setComment(bankBookCommentDTO);
//	     mv.addObject("result", result);
//	     mv.setViewName("common/ajaxResult");
//
//	     
//	     return mv;
//	      
//	  }
	 //1. jsp에 출력하고 결과물을 응답으로 전송
//	 @RequestMapping(value ="commentList", method = RequestMethod.GET)
//	 public ModelAndView getCommentList(CommentPager commentPager) throws Exception{
//		 ModelAndView mv = new ModelAndView();
//		 List<BankBookCommentDTO> ar = bankBookService.getCommentList(commentPager);
//		 mv.addObject("commentList", ar);
//		 mv.setViewName("common/commentList");
//		 
//		 
//		 return mv;
//	 }
	 
	 @RequestMapping(value ="commentList", method = RequestMethod.GET)
	 @ResponseBody
	 public List<BankBookCommentDTO> getCommentList(CommentPager commentPager) throws Exception{
		 ModelAndView mv = new ModelAndView();
		 List<BankBookCommentDTO> ar = bankBookService.getCommentList(commentPager);
		 
		 String jsonComment = "";
		 
		 
		 
		return ar; 
	 }
	   
	
	//---------------------COMMENT--------------------------------------
	
	
	@RequestMapping(value = "list.esh", method =RequestMethod.GET)
	public String list(Model model) throws Exception {
//			ModelAndView mv = new ModelAndView()
			System.out.println("list GET");
			List<BankBookDTO> ar = bankBookService.getList();
			model.addAttribute("list", ar);
		return "bankbook/list";
	}
	
	// 요청을 받아서 웹페이지로 출력 
	
//	@RequestMapping(value = "detail", method =RequestMethod.GET)
//	public void detail(Long bookNum) {
//		ModelAndView mv = new ModelAndView();
//		System.out.println("datail 실행");
//		System.out.println(bookNum);
//		
//		mv.setViewName("bankbook/detail");
//		// return "bankbook/detail";"
//		// modelAndView 활용 리턴값 Spring에서 전달
//	}
	
	// ModelAndView 리턴 활용
	@RequestMapping(value = "detail.esh", method =RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("datail 실행");
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		mv.setViewName("bankbook/detail");
		mv.addObject("test", bankBookDTO);
		
		
		
		// return "bankbook/detail";"
		// modelAndView 활용 리턴값 Spring에서 전달
		
		return mv;
	}
	
	
	
//	@RequestMapping(value = "detail", method =RequestMethod.GET)
//	public String detail(HttpServletRequest request, Long bookNum) {
//		
//		System.out.println("datail 실행");
//		System.out.println(bookNum);
//		BankBookDAO bankBookDAO = new BankBookDAO();
//		BankBookDTO bankBookDTO = new BankBookDTO();
//		
//		bankBookDTO.setBOOKNUM(Long.valueOf(bookNum));
//		try {
//			
//			bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
//			
//			request.setAttribute("test", bankBookDTO);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return "bankbook/detail";
//	}
	@RequestMapping(value = "add.esh", method =RequestMethod.GET)
	public String add() {
		System.out.println("ADD GET");
		
		return "bankbook/add";
	}
	
	@RequestMapping(value = "add.esh", method =RequestMethod.POST)
	public ModelAndView add(String BOOKNAME, String BOOKRATE) throws Exception {
		System.out.println("ADD POST");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./list.esh");
		BankBookDTO bankBookDTO = new BankBookDTO();
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		long millis = System.currentTimeMillis();
		bankBookDTO.setBookNum(millis);
		bankBookDTO.setBookName(BOOKNAME);
		bankBookDTO.setBookRate(Double.valueOf(BOOKRATE));
		bankBookDTO.setBookSale(1);
		ar.add(bankBookDTO);
		int result = bankBookService.setBankBook(bankBookDTO);
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return mv;
	}
	
	@RequestMapping(value ="update.esh", method =RequestMethod.GET)
	public void update(BankBookDTO bankBookDTO,Model model) throws Exception{
		System.out.println("UPDATE GET");
		System.out.println(bankBookDTO.getBookNum());
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		
		model.addAttribute("update", bankBookDTO);
		
	}
	
	@RequestMapping(value ="update.esh", method =RequestMethod.POST)
	public ModelAndView update(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("UPDATE POST");
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookNum());
		int result = bankBookService.setUpdate(bankBookDTO);
		
		
		
		System.out.println(bankBookDTO.getBookNum());
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		
		mv.setViewName("redirect:./detail.esh?bookNum="+bankBookDTO.getBookNum());
		
		return mv;
	}
	
	
	@RequestMapping(value ="delete.esh", method = RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setDelete(bankBookDTO);
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		System.out.println("DELETE GET");
		
		mv.setViewName("redirect:./list.esh");
		
		return mv;
	}
	
	
}
