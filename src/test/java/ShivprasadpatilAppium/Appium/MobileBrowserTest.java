package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MobileBrowserTest extends MobileBrowserBaseTest  {
	
	@Test
	public void BrowserTest()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://www.amazon.com/");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

	
}
