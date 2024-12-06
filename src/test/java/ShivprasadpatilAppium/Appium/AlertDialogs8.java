package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs8 extends BaseTest {
	
	@Test
	public void AlertDialogs9Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("Shiv");
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("Shiv$1998");
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		
//		String text=driver.findElement(By.id("android:id/alertTitle")).getText();
//	   Assert.assertEquals(text,"Text Entry dialog");
		
		
		
		
			
	}
}