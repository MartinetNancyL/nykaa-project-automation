package com.Inheritance_Day4_Pkg;

public class Multilevel_Inheritance_Child_Class extends Multilevel_Inheritance_Parent_Class {
	
	public void river() {
		System.out.println("River");
	}
	public static void main(String[] args) {
		Multilevel_Inheritance_Child_Class c= new Multilevel_Inheritance_Child_Class();
		c.river();
		c.water();
	}

}
