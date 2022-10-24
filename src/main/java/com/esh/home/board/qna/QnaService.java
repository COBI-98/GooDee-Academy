package com.esh.home.board.qna;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esh.home.util.FileManager;
import com.esh.home.util.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QnaService implements QnaMapper {

	@Autowired
	private QnaMapper qnaMapper;
	
	@Value("${app.upload.qna")
	private String path;
	
	@Autowired
	private FileManager fileManager;
	
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
		
//		String realPath = session.getServletContext().getRealPath("/static/upload/qna");
//		log.info("RealPath :  {}",realPath);
		int result = qnaMapper.setQnaList(qnaVO);
		
		log.info("RealPath :  {}",path);
		
		File file = new File(path);
		
		if (!file.exists()) {
			boolean check = file.mkdirs();
			log.info("Check : {}",check);
		}
		
		
		for(MultipartFile f : qnaVO.getFiles()) {
			if(!f.isEmpty()) {
				log.info("FileName : {}", f.getOriginalFilename());
				String fileName =fileManager.saveFile(f, path);
				QnaFileVO qnaFileVO = new QnaFileVO();
				qnaFileVO.setNum(qnaVO.getNum());
				qnaFileVO.setFileName(fileName);
				qnaFileVO.setOriName(f.getOriginalFilename());
				qnaMapper.setQnaFileAdd(qnaFileVO);
			}
		}
		
		return result; //;
	}

	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		return getCount(pager);
	}

	@Override
	public int setQnaFileAdd(QnaFileVO qnaFileVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QnaVO getListDetail(QnaVO qnaVO) throws Exception {
		// TODO Auto-generated method stub
		
		
		return qnaMapper.getListDetail(qnaVO);
	}

	
}
