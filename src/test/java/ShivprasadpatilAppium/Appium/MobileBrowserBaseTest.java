package ShivprasadpatilAppium.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileBrowserBaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException
	{
		 service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options =new UiAutomator2Options();
		options.setDeviceName("ShivprasadPhone");//emulator
		options.setCapability("browserName", "Firefox");
		
		//we have toset chromedriver path
		options.setChromedriverExecutable("C:\\Users\\Lenovo\\Downloads\\Firefox Installer.exe");
        //AndroidDriver ,IOsDriver
		//Appium code > Appium Server >Mobile
		 driver=new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
		 
	@AfterClass
	public void tearDown()
	{
//		driver.quit();
//		service.stop();
	}


}
