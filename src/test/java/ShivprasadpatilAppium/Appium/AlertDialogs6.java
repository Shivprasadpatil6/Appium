package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs6 extends BaseTest {
	
	@Test
	public void AlertDialogs6Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Satellite']")).click();
	// driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Satellite')]")).click();
//		
//  	String text=driver.findElement(AppiumBy.accessibilityId("Send Call to VoiceMail")).getText();
//   Assert.assertEquals(text,"Send Call to VoiceMail");
		
	}
}