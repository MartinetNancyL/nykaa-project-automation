package com.java;

public class Demo2 {

	public static void BrowserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.err.println("Chrome Drive Launch");
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.err.println("gecko Drive Launch");
		}else { System.out.println("Invalid Driver Launched");
		}
	}
	public static void main(String[] args) {
		BrowserLaunch("Chrome");
	}
}
