package com.esh.start.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
//		bankMembersDTO.setUSERNAME("EUN");
//		bankMembersDTO.setPASSWORD("QQQ");
//		bankMembersDTO.setNAME("SANGHYEON");
//		bankMembersDTO.setEMAIL("QQQ@naver.com");
//		bankMembersDTO.setPHONE("010-1234");
		try {
			
			System.out.println("검색하고싶은 아이디를 입력하세요 ");
			String str = sc.next();
			ar = dao.getSearchByID(str);
			
			view.view(ar);
			
		
//			if(result > 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//			Connection con  = DBConnector.getConnetion();
//			System.out.println(con != null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
