package Android.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.springframework.util.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.EditFeedMethod;
import Method.SearchFeed;
import Method.logout;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;

public class TCCommentOnOtherPost {
	 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
		@BeforeTest
		public void Setup() throws MalformedURLException {
			
			AppFactory.Android_LaunchApp();
			propertiesUtil = new PropertiesUtil();
		
		}
		
		
	

}
