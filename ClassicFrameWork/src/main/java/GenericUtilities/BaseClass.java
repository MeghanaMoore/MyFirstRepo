package GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public JavaScriptUtility js;
	public LoginPage login;
	public RegisterPage reg;
	PropertyUtility ppt=new PropertyUtility();
	@BeforeClass
	public void launchingTheBrowser() {
		if(ppt.readingDatafromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(ppt.readingDatafromPropertyFile("browser").equalsIgnoreCase("firefox")){
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new EdgeDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ppt.readingDatafromPropertyFile("url"));
	}
	@BeforeMethod
	public void loadingObject() {
		 js=new JavaScriptUtility();
		login=new LoginPage(driver);
		reg=new RegisterPage(driver);
	}
	@AfterClass
	public void closingBrowser() {
		driver.quit();
	}
}

