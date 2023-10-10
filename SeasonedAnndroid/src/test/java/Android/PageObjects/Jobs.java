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
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Work, tab, 2 of 4\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	public WebElement jobs;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"work-screen-content-header-content-tabs-scrollable-0-jobs-tab-button\"]")
	public WebElement jobsTab;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"work-screen-content-header-content-tabs-scrollable-1-my-work-tab-button\"]")
	public WebElement applicationTab;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"work-screen-content-jobs-tab-label\"]")
	public WebElement ddLocation;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"work-screen-content-header-content-title\"]")
	public WebElement jobTile;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"work-screen-content-jobs-jobs-count-text\"]")
	public WebElement totalJobs;
	
	@FindBy(xpath="//android.widget.ScrollView[@content-desc=\"jobdetailsscreen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
	public WebElement jobDetailName;
	 
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"work-screen-content-my-work-tab-view-0-job-application-submitted\"]")
	public WebElement applicationTime;
	
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"work-search-jobs-1-job-item-job-name\"]")
	public WebElement jobName;
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement JobSearchField;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
	public WebElement JobSearchField2;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	public WebElement seeAllResults;
	
	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"apply\"])[1]/android.widget.TextView")
	public WebElement btnApply;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"bottom-screen-button-label\"]")
	public WebElement btnDone;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"schedule-interview-head-text-title\"]")
	public WebElement requestInterviewScreen;
	
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc=\"schedule-interview-interview-availabilities-interview-dates-dates-selector-date-box-date\"])[1]")
	public WebElement dateBox;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"schedule-interview-interview-availabilities-1-shift-0-select-time-08:00-pm\"]")
	public WebElement timeBox8;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"schedule-interview-interview-availabilities-1-shift-2-select-time-09:00-pm\"]")
	public WebElement timeBox9;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"schedule-interview-interview-availabilities-1-shift-4-select-time-10:00-pm\"]")
	public WebElement timeBox10;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	public WebElement btnSubmitApplication;
	
	@FindBy(className = "android.widget.TextView")
	public WebElement btnApplied;
	

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"work-search-search-container-back-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnBackJob;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement firstTwoJobText;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement thridJob;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup")
	public WebElement btncross;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"search-input-input\"]")
	public WebElement inputSearch;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnCurrentLocation;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
	public WebElement btnAllow;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"location-screen-google-autocomplete-0-item-button\"]/android.view.ViewGroup")
	public WebElement currentLocation;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"work-screen-content-jobs-tab-label\"]")
	public WebElement verifyLocation;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	public WebElement newToIndustory;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
	public WebElement btnNext;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement btnWeekNight;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement btnDone2;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement experienceScreen;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement workScreen;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement releventScreen;
	
	
	
	@FindBy(xpath = "//android.widget.HorizontalScrollView[@content-desc=\"work-screen-content-swiper\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
	public WebElement zeroJob;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Work, tab, 2 of 4\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	public WebElement redIcon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"location-screen-google-autocomplete-0-item-button\"]/android.view.ViewGroup")
	public WebElement WashingtonDC;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")
	public WebElement btnDeny;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public WebElement permissionPopover;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public WebElement btnOK;
	
	
	@FindBy(xpath = "//android.widget.HorizontalScrollView[@content-desc=\"search-results-swiper\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
	public WebElement jobWidget;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"jobdetailsscreen-apply-bottom-screen-button-label\"]")
	public WebElement detailbtnApply;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	public WebElement btnSubmitApplication2;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"work-search-jobs-0-job-item-job-name\"]")
	public WebElement jobTitle;
	
	
	@FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"jobdetailsscreen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
	public WebElement jobDetailTitle;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@content-desc=\"search-results-swiper\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup")
	public WebElement parent;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	public WebElement btnSubmit2;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"work-screen-content-header-content-tabs-scrollable-1-my-work-tab-label\"]")
	public WebElement MyApplicationTab;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"work-screen-content-my-work-tab-view-0-job-application-position\"]")
	public WebElement applicationjob;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"schedule-interview-interview-availabilities-interview-dates-dates-selector-active-month\"]")
	public WebElement month;
	
	
	
	
	public static String joblist ="";
	public static String jobdetailName =""; 
	public static String JobVerify ="";
	public static String jobDetailVerify ="";
	public static String progressBarText ="";
	public static String jobVerify ="";
	public static String time ="";
	public static String row ="";
}
