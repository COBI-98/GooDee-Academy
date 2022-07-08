package com.eun.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("1. 단발 2. 점사  :");
			int mode = 0;
			mode = sc.nextInt();
			
			
			for(int tan = 30; tan >0; tan --)
			
			if(mode == 1) {
				
				System.out.print("탕 ");
				
				
			}else if (mode ==2 ) {
				System.out.print("타라탕  ");
				tan --;
				tan --;
			}
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}
