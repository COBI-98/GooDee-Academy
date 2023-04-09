package com.esh.start.member;

import java.util.ArrayList;

public class BankMembersView {

	public void view(BankMembersDTO bankMembersDTO) {
		System.out.println("-----------------------");
		System.out.println(bankMembersDTO.getUSERNAME());
		System.out.println(bankMembersDTO.getPASSWORD());
		System.out.println(bankMembersDTO.getNAME());
		System.out.println(bankMembersDTO.getEMAIL());
		System.out.println(bankMembersDTO.getPHONE());
		System.out.println("-----------------------");
		
	}
	
	public void view(ArrayList<BankMembersDTO> ar) {
		for(int i = 0; i<ar.size();i++) {
			
			BankMembersDTO bankMembersDTO = ar.get(i);
			this.view(bankMembersDTO);;
		}
		
	}
	
}
