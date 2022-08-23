package com.esh.start.qna;

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
public class QnaDAO {

	@Autowired
	private SqlSession sqlsession;
	// 상수 대문자 선언 연결하려는 mapper의 namespace값
	private final String NAMESPACE ="com.esh.start.qna.QnaDAO.";
	
	
	
	public List<QnaDTO> getList() throws Exception{
		
		return sqlsession.selectList(NAMESPACE+"getList");
	}
	
	public QnaDTO getDetail(QnaDTO qnaDTO) throws Exception{
		
		return sqlsession.selectOne(NAMESPACE+"getDetail", qnaDTO);
	}
	
	public int add(QnaDTO qnaDTO) throws Exception{
				
		return sqlsession.insert(NAMESPACE+"add", qnaDTO);
	}
	
	public int setDelete(QnaDTO qnaDTO) throws Exception{
		
		return sqlsession.delete(NAMESPACE+"setDelete", qnaDTO);
	}
	
	public int setUpdate(QnaDTO qnaDTO) throws Exception{
		
		return sqlsession.update(NAMESPACE+"setUpdate", qnaDTO);
	}
	
	
}
