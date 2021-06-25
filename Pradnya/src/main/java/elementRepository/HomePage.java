package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		   PageFactory.initElements(driver, this);
	   }
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement profile;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOut;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productLink;

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	
}
