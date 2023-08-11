package com.Polymorphism_Day6_Pkg;

public class SubClass2_Day6_Method_Overriding extends SuperClass_Day6_Method_Overriding{

	@Override
	public void color_Of_Flowers(String Rose) {
		System.out.println("SubClass-Color of Rose: " +Rose);
	}
	public void car(String car2) {
		System.out.println("SubClass-Car: " +car2);
	}
	
	public static void main(String[] args) {
		SuperClass_Day6_Method_Overriding p= new SuperClass_Day6_Method_Overriding();
		p.color_Of_Flowers("Multiple");//superClass method -passing data/value to Flowers
		p.car("Porsche");
		SuperClass_Day6_Method_Overriding c= new SubClass2_Day6_Method_Overriding();//abstraction
		c.color_Of_Flowers("Red"); //subClass method-passing data/value to Rose
		SubClass2_Day6_Method_Overriding cc= new SubClass2_Day6_Method_Overriding();
		cc.color_Of_Flowers("Yellow"); //subClass method-passing data/value to Rose
		cc.car("Cayenne");
	}

}
