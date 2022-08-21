package com.esh.start.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.util.DBConnector;

@Repository
public class BankMembersDAO {

	@Autowired
	private SqlSession sqlsession;
	// 상수 대문자 선언 연결하려는 mapper의 namespace값
	private final String NAMESPACE ="com.esh.start.member.BankMembersDAO.";
	
	
	public int setJoin(BankMembersDTO bankMembersDTO ) throws Exception {
		return sqlsession.insert(NAMESPACE+"setJoin", bankMembersDTO);
		}
		

	public List<BankMembersDTO> getSearchById(String search) throws Exception {
		return sqlsession.selectList(NAMESPACE+"getSearchById", search);
		}

	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception {
		// TODO Auto-generated method stub
		
		// namespace + "메소드(id명)", 보내줘야할 값
		return sqlsession.selectOne(NAMESPACE+"getLogin",bankMembersDTO);
	}
	
	
	
	
	
}
