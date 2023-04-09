package com.esh.start.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

import com.esh.start.bankbook.BankBookDAO;
import com.esh.start.bankbook.BankBookDTO;
import com.esh.start.bankbook.BankBookView;
import com.esh.start.member.BankMembersDAO;
import com.esh.start.member.BankMembersDTO;
import com.esh.start.member.BankMembersView;
import com.esh.start.util.DBConnector;

public class DBConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankMembersDAO dao = new BankMembersDAO();
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		BankMembersView view = new BankMembersView();
		BankBookView bankBookview = new BankBookView();
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		BankBookDAO bankBookDAO = new BankBookDAO();
		
		Scanner sc = new Scanner(System.in);
		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
		ArrayList<BankBookDTO> ar1 = null;
//		bankMembersDTO.setUSERNAME("EUN");
//		bankMembersDTO.setPASSWORD("QQQ");
//		bankMembersDTO.setNAME("SANGHYEON");
//		bankMembersDTO.setEMAIL("QQQ@naver.com");
//		bankMembersDTO.setPHONE("010-1234");
//		long millis = System.currentTimeMillis();
//		bankBookDTO.setBOOKNUM(millis);
//		bankBookDTO.setBOOKNAME("EUN");
//		bankBookDTO.setBOOKRATE(4.5);
//		bankBookDTO.setBOOKSALE(1);
		try {
//			ar1 = bankBookDAO.getList();
//			bankBookview.view(ar1);
//			String str1 = bankBookDTO.getBOOKNAME();
//			System.out.println(str1);
//			bankBookDTO.setBOOKNUM(12L);
//			
//			int result1 = bankBookDAO.setChangeSale(bankBookDTO);
//			
			
			bankBookDTO.setBOOKNUM(10L);
			bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
			bankBookview.view(bankBookDTO);
//			if(result1 >0) {
//					System.out.println("성공");
//				}else {
//					System.out.println("실패");
//				}
			
			
//			int result = bankBookDAO.setBankBook(bankBookDTO);
//			if(result > 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
			
//			System.out.println("검색하고싶은 아이디를 입력하세요 ");
//			String str = sc.next();
//			ar = dao.getSearchByID(str);
//			
//			view.view(ar);
	
			
//			Connection con  = DBConnector.getConnetion();
//			System.out.println(con != null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
