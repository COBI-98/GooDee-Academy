package com.eun.loop;
import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int yId = 1234;
		int yPw = 5678;
		boolean check = true;
		boolean login = false;
		
			while(true) {
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
				
				if(yId!=checkId) {
					System.out.println("로그인실패");
					}else if (yPw != checkPw) {
					System.out.println("로그인실패");
					}else {
						System.out.println("로그인성공");
						check =! check;
						login =! login;
						break;
					}
				}
			
			if (login == true ) {
				for(int i=1; i<16 ; i++){
					System.out.println(i+"레벨입니다");
				}
				
			}
	}
}
		
		