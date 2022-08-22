package com.esh.start.bankaccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.bankbook.BankBookDTO;
import com.esh.start.member.BankMembersDTO;
import com.esh.start.util.DBConnector;

@Repository
public class BankAccountDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.esh.start.bankaccount.BankAccountDAO.";
	
	public List<BankAccountDTO> getListByUserName(BankMembersDTO bankMembersDTO) throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getListByUserName", bankMembersDTO);
	}
	
	
	
	public int add(BankAccountDTO bankAccountDTO) throws Exception{
		Connection con = DBConnector.getConnetion();
		
		String sql = "INSERT INTO BANKACCOUNT "
				+ "VALUES (ACCOUNT_SEQ.NEXTVAL, ?, ?,SYSDATE)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankAccountDTO.getUserName());
		st.setLong(2, bankAccountDTO.getBookNum());
		
		
//		ResultSet rs = st.executeQuery();
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
}
