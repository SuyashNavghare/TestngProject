package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage_Objects;
import PageObjectModel.SignUpPage_Objects;
import Resources.BrowserSetup;
import Resources.Constants;

public class VerifySignUpPage extends BrowserSetup {
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		
		LoginPagePage_Objects jp= new LoginPagePage_Objects(driver);
		jp.clickontryforfree().click();
		
		Thread.sleep(3000);
		
		
		SignUpPage_Objects obj = new SignUpPage_Objects(driver);
		obj.enterFirstName().sendKeys(Constants.firstname);
		obj.enterLastName().sendKeys(Constants.lastname);
		obj.enterEmail().sendKeys(Constants.email);
		
		
		// select class for jobtitle because tagname is select
		Select ad= new Select(obj.ClickOnJobTitle());
		ad.selectByIndex(8);
		
		obj.EnterCompany().sendKeys(Constants.company);
		
		
		// select class for employees because tagname is select
		Select bs= new Select(obj.SelectEmployees());
		bs.selectByIndex(2);
		
		obj.EnterMobileNumber().sendKeys(Constants.phone);
		
		obj.MainServicesAgreement().click();
		
		// select class for country/region because tagname is select
		Select ak= new Select(obj.CountryRegion());
		ak.selectByVisibleText("American Samoa");
	
		}
        }
