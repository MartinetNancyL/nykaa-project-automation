package com.java;

public class Demo1 {
	//20Feb
	public Demo1() {
		System.out.println("Non-parameter");
	}
			
	public Demo1(int a) {
		System.out.println("parameter");
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo1 d= new Demo1();
		Demo1 d1= new Demo1(20);
	}

}
