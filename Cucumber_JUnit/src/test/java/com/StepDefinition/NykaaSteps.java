package com.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Nykaa_SeleniumBase.NykaaBase;
import com.PageObjectManager.NykaaPOManager;
import com.TestRunner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaaSteps extends NykaaBase {
	
	public static WebDriver driver=Runner.driver;
	//public static WebDriver driver=NykaaBase.driver;

	NykaaPOManager pom = new NykaaPOManager(driver);

	

@Given("User launches the Nykaa Application")
public void user_launches_the_nykaa_application() {
	//driver.get("https://www.nykaa.com/");
	urlLaunch("https://www.nykaa.com/");
}

	// Scenario: Sign-in should be successful
//	@Given("User launches the Nykaa Application")
//	public void userLaunchesTheNykaaApplication() throws IOException {
//		driver.get("https://www.nykaa.com/");
//		//urlLaunch("https://www.nykaa.com/");
//		screenShots("Home");
//	}

//	@Given("User clicks the Sign-in button")
//	public void userClicksTheSignInButton() {
//		clickElement(pom.getSignInPage().getSignIn());
//	}
//
//	@Given("User click the Sign-in with Mobile number")
//	public void userClickTheSignInWithMobileNumber() {
//		clickElement(pom.getSignInPage().getSigInMobileNum());
//	}
//
//	@Given("User enters the Mobile number as Username")
//	public void userEntersTheMobileNumberAsUsername() {
//		inputElement(pom.getLoginRegPage().getEmailMobile(), "8884104781");
//	}
//
//	@Given("User clicks the Proceed button")
//	public void userClicksTheProceedButton() {
//		clickElement(pom.getLoginRegPage().getProceed());
//	}
//
//	@Given("User enters the OTP in console output as otp")
//	public void userEntersTheOTPInConsoleOutputAsOtp() {
//		inputElement(pom.getOTPVerificationPage().getOtpValue(), scannerinput());
//	}
//
//	@When("User click on Verify button")
//	public void userClickOnVerifyButton() {
//		clickElement(pom.getOTPVerificationPage().getVerify());
//	}
//
//	@Then("Login should be successful")
//	public void loginShouldBeSuccessful() throws IOException {
//		System.out.println("Sign-in is Successful");
//		screenShots("OTP Verification");
//	}

}
