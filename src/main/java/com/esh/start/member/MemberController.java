package com.esh.start.member;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

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

	
	// annotation
	// @ : 설명 + 실행
	
	// /member/login
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		
		return "member/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(BankMembersDTO bankMembersDTO,Model model) throws Exception {
		System.out.println("DB에 로그인 실행");
		// "Redirect: 다시 접속할 URL 주소(절대경로,상대경로)"
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		
		bankMembersDTO = bankMembersDAO.getLogin(bankMembersDTO);
		model.addAttribute("check", bankMembersDTO);
		
		System.out.println(bankMembersDTO);
		return "";
	}
	
	//get
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		System.out.println("join get");
		
		return "member/join";
	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
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
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public ModelAndView search(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("SEARCH POST");
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		String search = request.getParameter("search");
		System.out.println(search);
		ArrayList<BankMembersDTO> ar = bankMembersDAO.getSearchByID(search);
		request.setAttribute("list", ar);
		mv.setViewName("/member/list");
		
		return mv;
	}
	
	//post
	//method join /method/join 
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(BankMembersDTO bankMembersDTO) throws Exception {
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
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
		
		int result= bankMembersDAO.setJoin(bankMembersDTO);
		if(result > 0) {
				System.out.println("성공");
		}else {
				System.out.println("실패");
		}
		
		
			
			return "redirect:../member/login";		
	}
	
	
	
	
}
