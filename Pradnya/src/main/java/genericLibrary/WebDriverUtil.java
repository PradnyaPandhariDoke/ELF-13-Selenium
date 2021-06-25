package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebDriverUtil {
	WebDriver driver;

	
		public void switchToSpecificTittleWindow(String title) {
		String parentwid = driver.getWindowHandle();
		Set<String> allwids = driver.getWindowHandles();
		allwids.remove(parentwid);
		for (String sessionId : allwids) {
			driver.switchTo().window(sessionId);
			if (driver.getTitle().equalsIgnoreCase(title)) {
				break;
			}
		}
	}
	public void switchToSpecificWindow(WebElement ele) {
		String parentwid = driver.getWindowHandle();
		Set<String> allwids = driver.getWindowHandles();
		allwids.remove(parentwid);
		for (String sessionId : allwids) {
			driver.switchTo().window(sessionId);
			if (ele.isDisplayed()) {
				break;
			}
		}
	}
}
