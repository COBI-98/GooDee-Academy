package com.eun.loop;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		// 분과 초를 입력 받았을 때 그 분 초 되면 멈춰지게 하는 for문
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		for(int i=0; i<60; i++) {
			
			for(int j=1; j<60; j++) {
				System.out.println(i+ "분" + j + "초");
				if (i == m && j == s) {
					m = 60;
					break;
					}
			
			}
//		if(i==m)break;
		}
	}
}
