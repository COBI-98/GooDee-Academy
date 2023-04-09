package com.esh.start.interceptor;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.esh.start.member.BankMembersDTO;
import com.esh.start.member.RoleDTO;

public class AdminCheckInterceptor extends HandlerInterceptorAdapter {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		
		// 1. Login 한 사용자의 roleDTO 를 꺼내서 admin 찾기
		
		BankMembersDTO bankMembersDTO = (BankMembersDTO)request.getSession().getAttribute("check");
		
		boolean check = false;
		
		for(RoleDTO roleDTO:bankMembersDTO.getRoleDTOs()) {
			roleDTO.getRoleNum();
			if(roleDTO.getRoleName().equals("admin")) {
				System.out.println("admin 아이디");
				check =true;
				break;
			}
		}
		
		
		// admin 아닐때 check =false
		if(!check) {
			// 절대경로
			request.setAttribute("message", "권한이없습니다");
			request.setAttribute("url", "../../../../");
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
			view.forward(request, response);
		}
	
		
		return check; 
	}
}
