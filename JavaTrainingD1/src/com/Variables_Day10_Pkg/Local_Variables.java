package com.Variables_Day10_Pkg;

public class Local_Variables {
	private void LV() {//Local Variable must be inside method
		int day=10; // must initialize local variable
		String s="Variable Types";
		System.out.println("Local Variables must be inside method"); //Life cycle is only inside the method
		System.out.println("Int: " +day +"String:" +s);
	}
	public static void main(String[] args) {
		Local_Variables LV= new Local_Variables();
		LV.LV();//calling LV method with object LV 
	}
	
	
	
	/*
	 * private static void LV() {//Local Variable 
	 * int day=10; 
	 * String s="Variable Types";
	 * System.out.println("Local Variables must be inside method");
	 * System.out.println("Int: " +day +"String:" +s); } 
	 * public static void main(String[] args) { 
	 * LV(); //static method can be directly called without creating object 
	 * }
	 */
}
