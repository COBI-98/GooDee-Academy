package com.eun.loop;

import java.util.Scanner;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1번 대문자, 2번 소문자
		//	1번이면 A-Z 출력
		//	2번이면 a-z 출력
		
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1,2 중 숫자를 입력하세요.");
		a = sc.nextInt();
		
		if(a == 1) {
			for(char i= 'a'; i<= 'z'; i++) {
				System.out.print(i +" ");
			}
		}else {
			for(char i ='A'; i <= 'Z'; i++) {
				System.out.print(i + " ");
			}
		}
		
		//2. 1-10까지의 합 구하기
		int b = 0;
		for(int i=0; i<=10 ; i++) {
			b = b + i;
		}
		System.out.println(b);
		
		//3.  ID, PW를 입력해서 로그인 판단
		//	최대 5번까지 시도 가능
		//	로그인이 성공하면 그 즉시 종료
		
		int yId = 1234; //회원가입시 입력한 ID
		int yPw = 5678; //회원가입시 입력한 PW
		
		for(int i=0; i<5; i++ ) {
			System.out.println("ID를 입력하세요");
			int id = sc.nextInt();
			
			System.out.println("PW를 입력하세요");
			int pw = sc.nextInt();
			
			if(yId == id) {
				if (yPw == pw) {
					System.out.println("로그인 성공");
					break;
				}
			}else {
				System.out.println("정보가 맞지 않습니다.");
			}
		}
	}
}