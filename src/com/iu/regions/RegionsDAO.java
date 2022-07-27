package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
		public RegionsDTO getDetail(int region_id)throws Exception{
		RegionsDTO regionsDTO=null;
		//1. DB 연결
		Connection con  = DBConnector.getConnetion();
		
		//2. SQL문 작성
		String sql="SELECT * FROM REGIONS WHERE REGION_ID=?";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		// WHERE NUM BETEEN ?(1) AND ?(2);
		st.setInt(1, region_id);
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			regionsDTO = new RegionsDTO();
			int rId= rs.getInt(1);
			regionsDTO.setRegion_id(rId);
			regionsDTO.setRegion_name(rs.getString(2));
			
		}
		
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);
		
		return regionsDTO;
		
	}
	//1. Regions 모든테이블가져오기
	public void getList(ArrayList<RegionsDTO> ar) throws Exception {
		//1. db 연결
		//static 객체 안 만들어도됨
		Connection con = DBConnector.getConnetion(); 
		
		//2. Query 작성
		String sql ="SELECT * FROM regions";
		
		// 3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		// 4. ? 값 세팅
		
		// 5. 최종 전송 후 결과처리
		ResultSet rs = st.executeQuery();
		
		
//		if(rs.next()) {
//			regionsDTO = new RegionsDTO();
//			int rId = rs.getInt(1);
//			String rName = rs.getString(2);
//			
//		}
		while(rs.next()) {
				RegionsDTO regionsDTO = new RegionsDTO();
				
				int id = rs.getInt("Region_id");
				regionsDTO.setRegion_id(id);
				String name = rs.getString("Region_name");
				regionsDTO.setRegion_name(name);
				ar.add(regionsDTO);
		}
		
		
		
//		6. 자원해제
		DBConnector.disConnect(rs, st, con);
		
	}
}
