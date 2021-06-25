package genericLibrary;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtil {
	public void selectElement(WebElement ele,String input) {
		Select select=new Select(ele);
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			String optionText=option.getText();
			String optionValue=option.getAttribute("value");
			try {
				if (input.equalsIgnoreCase(optionText)) {
					select.selectByVisibleText(input);
					break;
				} else {
					select.selectByValue(optionValue);
					break;
				}
			}
			catch (Exception e) {
				int index=Integer.parseInt(input);
				select.deselectByIndex(index);
				break;
			}
		}
	}
}
