package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {
	public static void main(String[] args) {
		
		// 키보드로부터 인원수를 입력받아서 인원수 만큼 이름을 입력 받아서 이름들을 출력
		
		int num = 0;
		String [] names ;
		int [] korean;
		
		
		System.out.print("인원수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		
		names = new String[num];
		
		
		
		for(int i = 0; i < names.length; i ++) {
			
			System.out.print(i+1 +"번째 이름을 입력하세요 : ");
			names[i] = sc.next();
			
		}
		
		korean = new int[num];
		int sum = 0 ;
		for(int i = 0; i < names.length; i ++) {
			
			System.out.print(names[i] + "의 국어 점수를 입력하세요 . : ");
			korean[i] = sc.nextInt();
			sum += korean[i];
		}
		
		
		System.out.println("국어 점수 의 총 합은 : "+ sum +"점 입니다.");
		
		
		
		
	}
}
