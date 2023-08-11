package com.Polymorphism_Day5_Pkg;

public class Class_Day5_Method_Overloading {//compile time polymorphism/static binding
	private void testing_Method() { //method
		System.out.println("Testing");
	}
	private void testing_Method(String name){//method overloading-Data type
		System.out.println("Tester Name: " +name);
	}
	private void testing_Method(String name, int len) { //method overloading- Data count
		System.out.println("Length of " +name +" is  "+ len);
	}
	private void testing_Method(int alen, String sname) { //method overloading- Data order
		System.out.println(alen +"th "+ sname);
	}
	public static void main(String[] args) {
		Class_Day5_Method_Overloading overloading= new Class_Day5_Method_Overloading();
		overloading.testing_Method();
		overloading.testing_Method("Nancy");
		overloading.testing_Method("Automation", 10);
		overloading.testing_Method(5, "Day");
	}
}
