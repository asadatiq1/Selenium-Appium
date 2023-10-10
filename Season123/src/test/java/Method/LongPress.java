package Method;

import base.AppDriver;
import base.AppFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import Android.PageObjects.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class LongPress {
	
	static AndroidDriver<MobileElement> driver;
	
	  public static void longPress() {
		  Feed feed= new Feed();
		  
		  WebElement ele = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup\n"
		  		+ ""));
		  Point location = ele.getLocation();
		  //new TouchAction(driver).lopress(PointOption.point(location.getX(), location.getY())).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform();
//
//		  TouchAction action = new TouchAction(driver);
//		  action.longPress(LongPressOptions.longPressOptions()).perform().release();

		  //MobileElement longpress = driver.findElement({element find strategy})
				    LongPressOptions longPressOptions = new LongPressOptions();
				    longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(ele));
				    TouchAction action = new TouchAction(driver);
				    action.longPress(longPressOptions).release().perform();
		  
	  }
}
