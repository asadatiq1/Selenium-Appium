package Android.TestCases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Android.PageObjects.ProfileScreen;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.SearchFeed;
import base.AppFactory;
import base.PropertiesUtil;

public class TCElasticSearch {

	 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	
	@Test(priority = 1 )
	public void esFeed() throws Exception {
	 
		 AddFeedMethod feedMethod= new AddFeedMethod();
		 TCFeed tcfeed= new TCFeed();
		 AddFeedMethod addmethod= new AddFeedMethod();
		 SearchFeed search = new SearchFeed();
		 tcfeed.addFeed();
		 addmethod.btnBack();
		 search.search();
}
//	@Test(priority = 2)
	public void esUpadtedFeed() throws Exception {
		TCEditPostDetailScreen updatefeed = new TCEditPostDetailScreen();
		SearchFeed search = new SearchFeed();
		updatefeed.editAddFeed();
		updatefeed.back();
		search.search();
	}
	//@Test(priority = 3)
	public void esUser() throws Exception {
		SearchFeed search= new SearchFeed();
		TCCommentOnOtherPost commentonotherpost = new TCCommentOnOtherPost();
		EditFeed editfeed = new EditFeed();
		ProfileScreen profilescreen = new ProfileScreen();
		//commentonotherpost.logout();
	//	commentonotherpost.signUp();
		

		try{
		if(editfeed.ProfileIcon.isDisplayed())
		{
			Utils.waitUntil(editfeed.ProfileIcon);
			editfeed.ProfileIcon.click();
		}
		}
		catch(Exception e) {
			Utils.waitUntil(editfeed.withoutImage);
			editfeed.withoutImage.click();
		}
		Utils.waitUntil(profilescreen.profileName);
		EditFeed.ProfileName= profilescreen.profileName.getText();
		Utils.waitUntil(editfeed.btnback);
		editfeed.btnback.click();
		search.searchprofile();	
	}
	//@Test(priority =4)
	public void simpleSearch() throws Exception {
		SearchFeed search= new SearchFeed();
		search.simpleSearch();
	}
//	@Test(priority =5)
	public void searchDeletePost() throws Exception {
		TCEditPostDetailScreen postdetail = new TCEditPostDetailScreen();
		SearchFeed search= new SearchFeed();
		postdetail.deletePost();
		search.search();
	}
	
	
}
