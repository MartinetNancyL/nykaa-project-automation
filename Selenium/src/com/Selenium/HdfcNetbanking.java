package com.Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcNetbanking {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver"
				,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver hdfc= new ChromeDriver();
		hdfc.get("https://netbanking.hdfcbank.com/netbanking/");
		Set<Cookie> cookies= hdfc.manage().getCookies();
		for(Cookie cookie:cookies) {
			System.out.println(cookie);
			System.out.println("next");
		}
		hdfc.manage().deleteAllCookies();
	}

}
