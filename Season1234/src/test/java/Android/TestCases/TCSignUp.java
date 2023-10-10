package Android.TestCases;

import java.io.IOException;

import java.net.MalformedURLException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Android.PageObjects.Signup;
import Common.Utility.Utils;
import Method.SingupMethod;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import io.appium.java_client.TouchAction;


public class TCSignUp {
	
	//public Objects
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	SingupMethod signup = new SingupMethod();
	SoftAssert softassert = new SoftAssert();

	// Launch Application
	@BeforeTest
	public void Setup() throws MalformedURLException {
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
		signup = new SingupMethod();

	}
	
	// -------------------- Test Cases --------------------

	// "Login or Signup for free" Screen

	@Test(priority = 1)
	public void Verify_Countinue_Btn_Disable_Signup_Screen() throws InterruptedException {
		signup.Disable_countinue_Btn();
		
	}

	@Test(priority = 2)
	public void Verify_Continue_Btn_Enable_Signup_Screen() {
		signup.Enter_New_Email();
		signup.Enable_continue_Btn();
		
	}

	// "Let's Create your account" screen

	@Test(priority = 3)
	public void Verify_Continue_Btn_Disable_CreateAccount_Screen() {
		signup.Tap_Continue_Btn_Signup_Screen();
		signup.Disable_continue_Button();
		
	}

	// "Phone Number" Screen

	@Test(priority = 4)
	public void Enter_Phone_number() throws IOException {
		signup.FirstName_LastName();
		signup.Password_Countinue(propertiesUtil.getProperty("newPassword"));
		signup.Enable_SendCode_Btn();
		signup.Enter_PhoneNumer(propertiesUtil.getProperty("phoneNumber"));
		signup.Tap_SendCode();
		System.out.println("Pass enter phone");
	}

	// "Verification Code" Screen

	@Test(priority = 5)
	public void Enter_Verification_Code() {
		signup.Verification_code();
	}
	
	// "Find jobs near you" Screen
	
	@Test (priority = 6)
	public void Tap_to_ProvideLocation() {
		signup.Provide_Location();
		
	}
	
	//"Where are you located?" Screen
	
	@Test(priority = 7)
	public void Verify_Enable_ConfirmLoc_Btn() throws IOException {
		signup.searchLocation_Btn(propertiesUtil.getProperty("location1"));
		signup.Enable_CnfrmLocation_Btn();
	}
	
	@Test (priority = 8)
	public void tap_cnfrmLocation_takes_jobsScreen() {
		signup.Tap_cnfrmLocation_Btn();
		signup.cnfrm_JobsTab();
		
	}

}
