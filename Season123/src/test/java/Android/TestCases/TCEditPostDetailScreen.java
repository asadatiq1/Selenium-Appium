package Android.TestCases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.sql.Driver;

import javax.swing.Action;

import org.aspectj.lang.reflect.CatchClauseSignature;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.EditFeedMethod;
import Method.SearchFeed;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.bytebuddy.asm.Advice.Return;

public class TCEditPostDetailScreen {
	PropertiesUtil propertiesUtil;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	
	@Test(priority = 1) 
	public void editAddFeed() throws Exception {
		 Feed opfeed= new Feed();
		EditFeed editfeed= new EditFeed();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		TCFeed feed = new TCFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		String rantext = RandomString.generateRandomPassword(15);
		feed.addFeed();
		editfeedmethod.editFeed();
		Utils.waitUntil(editfeed.detailEditFieldpost);
		//editfeed.detailEditFieldpost.clear();
		opfeed.RandomString= RandomString.generateRandomPassword(15);
 		editfeed.detailEditFieldpost.sendKeys(opfeed.RandomString);
		Utils.waitUntil(editfeed.btnDone);
		editfeed.btnDone.click();	
		Utils.waitUntil(editfeed.updateString2);
		Assert.assertEquals(editfeed.updateString2.getText(), opfeed.RandomString);
	
	}
 @Test(priority = 2)
	public void back() throws Exception {
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		addfeedmethod.btnBack();
		
			}
	@Test(priority = 3) 
	public void editComment() throws InterruptedException, Exception {
		TCFeed tcfeed = new TCFeed();
		Feed feed= new Feed();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		String rantext = RandomString.generateRandomPassword(15); 
		tcfeed.addFeed();
		tcfeed.addSimpleComment();
		editfeedmethod.editComment();
		Utils.waitUntil(editfeed.editCommentField);
		editfeed.UpdateComment = RandomString.generateRandomPassword(15);
		editfeed.editCommentField.sendKeys(editfeed.UpdateComment);
		Utils.waitUntil(editfeed.btnDone);
		editfeed.btnDone.click();
		Utils.waitUntil(editfeed.addedcomment);
		Assert.assertEquals(editfeed.addedcomment.getText(), editfeed.UpdateComment);
		addfeedmethod.btnBack();
		
	}

	@Test(priority = 4 )
public void editGifFeed() throws Exception {
		TCFeed tcfeed = new TCFeed();
		Feed feed= new Feed();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		tcfeed.addGIF();
		editfeedmethod.editFeed();
		Utils.waitUntil(editfeed.detailEditFieldpost);
		editfeed.detailEditFieldpost.clear();
		editfeed.PostText=propertiesUtil.getProperty("postText");
		Utils.waitUntil(feed.commentField);
		feed.commentField.sendKeys(editfeed.PostText);
		Utils.waitUntil(editfeed.btnDone);
		editfeed.btnDone.click();
		Utils.waitUntil(editfeed.updatedstring);
		Assert.assertEquals(editfeed.updatedstring.getText(), editfeed.PostText);
		addfeedmethod.btnBack();
}
	@Test(priority = 5 )
	public void editGifComment() throws InterruptedException, Exception {
		TCFeed tcfeed = new TCFeed();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		Feed feed= new Feed();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		tcfeed.addGIF();
		tcfeed.addGifComment();
		editfeedmethod.editComment();
		Utils.waitUntil(editfeed.editCommentField);
		editfeed.editCommentField.sendKeys(RandomString.generateRandomPassword(10));
		Utils.waitUntil(editfeed.btnDone);
		editfeed.btnDone.click();	
		addfeedmethod.btnBack();
	}
	@Test(priority = 6 ) 
	
	public void deletePost() throws InterruptedException, Exception {
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		EditFeed editfeed= new EditFeed();
		TCFeed feed = new TCFeed();
		feed.addFeed();
		editfeedmethod.delete();
		addfeedmethod.btnBack();
		
	}

