package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit {
	
	
	private String weapon;

	public Marine() {
		super(30);
		System.out.println("Marine 생성자");
	}
	
	
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//오버라이딩
	public void move() {
		System.out.println("뛰어다님");
	}

	//오버라이딩
	public void info() {
		super.info();
		System.out.println("Marine Info");
	}
	
	
	public void shoot() {
		System.out.println("우다다닫");
	}
}
