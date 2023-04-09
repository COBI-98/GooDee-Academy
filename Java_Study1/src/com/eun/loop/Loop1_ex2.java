package com.eun.loop;

import java.util.Scanner;

public class Loop1_ex2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		
		
		// 1. 1번 대문자, 2번 소문자
		//1번이면 A-Z 출력dSDASD
		//2번이면 a-z 출력d
		
		int num = 0;
		System.out.print("1. 대문자 출력 2. 소문자 출력  : ");
		num = sc.nextInt();
		
		
		switch(num) {
			case 1:
				for(int i = 'a' ; i <= 'z' ; i ++ ) {
					System.out.println((char)i);
					
					
				}
				break;
			case 2:
				for(int i = 'A' ; i <= 'Z' ; i ++ ) {
					System.out.println((char)i);
				}
				break;
		}
		
		
		
		// 2. 1-10까지의 합 구하기
		int sum = 0 ;
		System.out.println("1~10까지 합은 ");
		for(int j = 0 ; j <= 10 ; j ++ ) {
			sum += j;
		}
		System.out.println(sum + " 입니다 .");
		
		
		
		// 3. ID PW 입력해서 로그인 판단  . 틀리면 다시 입력 . 최대 5번 . 5번 틀리면 끝
		int yId=1234;
		int yPw=5678;
		int checkID = 0;
		int checkPW = 0;
		
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("아이디를 입력하세요");
			checkID = sc.nextInt();
			
			
			System.out.println("비밀번호를 입력하세요");
			checkPW = sc.nextInt();
			
			
			if(yId != checkID) {
				
				System.out.println("로그인 실패");
			}else if(yPw != checkPW) {
				
				System.out.println("로그인 실패");
			}
			else {
				System.out.println("로그인 성공");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("End");
	}

}
