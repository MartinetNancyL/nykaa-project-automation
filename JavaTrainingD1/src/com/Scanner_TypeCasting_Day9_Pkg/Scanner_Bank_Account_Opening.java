package com.Scanner_TypeCasting_Day9_Pkg;

import java.util.Scanner;

public class Scanner_Bank_Account_Opening {

	public static void main(String[] args) {
		System.out.println("Welcome to SBI. Please Enter your Personal Details");
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter Name");
		String name= sc.nextLine(); //scanning String as next token of the input
		
		System.out.println("Enter Fathers Name");	
		char i= sc.next().charAt(0); //scanning Character as next token of the input
		
		System.out.println("Enter Mobile Number");
		long Mobilenumber= sc.nextLong(); //scanning Integer as next token of the input
		
		System.out.println("Enter True if you have reference in Bank");	
		boolean ref= sc.nextBoolean(); //scanning Integer as next token of the input
		sc.close();
		
		System.out.println("Customer Details:");
		System.out.println("Name: " +name);
		System.out.println("Initial: " + i);
		System.out.println("Mobile Number: " +Mobilenumber);
		System.out.println("Has Reference: " + ref);
		
	}
}
