package ShivprasadpatilAppium.Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {
	
	
	@Test
	public void LongPressGesture() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
	    
//	    ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
//	    		 ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),
//	    		 "duration",2000));
	    Thread.sleep(2000);
	    
	                String ActualTitle=driver.findElement(By.id("android:id/title")).getText();
	                Assert.assertEquals(ActualTitle,"Sample menu");
	                Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		
		
	}
	
	

}
