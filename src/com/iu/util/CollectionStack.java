package com.iu.util;

public class CollectionStack implements Collection{

	@Override
	public int[] add(int[] numbers) {
		 //add - 새로운 숫자 추가 무조건 0번에 추가
		 int num=4; //추가할 Data
		 int [] newAr = new int[numbers.length+1];
		 
		 newAr[0]=num; //0 번 index에 추가
		 for(int i=0;i<numbers.length;i++) {
			 newAr[i+1]=numbers[i];
		 }
		 
		return newAr;
	}

	@Override
	public int[] remove(int[] numbers) {
		//remove - 0번 인덱스 삭제 
		int [] newAr = new int [numbers.length-1];
		for(int i=1;i<numbers.length;i++) {
			newAr[i-1]=numbers[i];
		}
		
		return newAr;
	}
	
	

}
