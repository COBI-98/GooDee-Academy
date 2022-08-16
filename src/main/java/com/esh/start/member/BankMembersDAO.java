package com.esh.start.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.util.DBConnector;

@Repository
public class BankMembersDAO implements MembersDAO {

	@Autowired
	private SqlSession sqlsession;
	// 상수 대문자 선언 연결하려는 mapper의 namespace값
	private final String NAMESPACE ="com.esh.start.member.BankMembersDAO.";
	
	
	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DBConnector.getConnetion();
		
		String sql = "INSERT INTO BANKMEMBERS "
				+ "VALUES (?,?,?,?,?) ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getUserName());
		st.setString(2, bankMembersDTO.getPassWord());
		st.setString(3, bankMembersDTO.getName());
		st.setString(4, bankMembersDTO.getEmail());
		st.setString(5, bankMembersDTO.getPhone());
		
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
			
			bankMembersDTO.setUserName(rs.getString("USERNAME"));		
			bankMembersDTO.setPassWord(rs.getString("PASSWORD"));
			bankMembersDTO.setName(rs.getString("NAME"));
			bankMembersDTO.setEmail(rs.getString("EMAIL"));
			bankMembersDTO.setPhone(rs.getString("PHONE"));
			ar.add(bankMembersDTO);
		}
		
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
	}

	@Override
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception {
		// TODO Auto-generated method stub
		
		// namespace + "메소드(id명)", 보내줘야할 값
		return sqlsession.selectOne(NAMESPACE+"getLogin",bankMembersDTO);
	}
	
	
	
	
	
}
