package Android.TestCases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.sql.Driver;

import javax.swing.Action;

import org.aspectj.lang.reflect.CatchClauseSignature;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.EditFeedMethod;
import Method.SearchFeed;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.bytebuddy.asm.Advice.Return;

public class TCEditPostDetailScreen {
	PropertiesUtil propertiesUtil;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
}
		
     
	
	
