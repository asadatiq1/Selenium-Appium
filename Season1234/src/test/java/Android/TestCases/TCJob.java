package Android.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Jobs;
import Common.Utility.Utils;
import Method.ApplyJobsMethod;
import base.AppFactory;
import base.PropertiesUtil;

public class TCJob {
	PropertiesUtil propertiesUtil = null;;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	}
	
}