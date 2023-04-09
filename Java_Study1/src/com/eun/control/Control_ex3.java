package com.eun.control;
import java.util.Scanner;
public class Control_ex3 {
	public static void main(String[] args) {
		
		//월급 입력
		//1. 정규직 2. 계약직 400마넌
		// 정규직 국민연금 1%, 건강보험 1.4%, 고용 0.5%, 산재보험 0.7%
		//계약직 3.3%
		System.out.println("급여를 입력하세요");
		Scanner sc = new Scanner (System.in);
		int pay = 0;
		pay = sc.nextInt();
			
		
		System.out.println("1. 정규직 2. 계약직");
		int select = sc.nextInt();
		
		double a = pay*0.01;
		double b = pay*0.014;
		double c = pay*0.005;
		double d = pay*0.007;
		double e = pay*0.033;
		if (select == 1) {
			pay = (int) (pay-(a+b+c+d));
			System.out.println("정규직입니다");
			System.out.println("급여는" + pay + "입니다");
			
		}else {
			pay = (int) (pay-e);

			System.out.println("비 정규직입니다");
			System.out.println("급여는" + pay + "입니다");
		}
		
	
	}
}
