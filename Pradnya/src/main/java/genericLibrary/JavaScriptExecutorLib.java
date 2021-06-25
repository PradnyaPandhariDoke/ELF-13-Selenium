package genericLibrary;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorLib {
	WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public void click(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}
	public void sendData(WebElement element,String data) {
		js.executeScript("arguments[0].value='data'", element);
	}
	public void scrollTo(int x,int y) {
		js.executeScript("window.scrollTo(x,y);");
	}
	public void scrollIntoView(boolean a,WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(a);",element);
	}
	public Object returnValue(WebElement element) {
		Object obj = js.executeScript("return arguments[0].value",element);
		return obj;
	}
}
