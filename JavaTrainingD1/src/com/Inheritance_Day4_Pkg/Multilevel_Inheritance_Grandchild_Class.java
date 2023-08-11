package com.Inheritance_Day4_Pkg;

public class Multilevel_Inheritance_Grandchild_Class extends Multilevel_Inheritance_Child_Class {

	private void sea() {
		System.out.println("Sea");
	}
	public static void main(String[] args) {
		Multilevel_Inheritance_Grandchild_Class gc= new Multilevel_Inheritance_Grandchild_Class();
		gc.sea();
		gc.river();
		gc.water();
	}

}
