package com.Constructor_Day8_Pkg;

public class Company {
	String c;
	boolean b;
	public Company(){ //No-Argument Constructor
		c="TCS";
		System.out.println("No-Argument Constructor is called. Company: "+c);
	}
	public Company(String pc){ //parameterized Constructor
		System.out.println("Parameterized Constructor is called. Company: "+pc);
	}
	public Company(int year) {
		System.out.println("Polaris Tenure: " +year +" Years");
	}
	public static void main(String[] args) {
		Company nc= new Company(); // No-Argument Constructor & default constructor are called
		Company pcs= new Company("Polaris"); //Parameterized Constructor & default constructor are called
		Company pci= new Company(4); //Parameterized Constructor & default constructor are called
		System.out.println("Default Contructor is called. Printing Default values with nc: " +nc.c +" " +nc.b);
		System.out.println("Default Contructor is called. Printing Default values with pcs: " +pcs.c +" " +pcs.b);
		System.out.println("Default Contructor is called. Printing Default values with pci: " +pci.c +" " +pci.b);
	}
}
