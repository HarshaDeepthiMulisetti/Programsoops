package com_Oopsconceptsjava;

class Animals { 
	
void eat(){
	System.out.println("eating.");
	}  
 }
class Tiger extends Animals{                         //single level inhetence Animal-->Dog-->cat
	
  void roar()
  {
System.out.println("roaring");
}

}
public class Singleinheritance{
	public static void main(String[] args) {
		Tiger tg=new Tiger();
		tg.eat();
		tg.roar();
	}
	
}
