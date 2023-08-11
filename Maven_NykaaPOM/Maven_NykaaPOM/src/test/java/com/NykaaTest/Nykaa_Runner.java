package com.NykaaTest;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Nykaa_POM.AddToBagPage;
import com.Nykaa_POM.AddressPage;
import com.Nykaa_POM.FaceWashPage;
import com.Nykaa_POM.HomePage;
import com.Nykaa_POM.LoginRegPage;
import com.Nykaa_POM.OTPVerificationPage;
import com.Nykaa_POM.PaymentPage;
import com.Nykaa_POM.SignInPage;
import com.Nykaa_SeleniumBase.NykaaBase;

public class Nykaa_Runner extends NykaaBase {
	
	public static WebDriver driver= browserLaunch("edge");
	public static SignInPage signin= new SignInPage(driver);
	public static LoginRegPage login= new LoginRegPage(driver);
	public static OTPVerificationPage otp= new OTPVerificationPage(driver);
	public static HomePage home= new HomePage(driver);
	public static FaceWashPage facewash= new FaceWashPage(driver);
	public static AddToBagPage addtobag= new AddToBagPage(driver);
	public static AddressPage address= new AddressPage(driver);
	public static PaymentPage payment= new PaymentPage(driver);

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		urlLaunch("https://www.nykaa.com/");
		screenShots("Home");
		clickElement(signin.getSignIn());
		clickElement(signin.getSigInMobileNum());
		inputElement(login.getEmailMobile(),"8884104781");
		clickElement(login.getProceed());
		inputElement(otp.getOtpValue(),scannerinput());
		clickElement(otp.getVerify());
		screenShots("OTP Verification");
		actions(home.getSkin(),"moveToElement");
		clickElement(home.getFaceWash());
		windowHandles();
		actions(facewash.getfaceShop(),"click");
		windowHandles();
		actions(addtobag.getaddToBag(),"click");
		actions(addtobag.getbagSection(),"click");
		Thread.sleep(2000);
		screenShots("CartSection");
		iframes(addtobag.getiframe());
		Thread.sleep(2000);
		actions(addtobag.getproceed(),"click");
		Thread.sleep(2000);
		screenShots("Address");
		actions(address.getdeliverhere(),"click");
		Thread.sleep(3000);
		screenShots("Payment");
		clickElement(payment.getcod());
		clickElement(payment.getplaceOrder());
		Thread.sleep(3000);
		screenShots("OderderPlaced");
	}
}
