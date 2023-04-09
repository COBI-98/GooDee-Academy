package com.esh.start.bankbook;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {

	// /bankbook/list Get list
	// /bankbook/detail GET Detail
	
	@RequestMapping(value = "list.esh", method =RequestMethod.GET)
	public String list(Model model) throws Exception {
//			ModelAndView mv = new ModelAndView()
			System.out.println("list GET");
			BankBookDAO bankBookDAO = new BankBookDAO();
			ArrayList<BankBookDTO> ar = bankBookDAO.getList();
			System.out.println(ar);
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
		System.out.println(bankBookDTO.getBOOKNUM());
		System.out.println("datail 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
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
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		long millis = System.currentTimeMillis();
		bankBookDTO.setBOOKNUM(millis);
		bankBookDTO.setBOOKNAME(BOOKNAME);
		bankBookDTO.setBOOKRATE(Double.valueOf(BOOKRATE));
		bankBookDTO.setBOOKSALE(1);
		ar.add(bankBookDTO);
		int result = bankBookDAO.setBankBook(bankBookDTO);
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
		System.out.println(bankBookDTO.getBOOKNUM());
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
		
		model.addAttribute("update", bankBookDTO);
		
	}
	
	@RequestMapping(value ="update.esh", method =RequestMethod.POST)
	public ModelAndView update(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("UPDATE POST");
		ModelAndView mv = new ModelAndView();
		BankBookDAO bankBookDAO = new BankBookDAO();
		System.out.println(bankBookDTO.getBOOKNUM());
		int result = bankBookDAO.setUpdate(bankBookDTO);
		
		
		
		System.out.println(bankBookDTO.getBOOKNUM());
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		
		mv.setViewName("redirect:./detail.esh?BOOKNUM="+bankBookDTO.getBOOKNUM());
		
		return mv;
	}
	
	
	@RequestMapping(value ="delete.esh", method = RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO) throws Exception{
		BankBookDAO bankBookDAO = new BankBookDAO();
		ModelAndView mv = new ModelAndView();
		int result = bankBookDAO.setDelete(bankBookDTO);
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
