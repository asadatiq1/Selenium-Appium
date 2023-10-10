package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppFactory {


	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities caps;
	
	public static void Android_LaunchApp() throws MalformedURLException {
		caps = new DesiredCapabilities();
		caps.setCapability("newCommandTimeout", 10000);
		caps.setCapability("platformName", "Android");
		caps.setCapability("udid", "RFCNB0C265B");
		caps.setCapability("platformVersion", "12");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage","co.seasoned.seasonedMessaging.qa");  
		caps.setCapability("appActivity","co.seasoned.seasonedMessaging.MainActivity");
		
		caps.setCapability(MobileCapabilityType.NO_RESET, "true");
		caps.setCapability(MobileCapabilityType.FULL_RESET, "False");
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		AppDriver.setDriver(driver);
	
		
	}
	
	public static void IOS_LaunchApp() throws MalformedURLException {
		caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage","co.seasoned.seasonedMessaging.dev");  
		caps.setCapability("appActivity","com.seasoned.MainActivity");
		
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		AppDriver.setDriver(driver);
	}
	
	
	  public static void closeApp() 
	  { 
		  driver.quit();
		  
	  }
	
	

}
