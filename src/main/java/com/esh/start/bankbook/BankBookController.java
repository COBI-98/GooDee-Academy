package com.esh.start.bankbook;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {

	// /bankbook/list Get list
	// /bankbook/detail GET Detail
	
	@RequestMapping(value = "list", method =RequestMethod.GET)
	public String list(HttpServletRequest request) {
		try {
			BankBookDAO bankBookDAO = new BankBookDAO();
			ArrayList<BankBookDTO> ar = bankBookDAO.getList();
			request.setAttribute("list", ar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "bankbook/list";
	}
	@RequestMapping(value = "detail", method =RequestMethod.GET)
	public String detail(Long bookNum) {
		System.out.println("datail 실행");
		System.out.println(bookNum);
		BankBookDTO bankBookDTO = new BankBookDTO();
		return "bankbook/detail";
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
	@RequestMapping(value = "add", method =RequestMethod.GET)
	public String add() {
		System.out.println("ADD GET");
		
		return "bankbook/add";
	}
	
	@RequestMapping(value = "add", method =RequestMethod.POST)
	public String add(String BOOKNAME, String BOOKRATE) throws Exception {
		System.out.println("ADD POST");
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
		return "bankbook/add";
	}
	
	
}
