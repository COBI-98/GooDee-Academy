package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학교 성적프로그램
		//1. 학생 정보 입력
		//	-학생 수를 입력
		//	-이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
		//2. 학생 정보 조회
		//	-모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 학생 정보 검색
		//	-검색할 학생의 번호를 입력
		//	-입력한 번호와 일치하는 학생의 모든 정보 출력
		//	-일치하는 번호가 없으면 없는 학생이다 출력
		//4. 학생 정보 삭제
		//	-삭제할 학생의 번호를 입력
		//	-입력한 번호와 일치하는 학생의 정보 삭제 (배열을 한칸 삭제)
		//	-일치하는 번호가 없으면 없는 학생이다 출력
		//5. 학생 정보 추가
		//6. 프로그램 종료
		
		int num, student = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		String[] student_name = new String[0] ;
		int [] student_num = new int[0];
		int [] student_kor = new int[0];
		int [] student_eng = new int[0];;
		int [] student_math  = new int[0];
		int [] student_total = new int[0];
		double [] student_avg  = new double[0];
		
		int number=0;
		
		
		while(check) {
			System.out.println("1.학생정보입력 2.학생정보조회 3.학생정보검색 4.학생정보삭제 5.학생정보추가 6.프로그램 종료");
			num = sc.nextInt();
			
			System.out.println(num + "을 선택하셨습니다.");
			if(num == 1) {
				
				System.out.println("학생 수를 입력 해 주십시오. ");
				number = sc.nextInt();
				
				student_name = new String[number];
				student_num = new int[number];
				student_kor = new int[number];
				student_eng = new int[number];
				student_math = new int[number];
				student_total = new int[number];
				student_avg = new double[number];
				
				
				
				
				for ( int i = 0 ; i < number ; i ++ ) {
					System.out.println(i+1 +"번째 학생 이름 :  ");
					student_name[i] = sc.next();
					System.out.println("학생 번호 :  ");
					student_num[i] = sc. nextInt();
					System.out.println("국어 점수 :   ");
					student_kor[i] = sc. nextInt();
					System.out.println("영어 점수 :   ");
					student_eng[i] = sc. nextInt();
					System.out.println("수학 점수 :   ");
					student_math[i] = sc. nextInt();
					student_total[i] = student_kor[i] + student_eng[i] + student_math[i];
					student_avg[i] = student_total[i]/3;
				}
				
				
			}else if (num == 2) {
				
				for (int i = 0 ; i < number ; i ++) {
					
					System.out.println(student_name[i] +" "+ student_num[i]+" "+student_kor[i]+" "+ student_eng[i]+" "+student_math[i]+" "+ student_total[i] +" "+student_avg[i]);
					
					
					
				}
				
				
				
				
				
			}else if (num == 3) {
				
				
				
				
				
				System.out.println("검색 가능한 학생 번호");
				for (int i = 0 ; i < number ; i ++) {
					
					System.out.print(student_num[i]+" ");
					
				}
				
				System.out.println("검색할 번호 : ");
				int j = sc.nextInt();
				boolean checkst = false;
				for (int i = 0 ; i < number ; i ++) {
					
					if(student_num[i] == j) {
						System.out.println(student_name[i] +" "+ student_num[i]+" "+student_kor[i]+" "+ student_eng[i]+" "+student_math[i]+" "+ student_total[i] +" "+student_avg[i]);
						checkst = true;
						
					}
				}
				
				if(checkst == false ) {
					System.out.println("그런 사람 없습니다. ");
				}
				
				checkst = false;
				
				
			}else if (num == 4) {
				
				System.out.println("삭제 가능한 학생 번호");
				for (int i = 0 ; i < number ; i ++) {
					
					System.out.print(student_num[i]+" ");
					
				}
				
				System.out.println("삭제할 번호 : ");
				int j = sc.nextInt();
				boolean checkst = false;
				int number1 = number;
				
				String student_name1[] = new String[number1];
				int student_num1[] = new int[number1];
				int student_kor1[] = new int[number1];
				int student_eng1[] = new int[number1];
				int student_math1[] = new int[number1];
				int student_total1[] = new int[number1];
				double student_avg1[] = new double[number1];
				
				int k = 0 ;
				
				for (int i = 0 ; i < number ; i ++) {
					
					if(student_num[i] == j) {
						checkst = true;
						
						
						continue;
						
						
						
					}
					student_name1[k] = student_name[i];
					student_num1[k] =student_num[i];
					student_kor1[k] =student_kor[i];
					student_eng1[k] =student_eng[i];
					student_math1[k] =student_math[i];
					student_total1[k] =student_total[i];
					student_avg1[k] =student_avg[i];
					
					k++;
				}
				
				if(checkst == false ) {
					System.out.println("그런 사람 없습니다. ");
				}else {
					
					number -= 1; 
					student_name = student_name1;
					student_num =student_num1;
					student_kor =student_kor1;
					student_eng =student_eng1;
					student_math =student_math1;
					student_total =student_total1;
					student_avg =student_avg1;
					
					
					
					
				}
				
				checkst = false;
				
				
			}else if (num == 5) {
				
				
				
				number += 1;
				String student_name1[] = new String[number];
				int student_num1[] = new int[number];
				int student_kor1[] = new int[number];
				int student_eng1[] = new int[number];
				int student_math1[] = new int[number];
				int student_total1[] = new int[number];
				double student_avg1[] = new double[number];
				
				System.out.println("추가할 학생 이름 :  ");
				student_name1[number-1] = sc.next();
				System.out.println("학생 번호 :  ");
				student_num1[number-1] = sc. nextInt();
				System.out.println("국어 점수 :   ");
				student_kor1[number-1] = sc. nextInt();
				System.out.println("영어 점수 :   ");
				student_eng1[number-1] = sc. nextInt();
				System.out.println("수학 점수 :   ");
				student_math1[number-1] = sc. nextInt();
				student_total1[number-1] = student_kor1[number-1] + student_eng1[number-1] + student_math1[number-1];
				student_avg1[number-1] = student_total1[number-1]/3;
				
				
				
				
				student_name = student_name1;
				student_num =student_num1;
				student_kor =student_kor1;
				student_eng =student_eng1;
				student_math =student_math1;
				student_total =student_total1;
				student_avg =student_avg1;
				
				
				
				
				
			}else {
				break;
			}
		}
	
		System.out.println("프로그램이 종료 되었습니다. ");
		

	}

}
