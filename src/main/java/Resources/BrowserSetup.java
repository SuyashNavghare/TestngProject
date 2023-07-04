package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver driverInitialization() throws IOException {
		
	// to read the file=== data.properties	
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	
	//System.getProperty("user.dir") ==== he line project pryant cha path automatically dete, he line java provide karte
	// \\src\\main\\java\\Resources\\data.properties === he line as it is rahte nehmi
	//  \\src\\main\\java\\Resources\\data.properties===== ha data.properties file cha path ahe
	
	// to access data.properties 
    prop = new Properties();
	prop.load(fis);
	
	String BrowserName = prop.getProperty("browser");
	
	if(BrowserName.equalsIgnoreCase("chrome")) {
		
		// WebDriverManager.chromedriver().version("79.0.9").setup; // this will run with specific browser version
		
		WebDriverManager.chromedriver().setup(); // this will run my current browser i.e. of latest version
         driver = new ChromeDriver();
	}
	
	else if(BrowserName.equalsIgnoreCase("firefox")) {
		
		// firefox code 
	}
	
	else if(BrowserName.equalsIgnoreCase("edge")) {
		
		// edge code
	}
	
	else {
		System.out.println("please enter valid browser name");
	}
	
	return driver;
	
	
	}
	
	@BeforeMethod
	public void BrowserLaunch() throws IOException {
    driverInitialization();
		
		// to launch url
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	
	
	
	

}
