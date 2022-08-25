package com.esh.start.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.impl.BoardService;
import com.esh.start.util.Pager;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		Long totalCount = noticeDAO.getCount(pager);
		pager.getNum(totalCount);	
		
		
		pager.getRowNum();

		
		
		
//		System.out.println("Service page : " + page);
//		
//		Long perPage=10L;
//		
//		Long startRow=(page-1)*perPage+1;
//		Long lastRow=page*perPage;
//		Map<String, Long> map = new HashMap<String, Long>();
//		
//		map.put("startRow", startRow);
//		map.put("lastRow", lastRow);
//		
//		/* 
//		 * JSP에 페이지번호를 출력 1-?
//		 * 1. 글의 갯수가 몇갠지 알아야함 ->getCount -> totalCount
//		 * 2. 총 페이지 수 구하기 => totalPage
//		 * 3. perBlock : 한페이지에 출력할 번호의 수 5 ->totalBlcok
//		 * 4. page로 현재 Block 번호 찾기 -> curBlock
//		 * 5. curBlock로 시작번호와 끝번호 알아 오기 1 1-5 2- 6-10 3 11
//		 * 
//		 * */
//		Long totalCount = noticeDAO.getCount();
//		Long totalPage = 0L;
//		
//		Long perBlock=5L;
//		Long totalBlock = totalPage/perBlock;
//		
//		Long curBlock = page/perBlock;
//		
//		Long startNum=(curBlock-1)*perBlock+1;
//		Long lastNum = curBlock*perBlock;
//		
//		if(page%perBlock != 0) {
//			curBlock++;
//		}
//		
//		if(totalPage%perBlock != 0) {
//			totalBlock++;
//		}
//		
//		if(totalCount%perPage == 0) {
//			totalPage = totalCount/perPage;
//		} else {
//			totalPage = totalCount/perPage+1L;
//		}
//		
//		System.out.println(totalPage);
		
		return noticeDAO.getList(pager);
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
