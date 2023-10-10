package Method;

import java.io.IOException;

import org.testng.annotations.Test;

import Android.PageObjects.EditFeed;
import Android.TestCases.TCFeed;
import Android.TestCases.TCLogin;
import Common.Utility.Utils;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;

public class logout {

public void logout() {
	EditFeed editfeed = new EditFeed();
	Scrolling scroll= new Scrolling();
	
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
	
	Utils.waitUntil(editfeed.settingIcon);
	editfeed.settingIcon.click();
	Utils.waitUntil(editfeed.signOut);
	scroll.scollDown();
	editfeed.signOut.click();
	
}		

}
