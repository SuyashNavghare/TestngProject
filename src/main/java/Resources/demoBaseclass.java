package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoBaseclass {
	
	public WebDriver driver;
	public Properties prop;
	public void driverInitialization() throws IOException {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		String BrowserNew= prop.getProperty("browser");
		
		if(BrowserNew.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Suyash\\Desktop\\ChromeDriver114\\chromedriver_win32");
			WebDriver driver= new ChromeDriver();
			
		}
		
		else if(BrowserNew.equalsIgnoreCase("firefox")) {
			// firefox code
		}
		else if(BrowserNew.equalsIgnoreCase("edge")) {
			// edge code
		}
		else {
			System.out.println("enter valid browser");
		}
		
		
	}
	@BeforeMethod
	public void Browserlaunch() throws IOException {
		driverInitialization();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
	
	

	
}
