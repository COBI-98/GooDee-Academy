package com.iu.ex1;

public class Iu {

   
   
   private  Iu() {
	   
   }
   
   public static Iu getInstance() {
	   return new Iu();
   }
   
   private String name;
   private int age;
   
   
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