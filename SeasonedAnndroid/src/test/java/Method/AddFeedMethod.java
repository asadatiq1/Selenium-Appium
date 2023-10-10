
package Method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Common.Utility.Utils;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import io.appium.java_client.MobileElement;

public class AddFeedMethod {
	Feed feed= new Feed();
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	
	public void feed() throws Exception, InterruptedException {
		
		Utils.waitUntil(feed.btnAddFeed);
		this.btnAddPost();
		//this.textPost((propertiesUtil.getProperty("postText")));
		this.searchTopic((propertiesUtil.getProperty("searchPost")));
		this.btnPost();
	}

public  void btnAddPost() throws Exception, InterruptedException {
	Utils.waitUntil(feed.btnAddFeed);
	feed.btnAddFeed.click();
}

public  void textPost() throws Exception {
	Utils.waitUntil(feed.addText);
	feed.RandomString = RandomString.generateRandomPassword(15);
	feed.addText.sendKeys(feed.RandomString);

}

public void searchTopic(String searchPost) throws Exception{
	Utils.waitUntil(feed.inputSearchField);
	feed.inputSearchField.sendKeys(searchPost);
}

public  void btnPost() throws Exception {
	Utils.waitUntil(feed.btnPost);
	feed.btnPost.click();
}

public  void btnRemoveLocation() throws Exception {
	Utils.waitUntil(feed.btnRemoveLocation);
	feed.btnRemoveLocation.click();
}

public void addPhoto() throws Exception{
	Utils.waitUntil(feed.addPhoto);
	feed.addPhoto.click();
}

public void reactionDetail() throws Exception{
	Utils.waitUntil(feed.btnReactDetail);
	feed.btnReactDetail.click();
}

public void reactionCommentDetail() throws Exception{
	Utils.waitUntil(feed.btnLikeComment);
	feed.btnLikeComment.click();
}


public void reactionReplyDetail() throws Exception{
	Utils.waitUntil(feed.btnLikeReply);
	feed.btnLikeReply.click();
}



public void choosePhoto() throws Exception{
	Utils.waitUntil(feed.choosePhoto);
	feed.choosePhoto.click();
	
}
public void selectImage() throws Exception{
	Utils.waitUntil(feed.selectImage);
	feed.selectImage.click();
	
}
public void openCamer() throws Exception{
	Utils.waitUntil(feed.openCamer);
	feed.openCamer.click();
}
public void tagLocation() throws Exception{
	Utils.waitUntil(feed.tagLocation);
	feed.tagLocation.click();
}
public  void addLocation(String location) throws Exception {
	Utils.waitUntil(feed.addLocation);
	feed.addLocation.sendKeys(location);
}
public  void btnBack() throws Exception {
	Utils.waitUntil(feed.btnBack);
	Utils.waitUntil(feed.btnBack);
	feed.btnBack.click();
}

public  void updateText(String updateText) throws Exception {
	Utils.waitUntil(feed.updatText);
	feed.updatText.sendKeys(updateText);
}

public  void editImageFeed() throws Exception {
	 feed.ellipsis.click();	
	 Utils.waitUntil(feed.btnEdit);
	 feed.btnEdit.click();
	 try{
		 if(feed.imageRemove != null && feed.imageRemove.isDisplayed()) {
			 feed.imageRemove.click();	 
		 }
	    }catch(Exception e){
	        //System.out.println(e);
	        //return false;
	    }
	 updateText(propertiesUtil.getProperty("updateText"));
	 feed.btnDone.click();
}
public  void addImage() throws Exception, InterruptedException {
	 Utils.waitUntil(feed.commentAddPhoto);
	if(feed.commentAddPhoto != null && feed.commentAddPhoto.isDisplayed()) {
		feed.commentAddPhoto.click(); 
	}
	else {
		Utils.waitUntil(feed.addPhoto);
		feed.addPhoto.click();
	}
	 Utils.waitUntil(feed.choosePhoto);
	 feed.choosePhoto.click();
	 try{
		 if(feed.locationPopover != null && feed.locationPopover.isDisplayed()) {
			 feed.Allow.click(); 
		 }
	    }catch(Exception e){
	        //System.out.println(e);
	        //return false;
	    }

	 Utils.waitUntil(feed.selectImage);
	 feed.selectImage.click();
	 
}

public  void addImageByCamera() throws Exception, InterruptedException {
	
	Utils.waitUntil(feed.commentAddPhoto);
	 feed.commentAddPhoto.click();
	 Utils.waitUntil(feed.openCamer);
	 feed.openCamer.click();
	 try{
		 if(feed.locationPopover != null && feed.locationPopover.isDisplayed()) {
			 Utils.waitUntil(feed.Allow);
			 feed.Allow.click(); 
		 }
	    }catch(Exception e){
	        //System.out.println(e);
	        //return false;
	    }
	 Utils.waitUntil(feed.takePhoto);
	 feed.takePhoto.click();
	 Thread.sleep(2000);
	 Utils.waitUntil(feed.btnOk);
	 feed.btnOk.click();
	
	 
	 
}

public  void comment() throws Exception, InterruptedException {
	feed.commentField.isEnabled();
	Utils.waitUntil(feed.commentField);
	feed.RandomComment=  RandomString.generateRandomPassword(15);
	feed.commentField.sendKeys(feed.RandomComment);
	Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
	/* addImage();
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("phoneNumber"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
	 Utils.waitUntil(feed.listP0);
	 feed.listP0.click();
	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("email"));
	 feed.btnCommentSent.click();
	 Utils.waitUntil(feed.listP0);
	 feed.listP0.click();
	 /////////////////////////////
	 addImageByCamera();
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();

	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("Link"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
	 
	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("metaDataLink"));
	 Utils.waitUntil(feed.btnCommentSent);
*/
}

public  void commentImage() throws Exception, InterruptedException {
	
	addImageByCamera();
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
		
}

public  void commentLink() throws Exception, InterruptedException {
	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("Link"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
		
}


public  void commentTagUser() throws Exception, InterruptedException {
	EditFeed editfeed = new EditFeed();
	Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys("@");
	Utils.waitUntil(feed.memberList);
	//feed.user =feed.clickUser.getText();
	Utils.waitUntil(feed.clickUser);
	feed.clickUser.click();
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
		
}


public  void commentMetaData() throws Exception, InterruptedException {
	Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("metaDataLink"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();

}

public  void commentSepecialCharacters() throws Exception, InterruptedException {
	 Utils.waitUntil(feed.commentField);
	 RandomString randomString = new RandomString();
	 feed.specialCharactorComment= randomString.specialCharacterRandom(10);
	 feed.commentField.sendKeys(feed.specialCharactorComment);
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click(); 
}
public  void commentGif() throws Exception {
	Utils.waitUntil(feed.commentField);
	feed.commentField.sendKeys(propertiesUtil.getProperty("Gif"));
	Utils.waitUntil(feed.btnCommentSent);
	feed.btnCommentSent.click();
}
public  void commentPhoneNumber() throws Exception {
	Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("phoneNumber"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
}
	 public  void commentPhoneNumber2() throws Exception {
			Utils.waitUntil(feed.commentField);
			 feed.commentField.sendKeys(propertiesUtil.getProperty("phoneNumber"));
			 Utils.waitUntil(feed.btnCommentSent2);
			 feed.btnCommentSent2.click();
	
}
public  void commentEmail() throws Exception {
	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("email"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
//	 Utils.waitUntil(feed.listP0);
	 //feed.listP0.click();
}
public  void commentLongString() throws Exception {
	 Utils.waitUntil(feed.commentField);
	 feed.commentField.sendKeys(propertiesUtil.getProperty("longString"));
	 Utils.waitUntil(feed.btnCommentSent);
	 feed.btnCommentSent.click();
	
}
public void simpleText(String postText) {
	Utils.waitUntil(feed.addText);
	feed.addText.sendKeys(postText);
}


public  void addReply() throws Exception {
	Utils.waitUntil(feed.btnReply);
	feed.btnReply.click();
	Utils.waitUntil(feed.replyField);
	
//	feed.RandomComment= RandomString.generateRandomPassword(15);
	//Utils.waitUntil(feed.replyField);
//	feed.replyField.sendKeys(feed.RandomComment);
	Utils.waitUntil(feed.btnCommentSent);
	feed.btnCommentReply.click();
	//Assert.assertEquals(feed.verifyReplyField.getText(), feed.RandomComment);

}

public  void addReplyTag() throws Exception {
//	Utils.waitUntil(feed.btnReply);
//	feed.btnReply.click();
//	Utils.waitUntil(feed.replyField);
	    
	    TouchActions action = new TouchActions(AppFactory.driver);
	    action.longPress(feed.btnreact);
	    action.perform();


	
	//feed.RandomComment= RandomString.generateRandomPassword(15);
//	feed.replyField.sendKeys("@Test Apply2");
//	feed.replyField.sendKeys(feed.replyField.getText() + RandomString.generateRandomPassword(15) );
//	feed.replyField.sendKeys(feed.RandomComment);
	//Utils.waitUntil(feed.btnCommentSent);
	//feed.btnCommentReply.click();
	//Assert.assertEquals(feed.verifyReplyField.getText(), feed.RandomComment);

}

public  void tagUser() throws Exception {
	EditFeed editfeed = new EditFeed();
	Utils.waitUntil(feed.communityFeed);
	Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
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
	editfeed.blockUser=	editfeed.blockedUser.getText();
	Utils.waitUntil(editfeed.profileBtnBack2);
	editfeed.profileBtnBack2.click();
	Utils.waitUntil(feed.communityFeed);
	Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
}


}