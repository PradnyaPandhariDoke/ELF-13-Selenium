package vTigerTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.ProductPage;
import genericLibrary.BaseClass;
import genericLibrary.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class TC_005Test  extends BaseClass{
	@Test
	public void goToFiltersSelectTheCreatedFiltersAndDeleteIt() {

		//==================Step 3:click on product link==========

		Actions actions=new Actions(driver);
		actions.moveByOffset(910, 60).perform();
		HomePage homepage=new  HomePage(driver);
		homepage.getProductLink().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product page is not displayed");

		//===============Step 5;Go to filters select the created filters and delete=============

		ProductPage productpage= new  ProductPage(driver);
		productpage.getFilterDropDown().click();
		productpage.getCheckBox().click();
		productpage.getDelete().click();
		driver.switchTo().alert().accept();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"created  filter is not deleted");

	}

}
