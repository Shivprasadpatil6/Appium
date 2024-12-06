package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest {
	@Test
	public void WifiSettingsName() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		
		
		//Actual Automation start when you details Of app
		// xpath ,id,uiautomator2,classname,acessibility id
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/checkbox")).click();
		Thread.sleep(2000);	
	    driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    Thread.sleep(2000);	
	    String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals(alertTitle,"WiFi settings");
	    driver.findElement(By.id("android:id/edit")).sendKeys("Shivprasad Wifi");
	    Thread.sleep(2000);	
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	    
	    //  //android.widget.Button[text()='OK']
	    
	    
	   
	    

	
		
	}
	

}
//android.widget.ListView[@resource-id="android:id/list"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout
