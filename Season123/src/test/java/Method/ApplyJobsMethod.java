package Method;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import Android.PageObjects.Jobs;
import Android.TestCases.TCJob;
import Common.Utility.Utils;
import base.AppFactory;
import base.PropertiesUtil;
import base.Scrolling;
import io.appium.java_client.MobileElement;

public class ApplyJobsMethod {
	PropertiesUtil propertiesUtil = new PropertiesUtil();
	Jobs job=new Jobs();
	
	public void searchJob(String restaurantName) throws IOException {
	  
		Utils.waitUntil(job.jobs);
		job.jobs.click();
		Utils.waitUntil(job.jobTile);
		Assert.assertEquals(job.jobTile.getText(), propertiesUtil.getProperty("jobScreen"));
		Utils.waitUntil(job.totalJobs);
		Assert.assertEquals(true, job.totalJobs.isDisplayed());
		Utils.waitUntil(job.JobSearchField);
		job.JobSearchField.click();
		Utils.waitUntil(job.JobSearchField2);
		job.JobSearchField2.sendKeys(restaurantName);
		AppFactory.driver.hideKeyboard();
	}

	public void applyJob() {
		
					Jobs job= new Jobs();
					//for(int i=1; i<=5; i++) {
					//	Utils.waitUntil(job.btnApply);
					//	if(job.btnApplied.isEnabled() & job.btnApply.isEnabled()) {
					//	job.btnApply.click();
				//	Utils.waitUntil(job.requestInterviewScreen);
					Utils.waitUntil(job.newToIndustory);
					job.newToIndustory.click();
					Utils.waitUntil(job.btnNext);
					job.btnNext.click();
				
				job.workScreen.isDisplayed();
					Utils.waitUntil(job.btnNext);
					job.btnNext.click();
				try {
				if(job.releventScreen.isDisplayed()) {
					Utils.waitUntil(job.btnNext);
					job.btnNext.click();
				}
				}catch(Exception e) {
			job.btnNext.isDisplayed();
					Utils.waitUntil(job.btnNext);
				job.btnNext.click();
				
				//}
		}
		try {
			
		if(job.btnDone.isDisplayed()) {
			Utils.waitUntil(job.btnDone);
			job.btnDone.click();
		}
		
		}catch(Exception e) {
		
		//Utils.waitUntil(job.requestInterviewScreen);
			//if(job.btnSubmitApplication2.isDisplayed()) { 
			//	Utils.waitUntil(job.btnSubmitApplication2);
			//	job.btnSubmitApplication2.click();
			//	Utils.waitUntil(job.btnDone);
			//	job.btnDone.click();
				
			}
		boolean hasNext=true;
		int j=3;
		while( hasNext) {
		//	List<MobileElement> allElements = AppFactory.driver.findElementsByXPath("(//android.widget.TextView[@content-desc=\"schedule-interview-interview-availabilities-interview-dates-dates-selector-date-box-date\"])["+j+"]");
			List<MobileElement> allElements = AppFactory.driver.findElementsByXPath("(//android.widget.TextView[@content-desc=\"schedule-interview-interview-availabilities-interview-dates-dates-selector-date-box-date-days\"])["+j+"]");
			//List<MobileElement> allElements = AppFactory.driver.findElementsByXPath("(//android.widget.TextView[@content-desc=\"schedule-interview-interview-availabilities-interview-dates-dates-selector-date-box-date\"])");
			
			List<MobileElement> allElements3= AppFactory.driver.findElementsByXPath("(//android.widget.TextView[@content-desc=\"schedule-interview-interview-availabilities-interview-dates-dates-selector-date-box-date\"])["+j+"]");
			
			
				for(MobileElement element3 : allElements3) {
					if(element3.isEnabled()) {
						element3.getText();
						element3.click();
						System.out.println(element3.getText());
					}
			
			if(allElements != null && allElements.size() > 0) {
			
				for(MobileElement element : allElements) {
					if(element.isEnabled()) {
						element.click();
					
						System.out.println(element.getText());
						hasNext=false;
						break;
					}
				}
				
			}else {
				
			}
			
			
		/*	//jobTitle();
			java.util.Iterator i = allElements.iterator();
			if(i.hasNext()) {
				hasNext =true;
				j=j+1;
	
			}
			
			else {
				hasNext = false;
			}
		
			MobileElement row = (MobileElement) i.next();
			
			if(row.isEnabled()) {
				row.click();
				job.row = row.getText();
				System.out.println(row.getText());
				break;
			}	
		*/	
		}
		
		//	Utils.waitUntil(job.dateBox);
			
			
			
			//	job.dateBox.click();
				try {
				if(job.timeBox8.isDisplayed())
					Utils.waitUntil(job.timeBox8);
					job.timeBox8.click();
				}catch(Exception e) {
					Utils.waitUntil(job.timeBox9);
					job.timeBox9.click();	
					
				}
				
				try {
					if(job.btnSubmitApplication.isEnabled()) {
						Utils.waitUntil(job.btnSubmitApplication);
						job.btnSubmitApplication.click();
					}
					
					}catch(Exception b) {
						Scrolling scroll = new Scrolling();
						scroll.scollDown();
			Utils.waitUntil(job.btnSubmit2);
			job.btnSubmit2.click();	
					}
				
			Utils.waitUntil(job.btnDone);
			job.btnDone.click();
			}
		}
			
		
	//	}
	
		
		
