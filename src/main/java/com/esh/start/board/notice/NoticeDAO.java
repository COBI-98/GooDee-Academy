package com.esh.start.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.board.impl.BoardDAO;
import com.esh.start.board.impl.BoardDTO;
import com.esh.start.member.BankMembersFileDTO;
import com.esh.start.util.Pager;

@Repository
public class NoticeDAO implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.esh.start.board.notice.NoticeDAO.";

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}

	public int setAddFile(NoticeFileDTO noticeFileDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setAddFile", noticeFileDTO);
	}
	
	
	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne(NAMESPACE+"getCount", pager);
	}



	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail", boardDTO);
	}

	@Override
	public int setadd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setadd", boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setUpdate", boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);
	}
	

}
