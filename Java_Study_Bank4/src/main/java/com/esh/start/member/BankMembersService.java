package com.esh.start.member;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMembersService {

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	//bankmembers 회원가입
	  public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		
		  return bankMembersDAO.setJoin(bankMembersDTO);
	  }
	   
	   //검색어를 입력해서 ID를 찾기 
	   
	  public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception{
		  return bankMembersDAO.getSearchByID(search);
	  }
	   
	  // login 
	  public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		  
		  return bankMembersDAO.getLogin(bankMembersDTO);
	  }
	  
	  

	   
	
}
