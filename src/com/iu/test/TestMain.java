package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.employees.EmployeesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
		RegionsDAO dao = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		ArrayList<RegionsDTO> ar = new ArrayList<>();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		try {
			RegionsDTO regionsDTO = new RegionsDTO();
			regionsDTO.setRegion_id(7);
			regionsDTO.setRegion_name("Mars");
			int result = dao.setRegion(regionsDTO);
			
			if(result > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
//			employeesDAO.getSalaryInfo();
//			dao.getList(ar);
//			regionsView.view(ar);
//			dao.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
