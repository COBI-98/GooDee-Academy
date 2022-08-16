package com.esh.start.member;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member/*")
// 이 클래스는 Controller역할, 
// Container에게 이 클래스의 객체를 생성하는것을 위임
public class MemberController {

	@Autowired //세터 게터 필요 x
	private BankMembersService bankMembersService;
	
//	@Autowired
//	public MemberController(BankMembersDAO bankMembersDAO) {
//		this.bankMembersDAO = bankMembersDAO;
//	}
	
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
	public ModelAndView search(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("SEARCH POST");
		String search = request.getParameter("search");
		System.out.println(search);
		ArrayList<BankMembersDTO> ar = bankMembersService.getSearchByID(search);
		request.setAttribute("list", ar);
		mv.setViewName("/member/list");
		
		return mv;
	}
	
	//post
	//method join /method/join 
	@RequestMapping(value = "join.esh", method = RequestMethod.POST)
	public String join(BankMembersDTO bankMembersDTO) throws Exception {
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		System.out.println("조인 POST");
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String phone = request.getParameter("phone");
//		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
//		bankMembersDTO.setUSERNAME(id);
//		bankMembersDTO.setPASSWORD(pw);
//		bankMembersDTO.setNAME(name);
//		bankMembersDTO.setEMAIL(email);
//		bankMembersDTO.setPHONE(phone);				bankMembersDTO
//		ar.add(bankMembersDTO);
		
		int result= bankMembersService.setJoin(bankMembersDTO);
		if(result > 0) {
				System.out.println("성공");
		}else {
				System.out.println("실패");
		}
		
		
			
			return "redirect:../member/login.esh";		
	}
	
	
	
	
}
