package com.Constructor_Day8_Pkg;

public class This_Company {
		String c;
		boolean b;
		public This_Company(){ //No-Argument Constructor
			this("Polaris");
			c="TCS";
			System.out.println("No-Argument Constructor is called. Company: "+c);
		}
		public This_Company(String pc){ //parameterized Constructor
			this(3);
			System.out.println("Parameterized Constructor is called. Company: "+pc);
		}
		public This_Company(int year) {
			
			System.out.println("Polaris Tenure: " +year +" Years");
		}
		
		public static void main(String[] args) {
			This_Company nc= new This_Company(); // No-Argument,Parameterized & default constructor are called
			System.out.println("Default Contructor is called. Printing Default values with nc: " +nc.c +" " +nc.b);
		}

	}