package com.eun.control;

import java.util.Scanner;

public class Control5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		int avg = sum/3;
		
		switch (avg) {
		case 1:
			if (avg>=90) {
				System.out.println("총점은"+ sum+"입니다");
				System.out.println("평균은" + avg + "이며 A학점입니다");
			}
			break;

		default:
			break;
		}
		
	}

}
