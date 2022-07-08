package com.eun.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int yId = 1234;
		int yPw = 5678;
		boolean check = true;
		int lv = 1;
		int exp = 0;
		int gold = 0;
		boolean logincheck = false ;
		
		
		while(check) {
			System.out.println("1. 로그인 2. 프로그램 종료");
			int num = sc.nextInt();
			
			if(num == 1) {
			}else {
				System.out.println("종료");
				check =! check;
				break;
			}
			
			System.out.println("아이디입력");
			int checkId = sc.nextInt();
			System.out.println("비밀번호입력");
			int checkPw = sc.nextInt();
			
			if(yId!=checkId && yPw != checkPw) {
				System.out.println("로그인실패");
			}else {
				System.out.println("로그인성공");
				check =! check;
				logincheck =! logincheck;
				System.out.println("Game Start");
				break;
				}
			}
		
		while(logincheck) {
			
			while(exp<(lv * 3)) {
				
				System.out.println("사냥");
				exp ++;

			}
			lv++;
			exp = 0;
			System.out.println("레벨 업");
			
			if( lv == 5) {
							
				System.out.println("5렙 ㅊㅋㅊㅋ 1000 Gold 획득");		
				gold += 1000;
							
			}
			if( lv == 10) {
				
				System.out.println("10렙 ㅊㅋㅊㅋ 2000 Gold 획득");		
				gold += 2000;
				
			}
			
			
			if( lv == 15) {
				
				System.out.println("만렙 ㅊㅋㅊㅋ 3000 Gold 획득");		
				gold += 3000;
				break;
				
			}
			
			
		}
		
		
		
		
		
		
			
			
			} 
			
		}
		
		
		
