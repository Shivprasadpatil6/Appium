package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs9 extends BaseTest {
	
	@Test
	public void AlertDialogs8Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Send Call to VoiceMail")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Loader")).click();
		Thread.sleep(2000);
		
		
		
			
	}
}