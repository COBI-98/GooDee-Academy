package com.esh.start.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.member.BankMembersDTO;
import com.esh.start.util.DBConnector;

@Repository
public class BankBookDAO implements BookDAO{

	//수정
	//등록
	//판매여부 변경
	//리스트조회
	//항목조회
	//삭제
	
	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		Connection con = DBConnector.getConnetion();
		
		String sql = "INSERT INTO BANKBOOK "
				+ "VALUES (?,?,?,?) ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankBookDTO.getBookNum());
		st.setString(2, bankBookDTO.getBookName());
		st.setDouble(3, bankBookDTO.getBookRate());
		st.setInt(4, bankBookDTO.getBookSale());
		
//		ResultSet rs = st.executeQuery();
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}

	@Override
	public ArrayList<BankBookDTO> getList() throws Exception {
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		Connection con = DBConnector.getConnetion();
		
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		

		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
			ar.add(bankBookDTO);
		}
		
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
	}

	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean change = !bankBookDTO.isBooksale();
		System.out.println(bankBookDTO.isBooksale());
		System.out.println(change);
		
		
		Connection con = DBConnector.getConnetion();
		
		
		String sql = "UPDATE BANKBOOK SET BOOKSALE = ? WHERE BOOKNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
	
		
//		 
////	      int check = 0;
//	      if(bankBookDTO.isBooksale() == false) {
//	         check = 0;
//	         
//	      }else {
//	         check = 1;
//	      }
//		
		
		st.setBoolean(1, true);
		st.setLong(2, bankBookDTO.getBookNum());
		
		
		int result = st.executeUpdate();
		
		
		DBConnector.disConnect(st, con);
		
		return result;
	
		
	}

	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DBConnector.getConnetion();
		
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankBookDTO.getBookNum());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
		}
		
		
		
		DBConnector.disConnect(rs, st, con);
		return bankBookDTO;
	}

	@Override
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		
		BankBookController ct = new BankBookController();
		
		Connection con = DBConnector.getConnetion();
		
		
		String sql = "UPDATE BANKBOOK SET BOOKNAME=?, BOOKRATE = ? WHERE BOOKNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, bankBookDTO.getBookName());
		st.setDouble(2, bankBookDTO.getBookSale());
		st.setLong(3, bankBookDTO.getBookNum());
		
		int result = st.executeUpdate();
		
		
		DBConnector.disConnect(st, con);
		
		return result;
	}

	@Override
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		
		
		Connection con = DBConnector.getConnetion();
		
		
		String sql = "DELETE BANKBOOK WHERE BOOKNUM =?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, bankBookDTO.getBookNum());
		
		
		int result = st.executeUpdate();
		
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
	

}
