package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBagPage {
	WebDriver driver;
	public AddToBagPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);	}
	@FindBy(xpath="//span[text()='Add to Bag']") private WebElement addToBag;
	@FindBy(xpath="//span[@class='cart-count']") private WebElement bagSection;
	@FindBy(xpath="//iframe[@class='css-acpm4k']") private WebElement iframe;
	@FindBy(xpath="//span[text()='Proceed']") private WebElement proceed;
	
	public WebElement getaddToBag(){
		return addToBag;	}
	public WebElement getbagSection(){
		return bagSection;	}
	public WebElement getiframe(){
		return iframe;	}
	public WebElement getproceed(){
		return proceed;	}
}
