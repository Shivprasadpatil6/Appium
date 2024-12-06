package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs4 extends BaseTest {
	
	@Test
	public void AlertDialogs4Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Progress dialog")).click();
		Thread.sleep(2000);
	 // driver.findElement(By.id("android:id/text1")).click();
		
  	String text=driver.findElement(AppiumBy.accessibilityId("Send Call to VoiceMail")).getText();
   Assert.assertEquals(text,"Send Call to VoiceMail");
		
	}
}