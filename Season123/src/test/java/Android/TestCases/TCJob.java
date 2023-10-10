package Android.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PageObjects.Jobs;
import Common.Utility.Utils;
import Method.ApplyJobsMethod;
import base.AppFactory;
import base.PropertiesUtil;

public class TCJob {
	PropertiesUtil propertiesUtil = null;;
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
		AppFactory.Android_LaunchApp();
		propertiesUtil = new PropertiesUtil();
	}
//	@Test(priority=1)
	public void searchRestaurant() throws Exception {
		Jobs job = new Jobs();
		ApplyJobsMethod applyjob = new ApplyJobsMethod();
		
		applyjob.searchJob(propertiesUtil.getProperty("restaurantName"));
		Utils.waitUntil(job.seeAllResults);
		job.seeAllResults.click();
		for(int i=1; i<=5; i++) {
			Utils.waitUntil(job.btnApply);
			applyjob.verifyJob();
		}
		//if(job.btnApplied.isEnabled() & job.btnApply.isEnabled()) {
		//	job.btnApply.click();
		//	applyjob.applyJob();
		}
	//	}
		
		
	//}
	
	//@Test(priority=2)
	public void currentLocation() throws Exception {
		Jobs job = new Jobs();
		ApplyJobsMethod applyjob = new ApplyJobsMethod();
		applyjob.currentLocation();
		applyjob.addLocation(propertiesUtil.getProperty("location"));
	}
	
	//@Test(priority=3)
	public void selectLocation() throws Exception {
		Jobs job = new Jobs();
		ApplyJobsMethod applyjob = new ApplyJobsMethod();
		applyjob.selectLocation();
		applyjob.addLocation(propertiesUtil.getProperty("location"));
		
}
	@Test(priority=1)
	
	public void applyjobdetail() throws Exception {
		Jobs job = new Jobs();
		ApplyJobsMethod applyjob = new ApplyJobsMethod();
		applyjob.searchJob(propertiesUtil.getProperty("restaurantName"));
		Utils.waitUntil(job.seeAllResults);
		job.seeAllResults.click();
	//	for(int i=1; i<=5; i++) {
			Utils.waitUntil(job.btnApply);
		if(job.btnApplied.isEnabled() & job.btnApply.isEnabled()) {

			applyjob.jobList();
			
		//}
			
		}
	}	
	
}