package Android.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileScreen {

	public ProfileScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	@FindBy(xpath ="//android.widget.TextView[@content-desc=\"profile-profile-header-name\"]")
	public WebElement profileName;

	
}
