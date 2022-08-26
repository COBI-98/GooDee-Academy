package com.esh.start.member;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esh.start.bankaccount.BankAccountDAO;
import com.esh.start.bankaccount.BankAccountDTO;

@Service
public class BankMembersService {

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
//	@Autowired
//	private BankAccountDAO bankAccountDAO;
	
	@Autowired
	private ServletContext servletContext;
	
	//bankmembers 회원가입
	  public int setJoin(BankMembersDTO bankMembersDTO, MultipartFile photo) throws Exception{
		
		  // 1.HDD 파일 저장
	      //  1)OS 기준으로 설정 /resources/upload/member
	      //  2)OS 기준 저장할 폴더의 실제 경로를 반환
		  
	      // 2. 저장된 파일 정보를 DB에 저장
	      String realpath = servletContext.getRealPath("resources/upload/member");
	      System.out.println("realePath:" + realpath);

	      int result = bankMembersDAO.setJoin(bankMembersDTO);
	      // 3. 저장할 폴더의 정보를 가지는 자바 객체 생성
	      File file = new File(realpath);

	      if(!photo.isEmpty()) {
	    	  
	      System.out.println("photo:"+photo.getOriginalFilename());
	      
	    	  if(file.exists()) {
	    		  file.mkdirs(); // 파일 없으면 만들기 mkdirs
	    	  } 
	      
	      
	    	  // 4) 중복되지 않는 파일명 생성
	    	  // - 시간, java api , ...
	    	  String fileName = UUID.randomUUID().toString();
	
	    	  System.out.println(fileName);
	      
	    	  Calendar ca =Calendar.getInstance();
	    	  Long time = ca.getTimeInMillis();
	      

	    	  fileName = fileName + "_" + photo.getOriginalFilename();
	      
	    	  System.out.println(fileName);
	      
	    	  // 5. HDD에 파일 저장
	    	  // 어느 폴더에 어떤 이름으로 저장할 file 객체 생성
	    	  file = new File(file,fileName);
	    	  // 1)MultipartFile 클래스의 transferTo 메서드 사용
	    	  photo.transferTo(file);
	    	  // 2)FileCopyUtils 클래스의 copy 메서드 사용
	    	  
	    	  
	    	  //2. 저장된 파일정보를 DB에 저장
	    	  BankMembersFileDTO membersFileDTO = new BankMembersFileDTO();
	    	  membersFileDTO.setFileName(fileName);
	    	  membersFileDTO.setOriName(photo.getOriginalFilename());
	    	  membersFileDTO.setUserName(bankMembersDTO.getUserName());
	    	  
	    	  bankMembersDAO.setAddFile(membersFileDTO);
	      }
	      
	      
		  return result;
	  }
	   
	   //검색어를 입력해서 ID를 찾기 
	   
	  public List<BankMembersDTO> getSearchById(String search) throws Exception {
			
		  return bankMembersDAO.getSearchById(search);
	}
	   
	  // login 
	  public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		  
		  return bankMembersDAO.getLogin(bankMembersDTO);
	  }
	  
	  
//	  public Map<String, Object> getmyPage(BankMembersDTO bankMemberDTO) throws Exception{
//		  Map<String, Object> map = new HashMap<String, Object>();
//		  List<BankAccountDTO> ar = bankAccountDAO.getListByUserName(bankMemberDTO);
//		  bankMemberDTO = bankMembersDAO.getmyPage(bankMemberDTO);
//		  map.put("list", ar);
//		  map.put("dto", bankMemberDTO);
//		  return map;
//	  }
	   
	  public BankMembersDTO getmyPage(BankMembersDTO bankMembersDTO) throws Exception{
		  
		  return bankMembersDAO.getmyPage(bankMembersDTO);
	  }
	
}
