package Android.TestCases;

import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import com.beust.jcommander.Parameter;
import com.google.common.base.Optional;

import org.testng.AssertJUnit;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.LongPress;
import Method.SearchFeed;
import Method.Verify;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;
import io.appium.java_client.AppiumDriver;

public class TCFeed {
	
	 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp(); 
		propertiesUtil = new PropertiesUtil();
	
	}

	@Test(priority = 1 )
		public void addFeed() throws Exception {
		 
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Scrolling scroll = new Scrolling();
			 Utils.waitUntil(feed.Feed_plus_icon);
			 feedMethod.btnAddPost();
			 Utils.waitUntil(feed.buildpost); 
			 Assert.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"));
			 Utils.waitUntil(feed.topicDropdown);
			 feed.topicDropdown.click();		 
			 Utils.waitUntil(feed.barLife);
			 feed.barLife.click();
			 feedMethod.textPost();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
			 Utils.waitUntil(feed.postt); 
			 Assert.assertEquals(feed.postt.getText(), feed.RandomString);
			 //scroll.scrollTillEnd();
		}
		@Test(priority = 2 ) 	 
	  public void Reaction() throws Exception {
			 Feed feed= new Feed();
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 feedMethod.reactionDetail();
			 Utils.waitUntil(feed.reactCount);
			 Assert.assertEquals(feed.reactCount.getText(), propertiesUtil.getProperty("count"));
					 
	}
	
	@Test(priority = 3 ) 
		public void addSimpleComment() throws InterruptedException, Exception {
		
		 AddFeedMethod feedMethod= new AddFeedMethod();
		 Feed feed= new Feed();
		 Utils.waitUntil(feed.commentScreen);
		 //Assert.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
		 Utils.waitUntil(feed.commentField);
		 feedMethod.comment();
		 
		 Utils.waitUntil(feed.verifyCommentAdded);
		 Assert.assertEquals(feed.verifyCommentAdded.getText(), feed.RandomComment);
		}
	
	@Test(priority =4 ) 	 
	  public void reactionComment() throws Exception {
			 Feed feed= new Feed();
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 feedMethod.reactionCommentDetail();
			 Utils.waitUntil(feed.commentLikecount);
			 Assert.assertEquals(feed.commentLikecount.getText(), propertiesUtil.getProperty("count"));
	}
	
	@Test(priority = 5 ) 
		public void addSimplereply() throws InterruptedException, Exception {
		 
		 AddFeedMethod feedMethod= new AddFeedMethod();
		 Feed feed= new Feed();
		 SearchFeed search = new SearchFeed();
		 feedMethod.addReply();
		
	}
	@Test(priority = 6) 
	  public void reactionReply() throws Exception {
			 Feed feed= new Feed();
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 feedMethod.reactionReplyDetail();
			 Utils.waitUntil(feed.replyLikecount);
			 Assert.assertEquals(feed.replyLikecount.getText(), propertiesUtil.getProperty("count"));
	}
	@Test(priority = 7)
	public void back() throws IOException {
		 Feed feed= new Feed();
		// Utils.waitUntil(feed.btnBack);
		 
		feed.btnBack.click();
		Utils.waitUntil(feed.communityFeed);
		 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		 //Verify verify = new Verify();
		 //verify.verify();
		 
		 
		 //Utils.waitUntil(feed.reactCountListing);
		 //Assert.assertEquals(feed.reactCountListing.getText(), propertiesUtil.getProperty("count"));
		//Utils.waitUntil(feed.communityFeed);
		//Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
	//	Utils.waitUntil(feed.fieldSearch);
	//	search.search();
		
		
	}
		
		@Test(priority = 8)
		//Add feed after searching the Topics 
		public void addSearchFeed() throws Exception {
			
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 SearchFeed search = new SearchFeed();
			 feedMethod.btnAddPost();
			 Utils.waitUntil(feed.topicDropdown);
			 feed.topicDropdown.click();		
			 Utils.waitUntil(feed.inputSearchField);
			 feed.inputSearchField.click();
			 feedMethod.searchTopic(propertiesUtil.getProperty("searchPost"));
			 feed.tapResult.click();
			 feedMethod.textPost();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Utils.waitUntil(feed.postt);
			 Assert.assertEquals(feed.postt.getText(), feed.RandomString);
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
			 Utils.waitUntil(feed.communityFeed);
			 //Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			// Utils.waitUntil(feed.fieldSearch);
			// search.search();
		}
			
		@Test(priority = 9)
		public void removeLocation() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 SearchFeed search = new SearchFeed();
			 feedMethod.btnAddPost();
			 Utils.waitUntil(feed.topicDropdown);
			 feed.topicDropdown.click();		 
			 Utils.waitUntil(feed.barLife);
			 feed.barLife.click();
			 Utils.waitUntil(feed.btnRemoveLocation);
			 feed.btnRemoveLocation.click();
			 Utils.waitUntil(feed.btnPost);
			 feedMethod.textPost();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.postt);
			 Assert.assertEquals(feed.postt.getText(), feed.RandomString);
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			// Utils.waitUntil(feed.fieldSearch);
			// search.search();
		}
		
	@Test(priority = 10)
		public void addByPhone() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.simpleText(propertiesUtil.getProperty("phoneNumber"));
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			 
		}
	
	  @Test(priority = 11)
	 
	 
		public void addGIF() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 RandomString randomString = new RandomString();
			 feedMethod.btnAddPost();
			 feedMethod.simpleText(propertiesUtil.getProperty("Gif") +randomString.specialCharacterRandom(3));
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
		}	 
		@Test(priority = 12)
		public void addGifComment() throws Exception {
			
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.commentGif();
			 Assert.assertEquals(feed.verifyImageView.getText(), propertiesUtil.getProperty("Comments"), "comment added");
//			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"), "Post added");
			  
			/*   feedMethod.addreply();
		 feed.replyField.sendKeys(propertiesUtil.getProperty("Gif"));
		 Utils.waitUntil(feed.btnCommentSent);
		 feed.btnCommentSent.click();*/
		}
		@Test(priority = 13)
		public void backGif() throws Exception {
			
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.btnBack);
			  feed.btnBack.click();
			 //Utils.waitUntil(feed.listP0);
			 //Assert.assertEquals(feed.listP0.getText(), propertiesUtil.getProperty("postText"));
	
		}

		
		@Test(priority = 14)
		public void addSpecialCharacters() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			RandomString randomString = new RandomString();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost(); 
			 feed.Randomspecialcharactor = randomString.specialCharacterRandom(10);
			 feedMethod.simpleText(feed.Randomspecialcharactor);
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.postt);
			 Assert.assertEquals(feed.postt.getText(),feed.Randomspecialcharactor);
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
		}
	@Test(priority = 15)
		 public void addSpecialCharactersComment() throws InterruptedException, Exception {
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 RandomString randomString = new RandomString();
			 feedMethod.commentSepecialCharacters();
			 Utils.waitUntil(feed.verifySpecialCharactersInComment);
			 Assert.assertEquals(feed.verifySpecialCharactersInComment.getText(),feed.specialCharactorComment);
			 Utils.waitUntil(feed.btnBack); 
			 feed.btnBack.click();
		}
	
		@Test(priority = 16)
		public void addByEmail() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.simpleText(propertiesUtil.getProperty("email"));
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"), "Feed cannot create with number");
		}
		
	@Test(priority = 17)
		public void addByLink() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 RandomString randomString = new RandomString();
			 feedMethod.btnAddPost();
			 feed.Randomlink= propertiesUtil.getProperty("Link") +randomString.specialCharacterRandom(3);
			 feedMethod.simpleText(feed.Randomlink);
			 feedMethod.btnPost();	
		//	 Assert.assertEquals(feed.randomlink.getText(), feed.Randomlink);
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
			 
		}
	
		@Test(priority = 18)
		public void addLinkComments() throws InterruptedException, Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			RandomString randomString = new RandomString();
			 Feed feed= new Feed();
			 feedMethod.commentLink();
			 Utils.waitUntil(feed.btnBack4); 
			 feed.btnBack4.click();
		}
	@Test(priority = 19)
		public void addByMetaDataLink() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 RandomString randomString = new RandomString();
			 feedMethod.btnAddPost();
			 feedMethod.simpleText(propertiesUtil.getProperty("metaDataLink") +randomString.specialCharacterRandom(3));
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
	}
	@Test(priority = 20)
	public void addByMetaDataLinkComment() throws InterruptedException, Exception {
	        AddFeedMethod feedMethod= new AddFeedMethod();
	         Feed feed= new Feed();
	        // RandomString randomString = new RandomString();
			 feedMethod.commentMetaData();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
			// feedMethod.commentEmail();
			 
		}
	
		@Test(priority = 21)
		public void btnBack() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 Utils.waitUntil(feed.buildpost); 
			 Assert.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"));
			 Utils.waitUntil(feed.btnCross);
			 feed.btnCross.click();
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		}
		
		@Test(priority = 22)
		public void longString() throws Exception {
		AddFeedMethod feedMethod= new AddFeedMethod();
		 Feed feed= new Feed();
		 RandomString randomString = new RandomString();
		 feedMethod.btnAddPost();
		 feed.LongString= propertiesUtil.getProperty("longString")+randomString.specialCharacterRandom(3);
		 feedMethod.simpleText(feed.LongString);
		 feedMethod.btnPost();
		 Utils.waitUntil(feed.postt);
		 Assert.assertEquals(feed.postt.getText(), feed.LongString);
		 
		}
	@Test(priority = 23)
		public void longStringComment() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 RandomString randomString = new RandomString();
		 feedMethod.commentLongString();
		 Assert.assertEquals(feed.verifyLongStringLinkInComment.getText(), propertiesUtil.getProperty("Comments"), "comment added");
		 Utils.waitUntil(feed.btnBack3);
		 feed.btnBack3.click();
		}
		
	@Test(priority = 24)
		public void blankSpace() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.simpleText(propertiesUtil.getProperty("blankSpace"));
			 feedMethod.btnPost();
			// Assert.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("blankSpace"), "post cannot added");
			 Utils.waitUntil(feed.btnCross);
			 feed.btnCross.click();
		}
		
	//----------------------------------------------------------------------------------------------------------------------------------------
		
		@Test(priority = 25)
		public void changeLocation() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), "Community Feed");		
			 feedMethod.btnAddPost();
			 feedMethod.tagLocation();
			 feed.RemoveLocation.click();
			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
			 Utils.waitUntil(feed.WashingtonDC);
			 feed.WashingtonDC.click();
			 Utils.waitUntil(feed.addText);
			 feedMethod.textPost();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
		
		@Test(priority = 26)
		public void goBackRemoveLocation() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.communityFeed);	
			 feedMethod.btnAddPost();
			 feedMethod.tagLocation();
			 Utils.waitUntil( feed.RemoveLocation);
			 feed.RemoveLocation.click();
			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
			 Utils.waitUntil(feed.btnBack2);
			 feed.btnBack2.click();
			 feedMethod.textPost();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
			// Assert.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("blankSpace"), "post cannot added");
			 //Assert.assertEquals(feed.Austin.getText(), propertiesUtil.getProperty("location1"), "Same Location");
			 
		}
		
		@Test(priority = 27)
		public void btnCurrentLocation() throws Exception {
			
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.communityFeed);	
			 Utils.waitUntil(feed.Feed_plus_icon);
			 feedMethod.btnAddPost();
			 feedMethod.tagLocation();
			 feed.RemoveLocation.click();
			 Utils.waitUntil(feed.btnCurrentLocation);
			 feed.btnCurrentLocation.click();
			 try{
				 	if(feed.Allow.isDisplayed()) 
				 	{
					 Utils.waitUntil(feed.Allow);
					 feed.Allow.click();
				 	}
			 	}
			 catch(Exception e) 
			 {
				 
			 }
			 
			 Utils.waitUntil(feed.Lahore);
			 feed.Lahore.click();
			 Assert.assertEquals(feed.Lahore.getText(), propertiesUtil.getProperty("lahore"), "Same Location");
			 feedMethod.textPost();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(),"Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
			 
		
		
		@Test(priority = 28)
		public void covidArtical() throws Exception {
			Scrolling scroll = new Scrolling();
			Feed feed= new Feed();
			Utils.waitUntil(feed.communityFeed);
//			scroll.scollDown();
//			scroll.scollDown();
			scroll.scollDown_double();
			Utils.waitUntil(feed.covidArtical);
			feed.covidArtical.click();
			Utils.waitUntil(feed.verifyCovidArtical);
			Assert.assertEquals(feed.verifyCovidArtical.getText(), propertiesUtil.getProperty("serviceIndustory"));
			Utils.waitUntil(feed.closeCovidArtical);
			feed.closeCovidArtical.click();
			Utils.waitUntil(feed.covidArticalList);
			Assert.assertEquals(feed.covidArticalList.getText(), propertiesUtil.getProperty("listcovid"));
		}
		
		
		
	//----------------------------------------------------------------------------------------------------------------------------------------	
		
		
		//Creating Thread in comments
		//@Test
		public void threadComment() throws Exception {
			AddFeedMethod addfeedmethod = new AddFeedMethod();
			 Feed feed= new Feed();
			addFeed();
			addSimpleComment();
			for (int i=0; i<10; i++) {

			addfeedmethod.addReplyTag();
			
			}
		}
		
		
		//@Test(priority = 18)
		 public void editTextFeed() throws Exception {
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			// addFeed();
			 feedMethod.editImageFeed();
			 AssertJUnit.assertEquals(feed.updatText.getText(), propertiesUtil.getProperty("updateText"), "post updated");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();	 
	  }
		//@AfterTest
		public void quit() {
			AppFactory.closeApp();
		}
		
}
