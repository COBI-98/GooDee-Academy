package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2,3};
		System.out.println(nums1.length);
		
		//얕은 복사
		int[] nums2 = nums1;
		System.out.println(nums2.length);
		
		int [] nums3 = new int[3];
		for (int i=0;i<nums1.length;i++) {
			nums3[i] = nums1[i];
		}
		nums2[0] = 9;
		System.out.println(nums1[0]);
		
		nums3[0] = 100;
		System.out.println(nums1[0]);
		
		nums3 = new int [3];
		System.out.println(nums3[0]);

	}

}
