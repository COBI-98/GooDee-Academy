package com.esh.home.board.qna;

import java.sql.Date;

import lombok.Data;


// 상속받을때는 data 안 씀 단독으로 사용할때만
@Data
public class QnaVO {
	private Long num;
	private String title;
	private String writer;
	private String contents;
	private Long hit;
	private Date regDate;
	private Long ref;
	private Long step;
	private Long depth;
	
}