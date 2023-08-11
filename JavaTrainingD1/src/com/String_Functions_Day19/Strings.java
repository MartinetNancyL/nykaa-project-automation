package com.String_Functions_Day19;

public class Strings {

	public static void main(String[] args) {
		String s= "Welcome to Java";
		System.out.println("String s= Welcome to Java");
		int len=s.length();
		System.out.println("s.length: " +len);
		
		Boolean sW=s.startsWith("W");
		System.out.println("s.startsWith W: " +sW);
		
		Boolean eW=s.endsWith("W");
		System.out.println("s.endsWith W: " +eW);
		
		System.out.println("s.contains e: " +s.contains("e"));
		System.out.println("s.indexOf c: " +s.indexOf("c"));
		System.out.println("s.lastIndexOf Java: " +s.lastIndexOf("Java"));
		System.out.println("s.charAt 11th position: " +s.charAt(11));
		System.out.println("s.replace e with i: " +s.replace("a","i"));
		System.out.println("s.substring 0 to 11: " +s.substring(0,11)); // not pascal?
		System.out.println("s.isEmpty: " +s.isEmpty());
		//split()
		String[] arrOfStr = s.split(" ");
        for (String a: arrOfStr)
            System.out.println("s.split with space:" +a);
		System.out.println("s.split with a:" +s.split(" ",3)); // ?
	}

}
