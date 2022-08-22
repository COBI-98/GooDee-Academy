package com.esh.start.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.start.bankaccount.BankAccountDAO;
import com.esh.start.bankaccount.BankAccountDTO;

@Service
public class BankMembersService {

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
//	@Autowired
//	private BankAccountDAO bankAccountDAO;
	
	//bankmembers 회원가입
	  public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		
		  return bankMembersDAO.setJoin(bankMembersDTO);
	  }
	   
	   //검색어를 입력해서 ID를 찾기 
	   
	  public List<BankMembersDTO> getSearchById(String search) throws Exception {
			
		  return bankMembersDAO.getSearchById(search);
	}
	   
	  // login 
	  public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		  
		  return bankMembersDAO.getLogin(bankMembersDTO);
	  }
	  
	  
//	  public Map<String, Object> getmyPage(BankMembersDTO bankMemberDTO) throws Exception{
//		  Map<String, Object> map = new HashMap<String, Object>();
//		  List<BankAccountDTO> ar = bankAccountDAO.getListByUserName(bankMemberDTO);
//		  bankMemberDTO = bankMembersDAO.getmyPage(bankMemberDTO);
//		  map.put("list", ar);
//		  map.put("dto", bankMemberDTO);
//		  return map;
//	  }
	   
	  public BankMembersDTO getmyPage(BankMembersDTO bankMembersDTO) throws Exception{
		  
		  return bankMembersDAO.getmyPage(bankMembersDTO);
	  }
	
}
