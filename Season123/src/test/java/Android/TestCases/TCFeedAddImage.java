package Android.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import base.AppFactory;
import base.PropertiesUtil;
import base.Scrolling;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TCFeedAddImage {
	
	PropertiesUtil propertiesUtil = null;
	
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	@Test(priority = 1)
	 public void addImageComment() throws InterruptedException, IOException, Exception {

  		AddFeedMethod feedMethod= new AddFeedMethod();
		Scrolling scroll = new Scrolling();
		Feed feed= new Feed();
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));	
		scroll.scollDown(); 
		Utils.waitUntil(feed.Click_Comment_Icon);
		feed.Click_Comment_Icon.click();
//		 Thread.sleep(5000);
//		 TouchAction ac= new TouchAction(AppFactory.driver);
////		 ac.press(PointOption.point(0, 100)).moveTo(PointOption.point(100, 100)).release().perform();
//		 ac.press(PointOption.point(419, 1000))
//		  .moveTo(PointOption.point(478, 100))
//		  .release()
//		  .perform();
		  
		 feedMethod.addImageByCamera();
		 //Assert.assertEquals(feed.verifyCommentAdded.getText(), propertiesUtil.getProperty("comment"), "comment added"); 
		 Utils.waitUntil(feed.btnCommentSent);
		 feed.btnCommentSent.click();
		 Utils.waitUntil(feed.verifyImageView);
		 //del
		 //Assert.assertEquals(feed.verifyImageView.getText(), propertiesUtil.getProperty("Comments"), "comment added");
		 Utils.waitUntil(feed.commentScreen);
		 Assert.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
		 Utils.waitUntil(feed.btnBack);
		 feed.btnBack.click();
	}
	 @Test(priority = 2)
		public void addImage_ByCamera() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			 feedMethod.btnAddPost();
			 feedMethod.Add_a_photo_by_camera();
//			 feedMethod.btnPost();
//			 
//			 AssertJUnit.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"), "post Cann't be added Need to add text");
			 feedMethod.textPost();	
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 //AssertJUnit.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
	 
	 @Test(priority = 3)
		public void addImage_ByLibrary() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			 feedMethod.btnAddPost();
			 feedMethod.Add_a_photo_by_Library();
//			 feedMethod.btnPost();
//			 
//			 AssertJUnit.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"), "post Cann't be added Need to add text");
			 feedMethod.textPost();	
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 //AssertJUnit.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
		
		@Test(priority = 4)
		public void addImage_RemoveLocation() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 Utils.waitUntil(feed.communityFeed);
			 Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
			 feedMethod.btnAddPost();
			 //feedMethod.tagLocation();
			 //Thread.sleep(5000);
			 
//			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
//			 Utils.waitUntil(feed.btnBack2);
//			 feed.btnBack2.click();
			 feedMethod.Add_a_photo_by_Library();
			 feedMethod.textPost();	
			 Utils.waitUntil(feed.RemoveLocation);
			 feed.RemoveLocation.click();
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 //AssertJUnit.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
		
//		@Test(priority = 5)
//		public void addImage_ChangeLocation() throws Exception {
//			AddFeedMethod feedMethod= new AddFeedMethod();
//			 Feed feed= new Feed();
//			 feedMethod.btnAddPost();
//			 feedMethod.Add_a_photo_by_Library();
//			 feedMethod.textPost();	
//			 feedMethod.tagLocation1();
//			 feed.Remove_Location_from_Locations.click();
//			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
//			 Utils.waitUntil(feed.Select_Location);
//			 feed.Select_Location.click();
//			 Utils.waitUntil(feed.btnBack2);
//			 feed.btnBack2.click();
//			 feedMethod.btnPost1();
//			 Utils.waitUntil(feed.commentScreen);
//			 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
//			 Utils.waitUntil(feed.btnBack);
//			 feed.btnBack.click();
//		}
		@Test(priority = 7)
				public void removeImage() throws Exception {
					AddFeedMethod feedMethod= new AddFeedMethod();
					 Feed feed= new Feed();
					 feedMethod.btnAddPost();
					 feedMethod.Add_a_photo_by_Library();
					 feedMethod.textPost();	
//					 Utils.waitUntil(feed.addPhoto);
//					 feed.addPhoto.click();
//					 feed.choosePhoto.click();
//					 Utils.waitUntil(feed.selectImage);
//					 feed.selectImage.click();
					 Utils.waitUntil(feed.removeImage);
					 feed.removeImage.click();
					 feedMethod.btnPost();
					 Utils.waitUntil(feed.commentScreen);
					 Assert.assertEquals(feed.commentScreen.getText(), "Comments");
					 Utils.waitUntil(feed.btnBack);
					 feed.btnBack.click();
				}
				@Test(priority = 8)
				 public void editImageFeed() throws Exception {
					 AddFeedMethod feedMethod= new AddFeedMethod();
					 Feed feed= new Feed();
					 addImage_ByCamera();
					 feedMethod.editImageFeed();
					 Utils.waitUntil(feed.checkText);
					 AssertJUnit.assertEquals(feed.checkText.getText(), propertiesUtil.getProperty("Checktext"), "post updated");
					 Utils.waitUntil(feed.btnBack);			
					 feed.btnBack.click();	 
				 }
					@Test(priority = 9)
				 public void editTextFeedFromFeedScreen() throws Exception {
					 AddFeedMethod feedMethod= new AddFeedMethod();
					 Feed feed= new Feed();
					 //TCFeed.addFeed();
					 Utils.waitUntil(feed.listScreenEllipsis);
					 feed.listScreenEllipsis.click();
		             feed.listScreenEdit.click();
		             feedMethod.Add_a_photo_by_camera();
		             feedMethod.btnPost();
		             Utils.waitUntil(feed.communityFeed);
					 AssertJUnit.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));	 
					 AssertJUnit.assertEquals(feed.listP0.getText(), propertiesUtil.getProperty("postText"));
					 Utils.waitUntil(feed.btnBack);
					 feed.btnBack.click();
				 }
}
