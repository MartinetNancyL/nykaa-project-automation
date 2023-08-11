package com.PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Nykaa_POM.AddToBagPage;
import com.Nykaa_POM.AddressPage;
import com.Nykaa_POM.FaceWashPage;
import com.Nykaa_POM.HomePage;
import com.Nykaa_POM.LoginRegPage;
import com.Nykaa_POM.OTPVerificationPage;
import com.Nykaa_POM.PaymentPage;
import com.Nykaa_POM.SignInPage;

public class NykaaPOManager {
	//public static WebDriver driver;
	public WebDriver driver;
	//1.Declare page object model(pom) classes as private
	//accessmodifier pomclass object
	private SignInPage signin;
	private LoginRegPage login;
	private OTPVerificationPage otp;
	private HomePage home;
	private FaceWashPage facewash;
	private AddToBagPage addtobag;
	private AddressPage address;
	private PaymentPage payment;
	
	//2.generate getters method
	public SignInPage getSignInPage() {
		signin = new SignInPage(driver); 
		return signin;	}
	public LoginRegPage getLoginRegPage() {
		return login;	}
	public OTPVerificationPage getOTPVerificationPage() {
		return otp;	}
	public HomePage getHomePage() {
		return home;	}
	public FaceWashPage getFaceWashPage() {
		return facewash;	}
	public AddToBagPage getAddToBagPage() {
		return addtobag;	}
	public AddressPage getAddressPage() {
		return address;	}
	public PaymentPage getPaymentPage() {
		return payment;	}
	
	//3.Create constructors to initialize driver
	public NykaaPOManager(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);//used for web elements
		//this.driver=driver2;//object
	}
}
