package ShivprasadpatilAppium.Appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_2 extends BaseTest {
	
	
	@Test
	public void FillForm() throws InterruptedException
	{
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shobha Patil");
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
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
//	   int productCount= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//	   
//	   for(int i=0;i<productCount;i++)
//	   {
//		   String productname=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//		   if(productname.equals("Jordan 6 Rings"))
//		   {
//			   driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).getText();
//		   }
//	   }
	   Thread.sleep(3000);
//	   WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
//	   wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text","Cart"));
	  //We can use above code or below code as well
	    driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")).click();
	   driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); 
	   Thread.sleep(4000);
	   String actualtext= driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	  Assert.assertEquals(actualtext, "Jordan 6 Rings");
	   

	   

	    
		
		
	
		
		
		
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
	//	driver.findElement(By.xpath("//android.widget.TextView[text()='India']")).click();
//		
		
	}

}