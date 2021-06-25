package genericLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import genericLibrary.TakesScereenshotWebdriver;
public class ListenerImplementation implements ITestListener {

	public static WebDriver driver;
	public void onFinish(ITestContext arg0) {					
		//TODO Auto-generated method stub	
	}		

	public void onStart(ITestContext arg0) {					
		//TODO Auto-generated method stub	
	}		

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		

	public  void onTestFailure(ITestResult result) {					
		
		TakesScereenshotWebdriver.takesScreenshot(driver,result);
	}		

	public void onTestSkipped(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		

	public void onTestStart(ITestResult arg0) {	
		//TODO Auto-generated method stub	
	}		

	public void onTestSuccess(ITestResult arg0) {					
		//TODO Auto-generated method stub	
	}		
}
