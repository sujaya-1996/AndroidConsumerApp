package app.appium.BusinessLibrary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;

public class CommonElementPage extends DriverIgnit {

	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();

	public CommonElementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// To click on the DK on the grid-view page
	@FindBy(id = "prod_img")
	private List<WebElement> dk_Image_On_GridView;

	public void click_On_dk_Image_On_GridView() {
		for (int i = 0; i < dk_Image_On_GridView.size();) {
			dk_Image_On_GridView.get(i).click();
			break;
		}

	}

	// To assert the Tool-bar Title in Service request module
	@FindBy(id = "toolbar_title")
	private WebElement toolbar_Title;

	public String read_From_Toolbar_Title() {

		String read_Toolbar_Title = toolbar_Title.getText().trim();
		andrdCmnUtil.implicit_Wait();
		return read_Toolbar_Title;
	}

	// To click on the Show my dx card image
	@FindBy(id = "shortCutIcon")
	private WebElement click_On_ShowMyDxCard;

	public void clickOn_Show_MyDxcard_Field() throws InterruptedException {
		click_On_ShowMyDxCard.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on More option
	@FindBy(id = "navigation_more_settings")
	private WebElement click_On_More_Option;

	public void clickOn_More_Option() throws InterruptedException {
		click_On_More_Option.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the ok button of confirmation pop-up
	@FindBy(id = "positive_btn")
	private WebElement click_On_Confirmation_Popup;

	public void clickOn_Ok_On_Popup() throws InterruptedException {
		click_On_Confirmation_Popup.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the submit button
	@FindBy(id = "submit")
	private WebElement submit_Button;

	public void clickOn_submit_Button() throws InterruptedException {
		submit_Button.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Text showing in the Pop-up message
	@FindBy(id = "alert_message")
	private WebElement popUp_Message_Text;

	public String read_From_PopUp_Message_Text() throws InterruptedException {
		String value_From_PopUp_Message_Text = popUp_Message_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_PopUp_Message_Text;
	}

	// To click on the dk option on footer, when the user is on Menu screen
	@FindBy(id = "navigation_dk")
	private WebElement dk_Option_On_Footer;

	public void clickOn_dk_Option_On_Footer() throws InterruptedException {
		dk_Option_On_Footer.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To allow the media access, when it shows upon clicking on Attachments in new
	// request screen
	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allowAccess_Popup_For_Attachmnets_;

	public void click_allowAccess_Popup_For_Attachmnets_() {
		allowAccess_Popup_For_Attachmnets_.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Scan document text in the scan document dialog
	@FindBy(id = "title")
	private WebElement scanDocument_Text;

	public String read_value_Of_scanDocument_Text() {
		String value_Of_scanDocument_Text = scanDocument_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_Of_scanDocument_Text;

	}

	// To click and select the first image, which is there in Scan document pop-up
	// screen
	@FindBy(id = "image")
	private List<WebElement> list_Of_Images_In_ScanDocument_Screen;

	public void click_On_FirstImage_In_list_Of_Images_In_ScanDocument_Screen() {
		for (int i = 0; i < list_Of_Images_In_ScanDocument_Screen.size();) {
			list_Of_Images_In_ScanDocument_Screen.get(i).click();
			break;
		}

	}

	// To click on the camera icon, on the scan document screen
	@FindBy(id = "camera")
	private WebElement cameraOption_In_ScanDocument_PopupScreen;

	public void click_CameraOption_In_ScanDocument_PopupScreen() {
		cameraOption_In_ScanDocument_PopupScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the Cancel button on Scan document pop-up
	@FindBy(id = "cancel")
	private WebElement cancelButton_On_ScanDocument;

	public void click_CancelButton_On_ScanDocument() {
		cancelButton_On_ScanDocument.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the camera click button, when the phone camera is enabled
	@FindBy(id = "record_button")
	private WebElement cameraClickButton_In_NewRequestScreen_Attachment;

	public boolean takePicture_In_NewRequestScreen_Attachment() throws InterruptedException {
		boolean sts = cameraClickButton_In_NewRequestScreen_Attachment.isDisplayed();
		if (sts == true) {
			System.out.println("Its showing the camera click button");
			cameraClickButton_In_NewRequestScreen_Attachment.click();
			Thread.sleep(4000);
		} else {
			System.out.println("Its not shoiwng the click button");
		}
		andrdCmnUtil.implicit_Wait();
		return sts;

	}

	// To click on the select button, after taking the picture successfully
	@FindBy(id = "done_menu")
	private WebElement doneButton_In_Attachment_Preview_Screen;

	public void Click_DoneButton_In_Attachment_Preview_Screen() {
		doneButton_In_Attachment_Preview_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the delete button on the preview screen
	@FindBy(id = "delete_preview")
	private WebElement deleteButton_In_Attachment_Preview_Screen;

	public void Click_DeleteButton_In_Attachment_Preview_Screen() {
		deleteButton_In_Attachment_Preview_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the ok button of confirmation pop-up
	@FindBy(id = "negative_btn")
	private WebElement click_On_Confirmation_PopupScreen;

	public void clickOn_Cancel_On_Popup() throws InterruptedException {
		click_On_Confirmation_PopupScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the gallery button on the Scan document dialog
	@FindBy(id = "gallery")
	private WebElement gallery_On_ScanDocument_dialog;

	public void clickOn_Gallery_On_ScanDocument_dialog() throws InterruptedException {
		gallery_On_ScanDocument_dialog.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the mobile Downloads for attachment
	@FindBy(xpath = "//android.widget.TextView[@text='Downloads']")
	private WebElement downloads_In_Mobile;

	public void clickOn_Downloads_In_Mobile() throws InterruptedException {
		downloads_In_Mobile.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the first pdf file inside downloads
	@FindBy(xpath = "//android.widget.TextView[@text='0f15c9a2-8c0e-4ae1-bdc2-6d5fcb408485.pdf']")
	private WebElement firstPDF_In_Downloads;

	public void clickOn_FirstPDF_In_Downloads() throws InterruptedException {
		firstPDF_In_Downloads.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the validation for mobile number field (without giving any mobile
	// number/ less than 4 digits/more than 12 digits)
	// This will also work for email id validation error/ Also for category add
	// dialogue field validation
	@FindBy(id = "textinput_error")
	public WebElement mobilenoEmailID_Validation_Text;

	public String read_From_MobilenoEmailID_Validation_Text() {
		String value_From_MobilenoEmailID_Validation_Text = mobilenoEmailID_Validation_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_MobilenoEmailID_Validation_Text;
	}

	// To assert the Validation message when the otp has not been configured, and
	// clicked on signup /
	// verify in my profile (change mobno/emailid)
	// This will work for no otp/partial otp
	@FindBy(id = "error_tv")
	public WebElement enterValidOTP_Validation_Text;

	public String read_From_EnterValidOTP_Validation_Text() {
		String value_From_EnterValidOTP_Validation_Text = enterValidOTP_Validation_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_EnterValidOTP_Validation_Text;
	}

	// To assert the countrycode field text (both for profile/change mobile
	// no./change emailid field)
	@FindBy(id = "country_mobile_code_tv")
	public WebElement countryCode_In_Profile;

	public String read_From_countryCode_In_Profile() {
		String value_From_countryCode_In_Profile = countryCode_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_countryCode_In_Profile;
	}

	// To clear the text form any email id field
	@FindBy(id = "email_et")
	public WebElement emailID_Field;

	public void clear_Values_From_EmailID_Field() {
		emailID_Field.clear();
	}

	// To clear the text form Mobile number field (change mobile number screen in my
	// profile)
	@FindBy(id = "input_mobile_no")
	public WebElement mobileNo_Field;

	public void clear_Values_From_MobileNo_Field() {
		mobileNo_Field.clear();
	}

	// To clear the text form EmailID field (change EmailID screen in my profile)
	@FindBy(id = "input_email")
	public WebElement changeEmail_Field;

	public void clear_Values_From_changeEmail_Field() {
		changeEmail_Field.clear();
	}

	// To clear the text form any email id field (login screen)
	@FindBy(id = "mobile_no_et")
	public WebElement login_Mobileno_Field;

	public void clear_Values_From_Login_Mobileno_Field() {
		login_Mobileno_Field.clear();
	}

	// To click on the otp field
	@FindBy(id = "otp_et")
	private WebElement OTPBOX;

	public void clickOn_OTPBOX() throws InterruptedException {
		OTPBOX.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the close button that displayed as a cross icon
	@FindBy(id = "close")
	private WebElement close;

	public void clickOn_On_Close() throws InterruptedException {
		close.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To read the alert pop-up title (currently using this for loyalty points
	// validation pop-up)
	@FindBy(id = "alert_title")
	private WebElement alert_Title;

	public String read_From_Alert_Title() throws InterruptedException {
		String value_From_Alert_Title = alert_Title.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Alert_Title;

	}

	// To click on the Rewards option on footer, when the user is on Menu screen
	@FindBy(id = "navigation_rewards")
	private WebElement rewards_Option_On_Footer;

	public void clickOn_Rewards_Option_On_Footer() throws InterruptedException {
		rewards_Option_On_Footer.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Coupon code thats showing on the coupon
	@FindBy(id = "actual_coupon_code_tv")
	private WebElement actual_Couponcode;

	public String read_ValueFrom_Actual_Couponcode() {
		String ValueFrom_Actual_Couponcode = actual_Couponcode.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Actual_Couponcode;

	}

	// To assert coupon description
	@FindBy(id = "coupon_description_tv")
	private WebElement coupon_Description;

	public String read_ValueFrom_Coupon_Description() {
		String ValueFrom_Coupon_Description = coupon_Description.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_Description;

	}

	// To assert coupon Code label
	@FindBy(id = "coupon_code_tv")
	private WebElement couponcode_Label;

	public String read_ValueFrom_Couponcode_Label() {
		String ValueFrom_Couponcode_Label = couponcode_Label.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Couponcode_Label;

	}

	// To assert the coupon validity date
	@FindBy(id = "coupon_code_validity_tv")
	private WebElement coupon_ExpiryDate;

	public String read_ValueFrom_Coupon_ExpiryDate() {
		String ValueFrom_Coupon_expiryDate = coupon_ExpiryDate.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_expiryDate;

	}

	// To click on the coupon copy icon
	@FindBy(id = "copy_coupon_code_log")
	private WebElement coupon_CopyIcon;

	public void click_Coupon_CopyIcon() {
		coupon_CopyIcon.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the Add product + button
	@FindBy(id = "floatingActionButton")
	private WebElement addProductPlusbutton;

	public void click_On_AddProduct_Plus_Button() {
		addProductPlusbutton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on Search icon (This can be used for select country, multiple
	// dropdown field while adding n2c product)
	@FindBy(id = "action_search")
	private WebElement searchIcon;

	public void click_On_SearchIcon() {
		searchIcon.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Search field place holder (This can be used for select country,
	// multiple dropdown field while adding n2c product)
	@FindBy(id = "search_src_text")
	private WebElement searchFieldPlaceholder;

	public String read_ValueFrom_SearchFieldPlaceholder() {
		String valueFrom_SearchFieldPlaceholder = searchFieldPlaceholder.getText();
		andrdCmnUtil.implicit_Wait();
		return valueFrom_SearchFieldPlaceholder;

	}

	// To write some values Search field (This can be used for select country,
	// multiple dropdown field while adding n2c product)
	@FindBy(id = "search_src_text")
	private WebElement writeOnSearchField;

	public void write_Value_On_SearchField(String value_From_Excel) {
		writeOnSearchField.sendKeys(value_From_Excel);
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the cross icon on Search field (This can be used for select
	// country, multiple dropdown field while adding n2c product)
	@FindBy(id = "search_close_btn")
	private WebElement searchCloseIcon;

	public void click_CrossOption_On_SearchField() {
		searchCloseIcon.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the back button on Search field (This can be used for select
	// country, multiple dropdown field while adding n2c product)
	@FindBy(id = "toolbar_navigation_text")
	private WebElement searchField_Back_Button;

	public void clickOn_SearchField_Back_Button() {
		searchField_Back_Button.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the next button for the months, in calendar
	@FindBy(id = "android:id/next")
	private WebElement calendarNext_Button;

	public void clickOn_CalendarNext_Button() {
		calendarNext_Button.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the search field back button
	@FindBy(xpath = "//*[@class='android.widget.ImageButton']")
	private WebElement searchField_BackButton;

	public void click_On_SearchField_BackButton() {
		searchField_BackButton.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on any particular date on the calendar
	@FindBy(xpath = "//android.view.View[@text='28']")
	private WebElement select_Any_ParticularDate;

	public void clickOn_Select_Any_ParticularDate() {
		select_Any_ParticularDate.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the ok button, in calendar
	@FindBy(id = "android:id/button1")
	private WebElement calendarOK_Button;

	public void clickOn_CalendarOK_Button() {
		calendarOK_Button.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the cancel button, in calendar
	@FindBy(id = "button2")
	private WebElement calendarCancel_Button;

	public void clickOn_CalendarCancel_Button() {
		calendarCancel_Button.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the added product in grid view
	@FindBy(id = "title_tv")
	private List<WebElement> list_Of_added_Product;

	public void clickOn_AddedProduct_In_GridView() throws InterruptedException {
		
		for (int i = 0; i < list_Of_added_Product.size();) {
			list_Of_added_Product.get(i).click();
			break;
			
		}System.out.println("First product from the grid view has been selected.");

	}
	
	//To click on the cancel button of the android device
	@FindBy(id = "android:id/button2")
	private WebElement cancelButton;

	public void clickOn_CancelButton() {
		cancelButton.click();
		andrdCmnUtil.implicit_Wait();
	}


}
