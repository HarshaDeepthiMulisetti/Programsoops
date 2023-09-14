package com_Oopsconceptsjava;
class Vehicle{  
void drive(){
	System.out.println("driving.");          
	}  
}  

class Car extends Vehicle{  
void tyres(){
	System.out.println("its having tyres");
	}  
 }
class Bus extends Vehicle{                         
	
  void windows()
  {
System.out.println("its having windows");
}

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Car car=new Car();
		car.drive();
		car.tyres();
		Bus bus=new Bus();
		bus.windows();
		bus.drive();
		

	}

}
