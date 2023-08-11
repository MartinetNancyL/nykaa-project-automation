package com.Pkg_Java_Training;

public class Class_Day3 {
//encapsulation
	private void employee_Name() { //method
		System.out.println("Nancy");
	}
	private void employee_Gender() {
		System.out.println("Female");
	}
	private void employee_Skillset() {
		System.out.println("ETL/DWH/REST API Testing");
	}
	private void employee_YOE() {
		System.out.println("9 Years");
	}
	public static void main(String[] args) {
		// object creation has to be done only inside main method/naming-camel std
		//syntax: ClassName refName/objectName = new ClassName()
		Class_Day3 emp = new Class_Day3();
		emp.employee_Name();
		emp.employee_Gender();
		emp.employee_Skillset();
		emp.employee_YOE();
	}

}
