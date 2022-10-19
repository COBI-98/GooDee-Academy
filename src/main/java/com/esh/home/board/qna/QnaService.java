package com.esh.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esh.home.util.Pager;

@Service
public class QnaService implements QnaMapper {

	@Autowired
	private QnaMapper qnaMapper;
	
	@Override
	public List<QnaVO> getList(Pager pager) throws Exception {
		Long totalCount = qnaMapper.getCount(pager);
		pager.getNum(totalCount);
		pager.getRowNum();
		
		return qnaMapper.getList(pager);
	}

	@Override
	public int setQnaList(QnaVO qnaVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		return getCount(pager);
	}

	
}
