package com.eun.loop;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		
		for(int m=0;m<60;m++) {
			
			
			for(int s=0;s<60;s++) {
				
				System.out.println(m + "분 : "+ s + "초");
				
				if(m==1&&s==15)break;
				
				
			}
			if(m==1)break;
		}
		
		
		
		
	}

}
