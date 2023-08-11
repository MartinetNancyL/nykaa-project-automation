package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//WebElement RefName= driver.findelement(By.Locators("Value"));
	
	public static WebDriver driver;//null
	
	@FindBy(id="username")
	private WebElement user;
			
	@FindBy(id="password")
	private WebElement pwd;
			
	@FindBy(id="login")
	private WebElement loginBtn;
	
	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
			
	public static void main(String[] args) {
		
	}

}
