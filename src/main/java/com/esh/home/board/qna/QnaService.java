package com.esh.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esh.home.util.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
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
		
		for(MultipartFile f : qnaVO.getFiles()) {
			if(!f.isEmpty()) {
				log.info("FileName : {}", f.getOriginalFilename());
			}
		}
		
		return 1; //qnaMapper.setQnaList(qnaVO);
	}

	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		return getCount(pager);
	}

	
}
