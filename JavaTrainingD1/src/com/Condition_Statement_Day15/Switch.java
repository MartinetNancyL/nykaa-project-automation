package com.Condition_Statement_Day15;
import java.util.Scanner;
public class Switch {
	public static void Switch_Method () {
		System.out.println("Please enter the number of the week");
		Scanner n= new Scanner(System.in);
		int i= n.nextInt();
		switch (i) {
		case 1: {
			System.out.println("Sunday");
			break;		}
		case 2: {
			System.out.println("Monday");
			break;		}
		case 3: {
			System.out.println("Tuesday");
			break;		}
		case 4: {
			System.out.println("Wednesday");
			break;		}
		case 5: {
			System.out.println("Thursday");
			break;		}
		case 6: {
			System.out.println("Friday");
			break;		}
		case 7: {
			System.out.println("Saturday");
			break;		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
	}

}
