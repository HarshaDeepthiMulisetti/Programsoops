package com_Oopsconceptsjava;


class Dog extends Animals{ 
	
void bark(){
	System.out.println("barking.");
	}  
 }
class Cat extends Dog{                         //multi level inhetence Animal-->Dog-->cat
	
  void sleep()
  {
System.out.println("sleeping");
}

}

public class Inheritance {
	   
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.bark();
		cat.eat();
		cat.sleep();

	}
}

