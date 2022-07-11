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
		
		String[] student_name ;
		int [] student_num ;
		int [] student_kor ;
		int [] student_eng;
		int [] student_math ;
		int [] student_total;
		double [] student_avg ;
		
		int number;
		
		
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
					System.out.println(i +"번째 학생 이름 :  ");
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
				
				
				
				
				
				
			}else if (num == 3) {
				
			}else if (num == 4) {
				
			}else if (num == 5) {
				
			}else {
				break;
			}
		}
	
		
		

	}

}
