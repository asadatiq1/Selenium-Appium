package program;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadullah.atiq\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String ExpectedTitle = "1";
		driver.get("https://cbssports-test.azurewebsites.net/Eyeboard/Login");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("raheel.riaz@sigmatec.com.pk");;
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/footer/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/i/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentFrame\"]/div[2]/div/div[2]/div[1]/div[2]/span/a")).click();
		Thread.sleep(2000);
		//d.findElement(By.id("FirstName")).sendKeys("Test 1");
		//d.findElement(By.id("LastName")).sendKeys("Test 2");
		for(int i=135; i<=1000; i++) {
			driver.get("https://cbssports-test.azurewebsites.net/HirePortal/Create");
			Thread.sleep(2000);
			driver.findElement(By.id("FirstName")).sendKeys("fisrt"+i);
			driver.findElement(By.id("LastName")).sendKeys("last"+i);
			
		driver.findElement(By.id("Email")).sendKeys("anything"+i+"@efp1k3ui.mailosaur.net");
		Thread.sleep(2000);
		driver.findElement(By.id("StateINine")).click();
		WebElement testDropDown = driver.findElement(By.id("StateINine"));  
		Select dropdown = new Select(testDropDown);
		dropdown.selectByValue("6D34A024-6E8F-4FAB-AC3A-F741A16EC2CE");
		WebElement testDropDown1 = driver.findElement(By.id("State"));  
		driver.findElement(By.id("State")).click();
		Select dropdown1 = new Select(testDropDown1);
		//if(i==1 && i<=5) {
			dropdown1.selectByValue("78BA3EA0-75E7-44D2-900B-19E22E57AFAC");
			driver.findElement(By.xpath("//*[@id=\"create-container\"]/div/div/div/div/div[2]/div[4]/div/button")).click();
		//}
		//else if(i==6 && i<=10) {
		//	dropdown1.selectByValue("F4B550FE-A165-49F8-9D21-DE00B36D6661");
			// Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id=\"create-container\"]/div/div/div/div/div[2]/div[4]/div/button")).click();
		//}
	//	dropdown1.selectByValue("78BA3EA0-75E7-44D2-900B-19E22E57AFAC");
		//driver.findElement(By.xpath("//*[@id=\"create-container\"]/div/div/div/div/div[2]/div[4]/div/button")).click();
	
		
		//mailinator
		 Thread.sleep(2000);
		 driver.get("https://mailosaur.com/app/servers/efp1k3ui");
		 Thread.sleep(2000);
		if(driver.findElements(By.xpath("//*[@id=\"email\"]")).isEmpty() == false) {
	
		 driver.findElement(By.id("email")).sendKeys("finditnear1@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/form/button/div")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys("Sigma@007");	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/form/button[1]")).click();
		}
		
		

		
		 Thread.sleep(5000);
//		 List<WebElement> refresh = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[4]/div/table/tbody/tr[1]/td[2]/div/div[1]/div/div[2]/div/div/div/p[1]"));
//		 if(((WebElement) refresh).isDisplayed()) {
//			 ((WebElement) refresh).click();
//		 }
//		 else {
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[4]/div/table/tbody/tr[1]/td[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"mailcontainer\"]/div/div[2]/div/h3/a")).click();
		 
		 //event hirelast
		 driver.findElement(By.id("FirstName")).sendKeys("FiestName"+i);
		 driver.findElement(By.id("LastName")).sendKeys("LastName"+i);
		 driver.findElement(By.id("Nickname")).sendKeys("Nickname");
		 driver.findElement(By.id("EmailAddress")).sendKeys("email@gail.com");
		 driver.findElement(By.id("SocialSecurityNo")).sendKeys("312321321");
		 driver.findElement(By.id("StreetAddress")).sendKeys("312321321");
		 driver.findElement(By.id("City")).sendKeys("sddffds");
		 driver.findElement(By.id("ZipCode")).sendKeys("42433242");
		 driver.findElement(By.id("CellPhoneNumber")).sendKeys("3645656456");
		 driver.findElement(By.id("HomePhoneNumber")).sendKeys("3645656456");
		
		 
		 
		 Thread.sleep(2000);
		 WebElement testDropDown9 = driver.findElement(By.id("State"));  
		 driver.findElement(By.id("State")).click();
			Select dropdown2 = new Select(testDropDown9);
			//Thread.sleep(1000);
			dropdown2.selectByValue("AL");
