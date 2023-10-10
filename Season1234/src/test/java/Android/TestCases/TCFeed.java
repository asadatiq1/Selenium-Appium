package Android.TestCases;

import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import com.beust.jcommander.Parameter;
import com.google.common.base.Optional;

import org.testng.AssertJUnit;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.FeedMethod;
import Method.SearchFeed;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;
import io.appium.java_client.AppiumDriver;

public class TCFeed {
	
	//Global Objects
	 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
	 FeedMethod feed= new FeedMethod();
	 
	 //Application Launch
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp(); 
		propertiesUtil = new PropertiesUtil();
		feed= new FeedMethod();
	
	}

	// -------------------- Test Cases --------------------
	
	@Test(priority = 1)
	public void Verify_Content() {
		feed.feed_tab();
		feed.content();
		
	}
}
