package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MisceallanousAppiumActions extends BaseTest {
	@Test
	public void Misceallanous() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		
		
		//Actual Automation start when you details Of app
		// xpath ,id,uiautomator2,classname,acessibility id
		
		//WIth the help of below code we can direct jump into app pakage &app activity
//		Activity activity=new Activity ("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
//		((JavascriptExecutor) driver).executeScript("mobile: starActivity", ImmutableMap.of("Intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
		
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landScape=new DeviceRotation(0,0,90);
		driver.rotate(landScape);
	    driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    Thread.sleep(2000);	
	    String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals(alertTitle,"WiFi settings");
	    // copy to clipboard
        driver.setClipboardText("Shivprasad Wifi");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.pressKey(new KeyEvent (AndroidKey.ENTER));
//	    driver.findElement(By.id("android:id/edit")).sendKeys("Shivprasad Wifi");
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	    driver.pressKey(new KeyEvent (AndroidKey.BACK));
	    driver.pressKey(new KeyEvent (AndroidKey.HOME));
	    
	    
	    //  //android.widget.Button[text()='OK']
	    
	    
	   
	    

	
		
	}
	

}
//android.widget.ListView[@resource-id="android:id/list"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout
