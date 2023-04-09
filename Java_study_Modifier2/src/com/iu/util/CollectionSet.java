package com.iu.util;

public class CollectionSet implements Collection {

	@Override
	public int[] add(int[] numbers) {
		//add - 새로운 숫자 추가 마지막에 추가
		//      단, 중복되지 않는 숫자만 추가	
		int num=3; //추가할 Data
		int i=0;   //중복 확인
		for (i=0;i<numbers.length;i++) {
			if(num == numbers[i]) {
				//중복 발생
				break;
			}
		}
		//i 값이 numbers.length보다 작은 경우 중복 Data가 있는 경우
		//아니면 중복이 없는 경우

		if(i<numbers.length) {
			//중복된 데이터가 있는 경우
			//Data를 추가하지 않고 기존 Data를 리턴
			return numbers;
		}else {
			//중복된 데이터가 없는 경우
			//Data를 추가하고 리턴
			int [] newAr = new int[numbers.length+1];

			for(i=0;i<numbers.length;i++) {
				newAr[i]=numbers[i];
			}
			newAr[numbers.length]=num;

			return newAr;
		}


	}

	@Override
	public int[] remove(int[] numbers) {
		//remove - 삭제할 숫자를 입력받아서 일치하는 숫자 삭제
		int num=1; //삭제할 Data;
		int i=0;   //삭제할 Data 확인
		for (i=0;i<numbers.length;i++) {
			if(num == numbers[i]) {
				//삭제할 Data와 일치
				break;
			}
		}
		
		if(i<numbers.length) {
			//삭제할 data를 제외하고 배열 복사
			int [] newAr = new int [numbers.length-1];
			int index=0; //newAr index번호용
			
			for(int j=0;j<numbers.length;j++) {
				if(j==i) {
					continue;
				}
				newAr[index]=numbers[j];
				index++;
				
			}
			return newAr;
		}
		
		return numbers;
	}

}
