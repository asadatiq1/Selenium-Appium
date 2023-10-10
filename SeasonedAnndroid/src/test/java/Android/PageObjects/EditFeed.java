package Android.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditFeed {
	public EditFeed() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"station-message-0-station-message-station-message-head-menu-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement ellipsisFeedDetail;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]/android.widget.TextView")
	public WebElement btnEdit;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]/android.widget.TextView")
	public WebElement btnEdit1;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	public WebElement detailEditFieldpost;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	public WebElement btnDone;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"station-message-1-station-message-station-message-head-menu-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement ellipsisCommentEditDetail;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	public WebElement editCommentField;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Delete Post\"]/android.widget.TextView")
	public WebElement btndelete;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Delete Post\"]")
	public WebElement btndelete2;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"station-message-2-station-message-station-message-head-menu-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement ellipsisreply;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"content-feed-screen-0-0-station-message-station-message-head-menu-icon-button\"]")
	public WebElement ellipsisreply2;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"continue\"]/android.widget.TextView")
	public WebElement btnContinue;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[2]")
	public WebElement btnspam;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	public WebElement btnDone2;
	
	
	//(//android.view.ViewGroup[@content-desc="station-message-1-station-message-station-message-head-menu-icon-button"])[2]/android.view.ViewGroup/android.view.ViewGroup
	
	@FindBy(xpath= "(//android.widget.TextView[@content-desc=\"time-ago-text\"])[1]")
	public WebElement fewSecondago;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	public WebElement pinPost;
	
	@FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement ProfileIcon;

	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"header-avatar-avatar-empty-image\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement withoutImage;

	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[2]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement settingIcon;

	@FindBy(xpath= "(//android.widget.TextView[@content-desc=\"list-item-label\"])[8]")
	public WebElement signOut;
	

	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")	
	public WebElement feedlistingCommentfield;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView")
	public WebElement addedcomment;
	

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement updatedstring;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement updateString2;
	
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	public WebElement replyfield;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Report Comment\"]")
	public WebElement reportComment;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	public WebElement report;
	
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Block Member\"]")
	public WebElement block;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[1]")
	public WebElement Dontlike;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-0-0-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement post1;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-1-1-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis2;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-2-2-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis3;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-3-3-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis4;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-4-4-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis5;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-5-5-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis6;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-6-6-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis7;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"content-feed-screen-7-7-station-message-station-message-head-menu-icon-button\"]")
	public WebElement elipsis8;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[3]")
	public WebElement nudity;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[4]")
	public WebElement hateSpeech;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[5]")
	public WebElement voilence;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[6]")
	public WebElement harrassment;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[1]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement btnback;
	
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")
	public WebElement User;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"list-item-button\"])[4]")
	public WebElement tabBlockedAccount;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	public WebElement blockAccountWidget;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"profile-profile-header-name\"]")
	public WebElement blockedUser;
	
	@FindBy(xpath= "//android.widget.TextView[@content-desc=\"content-feed-screen-1-1-station-message-station-message-content-text-content-read-more-text\"]")
	public WebElement post2;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[1]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement profileBtnBack;
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"header-left-arrow-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement settingBtnBack;
	
	
	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"header-left-arrow-icon-button\"]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement blockedBtnBack;
	
	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"icon-button\"])[1]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement profileBtnBack2;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget")
	public WebElement nearAustin;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[9]/android.widget.TextView")
	public WebElement viewCommentText;
	
	

	
	public static String blockUser= "";
	
	
	public static String UpdateComment= "";
	public static String PostText= "";
	public static String ProfileName= "";
}
