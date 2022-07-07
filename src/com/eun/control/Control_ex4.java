package com.eun.control;
import java.util.Scanner;
public class Control_ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1-5 사이의 숫자 입력");
		int num = sc.nextInt();
		System.out.println("알파벳을 입력해보보보봅까");
		char ch = sc.next().charAt(0);
		if(num>=1 && num<=5) {
			ch = (char)(ch+num);
			if(ch >= 123){
				 ch = (char) (ch-26);
			}
			System.out.println(ch +"임");
			
		}
	}
	
}
