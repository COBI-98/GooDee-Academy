package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
		
	public void getJoinTest(EmployeesDTO employeeDTO) throws Exception{
		Connection con = DBConnector.getConnetion();
		
		//2. SQL 작성
		String sql ="SELECT E.LAST_NAME, E.SALARY, D.DEPARTMENT_NAME "
				+ "FROM EMPLOYEES E "
				+ "    INNER JOIN "
				+ "    DEPARTMENTS D "
				+ "    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID "
				+ "    WHERE E.EMPLOYEE_ID= ? ";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 갑 세팅
		st.setInt(1,  employeeDTO.getEmployee_ID());
		
		
		//5. 최종 전송 및 결과처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
				employeeDTO = new EmployeesDTO();
				employeeDTO.setLast_Name(rs.getString("LAST_NAME"));
				employeeDTO.setSalary(rs.getInt("SALARY"));
				// departmentdto를 활용하고싶다면
//				DepartmentsDTO dt = new DepartMentsDTO();
//				dt.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
				
		}
		DBConnector.disConnect(rs, st, con);
		
	}
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
