package com.esh.start.bankaccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.start.member.BankMembersDTO;


@Service
public class BankAccountService {

	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	public List<BankAccountDTO> getListByUserName(BankMembersDTO bankMembersDTO) throws Exception{
		
		return bankAccountDAO.getListByUserName(bankMembersDTO);
	}
}
