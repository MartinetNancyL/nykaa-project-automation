package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	
	WebDriver driver;
	@FindBy(xpath="//button[@color='#ffffff']")private WebElement deliverhere; //click
	@FindBy(xpath="//p[text()='Add New Address']") private WebElement newAddress;//click
	@FindBy(xpath="//input[@placeholder='Pincode']")private WebElement pincode;
	@FindBy(xpath="//input[@placeholder='House/ Flat/ Office No.']")private WebElement houseno;
	@FindBy(xpath="//input[@placeholder='Road Name/ Area /Colony']")private WebElement road;
	@FindBy(xpath="//button[text()='Ship to this address']")private WebElement ship;
	public AddressPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);	}
	public WebElement getdeliverhere() {
		return deliverhere;	} 
	public WebElement getnewAddress() {
		return newAddress;	}
	public WebElement getpincode() {
		return pincode;	}
	public WebElement gethouseno() {		
		return houseno;	}
	public WebElement getroad() {
		return road;	}
	public WebElement getship() {
		return ship;	}
}
