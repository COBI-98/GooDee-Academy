package com.eun.loop;

import java.util.Random;
import java.util.Scanner;

public class Random1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		Random rd = new Random();

		
		while(true) {

			System.out.println("가위바위보 하나를 입력하세요 0 : 가위, 1 : 주먹, 2 : 보");
			int user = sc.nextInt();
			int num = rd.nextInt(3);
			if(num == user) {
				System.out.println("비겼습니다 컴퓨터 : " + num);
			}else if (user-num !=2 && user-num >0 || user-num ==-2  ){
			System.out.println("이겼습니다. 축하합니다 컴퓨터 : " + num);
			System.out.println("프로그램을 종료합니다");
			
		}else{
					System.out.println("졌습니다 컴퓨터 : " + num);
		}
		}
		
	}

}
