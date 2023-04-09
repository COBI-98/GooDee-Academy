package com.esh.start.board.qna;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.impl.BoardFileDTO;
import com.esh.start.board.impl.BoardService;
import com.esh.start.board.notice.NoticeDAO;
import com.esh.start.util.FileManager;
import com.esh.start.util.Pager;

@Service
public class QnaService implements BoardService {

	

	@Autowired
	private QnaDAO qnaDAO;
	
	
	@Autowired
	private FileManager fileManager;
	
	public int setReply(QnaDTO qnaDTO) throws Exception {
		BoardDTO boardDTO = qnaDAO.getDetail(qnaDTO);
		QnaDTO parent = (QnaDTO) boardDTO;
		
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		qnaDAO.setStepUpdate(parent);
		int result = qnaDAO.setReplyAdd(qnaDTO);
		
		return result;
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		Long totalCount = qnaDAO.getCount(pager);
		pager.getNum(totalCount);	

		pager.getRowNum();
		
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getDetail(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setUpdate(boardDTO);
	}

	@Override
	public int setadd(BoardDTO boardDTO , MultipartFile[] files, ServletContext servletContext) throws Exception {
		// TODO Auto-generated method stub
		
		int result = qnaDAO.setadd(boardDTO);
		String path = "resources/upload/qna";
		for(MultipartFile multipartFile:files) {
			if(multipartFile.isEmpty()) {
				continue;
			}
			String fileName = fileManager.saveFile(path, servletContext, multipartFile);
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(multipartFile.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
	    	
	    	qnaDAO.setAddFile(boardFileDTO);
		}
		
		return result;
	}

	@Override
	public int setFileDelete(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setFileDelete(boardFileDTO);
	}
}
