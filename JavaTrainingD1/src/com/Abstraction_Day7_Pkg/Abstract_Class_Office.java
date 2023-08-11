package com.Abstraction_Day7_Pkg;

public abstract class Abstract_Class_Office {//having at least one abstract method should have abstract keyword in class
	public void office_Name(String n) {//non-abstract method-can be instantiated
		System.out.println(n);
	}
	public abstract void location();//abstract method
	public abstract void address();
}
