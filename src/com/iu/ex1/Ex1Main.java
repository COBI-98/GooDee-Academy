package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Iu iu = Iu.getInstance();
		iu.setName("iu");
		iu.setAge(30);
		
		String name = iu.getName();
	
		System.out.println(name);
		System.out.println(iu.getAge());
		
	}
	
	
}
