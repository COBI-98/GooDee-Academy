package com.iu.unit;

public abstract class Unit {
	// avstract 추상화한다.
	// class 앞에 있을경우 개체를 못만듬
	private int hp;
	private String color;
	private String name;
	
	public Unit(int hp) {
		System.out.println("Super 생성자");
		this.hp=hp;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void move();
	
	public void info() {
		System.out.println("Super Info");
	}
	
}
