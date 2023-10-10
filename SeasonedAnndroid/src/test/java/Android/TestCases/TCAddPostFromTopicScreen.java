package Android.TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Method.AddFeedTopicScreen;
import base.AppFactory;
import base.PropertiesUtil;

public class TCAddPostFromTopicScreen {
		 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
			@BeforeTest
			public void Setup() throws MalformedURLException {
				
				AppFactory.Android_LaunchApp();
				propertiesUtil = new PropertiesUtil();
			
			}
			@Test(priority=1)
			public static void addFeedTopicScreen() throws InterruptedException, Exception {
				AddFeedTopicScreen addfeed= new AddFeedTopicScreen();
				TCFeed feed = new TCFeed();
				addfeed.addfeedTopicScreen();
			}		
			
}
