package com.eun.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int yId = 1234;
		int yPw = 5678;
		
		int inputID;
		int inputPW;
		
		
		
		while(true){
			
			System.out.print(" 1. Try to login   2. Exit");
			inputID = sc.nextInt();
			if(inputID == 2) {
				System.out.print(" Good Bye "); 
			break;
			}
			
			
			
			System.out.print(" what ur ID : ");
			inputID = sc.nextInt();
			
			System.out.print(" what ur PW : ");
			inputPW = sc.nextInt();
			
			
			
			if(inputID == yId && inputPW == yPw) {
				
				System.out.println(" Login ");
				
				break;
			}
			
			System.out.println(" No Login ");
			
			
		}
		
		
		
	}

}
