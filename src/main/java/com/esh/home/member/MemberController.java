package com.esh.home.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/member/*")
@Slf4j
public class MemberController {

	@Autowired
	private MemberMapper memberMapper;
	
	@GetMapping("login")
	public void getLogin() throws Exception{
		
	}
	
	@PostMapping("login")
	public ModelAndView getLogin(MemberVO memberVO, HttpSession session) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		
		
		memberVO = memberMapper.getLogin(memberVO);
		
		if(memberVO != null) {

			session.setAttribute("check", memberVO);
			mv.setViewName("redirect:../");
		} else {
			mv.setViewName("./login");
		}
		
		return mv;
	}
	
	@GetMapping("join")
	public void getJoin() throws Exception{
		
	}
	
	@PostMapping("join")
	public String getJoin(MemberVO memberVO) throws Exception{
		
		int result = memberMapper.getJoin(memberVO);
		
		if(result >0) {
			log.info("-----------회원가입성공-----");
			log.info("memberVO {}",memberVO);
		}
		
		return "./login";
	}
	
	
	@GetMapping("logout")
	public String logout(HttpSession session) throws Exception{
		System.out.println("로그아웃");
		//session 소멸
		session.invalidate();
		
		return "redirect:../";
	}
	
}
