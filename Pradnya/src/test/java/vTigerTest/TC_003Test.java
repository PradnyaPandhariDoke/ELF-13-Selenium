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
public class TC_003Test extends BaseClass {
	@Test
	public void goToFilters() {

		//==================Step 3:click on product link==========

		Actions actions=new Actions(driver);
		actions.moveByOffset(910, 60).perform();
		HomePage homepage=new  HomePage(driver);
		homepage.getProductLink().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product page is not displayed");

		//====================Step 4:Go to filters,navigate to drop down button==================

		ProductPage productpage= new  ProductPage(driver);
		productpage.getFilterDropDown().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"created filters  is not displayed");
		 Reporter.log("created filters  is  displayed",true);

		
	}
}
