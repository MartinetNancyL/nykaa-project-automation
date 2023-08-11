package com.Abstraction_Day7_Pkg;

public class Abstract_Class_Inheriting_SubClass extends Abstract_Class_Office {

	public static void main(String[] args) {
		Abstract_Class_Office a= new Abstract_Class_Inheriting_SubClass();
		a.office_Name("TCS");
		a.location();
		a.address();
	}

	@Override
	public void location() {
		System.out.println("Bangalore");
	}

	@Override
	public void address() {
		System.out.println("ITPL");
	}

}
