package com.esh.start.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.bankbook.BankBookDTO;
import com.esh.start.util.DBConnector;


@Repository
public class BoardDAO {

	@Autowired
	private SqlSession sqlsession;
	// 상수 대문자 선언 연결하려는 mapper의 namespace값
	private final String NAMESPACE ="com.esh.start.board.BoardDAO.";
	
	
	
	public List<BoardDTO> getList() throws Exception{
		
		return sqlsession.selectList(NAMESPACE+"getList");
	}
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception{
		
		return sqlsession.selectOne(NAMESPACE+"getDetail",boardDTO);
	}
	
	public int add(BoardDTO boardDTO) throws Exception{
				
		return sqlsession.insert(NAMESPACE+"add",boardDTO);
	}
	
	public int setDelete(BoardDTO boardDTO) throws Exception{
		
		return sqlsession.delete(NAMESPACE+"setDelete",boardDTO);
	}
	
	public int setUpdate(BoardDTO boardDTO) throws Exception{
		
		return sqlsession.update(NAMESPACE+"setUpdate",boardDTO);
	}
	
	
}
