 package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage_Objects;
import Resources.BrowserSetup;
import Resources.Constants;

public class VerifyLoginPage extends BrowserSetup  {
	
	@Test(dataProvider="testdata")
	public void verifyLoginPage (String username,String password) throws IOException {
		// launch browser
		// launch url
		// username and password
		// click on login
		
		//create object of Lofinpagepage_object for xpath store in it
		LoginPagePage_Objects obj= new LoginPagePage_Objects (driver);
		
		
		// this coding will fail because driver dont have scope
		// so i need to pass driver in above object and need to create constructor in LoginPagePage_Object class
		
		obj.enterusername().sendKeys(username);
		obj.enterpassword().sendKeys(password);
		obj.clickonLogin().click();
		
		String Actualtext =driver.findElement(By.xpath("//div[@id='error']")).getText();
		String ExpectedText= "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		Assert.assertEquals(Actualtext, ExpectedText);
		
	}
	
	@DataProvider
	public Object[][] testdata(){
		Object[][] data= new Object[2][2];
		data[0][0]="user1";
		data[0][1]= "pass1";
		data[1][0]= "user2";
		data[1][1]= "pass2";
		return data;
	}
	}
