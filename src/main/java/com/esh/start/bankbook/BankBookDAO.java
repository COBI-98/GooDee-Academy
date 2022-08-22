package com.esh.start.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
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
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.esh.start.bankbook.BankBookDAO.";
	
	
	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		
//		ResultSet rs = st.executeQuery();
		
		return sqlSession.insert(NAMESPACE+"setBankBook",bankBookDTO);
	}

	@Override
	public List<BankBookDTO> getList() throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getList");
	}

	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		
		
		return sqlSession.update(NAMESPACE+"setChangeSale", bankBookDTO);
	}

	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getDetail", bankBookDTO);
	}

	@Override
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}

	@Override
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.delete(NAMESPACE+"setDelete", bankBookDTO);
	}
	

}
