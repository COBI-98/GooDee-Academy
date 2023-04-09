package com.esh.start.bankaccount;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BankAccountDTO {
	
	private Long ACCOUNTNUM;
	private String USERNAME;
	private Long BOOKNUM;
	private Date DATE;
	public Long getACCOUNTNUM() {
		return ACCOUNTNUM;
	}
	public void setACCOUNTNUM(Long aCCOUNTNUM) {
		ACCOUNTNUM = aCCOUNTNUM;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public Long getBOOKNUM() {
		return BOOKNUM;
	}
	public void setBOOKNUM(Long bOOKNUM) {
		BOOKNUM = bOOKNUM;
	}
	public Date getDATE() {
		return DATE;
	}
	public void setDATE(Date dATE) {
		DATE = dATE;
	}
	
	
}
