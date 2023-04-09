package com.esh.start.bankbook;

public class BankBookDTO {

	private Long BOOKNUM;
	
	
	private String BOOKNAME;
	private Double BOOKRATE;
	private Integer BOOKSALE;
	
	public Long getBOOKNUM() {
		return BOOKNUM;
	}
	public void setBOOKNUM(Long bOOKNUM) {
		BOOKNUM = bOOKNUM;
	}
	public String getBOOKNAME() {
		return BOOKNAME;
	}
	public void setBOOKNAME(String bOOKNAME) {
		BOOKNAME = bOOKNAME;
	}
	public Double getBOOKRATE() {
		return BOOKRATE;
	}
	public void setBOOKRATE(Double bOOKRATE) {
		BOOKRATE = bOOKRATE;
	}
	public Integer getBOOKSALE() {
		return BOOKSALE;
	}
	public void setBOOKSALE(Integer bOOKSALE) {
		BOOKSALE = bOOKSALE;
	}
	public boolean isBooksale() {
		// TODO Auto-generated method stub
		return false;
	}
}
