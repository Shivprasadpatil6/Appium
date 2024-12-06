package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends BaseTest {
	
	
	@Test
	public void FillForm() throws InterruptedException
	{
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shobha Patil");
		driver.hideKeyboard();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("android:id/text1")).click();
		//Thread.sleep(5000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"));"));
//		driver.findElement(By.xpath("//android.widget.TextView[@Text='Angola']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();		
	    String toastmessage=driver.findElement(By.xpath("(//android.widget.Toast[1]")).getAttribute("name")	;
		Assert.assertEquals(toastmessage, "Please enter your name");
		
		
	
		
		
		
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
	//	driver.findElement(By.xpath("//android.widget.TextView[text()='India']")).click();
//		
		
	}

}
