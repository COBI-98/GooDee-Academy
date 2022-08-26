package com.esh.start.member;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.esh.start.bankaccount.BankAccountDTO;
import com.esh.start.bankaccount.BankAccountService;

@Controller
@RequestMapping(value = "/member/*")
// 이 클래스는 Controller역할, 
// Container에게 이 클래스의 객체를 생성하는것을 위임
public class BankMembersController {

	@Autowired
	private BankMembersService bankMembersService;
	
	@Autowired
	private BankAccountService bankAccountService;
	// annotation
	// @ : 설명 + 실행
	@RequestMapping(value = "logout.esh", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		System.out.println("로그아웃");
		//session 소멸
		session.invalidate();
		
		return "redirect:../";
	}
	
	// /member/login
	@RequestMapping(value = "login.esh", method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		
		return "member/login";
	}
	
	@RequestMapping(value = "login.esh", method = RequestMethod.POST)
	public String login(HttpServletRequest request,BankMembersDTO bankMembersDTO,Model model) throws Exception {
		System.out.println("DB에 로그인 실행");
		// "Redirect: 다시 접속할 URL 주소(절대경로,상대경로)"
		
		bankMembersDTO = bankMembersService.getLogin(bankMembersDTO);
//		model.addAttribute("check", bankMembersDTO);
		
		HttpSession session =request.getSession();
		
		session.setAttribute("check", bankMembersDTO);
		
		System.out.println(bankMembersDTO);
		return "redirect:../";
	}
	
	//get
	@RequestMapping(value = "join.esh", method = RequestMethod.GET)
	public String join() {
		System.out.println("join get");
		
		return "member/join";
	}
	
	@RequestMapping(value = "search.esh", method = RequestMethod.GET)
	public String search() throws Exception {
		System.out.println("SEARCH GET");
		
		return "member/search";
	}
	//Model 사용
//	@RequestMapping(value = "search", method = RequestMethod.POST)
//	public String search(String search, Model model) throws Exception {
//		System.out.println("SEARCH POST");
//		System.out.println(search);
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
//		ArrayList<BankMembersDTO> ar = bankMembersDAO.getSearchByID(search);
//		model.addAttribute("list", ar);
//		return "member/list";
//	}
	@RequestMapping(value = "search.esh", method = RequestMethod.POST)
	public ModelAndView search(String search,Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("SEARCH POST");
		
		List<BankMembersDTO> ar = bankMembersService.getSearchById(search);
		model.addAttribute("list", ar);
		mv.setViewName("/member/list");
		
		return mv;
	}
	
	//post
	//method join /method/join 
	@RequestMapping(value = "join.esh", method = RequestMethod.POST)
	public String join(BankMembersDTO bankMembersDTO,MultipartFile photo) throws Exception {
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		
		System.out.println("조인 POST");

		
		
		      
			   //int result = bankMembersService.setJoin(bankMembersDTO);
		   
			      
	    int result = bankMembersService.setJoin(bankMembersDTO,photo);
		if(result > 0) {
				System.out.println("성공");
		}else {
				System.out.println("실패");
		}
		
		
			
			return "redirect:../member/login.esh";		
	}
	
	@RequestMapping(value = "myPage.esh", method = RequestMethod.GET)
	public ModelAndView myPage(HttpSession session) throws Exception{
		BankMembersDTO bankMemberDTO = (BankMembersDTO)session.getAttribute("check");
		ModelAndView mv = new ModelAndView();
//		Map<String, Object> map = bankMembersService.getmyPage(bankMemberDTO);
//		
//		model.addAttribute("map", map);
		bankMemberDTO = bankMembersService.getmyPage(bankMemberDTO);
//		List<BankAccountDTO> ar = bankAccountService.getListByUserName(bankMemberDTO);
//		model.addAttribute("list", ar);
		mv.addObject("dto", bankMemberDTO);
		System.out.println("myPage");
	
		mv.setViewName("/member/myPage");
		return mv;
	}
	
	
}
