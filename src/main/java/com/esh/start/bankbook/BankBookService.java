package com.esh.start.bankbook;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	//BankBook Table에 insert
		
		@Autowired
		private BankBookDAO bankBookDAO;
		
		public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		
			return bankBookDAO.setBankBook(bankBookDTO);
		}

		//BankBook 모든 데이터를 조회
		//최신순으로
		public ArrayList<BankBookDTO> getList() throws Exception{
			
			return bankBookDAO.getList();
		}

		//Sale 컬럼 수정
		public int setChangeSale(BankBookDTO bankbookDTO) throws Exception{
			
			return bankBookDAO.setChangeSale(bankbookDTO);
		}
		
		// Booknum의 값으로 조회
		public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
			
			return bankBookDAO.getDetail(bankBookDTO);
		}
		   
		public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
			
			return bankBookDAO.setUpdate(bankBookDTO);
		}
		
		public int setDelete(BankBookDTO bankBookDTO) throws Exception{
			
			return bankBookDAO.setDelete(bankBookDTO);
		}
}
