package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs5 extends BaseTest {
	
	@Test
	public void AlertDialogs5Test() throws InterruptedException
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
		driver.findElement(By.id("android:id/button1")).click();
		
//
//		
//	String text=driver.findElement(By.id("android:id/alertTitl")).getText();
//  Assert.assertEquals(text,"Single choice list");
   
		
	}
}