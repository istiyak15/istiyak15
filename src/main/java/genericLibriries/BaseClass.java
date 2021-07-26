package genericLibriries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.LeadsPage;
import pomRepository.LoginPage;

/**
 * 
 * @author Md istiyak
 *
 */

public class BaseClass {

	public static WebDriver driver;

	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browser is opened successfully",true);
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException{
		PropertyClassUtil Property=new PropertyClassUtil();
		String url = Property.getPropertyData("url");
		String username = Property.getPropertyData("username");
		String password = Property.getPropertyData("password");
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Login | Salesforce");
		Reporter.log("LoginPage is Displayed successfully",true);
		LoginPage login=new LoginPage(driver);
		login.setLogin(username, password);
	}

	@AfterMethod
	public void logout() {
		LeadsPage leadpage=new LeadsPage(driver);
		leadpage.setLogout(driver);
		Reporter.log("Logout of the application is done successfully",true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();	
		Reporter.log("browser is closed successfully",true);
	}
}
