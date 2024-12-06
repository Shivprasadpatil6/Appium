package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
	
	@Test
	public void ScrollDemoTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//
	// with the help of android uiautomator we can scroll
		//we have to crate scrollable class then we have to pass argument as uiselector then we have to give argument 
		//there are method scroll into view of that text
		//text value we have to write down in between  backward \ slash.
//		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));

		
		  //no prior data 
		scrollEndAction();
		Thread.sleep(2000);
		
	}
	
	

}
