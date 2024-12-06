package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs7 extends BaseTest {
	
	@Test
	public void AlertDialogs7Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Wednesday']")).click();
	String text=driver.findElement(By.id("android:id/alertTitle")).getText();
    Assert.assertEquals(text,"Repeat alarm");
    driver.findElement(By.id("android:id/button1")).click();
    
		
	}
}