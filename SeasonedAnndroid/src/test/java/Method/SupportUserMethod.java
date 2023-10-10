package Method;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import Android.PageObjects.Feed;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import base.AppFactory;
import base.PropertiesUtil;

public class SupportUserMethod {
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	Signup signup =new Signup();
	
	
	
	public void pinPost() throws IOException {
		Feed feed = new Feed();
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		try {
			if(feed.pinedPostimg.isDisplayed()) {
				Utils.waitUntil(feed.ellipsis2);
				feed.ellipsis2.click();	
			}
		}catch(Exception e) {
		
		Utils.waitUntil(feed.listScreenEllipsis);
		feed.listScreenEllipsis.click();
		}
		Utils.waitUntil(feed.pin);
		feed.pin.click();
		
	}
	
	public void unpinPost() throws IOException {
		Feed feed = new Feed();
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		Utils.waitUntil(feed.listScreenEllipsis);
		feed.listScreenEllipsis.click();
		Utils.waitUntil(feed.unpin);
		feed.unpin.click();
	}
	
	
}
