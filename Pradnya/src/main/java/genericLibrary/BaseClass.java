package genericLibrary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import elementRepository.HomePage;
import elementRepository.LoginPage;
@Listeners(ListenerImplementation.class)
public class BaseClass implements IAutoConstant {

	public WebDriver driver;

	@BeforeClass 
	public void beforeClass() {
		//Reporter.log("beforeClass",true);	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void beforeMethod() {
		//Reporter.log("beforMethod",true);
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), Login_pageTitle,"login page is not displayed");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsernameTextField().sendKeys(username);
		Assert.assertEquals(loginpage.getUsernameTextField().getAttribute("value"), username,"username is not enterded correctly");
		loginpage.getPasswordTextField().sendKeys(Password);
		Assert.assertEquals(loginpage.getPasswordTextField().getAttribute("value"), Password,"password is not entered correctly");
		loginpage.getLoginButton().click();
		Assert.assertEquals(driver.getTitle(), Home_pageTitle,"Home page is not displayed");

	}
	@AfterMethod
	public void afterMethod() {
		//Reporter.log("afterMethod",true);
		HomePage homepage=new  HomePage(driver);
		Actions actions=new Actions(driver);
		actions.moveToElement(homepage.getProfile()).perform();
		homepage.getSignOut().click();
		Assert.assertEquals(driver.getTitle(), Login_pageTitle,"login page is not displayed");

	}
	@AfterClass
	public void AfterClass() {
		//Reporter.log("AfterClass",true);
		driver.quit();
	} 
	@BeforeTest
	public void beforeTest() {

		//Reporter.log("beforeTest",true);

	}
	@AfterTest
	public void afterTest() {
		//Reporter.log("afterTest",true);

	}
	@BeforeSuite
	public void beforeSuite() {
		//Reporter.log("beforeSuite",true);
	}
	@AfterSuite
	public void afterSuite() {
		//Reporter.log("afterSuite",true);
	}
}
