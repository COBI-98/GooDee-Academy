package com.esh.start.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.start.member.BankMembersDAO;

@Service
public class BoardService {

	
	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> getList() throws Exception{
	
		return boardDAO.getList();
	}
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception{
		
		return boardDAO.getDetail(boardDTO);
	}
	
	public int add(BoardDTO boardDTO) throws Exception{	
	
		return boardDAO.add(boardDTO);
	}
	
	public int setDelete(BoardDTO boardDTO) throws Exception{

		return boardDAO.setDelete(boardDTO);
	
	}
	
	public int setUpdate(BoardDTO boardDTO) throws Exception{
		return boardDAO.setUpdate(boardDTO);
	}
}
