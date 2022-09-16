package com.esh.start.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esh.start.board.impl.BoardDAO;
import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.impl.BoardFileDTO;
import com.esh.start.util.Pager;

@Repository
public class QnaDAO implements BoardDAO {

	
	

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.esh.start.board.qna.QnaDAO.";

	
	public int setReplyAdd(QnaDTO qnaDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setReplyAdd", qnaDTO);
	}
	
	public int setStepUpdate(QnaDTO qnaDTO) throws Exception{
		
		return sqlSession.update(NAMESPACE+"setStepUpdate", qnaDTO);
	}
	
	
	public int setAddFile(BoardFileDTO boardFileDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setAddFile", boardFileDTO);
	}
	
	public List<BoardDTO> getList(Pager pager) throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail", boardDTO);
	}
	
	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getCount", pager);
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

	@Override
	public int setFileDelete(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setFileDelete", boardFileDTO);
	}

	

}
