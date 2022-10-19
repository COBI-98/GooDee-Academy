package com.esh.home.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.esh.home.util.Pager;
// @Repository
@Mapper
public interface QnaMapper {

	public List<QnaVO> getList(Pager pager) throws Exception;
	
	public int setQnaList(QnaVO qnaVO) throws Exception;
	
	public Long getCount(Pager pager) throws Exception;
}
