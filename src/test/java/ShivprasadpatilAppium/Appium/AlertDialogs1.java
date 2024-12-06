package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs1 extends BaseTest {
	
	@Test
	public void AlertDialogs1Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		Thread.sleep(2000);
	  driver.findElement(By.id("android:id/button2")).click();
		
//     	String text=driver.findElement(By.id("android:id/alertTitle")).getText();
//	    Assert.assertEquals(text,"Lorem ipsum dolor sit aie consectetur adipiscing Plloaso mako nuto siwuf cakso dodtos anr koop.");
		
	}
	
	
	

}
