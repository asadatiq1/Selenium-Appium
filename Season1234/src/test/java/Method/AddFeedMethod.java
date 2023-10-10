
package Method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Common.Utility.Utils;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;

public class AddFeedMethod {
	Feed feed= new Feed();
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	
	
}