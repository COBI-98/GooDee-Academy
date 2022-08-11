package com.esh.start.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.esh.start.util.DBConnector;

public class BankMembersDAO implements MembersDAO {

	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DBConnector.getConnetion();
		
		String sql = "INSERT INTO BANKMEMBERS "
				+ "VALUES (?,?,?,?,?) ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getUSERNAME());
		st.setString(2, bankMembersDTO.getPASSWORD());
		st.setString(3, bankMembersDTO.getNAME());
		st.setString(4, bankMembersDTO.getEMAIL());
		st.setString(5, bankMembersDTO.getPHONE());
		
//		ResultSet rs = st.executeQuery();
		
		int result = st.executeUpdate();
		
		
		DBConnector.disConnect(st, con);
		
		return result;
	}

	@Override
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
		Connection con = DBConnector.getConnetion();
		
		String sql = "SELECT * FROM BANKMEMBERS WHERE USERNAME LIKE ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, "%"+search+"%");

		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankMembersDTO bankMembersDTO = new BankMembersDTO();
			
			bankMembersDTO.setUSERNAME(rs.getString("USERNAME"));		
			bankMembersDTO.setPASSWORD(rs.getString("PASSWORD"));
			bankMembersDTO.setNAME(rs.getString("NAME"));
			bankMembersDTO.setEMAIL(rs.getString("EMAIL"));
			bankMembersDTO.setPHONE(rs.getString("PHONE"));
			ar.add(bankMembersDTO);
		}
		
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
	}

	@Override
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception {
		// TODO Auto-generated method stub
		Connection con = DBConnector.getConnetion();
		
		String sql = "SELECT USERNAME, PASSWORD FROM BANKMEMBERS WHERE USERNAME =? AND PASSWORD =?";
		
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getUSERNAME());
		st.setString(2, bankMembersDTO.getPASSWORD());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			bankMembersDTO = new BankMembersDTO();
			bankMembersDTO.setUSERNAME(rs.getString("USERNAME"));
			bankMembersDTO.setPASSWORD(rs.getString("PASSWORD"));
		}else {
			bankMembersDTO = null;
			
		}
		
		DBConnector.disConnect(rs, st, con);
		return bankMembersDTO;
	}
	
		


	
	
	
}
