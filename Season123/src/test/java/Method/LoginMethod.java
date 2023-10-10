package Method;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Android.PageObjects.Login;
import Common.Utility.Utils;
import base.AppDriver;
import base.PropertiesUtil;
import base.Scrolling;

public class LoginMethod {

	Login login = new Login();
	PropertiesUtil propertiesUtil = new PropertiesUtil();

	public void LoginScreen() throws IOException {
		
		Utils.waitUntil(login.inputEmail);
		this.enterEmail(propertiesUtil.getProperty("email"));
		this.enterPassword(propertiesUtil.getProperty("password"));

	}
	
	public  void enterEmail(String email) throws IOException {
		
		Utils.waitUntil(login.inputEmail);
		login.inputEmail.click();
		login.inputEmail.clear();
		login.inputEmail.sendKeys(email);
		Scrolling.scollDown();
		Utils.waitUntil(login.btnContinue);
		login.btnContinue.click();
		
	}
	public void enterPassword(String password) throws IOException {
		
		
		Utils.waitUntil(login.inputPassword);
		login.inputPassword.click();
		login.inputPassword.clear();
		login.inputPassword.sendKeys(password);
		login.btnSignin.click();
		
	}

}
