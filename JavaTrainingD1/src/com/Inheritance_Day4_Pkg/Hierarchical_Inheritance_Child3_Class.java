package com.Inheritance_Day4_Pkg;

public class Hierarchical_Inheritance_Child3_Class extends Hierarchical_Inheritance_Parent_Class {

	private void strawberry() {
		System.out.println("Strawberry");
	}
	public static void main(String[] args) {
		Hierarchical_Inheritance_Child3_Class c3= new Hierarchical_Inheritance_Child3_Class();
		c3.strawberry();
		c3.color();
	}

}
