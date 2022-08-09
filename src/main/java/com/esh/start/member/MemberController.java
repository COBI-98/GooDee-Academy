package com.esh.start.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;

@Controller
@RequestMapping(value = "/member/*")
// 이 클래스는 Controller역할, 
// Container에게 이 클래스의 객체를 생성하는것을 위임
public class MemberController {

	
	// annotation
	// @ : 설명 + 실행
	
	// /member/login
	@RequestMapping(value = "login")
	public String login() {
		System.out.println("로그인 실행");
		
		return "member/login";
	}
	
	//get
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		System.out.println("join get");
		
		return "member/join";
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
		
		
			
			return "member/join";		
	}
	
	
	
	
}
