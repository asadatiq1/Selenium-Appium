package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling {
	
	public static void scollDown() {
		Dimension dimension= AppDriver.getDriver().manage().window().getSize();
		int scrollStart= (int)(dimension.getHeight()*0.5);
		int scrollEnd= (int)(dimension.getHeight()*0.2);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
				.press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd)).release().perform();	
	}
	

	public static void scollUp() {
		Dimension dimension= AppDriver.getDriver().manage().window().getSize();
		int scrollEnd= (int)(dimension.getHeight()*0.5);
		int scrollStart= (int)(dimension.getHeight()*0.2);
		
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
				.press(PointOption.point(scrollStart, 0 ))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(scrollEnd, 0)).release().perform();	
	}
	public static void scollend2() {
		Dimension dimension= AppDriver.getDriver().manage().window().getSize();
		int scrollStart= (int)(dimension.getHeight()*0.9);
		int scrollEnd= (int)(dimension.getHeight()*0.5);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
				.press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd)).release().perform();	
		
		
	
	}
	
	public void scrollTillEnd() throws Exception {
		
		for(int i=1; i<=15; i++) {
			 scollend2();
		}
		
	}
	
	}

