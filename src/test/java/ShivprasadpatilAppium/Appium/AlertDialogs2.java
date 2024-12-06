package ShivprasadpatilAppium.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertDialogs2 extends BaseTest {
	
	@Test
	public void AlertDialogs2Test() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
		Thread.sleep(2000);
	  driver.findElement(By.id("android:id/button3")).click();
		
//    	String text=driver.findElement(By.id("android:id/message")).getText();
//    Assert.assertEquals(text,"Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\\n\\nSwipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\\n\\nWipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg");
		
	}
}