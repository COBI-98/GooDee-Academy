package com.eun.control;

import java.util.Scanner;

public class Control_ex1 {

	public static void main(String[] args) {
		//국어 영어 수학 점수 입력 후 총점과 평점 계산
		// 평점이 90점 이상 우등상
		// 모든 학생들은 졸업 출력
		
		// 2) 90점 이상이면 a
		// 80점 이상이면 b
		// 70점 이상이면 c
		// 60점 이상이면 d
		// 나머지 f	
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("국어점수를 입력하세요");
		a = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		b = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		c = sc.nextInt();
		int sum= a+b+c;
		int avg = sum/3;
//		if(avg>=90) {
//			System.out.println("총점은"+sum+"입니다.");
//			System.out.println("우등상입니다");
//			System.out.println("졸업입니다");
//		}else {
//			System.out.println("졸업입니다");
//		}
		if(avg>=90) {
			System.out.println("A학점");
		}else if(avg>=80 && avg<90) {
			System.out.println("B학점");
		}else if(avg>=70 && avg<80) {
			System.out.println("C학점");
		}else if(avg>=60 && avg<70) {
			System.out.println("D학점");
		} else {
			System.out.println("재수강");
		}
			
	
	}
}