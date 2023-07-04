package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage_Objects {
	
	public WebDriver driver;
	
	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By Email= By.xpath("//input[@name='UserEmail']");
	private By JobTitle =By.xpath("//select[@name='UserTitle']");
	private By Company = By.xpath("//input[@name='CompanyName']");	
	private By Employees= By.xpath("//select[@name='CompanyEmployees']");
	private By Mobile= By.xpath("//input[@name='UserPhone']");
	private By RadioButton= By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By CountryRegion= By.xpath("//select[@name='CompanyCountry']"); 
	
	
	public SignUpPage_Objects(WebDriver driver2) {
		
		this.driver= driver2;
	}

	public WebElement enterFirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastName() {
		return driver.findElement(lastname);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement ClickOnJobTitle() {
		return driver.findElement(JobTitle);
	}
	
	public WebElement EnterCompany() {
		return driver.findElement(Company);
	}

	public WebElement SelectEmployees() {
		return driver.findElement(Employees);
	}
	
	public WebElement EnterMobileNumber() {
		return driver.findElement(Mobile);
	}
	
	public WebElement MainServicesAgreement() {
		return driver.findElement(RadioButton);
	}
	
	public WebElement CountryRegion() {
		return driver.findElement(CountryRegion);
		
	}
	
	
	
	}
