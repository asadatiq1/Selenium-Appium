package Android.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Jobs {
	
	public Jobs() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
}
