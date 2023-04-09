package com.esh.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

	//선언 x Car => car == myCar  -> LeftWheel => leftWheel 
public class Car {

	//Car는  Engine이 없으면 X
	//Car는 Engine에 의존적
	
	private Engine engine;
	private Wheel leftWheel;
	private Wheel rightWheel;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//멤버변수 초기화
	// 1. private Engine engine = new Engine();
	
	// Car car = new Car();
	
	
	
	
	
	//3. public Car(){
	//		this.engine=engine;
	//}
	

	
	public Car(Engine engine, Wheel leftWheel, Wheel rightWheel) {
		
		this.leftWheel=leftWheel;
		this.rightWheel=rightWheel;
	}
//	
//	Engine engine = new Engine();
//	 Car car = new Car(engine);

}
