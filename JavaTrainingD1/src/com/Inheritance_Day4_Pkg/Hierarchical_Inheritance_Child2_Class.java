package com.Inheritance_Day4_Pkg;

public class Hierarchical_Inheritance_Child2_Class extends Hierarchical_Inheritance_Parent_Class {

	private void cherry() {
		System.out.println("Cherry");
	}
	public static void main(String[] args) {
		Hierarchical_Inheritance_Child2_Class c2= new Hierarchical_Inheritance_Child2_Class();
		c2.cherry();
		c2.color();
	}

}
