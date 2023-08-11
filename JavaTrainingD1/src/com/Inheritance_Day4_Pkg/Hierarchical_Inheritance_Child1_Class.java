package com.Inheritance_Day4_Pkg;

public class Hierarchical_Inheritance_Child1_Class extends Hierarchical_Inheritance_Parent_Class {
	
	private void apple() {
		System.out.println("Apple");
	}
	public static void main(String[] args) {
		Hierarchical_Inheritance_Child1_Class c1= new Hierarchical_Inheritance_Child1_Class();
		c1.apple();
		c1.color();
	}

}
