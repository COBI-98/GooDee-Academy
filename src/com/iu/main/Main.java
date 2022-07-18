package com.iu.main;

import java.util.Scanner;

import com.iu.util.Collection;
import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
import com.iu.util.CollectionStack;

public abstract class Main implements CollectionStack, CollectionQue, CollectionSet  {

	public static void main(String[] args) {
		//1. com.iu.util.CollectionStack
			//add호출 -> (입력받는 숫자)새로운 숫자 추가 무조건 0번 인덱스에추가
			//remove -> 0번 인데스 삭제
		
		//2. com.iu.util.CollectionQue
			//add -> 새로운 숫자 추가
			//remove -> 마지막인덱스 삭제
		
		//3. com.iu.util.CollectionSet
			//add -> 새로운 숫자 마지막에 추가
			// 단, 중복되지 않은 숫자만 추가
			//remove -> 삭제할 숫자를 입력받아서 일치하는 숫자 삭제	
		int [] nums = {1,2,3};
		Scanner sc = new Scanner(System.in);
		int nums1 = sc.nextInt();
		
		CollectionStack ct = new CollectionStack() {
			@Override
			public int[] remove(int[] numbers) {
				
				return null;
			}
			
			@Override
			public int[] add(int[] numbers) {
				ct.add(nums);
				System.out.println(nums);
				return null;
			}
		};
		
		
		
	}

	

}
