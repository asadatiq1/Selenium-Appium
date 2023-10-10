package Android.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import base.AppFactory;
import base.PropertiesUtil;

public class TCFeedAddImage {
	
	PropertiesUtil propertiesUtil = null;;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	@Test(priority = 1)
	 public void addImageComment() throws InterruptedException, IOException, Exception {

  		 AddFeedMethod feedMethod= new AddFeedMethod();
		 Feed feed= new Feed();
		 feedMethod.addImageByCamera();
		 //Assert.assertEquals(feed.verifyCommentAdded.getText(), propertiesUtil.getProperty("comment"), "comment added"); 
		 Utils.waitUntil(feed.btnCommentSent);
		 feed.btnCommentSent.click();
		 Utils.waitUntil(feed.verifyImageView);
		 Assert.assertEquals(feed.verifyImageView.getText(), propertiesUtil.getProperty("Comments"), "comment added");
		 Utils.waitUntil(feed.commentScreen);
		 Assert.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
		 Utils.waitUntil(feed.btnBack);
		 feed.btnBack.click();
	}
	 @Test(priority = 2)
		public void addImage() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.addImage();
			 feedMethod.btnPost();
			 AssertJUnit.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"), "post Cann't be added Need to add text");
			 feedMethod.textPost();	
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 AssertJUnit.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			 
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
		
		@Test(priority = 3)
		public void addImageChangeLocation() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.tagLocation();
			 feed.RemoveLocation.click();
			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
			 Utils.waitUntil(feed.btnBack2);
			 feed.btnBack2.click();
			 feedMethod.addImage();
			 feedMethod.btnPost();
			 AssertJUnit.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"), "post Cann't be added Need to add text");
			 feedMethod.textPost();	
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 AssertJUnit.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
		@Test(priority = 4)
		public void addImageByCamera() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.addImageByCamera();
			 Utils.waitUntil(feed.btnPost);
			 feedMethod.btnPost();
			 AssertJUnit.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"), "post Cann't be added Need to add text");
			 feedMethod.textPost();	
			 
			 Utils.waitUntil(feed.btnPost);
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 AssertJUnit.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			
			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
			 
		}
		@Test(priority = 5)
		public void addImageByCameraChangeLocation() throws Exception {
			AddFeedMethod feedMethod= new AddFeedMethod();
			 Feed feed= new Feed();
			 feedMethod.btnAddPost();
			 feedMethod.tagLocation();
			 feed.RemoveLocation.click();
			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
			 Utils.waitUntil(feed.btnBack2);
			 feed.btnBack2.click();
			 feedMethod.addImageByCamera();
			 Utils.waitUntil(feed.btnPost);
			 feedMethod.btnPost();
			 Assert.assertEquals(feed.buildpost.getText(), propertiesUtil.getProperty("buildProifileScreen"), "post Cann't be added Need to add text");
			 feedMethod.textPost();	
			
			 Utils.waitUntil(feed.btnPost);
			 feedMethod.btnPost();
			 Utils.waitUntil(feed.commentScreen);
			 Assert.assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"), "post added");
			 

			 Utils.waitUntil(feed.btnBack);
			 feed.btnBack.click();
		}
		//@Test(priority = 6)
				public void removeImage() throws Exception {
					AddFeedMethod feedMethod= new AddFeedMethod();
					 Feed feed= new Feed();
					 feedMethod.btnAddPost();
					 Utils.waitUntil(feed.addPhoto);
					 feed.addPhoto.click();
					 feed.choosePhoto.click();
					 Utils.waitUntil(feed.selectImage);
					 feed.selectImage.click();
					 Utils.waitUntil(feed.removeImage);
					 feed.removeImage.click();
				}
				// @Test(priority = 7)
				 public void editImageFeed() throws Exception {
					 AddFeedMethod feedMethod= new AddFeedMethod();
					 Feed feed= new Feed();
					 addImage();
					 feedMethod.editImageFeed();
					 Utils.waitUntil(feed.checkText);
					 AssertJUnit.assertEquals(feed.checkText.getText(), propertiesUtil.getProperty("Checktext"), "post updated");
					

					 Utils.waitUntil(feed.btnBack);			
					 feed.btnBack.click();	 
				 }
					// @Test(priority = 8)
				 public void editTextFeedFromFeedScreen() throws Exception {
					 AddFeedMethod feedMethod= new AddFeedMethod();
					 Feed feed= new Feed();
					 //TCFeed.addFeed();
					 Utils.waitUntil(feed.listScreenEllipsis);
					 feed.listScreenEllipsis.click();
		             feed.listScreenEdit.click();
		             feedMethod.addImage();
		             feedMethod.btnPost();
		             Utils.waitUntil(feed.communityFeed);
					 AssertJUnit.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));	 
					 AssertJUnit.assertEquals(feed.listP0.getText(), propertiesUtil.getProperty("postText"));
					 Utils.waitUntil(feed.btnBack);
					 feed.btnBack.click();
				 }
}
