package com.Abstraction_Day7_Pkg;

public class Implementing_Class_Girl implements Interface_Vehicle,Interface_House  {

	public static void main(String[] args) {
		Implementing_Class_Girl g= new Implementing_Class_Girl();
		g.house_Typ(); //Interface_Vehicle
		g.house_Color(); //Interface_Vehicle
		g.balcony(); //Interface_House
		g.wheeler(); //Interface_House
		g.brand(); //Interface_House
		System.out.println(V+RULES);//printing Final/Static variable from Interface_Vehicle
	}

	@Override
	public void house_Typ() {
		System.out.println("3 BHK");
	}

	@Override
	public void house_Color() {
		System.out.println("White,Grey&Black");
	}

	@Override
	public void balcony() {
		System.out.println("Yes");
	}

	@Override
	public void wheeler() {
		System.out.println("4");
	}

	@Override
	public void brand() {
		System.out.println("Bentley");
	}

	@Override
	public void color() {}

	@Override
	public void year() {}

}
