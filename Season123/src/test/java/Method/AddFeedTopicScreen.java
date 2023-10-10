package Method;

import org.testng.Assert;

import Android.PageObjects.Feed;
import Common.Utility.Utils;
import base.PropertiesUtil;

public class AddFeedTopicScreen {
	Feed feed= new Feed();
	PropertiesUtil propertiesUtil = new PropertiesUtil();

	public  void addfeedTopicScreen() throws Exception, InterruptedException {
		 Feed feed= new Feed();
		 AddFeedMethod feedMethod= new AddFeedMethod();
		 Utils.waitUntil(feed.Topic);	
		 feed.Topic.click();
		 Utils.waitUntil(feed.btnTopicAddFeed);
		 feed.btnTopicAddFeed.click();
		 Utils.waitUntil(feed.buildpost); 
		 Assert.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"));
		 feedMethod.textPost();
		 feedMethod.btnPost();
		 Utils.waitUntil(feed.commentScreen);
		 Assert.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
		 Utils.waitUntil(feed.postt); 			 
		 Assert.assertEquals(feed.postt.getText(), feed.RandomString);
		
	}

	}

