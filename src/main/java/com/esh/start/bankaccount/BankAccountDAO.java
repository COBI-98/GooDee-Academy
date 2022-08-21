package com.esh.start.bankaccount;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.esh.start.bankbook.BankBookDTO;
import com.esh.start.member.BankMembersDTO;
import com.esh.start.util.DBConnector;

public class BankAccountDAO {

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
