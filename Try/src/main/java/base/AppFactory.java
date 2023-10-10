package base;

import java.net.MalformedURLException;

import java.net.URL;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppFactory {

	
	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities caps;
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public String User="sam";
	public String Email="salmanbutt20@gmail.com";
	public String pass="123456";
	public String name= "salman";
	//lang= driver.findElement(By.xpath(select_lang)).getText();
	public String adds="true";
	
	
	String ok_Button = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button";
	String Display_a_Toast = "//android.widget.Button[@content-desc=\"showToastButtonCD\"]";
	String toast ="/hierarchy/android.widget.Toast";
	String check_box ="(//android.widget.LinearLayout[@content-desc=\"imageViewCD\"])[2]/android.widget.CheckBox";
	String show_progress_bar="//android.widget.Button[@content-desc=\"waitingButtonTestCD\"]";
	String newpage="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]";
	String User_Name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]";
	String E_mail="//android.widget.EditText[@content-desc=\"email of the customer\"]";
	String passwordd="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[3]";
	String Name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[4]";
	String select="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner";
	String select_lang="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[2]";
	String frm_checkBox="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox";
	String register_btn="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button";
	String verify_name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.TextView[2]";
	String verify_uname="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.TextView[2]";
	String verify_password="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.TextView[2]";
	String verify_email="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[5]/android.widget.TextView[2]";
	String verify_lang="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[6]/android.widget.TextView[2]";
	String verify_checkbox="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[7]/android.widget.TextView[2]";
	
	@BeforeTest
	public static void Android_LaunchApp() throws MalformedURLException {
		caps = new DesiredCapabilities();
		caps.setCapability("newCommandTimeout", 10000);
		caps.setCapability("platformName", "Android");
		caps.setCapability("udid", "ce031713c4a9ace80d");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage","io.selendroid.testapp");  
		caps.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	
		
	}
	

	
	@Test (priority = 1)
	public void DisplayToast()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ok_Button)));
		driver.findElement(By.xpath(ok_Button)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Display_a_Toast)));
		driver.findElement(By.xpath(Display_a_Toast)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(toast)));
		Assert.assertEquals(driver.findElement(By.xpath(toast)).getText(), "Hello selendroid toast!");
		System.out.println(driver.findElement(By.xpath(toast)).getText());
		
	}
	
	@Test (priority = 2)
	public void CheckBox()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(check_box)));
		driver.findElement(By.xpath(check_box)).click();
		driver.findElement(By.xpath(ok_Button)).isSelected();
		//Assert.assertFalse(driver.findElement(By.xpath(ok_Button)).isSelected());
	}
	
	@Test (priority = 3)
	public void ProgressBar_FormSubmitted()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(show_progress_bar)));
		driver.findElement(By.xpath(check_box)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(newpage)));
		Assert.assertEquals(driver.findElement(By.xpath(check_box)).getText(), "Welcome to register a new User");
		driver.findElement(By.xpath(newpage)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(User_Name)));
		driver.findElement(By.xpath(User_Name)).sendKeys(User);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(E_mail)));
		driver.findElement(By.xpath(E_mail)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(passwordd)));
		driver.findElement(By.xpath(passwordd)).sendKeys(pass);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Name)));
		driver.findElement(By.xpath(Name)).clear();
		driver.findElement(By.xpath(Name)).sendKeys(name);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(select)));
		driver.findElement(By.xpath(select)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(select_lang)));
		driver.findElement(By.xpath(select_lang)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(frm_checkBox)));
		driver.findElement(By.xpath(frm_checkBox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(register_btn)));
		driver.findElement(By.xpath(register_btn)).click();
		
		Assert.assertEquals(driver.findElement(By.xpath(Name)).getText(), name);
		Assert.assertEquals(driver.findElement(By.xpath(User_Name)).getText(), User);
		Assert.assertEquals(driver.findElement(By.xpath(passwordd)).getText(), pass);
		Assert.assertEquals(driver.findElement(By.xpath(E_mail)).getText(), Email);
		//Assert.assertEquals(driver.findElement(By.xpath(select_lang)).getText(), lang);
		
	}
	
	@AfterTest
	  public static void closeApp() 
	  { 
		  driver.quit();
		  
	  }
	
	

}
