package FindBy.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.AppDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPO extends BasePO {

	@AndroidBy(xpath = "")
	@iOSXCUITFindBy(xpath = "")
	public WebElement inputEmail;
	
	public LoginPO() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	
	
}
