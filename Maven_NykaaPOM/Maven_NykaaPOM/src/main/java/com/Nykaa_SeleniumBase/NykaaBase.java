package com.Nykaa_SeleniumBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaBase {
	
	public static WebDriver driver;//null driver
	
	/**
	 * @description Launches chrome browser
	 * @param browser
	 * @return
	 */
	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Nancy Lawrence\\JavaTraining\\Maven_NykaaPOM\\Maven_NykaaPOM\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Nancy Lawrence\\JavaTraining\\Maven_NykaaPOM\\Maven_NykaaPOM\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else {
			System.out.println("Invalid browser");
		}
		return driver;
	}
	
	/**
	 * @description Launches the URL
	 * @param url
	 */
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	/**
	 * @description Performs sendKeys action on WebElement
	 * @param input
	 * @param value
	 */
	public static void inputElement(WebElement input, String value) {
		input.sendKeys(value);
	}
	
	/**
	 * @description Performs Click action on WebElement
	 * @param clickbutton
	 */
	 public static void clickElement(WebElement clickbutton) {
	 clickbutton.click(); 
	 }
	 
	 /**
	  * @description Get input from Console
	  * @return input
	  */
	 public static String scannerinput() {
		 Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
			System.out.print("Enter the OTP within 30 seconds: ");  
			String input= sc.nextLine();
			return input;
	 }
	 
	 /**
	  * @description Takes Screenshots in png format
	  * @param ssname
	  * @throws IOException
	  */
	 public static void screenShots(String ssname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Maven_NykaaPOM\\Maven_NykaaPOM\\NykaaScreenshots\\"+ssname+".png");
			FileUtils.copyFile(scr,dest);
		}
	 
	 /**
	  * @description Performs mouse actions like moveToElement & click
	  * @param input
	  * @param action
	  */
	 public static void actions(WebElement input, String action) {
		 Actions act=new Actions(driver);
		 if (action=="moveToElement") {
			 act.moveToElement(input).build().perform();
			 }
		 if (action=="click") {
			 act.moveToElement(input).click().build().perform();
			 }
		 if (action=="pagedown") {
			 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 }
		 if (action=="pageup") {
			 act.sendKeys(Keys.PAGE_UP).build().perform();
		 }
	}
	 
	 public static void robot(String value) throws AWTException {
			Robot r = new Robot();
			if (value.equalsIgnoreCase("downarrow")) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}else if (value.equalsIgnoreCase("uparrow")) {
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
			}else if (value.equalsIgnoreCase("enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} else if (value.equalsIgnoreCase("pageup")) {
				r.keyPress(KeyEvent.VK_PAGE_UP);
				r.keyRelease(KeyEvent.VK_PAGE_UP);
				r.keyPress(KeyEvent.VK_PAGE_UP);
				r.keyRelease(KeyEvent.VK_PAGE_UP);
			} else if (value.equalsIgnoreCase("pagehome")) {
				r.keyPress(KeyEvent.VK_HOME);
				r.keyRelease(KeyEvent.VK_HOME);
			}			
		}
		

	 	/**
	 	 * @description Moves to next Window tab
	 	 */
		public static void windowHandle() {
			String newurl = driver.getWindowHandle();
			driver.switchTo().window(newurl);
		}

	 /**
	  * @description Moves to next Window tab
	  */
	public static void windowHandles() {
		Set <String> newurl = driver.getWindowHandles();
		for (String windows : newurl) {
		driver.switchTo().window(windows);
			}
		}
		
	public static void javascriptExecutorMethod(WebElement element,String action) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (action.equalsIgnoreCase("scroll")) {
			js.executeScript("arguments[0].scrollIntoView();", element);
		}else if (action.equalsIgnoreCase("click")) {
			js.executeScript("arguments[0].click();", element);
		}
	}
	
	public static void javascriptExecutorMethod(String action) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (action.equalsIgnoreCase("scrolltop")) {
			js.executeScript("window.scrollBy(0,0)");
		}
	}
	
	/**
	 * @description Moves to iframes
	 * @param iframe
	 */
	public static void iframes(WebElement iframe) {
		WebElement frame = iframe;
		driver.switchTo().frame(frame);
	}
}
