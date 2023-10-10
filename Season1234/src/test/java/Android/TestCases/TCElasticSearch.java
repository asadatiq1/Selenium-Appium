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
	
}
