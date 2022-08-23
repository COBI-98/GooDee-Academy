package com.esh.start.qna;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.start.member.BankMembersDAO;

@Service
public class QnaService {

	
	@Autowired
	private QnaDAO qnaDAO;
	
	public List<QnaDTO> getList() throws Exception{
	
		return qnaDAO.getList();
	}
	
	public QnaDTO getDetail(QnaDTO qnaDTO) throws Exception{
		
		return qnaDAO.getDetail(qnaDTO);
	}
	
	public int add(QnaDTO qnaDTO) throws Exception{	
	
		return qnaDAO.add(qnaDTO);
	}
	
	public int setDelete(QnaDTO qnaDTO) throws Exception{

		return qnaDAO.setDelete(qnaDTO);
	
	}
	
	public int setUpdate(QnaDTO qnaDTO) throws Exception{
		return qnaDAO.setUpdate(qnaDTO);
	}
}
