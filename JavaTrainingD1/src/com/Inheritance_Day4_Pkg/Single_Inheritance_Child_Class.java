package com.Inheritance_Day4_Pkg;

public class Single_Inheritance_Child_Class extends Single_Inheritance_Parent_Class{

	public void flowers() {
		System.out.println("Jasmine");
	}
	public static void main(String[] args) {
		Single_Inheritance_Child_Class c= new Single_Inheritance_Child_Class();
		c.flowers();
		c.fruits();
	}

}
