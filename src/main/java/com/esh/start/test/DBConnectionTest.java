package com.esh.start.test;

import java.sql.Connection;

import com.esh.start.util.DBConnector;

public class DBConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection con  = DBConnector.getConnetion();
			System.out.println(con != null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
