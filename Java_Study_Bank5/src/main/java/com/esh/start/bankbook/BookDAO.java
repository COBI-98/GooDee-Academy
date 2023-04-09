package com.esh.start.bankbook;

import java.util.ArrayList;

public interface BookDAO {
	
	//BankBook Table에 insert
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception;

	//BankBook 모든 데이터를 조회
	//최신순으로
	public ArrayList<BankBookDTO> getList() throws Exception;

	//Sale 컬럼 수정
	public int setChangeSale(BankBookDTO bankbookDTO) throws Exception;
	
	// Booknum의 값으로 조회
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception;
	   
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception;
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception;
}
