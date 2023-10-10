package Method;

import java.io.IOException;

import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.ClearCommand;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	//public static AppiumDriver<MobileElement> driver;
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	Signup signup =new Signup();
	
public void Signup() throws IOException {
	
	Utils.waitUntil(signup.inputNewEmail);
	//this.enterNewEmail(propertiesUtil.getProperty("newEmail"));
	this.enterFirstName(propertiesUtil.getProperty("firstName"));
	this.enterLastName(propertiesUtil.getProperty("lastName"));
	this.enterNewPassword(propertiesUtil.getProperty("newPassword"));
	}

public void enterNewEmail() {
	RandomString randomEmail = new RandomString();
	Utils.waitUntil(signup.inputNewEmail);
	signup.inputNewEmail.sendKeys(randomEmail.generateRandomPassword(3)+ "@gmail.com");

}

public void signupEmailScreen(String signupEmailField) {
	Utils.waitUntil(signup.inputNewEmailSignup);
	signup.inputNewEmailSignup.click();
	signup.inputNewEmailSignup.clear();
	signup.inputNewEmailSignup.sendKeys(signupEmailField);
}

	
	public void enterFirstName(String firstName) {
		
		Utils.waitUntil(signup.firstName);
		signup.firstName.click();
		signup.firstName.sendKeys(firstName);	
	}
	
	public void enterLastName(String lastName) {
		
		Utils.waitUntil(signup.lastName);
		signup.lastName.click();
		signup.lastName.sendKeys(lastName);
		
	}
	
public void enterNewPassword(String newPassword) {
		Utils.waitUntil(signup.newPassword);
		signup.newPassword.click();
		signup.newPassword.sendKeys(newPassword);
		AppFactory.driver.hideKeyboard();
		signup.btnContinue.click();	
		
	}

public void enterPhoneNumer(String phoneNumber) {
		Utils.waitUntil(signup.enterPhNumber);
		signup.enterPhNumber.clear();
		signup.enterPhNumber.sendKeys(phoneNumber);
		signup.btnSendCode.click();
}

public void enterVerificationCode() {
		Utils.waitUntil(signup.verificationNumber);
		
	
}	
public void provideLocaton() {
	try { 
		if(signup.provideLocation.isDisplayed()) {
			Utils.waitUntil(signup.provideLocation);
			Utils.waitUntil(signup.provideLocation);
			signup.provideLocation.click();
		}
		
	}catch(Exception e) {
		
	}
}
public void selectLocaton(String location1) {	
			signup.provideLocation.click();
			Utils.waitUntil(signup.enterLocation);
			signup.enterLocation.sendKeys(location1);
			Utils.waitUntil(signup.selectLocation);	
		
		}

}

	
	
	

