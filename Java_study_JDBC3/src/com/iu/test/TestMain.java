package com.iu.test;

import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
		DBConnector dbConnector = new DBConnector();
		
		try {
			DBConnector.getConnetion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
