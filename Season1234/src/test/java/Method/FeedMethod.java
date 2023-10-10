package Method;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import Android.PageObjects.Feed;
import Common.Utility.Utils;
import base.PropertiesUtil;
import base.Scrolling;

public class FeedMethod {
	
	//Global Objects
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	Feed feed = new Feed();
	Scrolling scroll = new Scrolling();
	
	//Feed Tab Switch
	
	public void feed_tab() {
		Utils.waitUntil(feed.feed_tab);
		if (feed.JobsTab.isDisplayed()) {
			Utils.waitUntil(feed.feed_tab);
			feed.feed_tab.click();
		}else {
			Assert.assertTrue(true);
		}
				
	}
	
	public void content() {
		Utils.waitUntil(feed.profile_icon_top);
		feed.profile_icon_top.isDisplayed();
		Utils.waitUntil(feed.search);
		feed.search.isDisplayed();
		Utils.waitUntil(feed.discover_icon);
		feed.discover_icon.isDisplayed();
		Utils.waitUntil(feed.notification_icon);
		feed.notification_icon.isDisplayed();
		Utils.waitUntil(feed.heading);
		feed.heading.isDisplayed();
		Utils.waitUntil(feed.under_heading_text);
		feed.under_heading_text.isDisplayed();
		Utils.waitUntil(feed.line_divider);
		feed.line_divider.isDisplayed();
		Utils.waitUntil(feed.add_plus_btn);
		feed.add_plus_btn.isDisplayed();
		
	}
	
	public void Article() {
		Utils.waitUntil(feed.heading);
		
		
	}
	
	public void Add_Post() {
		Utils.waitUntil(feed.add_plus_btn);
		feed.add_plus_btn.click();
		
	}
	

}
