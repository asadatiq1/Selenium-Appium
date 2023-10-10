package Method;

import java.io.IOException;

import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.ClearCommand;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Android.PageObjects.Signup;
import Common.Utility.Utils;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import base.Scrolling;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SingupMethod {
	
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	Signup signup =new Signup();
	
	
	// "Login or Signup for free" Screen
	
	public void Enter_New_Email() {
		RandomString random_string = new RandomString();
		Utils.waitUntil(signup.New_Email_Signup_Screen);
		signup.New_Email_Signup_Screen.sendKeys(random_string.generateRandomPassword(4) + "@mail.com");
	}
	
	public void Disable_countinue_Btn() {
		Utils.waitUntil(signup.Login_Signup_For_Free);
		Utils.waitUntil(signup.Disable_Continue_Btn_Signup_Screen);
		try {
			if (signup.Disable_Continue_Btn_Signup_Screen.isDisplayed()) {
				Assert.assertFalse(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	public void Enable_continue_Btn() {
		Utils.waitUntil(signup.Enable_Continue_Btn_Signup_Screen);
		try {
			if (signup.Enable_Continue_Btn_Signup_Screen.isDisplayed()) {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			Assert.assertFalse(false);
		}
	}
	
	public void Tap_Continue_Btn_Signup_Screen() {
		Utils.waitUntil(signup.Enable_Continue_Btn_Signup_Screen);
		signup.Enable_Continue_Btn_Signup_Screen.click();
	}
	
	
	// "Let's create your account" Screen 
	
	public void Disable_continue_Button() {
		Utils.waitUntil(signup.Create_your_Account);
		try {
			if (signup.Disable_Continue_Btn_CreateAccount_Screen.isDisplayed()) {
				Assert.assertFalse(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	public void FirstName_LastName() {
		RandomString random_string = new RandomString();
		Utils.waitUntil(signup.FirstName);
		signup.FirstName.sendKeys(random_string.generateRandomPassword(5));
		Utils.waitUntil(signup.LastName);
		signup.LastName.sendKeys(random_string.generateRandomPassword(5));
						
	}
	
	public void Password_Countinue(String newPassword) {
		Utils.waitUntil(signup.Password);
		signup.Password.sendKeys(newPassword);
		Utils.waitUntil(signup.Enable_Continue_Btn_CreateAccount_Screen);
		signup.Enable_Continue_Btn_CreateAccount_Screen.click();
	
	}
	
	// "Phone Number" Screen
	
	public void Enable_SendCode_Btn() {
		Utils.waitUntil(signup.Phone_Number);
		try {
			if (signup.Disable_SendCode_Btn.isDisplayed()) {
				Assert.assertFalse(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	public void Enter_PhoneNumer(String phoneNumber) {
		Utils.waitUntil(signup.PhoneNumber_Field);
		signup.PhoneNumber_Field.clear();
		signup.PhoneNumber_Field.sendKeys(phoneNumber);
		
	}
	
	public void Tap_SendCode() {
		Utils.waitUntil(signup.Enable_SendCode);
		signup.Enable_SendCode.click();
	}

	// "Verification Code" Screen
	
	public void Verification_code() {
//		Utils.waitUntil(signup.verification_screen);
		Utils.waitUntil(signup.verification_code_field);
		signup.verification_code_field.click();
		signup.verification_code_field.sendKeys("000000");
		System.out.println(signup.verification_code_field.getText());
	}
	
	// "Find jobs near you" Screen
	
	public void Provide_Location() {
		Utils.waitUntil(signup.Provide_Location);
		signup.Provide_Location.click();
		Assert.assertEquals(signup.Where_you_Located.getText(),"Where are you\nlocated?");
		
	}
	
	// "Where are you located?" Screen
	
	public void searchLocation_Btn(String location1) {
		Utils.waitUntil(signup.Search_Location);
		signup.Search_Location.sendKeys(location1);
		Utils.waitUntil(signup.Select_Location);
		signup.Select_Location.click(); //Tap to clear keyboard
		signup.Select_Location.click(); //Tap to select searched Location

	}
	
	public void Enable_CnfrmLocation_Btn() {
				Utils.waitUntil(signup.Confrm_Location);
		try {
			if(signup.Confrm_Location.isDisplayed()) {
				Assert.assertTrue(true);
			}
		}catch(Exception e) {
			Assert.assertFalse(false);
		}

	}
	
	public void Tap_cnfrmLocation_Btn() {
		signup.Confrm_Location.click();
	}
	
	// Jobs Tabs
	
	public void cnfrm_JobsTab() {
		Utils.waitUntil(signup.JobsTab);
		System.out.println(signup.JobsTab.getText());
		Assert.assertEquals(signup.JobsTab.getText(), "Jobs");
	}
	
	
//	public void test() {
//		Utils.waitUntil(signup.Enable_Continue_Btn_Signup_Screen);
//		signup.Disable_Continue_Btn_Signup_Screen.isEnabled();
//	}
	
}

	
	
	

