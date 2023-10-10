package Android.TestCases;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.AddFeedMethod;
import Method.LoginMethod;
import Method.MethodTourScreen;
import Method.SingupMethod;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.Scrolling;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TCLogin {
	
	PropertiesUtil propertiesUtil =  new PropertiesUtil();
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	
	}
	@Test (priority = 1)
	
	public void TC_InvalidEmail() throws IOException
	{
		Login login = new Login();
		LoginMethod loginMethod = new LoginMethod();
		loginMethod.enterEmail(propertiesUtil.getProperty("invalidEmail"));
		Assert.assertEquals(login.lblEmailError.getText(), propertiesUtil.getProperty("invalidEmailMessage"), "Incorrect error message");
		loginMethod.enterEmail(propertiesUtil.getProperty("invalidEmail2"));
		Assert.assertEquals(login.lblEmailError.getText(), propertiesUtil.getProperty("invalidEmailMessage"), "Incorrect error message");
		loginMethod.enterEmail("");
		Assert.assertEquals(login.lblEmailError.getText(), propertiesUtil.getProperty("invalidEmailMessage2"), "Incorrect error message");
		
	}
	@Test (priority = 2)
	public void TC_validEmail() throws IOException
	{
		Login login = new Login();
		LoginMethod loginMethod= new LoginMethod();
		loginMethod.enterEmail(propertiesUtil.getProperty("email"));
	}
	@Test (priority = 3)
		public void TC_InvalidPassword() throws IOException
		{
		Login login = new Login();
		LoginMethod loginMethod= new LoginMethod();
		loginMethod.enterPassword(propertiesUtil.getProperty("invalidPassword2"));
		new WebDriverWait(AppDriver.getDriver(), 25).until(ExpectedConditions.visibilityOf(login.lblPasswordError));
		Assert.assertEquals(login.lblPasswordError.getText(), propertiesUtil.getProperty("invalidPasswordMessage2"), "Minimum 8 characters");
		loginMethod.enterPassword(propertiesUtil.getProperty("invalidPassword3"));
		new WebDriverWait(AppDriver.getDriver(), 25).until(ExpectedConditions.visibilityOf(login.invalidCredendialError));
		Assert.assertEquals(login.invalidCredendialError.getText(), propertiesUtil.getProperty("invalidPasswordMessage3"), "Incorrect error message");
		login.OK.click();
		}
	@Test (priority = 4)
		public void TC_validpassword() throws IOException
		{
			Login login = new Login();
			LoginMethod loginMethod= new LoginMethod();
		loginMethod.enterPassword(propertiesUtil.getProperty("password"));	
	}
		

	 
	 
	//@AfterTest
	//public void CloseApp() {
		
	//	AppFactory.closeApp();
	//}

}
