package Method;

import java.io.IOException;

import org.testng.Assert;

import Android.PageObjects.EditFeed;
import Android.PageObjects.Feed;
import Common.Utility.Utils;
import base.PropertiesUtil;

public class EditFeedMethod {
	EditFeed editfeed= new EditFeed();
	PropertiesUtil propertiesUtil = new PropertiesUtil();


public void editFeed() {
	Utils.waitUntil(editfeed.ellipsisFeedDetail);
	editfeed.ellipsisFeedDetail.click();
	Utils.waitUntil(editfeed.btnEdit);
	editfeed.btnEdit.click();
}
public void editComment() {
	Utils.waitUntil(editfeed.ellipsisCommentEditDetail);
	editfeed.ellipsisCommentEditDetail.click();
	Utils.waitUntil(editfeed.btnEdit);
	editfeed.btnEdit.click();
}
public void delete() {
	Utils.waitUntil(editfeed.ellipsisFeedDetail);
	editfeed.ellipsisFeedDetail.click();
	Utils.waitUntil(editfeed.btndelete);
	editfeed.btndelete.click();
}

public void delete1() {
	Utils.waitUntil(editfeed.btndelete2);
	editfeed.btndelete2.click();
}


public void deleteComment() {
	Utils.waitUntil(editfeed.ellipsisCommentEditDetail);
	editfeed.ellipsisCommentEditDetail.click();
	Utils.waitUntil(editfeed.btndelete);
	editfeed.btndelete.click();
}
public void deletereply() {
	Utils.waitUntil(editfeed.ellipsisreply);
	editfeed.ellipsisreply.click();
	Utils.waitUntil(editfeed.btndelete);
	editfeed.btndelete.click();
}


public void ellipsisEdit() throws Exception {
	Feed feed= new Feed();
	AddFeedMethod feedMethod = new AddFeedMethod();
	Utils.waitUntil(feed.ellipsisbtnEdit);
	feed.ellipsisbtnEdit.click();
	 feedMethod.textPost();
	 feedMethod.btnPost();
	
	
}

public void listelipsis () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.ellipsisreply);
	 editfeed.ellipsisreply.click();
	 Utils.waitUntil(editfeed.btnEdit);
	 editfeed.btnEdit.click();
	 feedMethod.textPost();
	 feedMethod.btnPost();
}
public void listelipsis1 () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.btnEdit1);
	 editfeed.btnEdit1.click();
	 feedMethod.textPost();
	 feedMethod.btnPost();
}
public void spam () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.ellipsisreply2);
	 editfeed.ellipsisreply2.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.btnContinue);
	 editfeed.btnContinue.click();
	 Utils.waitUntil(editfeed.btnspam);
	 editfeed.btnspam.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();

}

public void iDontLike () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis2);
	 editfeed.elipsis2.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.btnContinue);
	 editfeed.btnContinue.click();
	 Utils.waitUntil(editfeed.Dontlike);
	 editfeed.Dontlike.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();
	 
}

public void nudity () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis3);
	 editfeed.elipsis3.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.btnContinue);
	 editfeed.btnContinue.click();
	 Utils.waitUntil(editfeed.nudity);
	 editfeed.nudity.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();	 
}
public void hateSpeech () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis4);
	 editfeed.elipsis4.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.btnContinue);
	 editfeed.btnContinue.click();
	 Utils.waitUntil(editfeed.hateSpeech);
	 editfeed.hateSpeech.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();	 
}
public void voilence () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis5);
	 editfeed.elipsis5.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.btnContinue);
	 editfeed.btnContinue.click();
	 Utils.waitUntil(editfeed.voilence);
	 editfeed.voilence.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();	 
}

public void haraasment () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis6);
	 editfeed.elipsis6.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.btnContinue);
	 editfeed.btnContinue.click();
	 Utils.waitUntil(editfeed.harrassment);
	 editfeed.harrassment.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();	 
}

public void report () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis7);
	 editfeed.elipsis7.click();
	 Utils.waitUntil(editfeed.reportComment);
	 editfeed.reportComment.click();
	 Utils.waitUntil(editfeed.report);
	 editfeed.report.click();
	 Utils.waitUntil(editfeed.btnDone2);
	 editfeed.btnDone2.click();	 
}


public void blocked () throws Exception {
	 AddFeedMethod feedMethod= new AddFeedMethod();
	 Utils.waitUntil(editfeed.elipsis8);
	 editfeed.elipsis8.click();
	 Utils.waitUntil(editfeed.block);
	 editfeed.block.click();
	 
}

}
