package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceWashPage {
	WebDriver driver;
	public FaceWashPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//div[text()='Nykaa Naturals Face Wash']") private WebElement NykaaFaceWash;
	@FindBy(xpath="//div[text()='Neutrogena Oil Free Acne Face Wash With 2.0% Salicylic Acid ...']") private WebElement NeutrogenaFaceWash;
	@FindBy(xpath="//div[text()='The Face Shop Rice Water Bright Foaming Cleanser']")private WebElement faceShop;
	@FindBy(xpath="//div[@class='css-d5z3ro']")private WebElement NeutrogenaFaceWashele;
	@FindBy(xpath="//button[@class=' css-ii3nwj']")private WebElement NeutrogenaFaceWasha2b;
	public WebElement getNykaaFaceWash(){
		return NykaaFaceWash;	}
	public WebElement getNeutrogenaFaceWash(){
		return NeutrogenaFaceWash;	}
	public WebElement getfaceShop() {
		return faceShop; }
	public WebElement getNeutrogenaFaceWashele() {
		return NeutrogenaFaceWashele;	}
	public WebElement getNeutrogenaFaceWasha2b() {
		return NeutrogenaFaceWasha2b;	}
}
