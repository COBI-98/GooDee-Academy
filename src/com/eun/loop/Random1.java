package com.eun.loop;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner (System.in);
	
	Random rd = new Random();

	
	while(true) {

		System.out.println("가위바위보 하나를 입력하세요 0 : 가위, 1 : 주먹, 2 : 보");
		int user = sc.nextInt();
		int num = rd.nextInt(3);
		if(num == user) {
			System.out.println("비겼습니다");
		}else if (num ==1 && user ==2 || num ==2 && user ==0 || num == 0 && user == 1 ) {
		System.out.println("이겼습니다. 축하합니다 ");
		System.out.println("프로그램을 종료합니다");
		break;
	}else{
				System.out.println("졌습니다");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