//			
			 Thread.sleep(1000);
			 WebElement testDropDown8 = driver.findElement(By.id("DobDay")); 
			 driver.findElement(By.id("DobDay")).click(); 
				Select dropdown3 = new Select(testDropDown8);
				dropdown3.selectByValue("02");
				
				
				 WebElement testDropDown7 = driver.findElement(By.id("DobMonth")); 
				 driver.findElement(By.id("DobMonth")).click();
				Select dropdown4 = new Select(testDropDown7);
					dropdown4.selectByValue("03");
//				 
					 Thread.sleep(1000);
					 WebElement testDropDown6 = driver.findElement(By.id("DobYear"));
					driver.findElement(By.id("DobYear")).click();
					Select dropdown5 = new Select(testDropDown6);
					dropdown5.selectByValue("2021");
//				 
		 driver.findElement(By.id("btnCreateSignature")).click();
			Thread.sleep(2000);
		 driver.findElement(By.id("sig-submitBtn")).click();
		 
			
			 //JavascriptExecutor js = (JavascriptExecutor) d;
			// js.executeScript("window.scrollBy(0,550)", "");
			 Thread.sleep(2000);
			 driver.findElement(By.id("btnSave")).click();
			
			 Thread.sleep(5000);
			 driver.findElement(By.id("MarriedFilingJointlyOrQualifyingWidow")).click();
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,550)", "");
			 
			 driver.findElement(By.id("signedHere1")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
			  
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 js1.executeScript("window.scrollBy(0,4000)", "");
			 Thread.sleep(1000);
			 
			 driver.findElement(By.id("btnSave")).click();
			 driver.findElement(By.id("EC1Name")).sendKeys("3645656456");
			 
			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 js2.executeScript("window.scrollBy(0,600)", "");
			 Thread.sleep(1000);
			// d.findElement(By.id("btnSave")).click();
			 
			 
			 driver.findElement(By.id("signedHere2")).click();
				Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("btnSave")).click();
			 
			 JavascriptExecutor js3 = (JavascriptExecutor) driver;
			 js3.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 JavascriptExecutor js4 = (JavascriptExecutor) driver;
			 js4.executeScript("window.scrollBy(0,3000)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 JavascriptExecutor js5 = (JavascriptExecutor) driver;
			 js5.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 
			 JavascriptExecutor js6 = (JavascriptExecutor) driver;
			 js6.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 JavascriptExecutor js7 = (JavascriptExecutor) driver;
			 js7.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 JavascriptExecutor js8 = (JavascriptExecutor) driver;
			 js8.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 JavascriptExecutor js9 = (JavascriptExecutor) driver;
			 js9.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 

			 JavascriptExecutor js10 = (JavascriptExecutor) driver;
			 js10.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 driver.findElement(By.id("signedHere1")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
			 Thread.sleep(2000);
			 JavascriptExecutor js11 = (JavascriptExecutor) driver;
			 js11.executeScript("window.scrollBy(0,600)", "");
			 driver.findElement(By.id("btnSave")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("btnSave")).click();
			 
			 Thread.sleep(7000);
			 driver.get("https://mailosaur.com/app/servers/efp1k3ui");
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[4]/div/table/tbody/tr[1]/td[2]")).click();
			 Thread.sleep(5000);
			// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[4]/div[2]/div[1]/div[3]/h2[2]")).getText();
			 Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[4]/div[2]/div[1]/div[3]/h2[2]")).getText(), ExpectedTitle);
			
		}
		}
	}

//}
