package vTigerTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.ProductPage;
import genericLibrary.BaseClass;
import genericLibrary.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class TC_002Test extends BaseClass {
	@Test
	public  void createProductAndKeepAllTheFieldBlank() {

		//==================Step 3:click on product link==========

		Actions actions=new Actions(driver);
		actions.moveByOffset(910, 60).perform();
		HomePage homepage=new  HomePage(driver);
		homepage.getProductLink().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product page is not displayed");

		//================Step 4:navigate to "create new Product"page by click on "+" image==============

		ProductPage productpage= new  ProductPage(driver);
		productpage.getCreateProduct().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle," create new Product page is not displayed");

		//===================Step 5:Keep the all field blank and save=================
          
		productpage.getSaveButton().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle," cconfirmation message displayed");
		 Reporter.log("Error message displayed successfully ",true);


	}
}
