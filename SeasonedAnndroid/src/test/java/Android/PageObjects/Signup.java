package Android.PageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.AppDriver;
import base.AppFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Signup {


	public Signup() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}	
	
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='welcome-screen-email-input']")
	public WebElement inputNewEmail;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\'onboarding-basic-info-email-text-field\']")
	public WebElement inputNewEmailSignup;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement lblEmailErrorSignup;
					
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='onboarding-basic-info-first-name-text-field']")
	public WebElement firstName;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\'onboarding-basic-info-last-name-text-field\']")
	public WebElement lastName;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='onboarding-basic-info-password-input-text-field']")
	public WebElement newPassword;
	
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='continue']/android.widget.TextView")
	public WebElement btnContinue;
	
	@FindBy(xpath= "//android.widget.EditText[@content-desc='mask-text-field-input']")
	public WebElement enterPhNumber;
	
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\'send-code\']/android.widget.TextView")
	public WebElement btnSendCode;
	
	@FindBy(xpath ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
	public WebElement verificationNumber;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement provideLocation;
	
	@FindBy(xpath="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	public WebElement entercode;
	
	@FindBy(xpath= "//android.widget.EditText[@content-desc=\"search-input-input\"]")
	public WebElement enterLocation;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"onboarding-location-google-autocomplete-0-item-button\"]/android.view.ViewGroup")
	public WebElement selectLocation;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"search-input-clear-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement removeloc;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"confirm-location\"]")
	public WebElement btnConfirmLocation;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"ContentFeed, tab, 1 of 4\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement feedTab;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement tourSwip;
}