	@Test(priority = 7) 
	public void deleteComment() throws InterruptedException, Exception {
		TCFeed tcfeed = new TCFeed();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		Feed feed= new Feed();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		tcfeed.addFeed();
		tcfeed.addSimpleComment();
		editfeedmethod.deleteComment();
		addfeedmethod.btnBack();
	}
	@Test(priority = 8) 
 	public void deleteReply() throws InterruptedException, Exception {
		TCFeed tcfeed = new TCFeed();
		Feed feed= new Feed();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		tcfeed.addFeed();
		tcfeed.addSimpleComment();
		tcfeed.addSimplereply();
		editfeedmethod.deletereply();
		try{
			if(editfeed.ReplyBlock.isDisplayed())
			{
				Utils.waitUntil(editfeed.ReplyBlock);
				addfeedmethod.btnBack();
				Assert.assertFalse(true);
				
			}
			}catch(Exception e) {
				Utils.waitUntil(editfeed.ReplyBlock);
				Assert.assertTrue(false);
			}
		addfeedmethod.btnBack();
	}
	@Test(priority = 9) 
	public void listViewEdit() throws InterruptedException, Exception {
		Scrolling scroll = new  Scrolling();
		
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		TCFeed tcfeed = new TCFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		Feed feed= new Feed();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethode = new EditFeedMethod();
		String ranString = RandomString.generateRandomPassword(15);
		tcfeed.addFeed();
		assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"));
		Utils.waitUntil(feed.btnBack);
		addfeedmethod.btnBack();
		
		
/*
		Utils.waitUntil(feed.fieldSearch);
		feed.fieldSearch.click();
		Utils.waitUntil(feed.fieldSearch2);
		feed.fieldSearch2.sendKeys(feed.RandomString); 
		((AndroidDriver) AppFactory.driver).pressKey(new KeyEvent(AndroidKey.ENTER));*/
		//Utils.waitUntil(editfeed.widget);
		//editfeed.widget.click();
	

		try {
		if (editfeed.pinPost.isDisplayed()== editfeed.fewSecondago.isDisplayed()) {
			
			scroll.scollDown();
			Utils.waitUntil(feed.widgetElipsis2);
			feed.widgetElipsis2.click();	
			//editfeedmethod.listelipsis();
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 Utils.waitUntil(editfeed.btnEdit1);
			 editfeed.btnEdit1.click();
			 feedMethod.textPost();
			 feedMethod.tagLocation();
			 feed.RemoveLocation.click();
			 feedMethod.addLocation(propertiesUtil.getProperty("location"));
			 Utils.waitUntil(feed.WashingtonDC);
			 feed.WashingtonDC.click();
			 feedMethod.btnPost();
		}
		
		//else {
			   // Utils.waitUntil(feed.listScreenEllipsis);
				//feed.listScreenEllipsis.click();
				//editfeedmethod.listelipsis();
				
				//scroll.scollDown();
				//Utils.waitUntil(feed.widgetElipsis1);
				//feed.widgetElipsis1.click();	
				//editfeedmethod.listelipsis();
		
			}
   			catch(Exception e){
				

				 Utils.waitUntil(feed.listScreenEllipsis);
					feed.listScreenEllipsis.click();
					editfeedmethod.ellipsisEdit();
				/*scroll.scollDown();
				Utils.waitUntil(feed.widgetElipsis1);
				feed.widgetElipsis1.click();	
				editfeedmethod.listelipsis();*/
				
			}
	}
	
	@Test(priority = 10)
	public void listViewDelete() throws InterruptedException, Exception {
		Scrolling scroll = new  Scrolling();
		
		AddFeedMethod addfeedmethod = new AddFeedMethod();
		TCFeed tcfeed = new TCFeed();
		EditFeedMethod editfeedmethod = new EditFeedMethod();
		Feed feed= new Feed();
		EditFeed editfeed= new EditFeed();
		EditFeedMethod editfeedmethode = new EditFeedMethod();
		String ranString = RandomString.generateRandomPassword(15);
		tcfeed.addFeed();
		assertEquals(feed.commentScreen.getText(), propertiesUtil.getProperty("Comments"));
		Utils.waitUntil(feed.btnBack);
		addfeedmethod.btnBack();
		
		
/*
		Utils.waitUntil(feed.fieldSearch);
		feed.fieldSearch.click();
		Utils.waitUntil(feed.fieldSearch2);
		feed.fieldSearch2.sendKeys(feed.RandomString); 
		((AndroidDriver) AppFactory.driver).pressKey(new KeyEvent(AndroidKey.ENTER));*/
		//Utils.waitUntil(editfeed.widget);
		//editfeed.widget.click();
	

		try {
		if (editfeed.pinPost.isDisplayed()== editfeed.fewSecondago.isDisplayed()) {
			
			scroll.scollDown();
			Utils.waitUntil(feed.widgetElipsis2);
			feed.widgetElipsis2.click();	
			//editfeedmethod.listelipsis();
			 AddFeedMethod feedMethod= new AddFeedMethod();
			 Utils.waitUntil(editfeed.btndelete2);
			 editfeed.btndelete2.click();
		}
		
		//else {
			   // Utils.waitUntil(feed.listScreenEllipsis);
				//feed.listScreenEllipsis.click();
				//editfeedmethod.listelipsis();
				
				//scroll.scollDown();
				//Utils.waitUntil(feed.widgetElipsis1);
				//feed.widgetElipsis1.click();	
				//editfeedmethod.listelipsis();
		
			}
   			catch(Exception e){
				

				 Utils.waitUntil(feed.listScreenEllipsis);
					feed.listScreenEllipsis.click();
					editfeedmethod.delete1();
				/*scroll.scollDown();
				Utils.waitUntil(feed.widgetElipsis1);
				feed.widgetElipsis1.click();	
				editfeedmethod.listelipsis();*/
				
			}
	}
	
	
	
}
		
     //System.out.prin
	
	
