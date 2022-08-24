package com.esh.start.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.impl.BoardService;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardDTO> getList(Long page) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service page : " + page);
		
		Long perPage=10L;
		
		Long startRow=(page-1)*perPage+1;
		Long lastRow=page*perPage;
		Map<String, Long> map = new HashMap<String, Long>();
		
		map.put("startRow", startRow);
		map.put("lastRow", lastRow);
		
		/* 
		 * 글의 갯수가 몇갠지 알아야함
		 * 
		 * 
		 * */
		return noticeDAO.getList(map);
	}
	
	

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setadd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setadd(boardDTO);
	}

}