	//	}
		
	//}
	
		/*
		else if(job.btnApplied.isEnabled() & job.btnApply2.isEnabled()) {
			Utils.waitUntil(job.btnApply2);
			job.btnApply2.click();
		}
		
		else if(job.btnApplied.isEnabled() & job.btnApply3.isEnabled()) {
			Utils.waitUntil(job.btnApply3);
			job.btnApply3.click();
			
		}
		else if(job.btnApplied.isEnabled() & job.btnApply4.isEnabled()) {
			Utils.waitUntil(job.btnApply4);
			job.btnApply4.click();
			
		}*/
		
		
	
	public void currentLocation() throws IOException {
		Jobs job = new Jobs();
		Utils.waitUntil(job.jobsTab);
		job.jobsTab.click();
		Utils.waitUntil(job.ddLocation);
		job.ddLocation.click();
		try {
			if(job.btnAllow.isDisplayed())
				Utils.waitUntil(job.btnAllow);
				job.btnAllow.click();
				Utils.waitUntil(job.currentLocation);
				job.currentLocation.click();	
		}catch(Exception e) {
			Utils.waitUntil(job.currentLocation);
			job.currentLocation.click();	
		}
			
	}
	
public void selectLocation() throws IOException {
		Jobs job = new Jobs();

		Utils.waitUntil(job.jobs);
		job.jobs.click();
		Utils.waitUntil(job.jobsTab);
		job.jobsTab.click();
		Utils.waitUntil(job.ddLocation);
		job.ddLocation.click();
		try {
			if(job.btnAllow.isDisplayed()) {
			Utils.waitUntil(job.btnDeny);
			job.btnDeny.click();
			Utils.waitUntil(job.btnOK);
			job.btnOK.click();
			}
		
		}catch(Exception e) {
			if (job.permissionPopover.isDisplayed()) {
				Utils.waitUntil(job.btnOK);
			job.btnOK.click();
			}
		}
		Utils.waitUntil(job.btncross);
		job.btncross.click();
		Utils.waitUntil(job.inputSearch); 
		job.inputSearch.click();
		}
	
	public  void addLocation(String location) throws Exception {
			Utils.waitUntil(job.inputSearch);
			job.inputSearch.sendKeys(location);
			Utils.waitUntil(job.WashingtonDC);
			job.WashingtonDC.click();
		
		}
		
	public  void verifyJob() throws Exception {
			Utils.waitUntil(job.jobName);
			job.joblist =job.jobName.getText();

			for(int i=0; i>5; i++) {
			AppFactory.driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\\\"work-search-jobs-"+i+"-job-item-job-name\\\"]")).click();
			}
			
			//Utils.waitUntil(job.jobDetailName);
			//job.jobdetailName =	job.jobDetailName.getText();
		//	if(job.joblist.equals(job.jobdetailName)) {
		//		assertTrue(true, "Same Job");
			//}
			//else
			//{
			//	assertTrue(false, "Not Same Job");
			//}
		}
			

		public  void jobTitle() throws Exception {
			
			Utils.waitUntil(job.jobTitle);
			job.JobVerify = job.jobTitle.getText();
			//job.jobWidget.click();
			
		    Utils.waitUntil(job.jobTitle); 
	    
		    //Utils.waitUntil(job.jobDetailTitle);
		//	job.jobDetailVerify =job.jobDetailTitle.getText();
			//Assert.assertEquals(job.JobVerify, job.jobDetailVerify);
			}
			
		
		
		public  void jobList() throws Exception {
			for(int j=1; j<=7; j++) {
				List<MobileElement> allElements = AppFactory.driver.findElementsByXPath("(//android.widget.TextView[@content-desc=\"restaurant-name\"])["+j+"]");

 				jobTitle();
				java.util.Iterator i = allElements.iterator();
				while(i.hasNext()) {
					MobileElement row = (MobileElement) i.next();
				//String s=	row.getWrappedDriver().getTitle();
					jobTitle();
					row.click();
					Utils.waitUntil(job.detailbtnApply);
					job.detailbtnApply.click();
					applyJob();
					Jobs job = new Jobs();
					Utils.waitUntil(job.btnBackJob);
					job.btnBackJob.click();
			/*		
					if (j==1) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("firstTwoJobs"));
					}
					else if (j==2) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("firstTwoJobs"));
					}
					else if(j==3) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("thirdJob"));
					}
					else if(j==4) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("fourthJob"));
					}
					else if(j==5) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("fithJob"));
					}
					else if(j==6) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("sixthJob"));
					}
					else if(j==7) {
						Utils.waitUntil(job.firstTwoJobText);
						Assert.assertEquals(job.firstTwoJobText.getText(), propertiesUtil.getProperty("LastJob"));
					}
						
					searchJob(propertiesUtil.getProperty("restaurantName")) ;
					*/
					
					Utils.waitUntil(job.MyApplicationTab);
					job.MyApplicationTab.click();
				//  job.jobVerify = job.applicationjob.getText();
			 	//  Assert.assertEquals(job.jobVerify, job.jobVerify);
				//	TCJob tcjob =new TCJob();
				//	tcjob.applyjobdetail();
				//	job.time = job.applicationTime.getText();
				//	Assert.assertEquals(job.row , job.time);
					
					
			}
			
			}
		}

		
		
}
		
