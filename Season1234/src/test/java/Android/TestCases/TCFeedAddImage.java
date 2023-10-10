package Android.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import base.AppFactory;
import base.PropertiesUtil;
import base.Scrolling;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TCFeedAddImage {
	
	PropertiesUtil propertiesUtil = null;
	
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
}
