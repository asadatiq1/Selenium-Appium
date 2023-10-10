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
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Feed;
import Android.PageObjects.Login;
import Android.PageObjects.Signup;
import Android.PageObjects.TourSkip;
import Common.Utility.Utils;
import Method.SingupMethod;
import base.AppDriver;
import base.AppFactory;
import base.PropertiesUtil;
import base.RandomString;
import io.appium.java_client.TouchAction;

public class TCSignUp {
	PropertiesUtil propertiesUtil =  new PropertiesUtil();
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
		
	}
	@Test (priority = 1)
	public void newEmail() throws IOException {
		Login login = new Login();
		
		Signup signup =new Signup();
		SingupMethod signupMethod= new  SingupMethod();
		signupMethod.enterNewEmail();
		login.btnContinue.click();
	
	}
	@Test (priority = 2)
	public void firstName() throws IOException {
		Signup signup = new Signup();
		RandomString randomEmail = new RandomString();
		SingupMethod signupMethod= new  SingupMethod();
		signupMethod.enterFirstName(randomEmail.generateRandomPassword(3));
		//Assert.assertEquals(signup.firstName.getText(), propertiesUtil.getProperty("firstName"));
	}
	@Test (priority = 3)
	public void lastName() throws IOException {
		Signup signup = new Signup();
		RandomString randomEmail = new RandomString();
		SingupMethod signupMethod= new  SingupMethod();
		signupMethod.enterLastName(randomEmail.generateRandomPassword(3));
		//Assert.assertEquals(signup.lastName.getText(), propertiesUtil.getProperty("lastName"));
	}
	
	@Test (priority = 4)
	public void enterpPassword() throws IOException {
		Signup signup = new Signup();
		SingupMethod signupMethod= new  SingupMethod();
		signupMethod.enterNewPassword(propertiesUtil.getProperty("newPassword"));
		
	}

	@Test (priority = 5)
	public void enterPhone() throws IOException {
		
		SingupMethod signupMethod= new  SingupMethod();
		signupMethod.enterPhoneNumer(propertiesUtil.getProperty("phoneNumber"));		
	}
	@Test (priority = 6)
	public void enterVerificationCode() throws IOException {
		Signup signup =new Signup();
		Utils.waitUntil(signup.verificationNumber);
		signup.verificationNumber.click();
		Utils.waitUntil(signup.entercode);
		signup.entercode.sendKeys("000000");
		
		
	}
	@Test (priority = 7)
public void btnLocation() throws IOException {
		
		SingupMethod signupMethod= new  SingupMethod();
		signupMethod.provideLocaton();			
	}
	@Test (priority = 8)
public void selectLocation() throws IOException, InterruptedException {
		Signup signup =new Signup();
		Feed feed= new Feed();
		TourSkip skiptour = new TourSkip();
		SingupMethod signupMethod= new  SingupMethod();
		Utils.waitUntil(signup.enterLocation);
		signup.enterLocation.click();
		signup.enterLocation.clear();
		signupMethod.selectLocaton(propertiesUtil.getProperty("location1"));		
		Utils.waitUntil(signup.selectLocation);
		signup.selectLocation.click();
		Utils.waitUntil(signup.btnConfirmLocation);
		signup.btnConfirmLocation.click();
	}
	/*@Test (priority = 0)
	public void nextTour() throws InterruptedException, IOException {	
		Feed feed= new Feed();
		Signup signup =new Signup();
		Thread.sleep(5000);
		WebElement panel = AppDriver.getDriver().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"next\"]"));
		Utils.waitUntil(panel);
		panel.click();
		Utils.waitUntil(panel);
		panel.click();
		Utils.waitUntil(panel);
		panel.click();
		Utils.waitUntil(signup.feedTab);
		signup.feedTab.click();
		Utils.waitUntil(feed.communityFeed);
		Assert.assertEquals(feed.communityFeed.getText(), propertiesUtil.getProperty("CommunityFeedScreen"));
		
		
	}*/
}

