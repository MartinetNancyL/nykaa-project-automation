package Nykaa_Order;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_Order {
	
	public static WebDriver driver;
//	public static void screenShots(String ssname) throws IOException {
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium_Project\\NykaaScreenshots\\"+ssname+".png");
//		FileUtils.copyFile(scr,dest);
//	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Screenshot of HomePage
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium_Project\\NykaaScreenshots\\"+"Home"+".png");
//		FileUtils.copyFile(scr,dest);
		//screenShots("Home");
		System.out.println("Home screenshot taken");
		
		
		//Instantiating Action Class for Keyboard & Mouse Events
		Actions act= new Actions(driver);
		
		//Searching Face Wash Products
		driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).sendKeys("facewash");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//Click on Nykaa Facewash
		WebElement nykaa = driver.findElement(By.xpath("//span[text()='Nykaa Naturals Face Wash']"));
		act.moveToElement(nykaa).click().build().perform();
		Thread.sleep(2000);
		
		//navigate to next Chrome Browser tab
		Set <String> newurl = driver.getWindowHandles();
		for (String windows : newurl) {
			driver.switchTo().window(windows);
		}
		
		//Instantiating Robot Class for Keyboard Events
		Robot robot = new Robot();  // Robot class throws AWT Exception
		
		//Click on Add to Bag
		driver.navigate().forward();
        robot.keyPress(KeyEvent.VK_DOWN);// moving the keyboard key down.
        Thread.sleep(2000);
		WebElement add2b = driver.findElement(By.xpath("//span[@class='btn-text']"));//Add to Bag
		act.moveToElement(add2b).click().build().perform();
		Thread.sleep(2000);
		
		//Moving to Bag/Cart section
		WebElement Cart = driver.findElement(By.xpath("//span[@class='cart-count']"));
		act.moveToElement(Cart).click().build().perform();
		Thread.sleep(2000);
		
		//Taking Screenshots of Cart
//		Thread.sleep(2000);
//		File scr2 = ts.getScreenshotAs(OutputType.FILE);
//		File dest2 = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium_Project\\NykaaScreenshots\\"+"Cart"+".png");
//		FileUtils.copyFile(scr2,dest2);
		//screenShots("Cart");
		System.out.println("Cart Screenshot taken");
		
		//Click on Proceed inside Frame
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
						
		//Sign-in Steps
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailMobile")).sendKeys("8884104781");//mobile number
		Thread.sleep(2000);
		driver.findElement(By.id("submitVerification")).click();//proceed
		Thread.sleep(2000);
		
		//Getting OTP
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter the OTP within 30 seconds: ");  
		String otp= sc.nextLine();              //reads string 
		Thread.sleep(2000);
		driver.findElement(By.name("otpValue")).sendKeys(otp);
		Thread.sleep(2000);
		
		//Taking Screenshot of OTP section
//		File scr3 = ts.getScreenshotAs(OutputType.FILE);
//		File dest3 = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium_Project\\NykaaScreenshots\\"+"OTP"+".png");
//		FileUtils.copyFile(scr3,dest3);
		//screenShots("OTP");
		System.out.println("OTP Screenshot taken");
		
		//Click on OTP-Submit
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();//Verify
		
		//PROCEED
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		
		//Address Section
		driver.findElement(By.xpath("//button[@color='#ffffff']")).click();
		
		//Screenshot of Payment Section
		Thread.sleep(2000);
//		File scr4 = ts.getScreenshotAs(OutputType.FILE);
//		File dest4 = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium_Project\\NykaaScreenshots\\"+"Payment"+".png");
//		FileUtils.copyFile(scr4,dest4);
		//screenShots("Payment");
		System.out.println("Payment Screenshot taken");
	}
}
