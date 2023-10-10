package Method;

import java.io.IOException;

import org.testng.Assert;

import Android.PageObjects.Feed;
import Android.PageObjects.Signup;
import Android.TestCases.TCFeed;
import Common.Utility.Utils;
import base.PropertiesUtil;
import base.Scrolling;

public class Verify {
	
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	TCFeed tcfeed= new TCFeed();
	Feed feed= new Feed();
	Scrolling scroll= new Scrolling();
	public void verify() throws IOException {
		Utils.waitUntil(feed.feed1);
		
		if(feed.feed1.getText() ==  feed.RandomString) {
		
			Assert.assertEquals(feed.feed1.getText(), feed.RandomString);
		
		}
		
		else if(feed.feed2.getText() ==  feed.RandomString) {
			
			Assert.assertEquals(feed.feed2.getText(), feed.RandomString);
			
		}
		scroll.scollDown();
 		 if(feed.feed3.getText() ==  feed.RandomString) {
			
			Assert.assertEquals(feed.feed3.getText(), feed.RandomString);
		}
	}
		


}
