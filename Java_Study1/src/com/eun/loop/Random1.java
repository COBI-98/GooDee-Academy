package com.eun.loop;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		//random : 0부터 입력한 정수 미만 범위에서 무작위 정수 추출
		
		//0 : 가위
		//1 : 주먹
		//2 : 보
		//이길때까지
		//사용자가 하나를 입력
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행
		boolean check = true;
		while(check) {
		System.out.println("0-2 중 하나를 입력하세요. (0: 가위, 1 : 주먹, 2 : 보)");
		
		int c = sc.nextInt();
		
		int num = random.nextInt(3);
		
		System.out.println("컴퓨터가 낸 값 : " + num);
		
		switch (c) {
		case 0 :
			switch(num) {
			case 0 :
				System.out.println("비겼습니다");
				break;
			case 1 :
				System.out.println("졌습니다");
				break;
			case 2 : 
				System.out.println("이겼습니다");
				check = false;
				break;
				
			}
			break;
			
			
		case 1 :
			
			switch(num) {
			case 0 :
				System.out.println("이겼습니다");
				check = false;
				break;
			case 1 :
				System.out.println("비겼습니다");
				break;
			case 2 :
				System.out.println("졌습니다");
				break;
			}
			
			break;
			
		case 2 :
		
			switch(num) {
			case 0 :
				System.out.println("졌습니다");
				break;
			case 1 :
				System.out.println("이겼습니다");
				check = false;
				break;
			case 2 :
				System.out.println("비겼습니다");
				break;
			}
			break;
		
			
		}
	}
	}

   
   
   
   
   
}