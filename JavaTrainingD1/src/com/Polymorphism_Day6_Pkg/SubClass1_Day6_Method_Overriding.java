package com.Polymorphism_Day6_Pkg;

public class SubClass1_Day6_Method_Overriding extends SuperClass_Day6_Method_Overriding{

	@Override
	public void color_Of_Flowers(String Jasmine) {
		super.color_Of_Flowers("Multiple");//superClass Method-passing data/value to Flowers
		System.out.println("SubClass-Color of Jasmine: " +Jasmine);
		super.car("Mini Cooper"); //calling superclass-car method in subclass-color_Of_Flowers method
	}
	
	public static void main(String[] args) {
		SubClass1_Day6_Method_Overriding c1= new SubClass1_Day6_Method_Overriding();
		c1.color_Of_Flowers("White"); //subClass Method-passing data/value to Jasmine
		
	}
}
