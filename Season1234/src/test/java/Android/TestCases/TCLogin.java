package Android.TestCases;



import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
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
import Method.SingupMethod;
import Method.logout;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.Scrolling;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TCLogin {
	
	//Global Objects
	PropertiesUtil propertiesUtil =  new PropertiesUtil();
	LoginMethod login = new LoginMethod();
	
	//Application Launch
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
		login = new LoginMethod();
	
	}
	
	// -------------------- Test Cases --------------------
	
	//"Login or sign up for free" Screen
	
	@Test (priority = 1)
	public void Verify_content() {
		login.verifiy_content();
		
	}
	
	@Test (priority = 2)
	public void Dis_Cont_Btn() {
		login.dis_cnt_btn();
		
	}
	
	@Test (priority = 3)
	public void Dis_Cont_Btn_BlankSpace() throws IOException {
		login.Enter_Email(propertiesUtil.getProperty("blankSpace"));
		login.dis_cnt_btn();
	}

	@Test (priority = 4)
	public void Verify_Invalid_Email() throws IOException {
		login.Enter_Email(propertiesUtil.getProperty("invalidEmail"));
		login.invalid_email_error();
		
	}
	
	@Test (priority = 5)
	public void Verify_Special_Characters() throws IOException {
		login.Enter_Email(propertiesUtil.getProperty("specialchar"));
		login.invalid_email_error();
		
	}
	
	@Test (priority = 6)
	public void Tap_Cont_Btn_Display_WlcmBack_Signin_screen() throws IOException {
		login.Enter_Email(propertiesUtil.getProperty("email"));
		login.tap_cnt_btn();
		login.verify_screen();
	}
	
	// "Welcome back. Sign into your account" Screen.
	
	@Test (priority = 7)
	public void Verify_Tap_Back_Btn() {
		login.tap_bck_btn();
		
	}
	
	@Test (priority = 8)
	public void Verify_Invalid_Password() throws IOException {
		login.tap_cnt_btn();
		login.password(propertiesUtil.getProperty("invalidPassword2"));
		login.password_error();
		
	}
	
	@Test (priority = 9)
	public void Verify_required_Error_Password() throws IOException {
		login.password(propertiesUtil.getProperty("password2"));
		login.require_error();
		
	}
	
	@Test (priority = 10)
	public void Verify_Tap_Signin_Btn() throws IOException {
		login.password(propertiesUtil.getProperty("password"));
		login.tap_signin_btn();
		
	}
	
}
