package com.iu.ex1;

public class Iu {

	private String name;
	private int age;
	//fix-study
	private String test;
   
	private static Iu iu;
	
   private  Iu() {
	   
   }
   
   // 개체 name,age 쓸수없음
   // 개체 선언보다 더 빨리 만들어져서
   // static으로 선언한 것만 사용가능
   public static Iu getInstance() {
	   if(Iu.iu == null) {
		   Iu.iu = new Iu();
		   
	   }
	   return Iu.iu;
   }
   
  
   
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   
   // public void set 변수명 (데이터 타입 변수명){}
   
   
   
   
   
   
   
}