package com.iu.main;

import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		//test data set
		int [] nums = {1,2,3};
		
		
		
		//1. com.iu.util.CollectionStack
			 //add - 새로운 숫자 추가 무조건 0번에 추가
			 //remove - 0번 인덱스 삭제 
			 //collectionStack.add -> {4,1,2,3}
			//collectionStack.remove -> {1,2,3} 	
		CollectionStack cs = new CollectionStack();
		
		//1) collectionStack.add ->  {4,1,2,3}
		System.out.println("======= collectionStack.add =======");
		nums = cs.add(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("======= collectionStack.remove =======");
		//2) collectionStack.remove -> {1,2,3}
		
		nums = cs.remove(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		//2. com.iu.util.CollectionQue
			 //add - 새로운 숫자 추가 무조건 0번에 추가
			 //remove - 마지막 인덱스 번호 삭제
		CollectionQue cq = new CollectionQue();
		
		//1) collectionQue.add -> {4,1,2,3}
		System.out.println("======= collectionQue.add =======");
		nums = cq.add(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		//2) collectionQue.remove -> {4,1,2} 
		System.out.println("======= collectionQue.remove =======");
		nums = cq.remove(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}		
		//3. com.iu.util.CollectionSet
			 //add - 새로운 숫자 추가 마지막에 추가
			 //      단, 중복되지 않는 숫자만 추가	
			 //remove - 삭제할 숫자를 입력받아서 일치하는 숫자 삭제
			CollectionSet cset = new CollectionSet(); 
		//1) collectionSet.add -> {4,1,2,3}
			System.out.println("======= collectionSet.add =======");
			nums = cset.add(nums);
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
			}	
		
		//2) collectionSet.remove -> {4,2,3} 
			System.out.println("======= collectionSet.remove =======");
			nums = cset.remove(nums);
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
			}
		
	}

}
