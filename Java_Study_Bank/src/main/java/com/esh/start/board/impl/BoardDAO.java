package com.esh.start.board.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

import com.esh.start.util.Pager;

public interface BoardDAO {

	//FileDelete
	public int setFileDelete(BoardFileDTO boardFileDTO) throws Exception;
	//글목록
	public List<BoardDTO> getList(Pager pager) throws Exception;
	//글디테일
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	//글삭제
	public int setDelete(BoardDTO boardDTO) throws Exception;
	//글수정
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	//글추가
	public int setadd(BoardDTO boardDTO) throws Exception;

	public Long getCount(Pager pager) throws Exception;
	
	public BoardFileDTO getFileDetail(BoardFileDTO boardFileDTO) throws Exception;
}
