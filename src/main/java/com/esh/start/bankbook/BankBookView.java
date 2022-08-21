package com.esh.start.bankbook;

import java.util.ArrayList;

import com.esh.start.member.BankMembersDTO;

public class BankBookView {
	public void view(BankBookDTO bankBookDTO) {
		System.out.println("-----------------------");
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		System.out.println(bankBookDTO.getBookSale());
		System.out.println("-----------------------");
		
	}
	
	public void view(ArrayList<BankBookDTO> ar1) {
		for(int i = 0; i<ar1.size();i++) {
			
			BankBookDTO bankBookDTO = ar1.get(i);
			this.view(bankBookDTO);;
		}
		
	}
}
