package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
		
	public void getSalaryInfo() throws Exception{
		//db연결
		Connection con = DBConnector.getConnetion();
		
		
		//2. SQL 작성
		String sql ="SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) FROM EMPLOYEES";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 갑 세팅
//		st.setString(1, country_id);
		
		//5. 최종 전송 및 결과처리
		ResultSet rs = st.executeQuery();
			
		
		
		if(rs.next()) {
			int sum = rs.getInt(1);
			Double avg = rs.getDouble(2);
			int max = rs.getInt(3);
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(max);
		}
		
		
		
		// 6. 자연 해제
		
		
		DBConnector.disConnect(rs, st, con);
		
				
				
		
		
	}
}
