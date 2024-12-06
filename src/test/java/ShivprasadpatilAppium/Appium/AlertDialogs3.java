package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs3 extends BaseTest {
	
	@Test
	public void AlertDialogs3Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		Thread.sleep(2000);
	 // driver.findElement(By.id("android:id/text1")).click();
		
  	String text=driver.findElement(By.id("android:id/alertTitle")).getText();
   Assert.assertEquals(text,"Header title");
		
	}
}