package Android.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Common.Utility.Utils;
import Method.LoginMethod;
import Method.SupportUserMethod;
import Method.logout;
import base.AppFactory;
import base.PropertiesUtil;

public class TCSupportUser {

	 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	@Test(priority=1)
	public void pinPost() throws IOException {
		SupportUserMethod supportmethod = new SupportUserMethod();
		logout logout = new logout();
		logout.logout();
		Login login = new Login();
		Feed feed = new Feed();
		LoginMethod loginMethod= new LoginMethod();
		loginMethod.enterEmail(propertiesUtil.getProperty("email2"));
		loginMethod.enterPassword(propertiesUtil.getProperty("password2"));
		feed.feedTab.click();
		supportmethod.pinPost();
		Assert.assertEquals(feed.pinTitle.getText(), propertiesUtil.getProperty("pinTitle"));
		Utils.waitUntil(feed.pinPopover);
		feed.pinPopover.click();
		Utils.waitUntil(feed.pinnedPost);
		Assert.assertEquals(feed.pinnedPost.getText(), propertiesUtil.getProperty("pinnedPost"));
	}
	
	@Test(priority=2)
	public void unpinPost() throws IOException {
		SupportUserMethod supportmethod = new SupportUserMethod();
		Feed feed = new Feed();
		supportmethod.unpinPost();
		Assert.assertEquals(feed.unpinTitle.getText(), propertiesUtil.getProperty("unpinTitle"));
		Utils.waitUntil(feed.unpinPopover);
		feed.unpinPopover.click();	
	}
	
	@Test(priority=3)
	public void markAsSpam() throws IOException {
		Feed feed = new Feed();
		Utils.waitUntil(feed.listScreenEllipsis);
		feed.listScreenEllipsis.click();
		Utils.waitUntil(feed.markAsSpam);
		feed.markAsSpam.click();	
		assertTrue(true, "post get removed");
	}
}
