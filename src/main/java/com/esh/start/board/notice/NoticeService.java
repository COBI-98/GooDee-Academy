package com.esh.start.board.notice;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.impl.BoardFileDTO;
import com.esh.start.board.impl.BoardService;
import com.esh.start.util.FileManager;
import com.esh.start.util.Pager;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	

	@Autowired
	private FileManager fileManager;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		Long totalCount = noticeDAO.getCount(pager);
		pager.getNum(totalCount);	
		
		
		pager.getRowNum();

		
		
		
//		System.out.println("Service page : " + page);
//		
//		Long perPage=10L;
//		
//		Long startRow=(page-1)*perPage+1;
//		Long lastRow=page*perPage;
//		Map<String, Long> map = new HashMap<String, Long>();
//		
//		map.put("startRow", startRow);
//		map.put("lastRow", lastRow);
//		
//		/* 
//		 * JSP에 페이지번호를 출력 1-?
//		 * 1. 글의 갯수가 몇갠지 알아야함 ->getCount -> totalCount
//		 * 2. 총 페이지 수 구하기 => totalPage
//		 * 3. perBlock : 한페이지에 출력할 번호의 수 5 ->totalBlcok
//		 * 4. page로 현재 Block 번호 찾기 -> curBlock
//		 * 5. curBlock로 시작번호와 끝번호 알아 오기 1 1-5 2- 6-10 3 11
//		 * 
//		 * */
//		Long totalCount = noticeDAO.getCount();
//		Long totalPage = 0L;
//		
//		Long perBlock=5L;
//		Long totalBlock = totalPage/perBlock;
//		
//		Long curBlock = page/perBlock;
//		
//		Long startNum=(curBlock-1)*perBlock+1;
//		Long lastNum = curBlock*perBlock;
//		
//		if(page%perBlock != 0) {
//			curBlock++;
//		}
//		
//		if(totalPage%perBlock != 0) {
//			totalBlock++;
//		}
//		
//		if(totalCount%perPage == 0) {
//			totalPage = totalCount/perPage;
//		} else {
//			totalPage = totalCount/perPage+1L;
//		}
//		
//		System.out.println(totalPage);
		
		return noticeDAO.getList(pager);
	}
	
	

	


	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setadd(BoardDTO boardDTO, MultipartFile [] files, ServletContext servletContext) throws Exception {
		// TODO Auto-generated method stub
		
		int result = noticeDAO.setadd(boardDTO);
		String path = "resources/upload/notice";
		for(MultipartFile multipartFile:files) {
			if(multipartFile.isEmpty()) {
				continue;
			}
			String fileName = fileManager.saveFile(path, servletContext, multipartFile);
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(multipartFile.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
	    	
	    	noticeDAO.setAddFile(boardFileDTO);
		}
//		String realpath = servletContext.getRealPath("resources/upload/notice");
//	      System.out.println("realePath:" + realpath);
//	      
//	      
//	      File file = new File(realpath);
//	      
//	      // 3. 저장할 폴더의 정보를 가지는 자바 객체 생성
//	      
//	    	  System.out.println(files.length);
//	    if(!file.exists()) {
//	    		  file.mkdirs(); // 파일 없으면 만들기 mkdirs
//	    } 
//	     
//	      for(int i =0; i<files.length;i++) {
//	    	  
//	    	 file = new File(realpath);
//
//		     System.out.println(boardDTO.getNum());
//		   
//	    	  
//		    if(!files[i].isEmpty()) {
//	    		  
//	    		  
//	    	  String fileName = UUID.randomUUID().toString();
//	    		
//	    	  System.out.println(fileName);
//	    	  
//	    	  Calendar ca =Calendar.getInstance();
//	    	  Long time = ca.getTimeInMillis();
//	      
//	    	  fileName = fileName + "_" + files[i].getOriginalFilename();
//	      
//	    	  System.out.println(fileName);
//	      
//	    	  // 5. HDD에 파일 저장
//	    	  // 어느 폴더에 어떤 이름으로 저장할 file 객체 생성
//	    	  file = new File(file,fileName);
//	    	  // 1)MultipartFile 클래스의 transferTo 메서드 사용
//	    	  files[i].transferTo(file);
//	    	  
//	    	  NoticeFileDTO noticeFileDTO = new NoticeFileDTO();
//	    	  noticeFileDTO.setFileName(fileName);
//	    	  noticeFileDTO.setOriName(files[i].getOriginalFilename());
//	    	  noticeFileDTO.setNum(boardDTO.getNum());
//	    	  
//	 
//	    	 
//	    	  noticeDAO.setAddFile(noticeFileDTO);
//	    	  
//	    	  
//	    	  
//	    	  } else {
//	    		  continue;
//	    	  }
	      
	      
	    	  // 4) 중복되지 않는 파일명 생성
	    	  // - 시간, java api , ...
	    	  
	    	  // 2)FileCopyUtils 클래스의 copy 메서드 사용
		return result;
	}

}
