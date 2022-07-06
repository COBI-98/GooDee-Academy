package com.eun.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수");
		}else if(num%2==1){
			System.out.println("홀수");
		}else{
			System.out.println("정수가 아닙니다");
		}
	}

}
