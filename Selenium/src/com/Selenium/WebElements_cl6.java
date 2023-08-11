package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_cl6 {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver"
				,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
				//memory reference for ChromeDriver
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				//findElement for user name & entering input- using xpath
				WebElement user = driver.findElement(By.xpath("//button[@type='submit']"));
				
				String text = user.getText();//ctrl+2 then press L
				System.out.println("Text on the element is "+text);
				
				boolean enabled = user.isEnabled();
				System.out.println("enabled: "+enabled);
				
				boolean displayed = user.isDisplayed();
				System.out.println("displed: "+displayed);
				
				boolean selected = user.isSelected();
				System.out.println("selected: "+selected);
				
				String attribute = user.getAttribute("type");
				System.out.println("getAttribute of type: "+attribute);
				
				user.click();
				driver.close();
				System.out.println("Done");
	}

}
