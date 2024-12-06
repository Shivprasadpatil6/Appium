package ShivprasadpatilAppium.Appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest {
	
	@Test
	public void SwipeDemoTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		Thread.sleep(2000);
		WebElement firstImage=driver.findElement(By.xpath("(//android.widget.ImageView[1]"));
		
		//Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView[1]")).getAttribute("focusable"),"true");
		//swipe
		swipeAction(firstImage,"left");
		
		//android.widget.CheckedTextView
		
		//
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView[1]")).getAttribute("focusable"),"false");
		
		
	}
	
	

}
