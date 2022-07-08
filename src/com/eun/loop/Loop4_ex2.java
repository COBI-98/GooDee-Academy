package com.eun.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			System.out.println("1. 단발 2. 점사");
			int num = sc.nextInt();
			switch (num) {
			case 1: 
				for(int j=0; j<30; j++ ) {
					System.out.println("탕");
				}
				System.out.println("총알 다 썼어요");
				break;
			case 2:
				for(int k=0; k<30; k = k+2 ) {
					System.out.println("타타탕");
				}
				System.out.println("총알 다 썼어요");
				break;
			
			}
		}
		System.out.println("탄창 없어요");

	}
}
