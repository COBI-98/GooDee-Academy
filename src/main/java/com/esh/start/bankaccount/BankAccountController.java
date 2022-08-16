package com.esh.start.bankaccount;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esh.start.bankbook.BankBookController;
import com.esh.start.bankbook.BankBookDTO;
import com.esh.start.member.BankMembersDTO;

@Controller
@RequestMapping(value = "/bankAccount/*")
public class BankAccountController {

	private BankAccountDAO bankAccountDAO;
	
	public BankAccountController() {
		this.bankAccountDAO = new BankAccountDAO();
	}
	
	@RequestMapping (value = "add.esh", method= RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session) throws Exception{
		System.out.println("ADD GET");
		System.out.println(bankAccountDTO.getBOOKNUM());
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("check");
		bankAccountDTO.setUSERNAME(bankMembersDTO.getUserName());
		
		//DTO : userName, bankNum
		int result = this.bankAccountDAO.add(bankAccountDTO);
		
		if(result>=1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return "redirect:../bankbook/list.esh";
	}
	
}
