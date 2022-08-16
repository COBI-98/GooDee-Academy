package com.esh.start.member;

import java.util.ArrayList;

public class BankMembersView {

	public void view(BankMembersDTO bankMembersDTO) {
		System.out.println("-----------------------");
		System.out.println(bankMembersDTO.getUserName());
		System.out.println(bankMembersDTO.getPassWord());
		System.out.println(bankMembersDTO.getName());
		System.out.println(bankMembersDTO.getEmail());
		System.out.println(bankMembersDTO.getPhone());
		System.out.println("-----------------------");
		
	}
	
	public void view(ArrayList<BankMembersDTO> ar) {
		for(int i = 0; i<ar.size();i++) {
			
			BankMembersDTO bankMembersDTO = ar.get(i);
			this.view(bankMembersDTO);;
		}
		
	}
	
}
