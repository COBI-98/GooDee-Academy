package com.eun.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner (System.in);
		int num = 0;
		num = sc.nextInt();
		String num1 = "홀수";
		
//		num1 = num%2==0 ? "짝수" : "홀수";
//		
		if(num%2==0) {
			num1="짝수";
		}
		
		System.out.println(num1+"입니다.");


		} 
	}

