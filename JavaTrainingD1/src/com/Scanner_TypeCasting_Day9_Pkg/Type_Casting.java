package com.Scanner_TypeCasting_Day9_Pkg;

public class Type_Casting {

	public static void main(String[] args) {
		//Widening Type casting- lower to higher memory
		int i= 987;
		double d =i;
		System.out.println("Widening Type casting- lower to higher memory:");
		System.out.println("int: "+i);
		System.out.println("double:"+d);
		//Narrowing Type casting- higher to lower memory
		double dd= 789.987;
		int ii= (int) dd;
		System.out.println("Narrowing Type casting- higher to lower memory");
		System.out.println("double:"+dd);
		System.out.println("int: "+ii);
		//Widening Type casting char
		char ch='N';
		int ci= ch; //ACSII value is assigned as Integer
		System.out.println("Widening Type casting ACSII value of char N is assigned as Integer");
		System.out.println("char: "+ch);
		System.out.println("int:"+ci);
		//Widening Type casting char
		char ch2='9';
		int ci2= ch2-'0'; //Widening Type casting char 9 to int
		System.out.println("Widening Type casting char 9 to int");
		System.out.println("char: "+ch2);
		System.out.println("int:"+ci2);		
		

	}

}
