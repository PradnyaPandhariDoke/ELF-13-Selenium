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
public class TC_001Test extends BaseClass {
	@Test
	public  void gotoAdvancedSearchAndCheckForTheAdditionsRow() {
		
		//==================Step 3:click on product link==========
		
		Actions actions=new Actions(driver);
		actions.moveByOffset(910, 60).perform();
		HomePage homepage=new  HomePage(driver);
		homepage.getProductLink().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product page is not displayed");

		//===============Step 4: navigate to advanced search ==================

	     ProductPage productpage= new  ProductPage(driver);
		 productpage.getGoToAdvanceSearchLink().click();
		 Assert.assertEquals(driver.getTitle(), GoToAdvanceSearch_PageTitle,"Go To Advance Search page is not displayed");

		//====================Step 5 :Go to new condition=================

		productpage.getGoToNewCondition().click();
        Reporter.log("Addition row is displyed successfully",true);

	}
}
