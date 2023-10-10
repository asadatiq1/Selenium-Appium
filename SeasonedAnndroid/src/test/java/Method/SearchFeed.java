package Method;

import java.io.IOException;

import org.testng.Assert;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Android.PageObjects.ProfileScreen;
import Common.Utility.Utils;
import base.AppFactory;
import base.PropertiesUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SearchFeed {
	
	public static void search() throws InterruptedException, IOException {
		Feed feed= new Feed();
		
		PropertiesUtil propertiesUtil = new PropertiesUtil();
		//Thread.sleep(3000);
		Utils.waitUntil(feed.communityFeed);
	 	Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		Utils.waitUntil(feed.fieldSearch);
		feed.fieldSearch.click();
		Utils.waitUntil(feed.fieldSearch2);
		feed.fieldSearch2.sendKeys(feed.RandomString); 
		((AndroidDriver) AppFactory.driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		try {
		if(feed.searchWidget.isDisplayed()) {
			Utils.waitUntil(feed.searchWidget);
		Assert.assertEquals(feed.searchWidget.getText(), feed.RandomString);
		}
		}catch(Exception e) {
			Utils.waitUntil(feed.noMatchFound);
			feed.noMatchFound.isDisplayed();
		}
		Utils.waitUntil(feed.btnback);
		feed.btnback.click();
	}
	
	public static void searchprofile() throws InterruptedException, IOException {
		Feed feed= new Feed();
		ProfileScreen profilescreen= new ProfileScreen();
		PropertiesUtil propertiesUtil = new PropertiesUtil();
		//Thread.sleep(3000);
		
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		Utils.waitUntil(feed.fieldSearch);
		feed.fieldSearch.click();
		Utils.waitUntil(feed.fieldSearch2);
		feed.fieldSearch2.sendKeys(EditFeed.ProfileName); 
		((AndroidDriver) AppFactory.driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		//Assert.assertEquals(feed.postt.getText(), feed.widget1);
		Utils.waitUntil(feed.btnback);
		feed.btnback.click();
	}

	public static void simpleSearch() throws InterruptedException, IOException {
		Feed feed= new Feed();
		ProfileScreen profilescreen= new ProfileScreen();
		PropertiesUtil propertiesUtil = new PropertiesUtil();
		//Thread.sleep(3000);
		
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		Utils.waitUntil(feed.fieldSearch);
		feed.fieldSearch.click();
		Utils.waitUntil(feed.fieldSearch2);
		feed.fieldSearch2.sendKeys("test"); 
		((AndroidDriver) AppFactory.driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		//Assert.assertEquals(feed.postt.getText(), feed.widget1);
		Utils.waitUntil(feed.btnback);
		feed.btnback.click();
	}
	public static void searchBlockedUser() throws InterruptedException, IOException {
		Feed feed= new Feed();
		EditFeed editfeed = new EditFeed();
		ProfileScreen profilescreen= new ProfileScreen();
		PropertiesUtil propertiesUtil = new PropertiesUtil();
		//Thread.sleep(3000);
		Utils.waitUntil(editfeed.settingIcon);
		editfeed.settingIcon.click();
		Utils.waitUntil(editfeed.tabBlockedAccount);
		editfeed.tabBlockedAccount.click();
		Utils.waitUntil(editfeed.blockAccountWidget);
		editfeed.blockAccountWidget.click();
		Utils.waitUntil(editfeed.blockedUser);
		editfeed.blockUser=	editfeed.blockedUser.getText();
		Utils.waitUntil(editfeed.profileBtnBack);
		editfeed.profileBtnBack.click();
		Utils.waitUntil(editfeed.blockedBtnBack);
		editfeed.blockedBtnBack.click();
		Utils.waitUntil(editfeed.settingBtnBack);
		editfeed.settingBtnBack.click();
		Utils.waitUntil(editfeed.profileBtnBack2);
		editfeed.profileBtnBack2.click();
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		Utils.waitUntil(feed.fieldSearch);
		feed.fieldSearch.click();
		Utils.waitUntil(feed.fieldSearch2);
		feed.fieldSearch2.sendKeys(EditFeed.blockUser); 
		((AndroidDriver) AppFactory.driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		//Assert.assertEquals(feed.postt.getText(), feed.widget1);
		Utils.waitUntil(feed.btnback);
		feed.btnback.click();
	}
	
}

