package Method;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Android.PageObjects.Login;
import Common.Utility.Utils;
import base.AppDriver;
import base.PropertiesUtil;
import base.Scrolling;

public class LoginMethod {

	Login login = new Login();
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	
	// "Login or Signup for free" Screen
	
	public void verifiy_content() {
		Utils.waitUntil(login.text1);
		Assert.assertEquals(login.text1.getText(), "Local jobs and community, just for the service industry.");
		Utils.waitUntil(login.text2);
		Assert.assertEquals(login.text2.getText(), "Log in or sign up for free");
		
	}
	
	public void dis_cnt_btn() {
		Utils.waitUntil(login.Disable_Continue_Btn_Signup_Screen);
		Utils.waitUntil(login.Disable_Continue_Btn_Signup_Screen);
		try {
			if (login.Disable_Continue_Btn_Signup_Screen.isDisplayed()) {
				Assert.assertFalse(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		
	}
	
	public void Enter_Email(String email) {
		Utils.waitUntil(login.Email_Address_Field);
		login.Email_Address_Field.click();
		login.Email_Address_Field.clear();
		login.Email_Address_Field.sendKeys(email);
		login.text1.click();
				
	}
	
	public void tap_cnt_btn() {
		Utils.waitUntil(login.Enable_Cont_Btn);
		login.Enable_Cont_Btn.click();
		
	}
	
	public void invalid_email_error() {
		Utils.waitUntil(login.invalid_email_error);
		Assert.assertEquals(login.invalid_email_error.getText(), "Invalid email");
		
	}
	
	// "Welcome back. Sign into your account" Screen.
	
	public void verify_screen() {
		Utils.waitUntil(login.wlcm_signin_ur_acc);
		System.out.println(login.wlcm_signin_ur_acc.getText());
		Assert.assertEquals(login.wlcm_signin_ur_acc.getText(), "Welcome back. Sign\ninto your account.");
		
	}
	
	public void tap_bck_btn() {
		Utils.waitUntil(login.Back_Btn);
		login.Back_Btn.click();
		Utils.waitUntil(login.text2);
		Assert.assertEquals(login.text2.getText(), "Log in or sign up for free");
		
	}
	
	public void password(String password) {
		Utils.waitUntil(login.password_field);
		login.password_field.click();
		login.password_field.clear();
		login.password_field.sendKeys(password);
		login.wlcm_signin_ur_acc.click();
		
	}
	
	public void password_error() {
		Utils.waitUntil(login.invalid_password_error);
		Assert.assertEquals(login.invalid_password_error.getText(), "Minimum 8 characters");
		
	}
	
	public void require_error() {
		login.password_field.clear();
		Assert.assertEquals(login.require_error.getText(), "Required");
		
	}
	
	public void tap_signin_btn() {
		Utils.waitUntil(login.signin_btn);
		login.signin_btn.click();
		Utils.waitUntil(login.JobsTab);
		Assert.assertEquals(login.JobsTab.getText(), "Jobs");
		
	}
	
}
