package Android.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Common.Utility.Utils;
import Method.LoginMethod;
import Method.SupportUserMethod;
import Method.logout;
import base.AppFactory;
import base.PropertiesUtil;

public class TCSupportUser {

	 PropertiesUtil propertiesUtil= new PropertiesUtil() ;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	
}
