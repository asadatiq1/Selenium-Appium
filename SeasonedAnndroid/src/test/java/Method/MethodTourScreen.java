package Method;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Android.PageObjects.TourSkip;
import Common.Utility.Utils;
import base.AppDriver;

public class MethodTourScreen {
	
	TourSkip ts = new TourSkip();
	
	public  void  TourScreen() {
		Utils.waitUntil(ts.skip);
		ts.skip.click();

}
}
