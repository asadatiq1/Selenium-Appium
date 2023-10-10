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
	
	// -------------- "Login or Signup for free" screen ---------------------
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement Login_Signup_For_Free;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"welcome-screen-email-input\"]")
	public WebElement New_Email_Signup_Screen;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"continue\"]")
	public WebElement Enable_Continue_Btn_Signup_Screen;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"continue-disabled\"]")
	public WebElement Disable_Continue_Btn_Signup_Screen;

	// --------------- "Let's create your account" screen -------------------

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"onboarding-title\"]")
	public WebElement Create_your_Account;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"continue-disabled\"]")
	public WebElement Disable_Continue_Btn_CreateAccount_Screen;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"onboarding-basic-info-first-name-text-field\"]")
	public WebElement FirstName;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"onboarding-basic-info-last-name-text-field\"]")
	public WebElement LastName;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"onboarding-basic-info-password-input-password-text\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"continue\"]")
	public WebElement Enable_Continue_Btn_CreateAccount_Screen;
	
	// --------------- "Phone Number" screen -------------------
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"onboarding-title\"]")
	public WebElement Phone_Number;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"send-code-disabled\"]")
	public WebElement Disable_SendCode_Btn;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"mask-text-field-input\"]")
	public WebElement PhoneNumber_Field;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"send-code\"]")
	public WebElement Enable_SendCode;
	
	// --------------- "Verification Code" Screen --------------- 
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement verification_screen;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	public WebElement verification_code_field;
	
	// --------------- "Find jobs near you" Screen --------------- 
		
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	public WebElement Provide_Location;
	
	// --------------- "Where are you located" Screen --------------- 
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"onboarding-title\"]")
	public WebElement Where_you_Located;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"search-input-input\"]")
	public WebElement Search_Location;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"onboarding-location-google-autocomplete-0-item-button\"]")
	public WebElement Select_Location;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"confirm-location\"]")
	public WebElement Confrm_Location;
	
	// --------------- "Jobs tab"  --------------- 
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	public WebElement JobsTab;
	
}
