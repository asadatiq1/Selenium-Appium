package Android.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.AppDriver;
import base.RandomString;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;

public class Feed {

	public Feed() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"content-feed-screen-add-post-icon-button\"]")
	public WebElement btnAddFeed;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[3]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnTopicAddFeed;
	
	@FindBy(xpath =  "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	public WebElement addText ;
	
	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement btnPost ;

	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement topicDropdown ;
	
	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup")
	public WebElement barLife; 
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	public WebElement inspiration; 
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\'search-input-input\']")
	public WebElement inputSearchField; 
	
	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	public  WebElement locationPopover; 
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
	public WebElement Allow; 
	
	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	public WebElement tapResult; 
	
	//@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"header-left-arrow-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='header-left-arrow-icon-button']/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnBack; 
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"location-screen-header-left-arrow-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnBack2;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"header-close-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnCross;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement verifyAddedPost;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[1]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnRemoveLocation;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"location-screen-google-autocomplete-0-item-button\"]/android.view.ViewGroup")
	public WebElement WashingtonDC;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
	public WebElement Austin;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"icon-button\"]")
	public WebElement btnCurrentLocation;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"location-screen-google-autocomplete-0-item-button\"]/android.view.ViewGroup")
	public WebElement Lahore;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc=\"text-highlight-text\"])[2]")
	public WebElement otherUser;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement tagLocation;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup")
	public WebElement RemoveLocation;
	
	@FindBy(xpath= "//android.widget.EditText[@content-desc=\"search-input-input\"]")
	public WebElement addLocation;
	
	@FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
	public WebElement addPhoto;
	
	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"icon-button\"])[2]")
	public WebElement commentAddPhoto;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Choose from Library\"]/android.widget.TextView")
	public WebElement choosePhoto;
	
	@FindBy(xpath= "//android.widget.LinearLayout[@content-desc=\"Screenshot_20210914-161538_QA - Seasoned.jpg, 128 kB, 14 Sep\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
	public WebElement selectImage;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Take Photo\"]/android.widget.TextView")
	public WebElement openCamer;
	
	@FindBy(xpath= "(//GLButton[@content-desc=\"NONE\"])[2]")
	public WebElement takePhoto;
	
	@FindBy(xpath= "(//GLButton[@content-desc=\"NONE\"])[1]")
	public WebElement btnOk;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	public WebElement imageInComment;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[1]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement removeImage;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-all-stations-label\"]")
	public WebElement communityFeed;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	public WebElement updatText;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement checkText;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	public WebElement btnDone;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView")
	public WebElement buildpost;
	
	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")
	public WebElement commentScreen ;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\'station-message-0-station-message-station-message-head-menu-icon-button\']")
	public WebElement ellipsis;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"content-feed-screen-0-0-station-message-station-message-head-menu-icon-button\"])[1]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement listScreenEllipsis;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-1-1-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement listScreenEdit;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-1-1-station-message-station-message-head-menu-icon-button\"]")
	public WebElement ellipsis2;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
	public WebElement noMatchFound;
	
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement clickUser;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc='Edit']")
	public WebElement ellipsisbtnEdit;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup")
	public WebElement userPopover;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"header-left-arrow-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnBack3;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc='header-left-arrow-icon-button']/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnBack4;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Edit\"]")
	public WebElement btnEdit;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-0-0-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement feed1;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-1-1-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement feed2;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-2-2-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement feed3;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement memberList;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"station-message-0-station-message-station-message-cta-reactions-reaction-react-button-a-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnReactDetail;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"station-message-0-station-message-station-message-cta-reaction-count\"]")
	public WebElement reactCount;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-0-0-station-message-station-message-cta-reaction-count\"]")
	public WebElement reactCountListing;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]/android.widget.TextView")
	public WebElement btnLikeComment;
	
	@FindBy(xpath= "(//android.widget.TextView[@content-desc=\"station-message-1-station-message-station-message-cta-reaction-count\"])[1]")
	public  WebElement commentLikecount;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[6]/android.widget.TextView")
	public WebElement btnLikeReply;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"station-message-1-station-message-station-message-cta-reaction-count\"]")
	public WebElement replyLikecount;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"posts-0-search-item-0-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement searchWidget;
	
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement imageRemove;
	
	
	//Listview 
	//----------------------------------------------------------------------------------------------------------------------------------------				
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-0-0-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement listP0;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-0-0-station-message-station-message-head-station-topic\"]")
	public WebElement Topic;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-1-1-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement listP1;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement fieldSearch;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-0-0-station-message-station-message-cta-reactions-reaction-react-button-a-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnreact;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
	public WebElement fieldSearch2;
	
	//Comments 
	//----------------------------------------------------------------------------------------------------------------------------------------			
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	public WebElement commentField;
	
	//@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[3]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnCommentSent;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[2]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnCommentSent2;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[3]")
	public WebElement btnCommentReply;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView")
	public WebElement verifyCommentAdded;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"station-message-1-station-message-station-message-content-message-images-0-button\"]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement verifyImageCommentAdded;
	
	@FindBy(className ="android.widget.TextView")
	public WebElement verifyGifInComment;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView")
	public WebElement verifySpecialCharactersInComment;
	
	//@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
	//public WebElement verifyLinkInComment;
	
	@FindBy(className="android.widget.TextView")
	public WebElement verifyMetaDataInComment;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.widget.TextView")
	public WebElement verifyReplyField;
	
	
	@FindBy(className= "android.view.ViewGroup")
	public WebElement verifyLongStringLinkInComment;
	
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"station-message-1-station-message-station-message-content-message-images-0-button\"]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement verifyImageInComment;
	
	@FindBy(className ="android.widget.ImageView")
	public WebElement verifyImageView;
	
	

	//reply/like
	//----------------------------------------------------------------------------------------------------------------------------------------
	
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement btnReply;	
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]/android.widget.TextView")
	public WebElement btnDetailLike;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	public WebElement replyField;
	
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"content-feed-search-search-container-back-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnback;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	public WebElement widget1;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")
	public WebElement widget2;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"content-feed-screen-1-1-station-message-station-message-head-menu-icon-button\"])[1]")
	public WebElement widgetElipsis1;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-1-1-station-message-station-message-head-menu-icon-button\"]")
	public WebElement widgetElipsis2;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement randomlink;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement postt;
	
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"covid-resources-button\"]/android.widget.ImageView[1]")
	public WebElement covidArtical;

	@FindBy(xpath="//android.widget.TextView[@content-desc=\"covid-resources-title\"]")
	public WebElement covidArticalList;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[2]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement closeCovidArtical;
	
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-details-title\"]")
	public WebElement verifyCovidArtical;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Mark as SPAM\"]")
	public WebElement markAsSpam;
	

	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"station-message-0-station-message-station-message-cta-reactions-reaction-react-button-a-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public MobileElement likebtn;

	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Pin\"]")
	public WebElement pin;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Unpin\"]")
	public WebElement unpin;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public WebElement pinPopover;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public WebElement unpinPopover;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public WebElement pinTitle;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public WebElement unpinTitle;
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
	public WebElement pinnedPost;
	
	

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	public WebElement pinedPostimg;
	
	
	public static String RandomString= "";
	public static String UpdateString= "";
	public static String RandomComment= "";
	public static String Randomreply= "";
	public static String Randomspecialcharactor= "";
	public static String specialCharactorComment= "";
	public static String Randomlink= "";
	public static String LongString= "";
	public static String user= "";
}
