package com.eun.control;
import java.util.Scanner;
public class Control_ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1-5 사이의 숫자 입력");
		int num = sc.nextInt();
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		if(num==1) {
			ch = (char)(ch+1);
			if(ch >= 123){
				ch = (char) (ch-26);
			}
			System.out.println(ch +"임");
			
		}else if (num==2) {
			ch = (char)(ch+2);
			if(ch >= 123){
				ch = (char) (ch-26);
			}
			System.out.println(ch +"임");
		}else if (num==3) {
			ch = (char)(ch+3);
			if(ch >= 123){
				ch = (char) (ch-26);
			}
			System.out.println(ch +"임");
		}else if (num==4) {
			ch = (char)(ch+4);
			if(ch >= 123){
				ch = (char) (ch-26);
			}
			System.out.println(ch +"임");
		}else if (num==5) {
			ch = (char)(ch+5);
			if(ch >= 123){
				ch = (char) (ch-26);
			}
			System.out.println(ch +"임");
		}
	}
}
