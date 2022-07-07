package com.eun.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mi = 0,si = 0;
		System.out.println("분 입력");
		mi = sc.nextInt();
		System.out.println("초 입력");
		si = sc.nextInt();
		
		for(int m=0;m<60;m++) {
			
			
			for(int s=0;s<60;s++) {
				
				System.out.println(m + "분 : "+ s + "초");
				
				if(m==mi&&s==si)break;
				
				
			}
			if(m==mi)break;
		}
		
		
		
		
	}

}
