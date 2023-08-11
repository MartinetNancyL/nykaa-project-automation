package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	WebDriver driver;
	@FindBy(xpath="(//div[@class='leftSelector css-1xck50t e87w9871'])[4]")private WebElement cod;
	@FindBy(xpath = "//div[@class='css-19mch3l e1ess1hf0']") private WebElement placeOrderBox;
	@FindBy(xpath="//button[text()='Place order']")private WebElement placeOrder;
	//@FindBy(xpath="//div//button")private WebElement placeOrder;
	public PaymentPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);	}
	public WebElement getcod() {
		return cod;	}
	public WebElement getplaceOrder() {
		return placeOrder;	}
	public WebElement getplaceOrderBox() {
		return placeOrderBox;	}
}
