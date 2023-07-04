package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage_Objects  {
	
	// this driver dont have scope
	public WebDriver driver;
	
	// private it is came from encapsulation 
	
	private By username= By.xpath("//input[@id='username']"); // for username
	
	// for password
	private By password= By.xpath("//input[@name='pw']");
	
	// for login
	private By login= By.xpath("//input[@id='Login']");
	
	// for TRY FOR FREE
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	
	
	// CONSTRUCTOR SHOULD BE SAME AS CLASS NAME
	// CONSTRUCTOR DONT HAVE ABY ETURN TYPE
	
	public LoginPagePage_Objects(WebDriver driver2) {   //THIS IS CONSTRUCTOR
		
		// driver2 is came from driver of VerifyLoginPage
		// provided scope to driver
		
		this.driver= driver2;
	}

	public WebElement enterusername() {
		return driver.findElement(username);
	}
	
	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement clickonLogin() {
		return driver.findElement(login);
	}

	public WebElement clickontryforfree() {
		return driver.findElement(tryforfree);
	}
	
	
	
	
}
