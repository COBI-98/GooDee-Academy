package com.esh.home.board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import com.esh.home.util.Pager;
// @Repository
@Mapper
public interface QnaMapper {

	public List<QnaVO> getList(Pager pager) throws Exception;
	
	public int setQnaList(QnaVO qnaVO) throws Exception;
	
	public int setQnaFileAdd(QnaFileVO qnaFileVO) throws Exception;
	
	public Long getCount(Pager pager) throws Exception;
	
	public QnaVO getListDetail(QnaVO qnaVO) throws Exception; 
}
