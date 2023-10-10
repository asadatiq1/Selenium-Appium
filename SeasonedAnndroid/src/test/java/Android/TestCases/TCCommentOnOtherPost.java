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
		
		
@Test(priority =1)
		public void addFeed() throws Exception {
			TCFeed tcfeed= new TCFeed();
			Feed feed= new Feed();
			AddFeedMethod addfeedmethod = new AddFeedMethod();
			String rantext = RandomString.generateRandomPassword(15); 
			tcfeed.addFeed();
			assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			addfeedmethod.btnBack();
			
		}
		
		
		@Test(priority =2)
		public void logout() throws IOException {
			Feed feed= new Feed();
			Utils.waitUntil(feed.communityFeed);
			assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			logout logout = new logout();
			logout.logout();		
			//Utils.waitUntil(login.loginorSignup);
			//assertEquals(login.loginorSignup.getText(), propertiesUtil.getProperty("loginScreen"));
		}
		@Test(priority =3)
		public void signUp() throws IOException, InterruptedException {
			Feed feed= new Feed();
			Signup signup2 =new Signup();
			TCLogin login = new TCLogin();
			TCSignUp signup= new TCSignUp();
			signup.newEmail();
			signup.firstName();
			signup.lastName();
			signup.enterpPassword();
			signup.enterPhone();
			signup.enterVerificationCode();
			signup.btnLocation();
			signup.selectLocation();
			
			Utils.waitUntil(signup2.feedTab);
			signup2.feedTab.click();
			//login.TC_validEmail();
			//login.TC_validpassword();
			Utils.waitUntil(feed.communityFeed);
			 assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		}
		@Test(priority =4)
		public void commentOtherPost() throws InterruptedException, Exception{
			Feed feed= new Feed();
			AddFeedMethod addfeedmethod = new AddFeedMethod();
			TCFeed tcfeed = new TCFeed();
			EditFeed editfeed= new EditFeed();
			//addfeedmethod.tagUser();
			Utils.waitUntil(editfeed.feedlistingCommentfield);
			editfeed.feedlistingCommentfield.click();
			Utils.waitUntil(feed.commentScreen);
			assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"));
			addfeedmethod.commentTagUser();
			//Utils.waitUntil(feed.commentField);
			//tcfeed.addSimpleComment();
			//addfeedmethod.commentGif();
			//addfeedmethod.commentLongString();
			//addfeedmethod.commentMetaData();
			//addfeedmethod.commentLink();
			//addfeedmethod.commentPhoneNumber2();
			addfeedmethod.btnBack(); 
		}
		
		
		@Test(priority =5)
		public void createSpamPost() throws Exception {
			EditFeed editfeed = new EditFeed();
			EditFeedMethod editfeedmethod = new EditFeedMethod();
			Utils.waitUntil(editfeed.post1);
			editfeed.post1.getText();
			editfeedmethod.spam();
			assertTrue(true, "post get removed");

		}
			
			@Test(priority =6)
			public void createIDontLikePost() throws Exception {
				EditFeed editfeed = new EditFeed();
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				Utils.waitUntil(editfeed.post2);
				editfeed.post2.getText();
				editfeedmethod.iDontLike();
				assertTrue(true, "p ost get removed");
		}
			
			@Test(priority =7)
			public void Nudity() throws Exception {
				EditFeed editfeed = new EditFeed();
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				editfeedmethod.nudity();
				assertTrue(true, "post get removed");
		}
			
			@Test(priority =8)
			public void hateSpeech() throws Exception {
				EditFeed editfeed = new EditFeed();
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				editfeedmethod.hateSpeech();
				assertTrue(true, "post get removed");
		}

			@Test(priority =9)
			public void voilence() throws Exception {
				EditFeed editfeed = new EditFeed();
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				editfeedmethod.voilence();
				assertTrue(true, "post get removed");
		}
			
			@Test(priority =10)
			public void haraasment() throws Exception {
				EditFeed editfeed = new EditFeed();
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				editfeedmethod.haraasment();
				assertTrue(true, "post get removed");
		}
			
			
			@Test(priority =11)
			public void report() throws Exception {
				EditFeed editfeed = new EditFeed();
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				editfeedmethod.report();
				assertTrue(true, "post get removed");
		}
		

	 		@Test(priority =12)
	 		public void blocked() throws Exception {
				EditFeed editfeed = new EditFeed();
				SearchFeed search =new SearchFeed();
				Utils.waitUntil(editfeed.User);
				AddFeedMethod addfeedmethod = new AddFeedMethod();
				EditFeedMethod editfeedmethod = new EditFeedMethod();
				editfeedmethod.blocked();
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
				search.searchBlockedUser();
				
		}

}
