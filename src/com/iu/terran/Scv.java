package com.iu.terran;

import com.iu.unit.Unit;

public class Scv extends Unit{

	//오버라이딩
		
	public void move() {
		System.out.println("뛰어다님");
		
	}
	
	public void attack() {
		System.out.println("공격,,");
	}
	
	public void work() {
		System.out.println("웤");
		
	}

}
