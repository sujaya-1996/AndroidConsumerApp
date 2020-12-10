package app.appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class ProfilePage
{
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	
	public WebDriver driver;
	
	public ProfilePage (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	// To assert whether the default address is showing or not
	@FindBy (id= "profile_default_address_tv")
	public WebElement defaultAddress_In_Profile;
	
	public String read_DefaultAddress_In_Profile()
	{
		String value_From_DefaultAddress_In_Profile= defaultAddress_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_DefaultAddress_In_Profile;
	}
	
	// To assert the "please add default address" text
	@FindBy (id= "profile_default_address_tv")
	public WebElement configure_defaultAddress_In_Profile;
	
	public String read_Configure_defaultAddress_In_Profile()
	{
		String value_From_Configure_defaultAddress_In_Profile= configure_defaultAddress_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Configure_defaultAddress_In_Profile;
	}
	
	// To click on the Submit button My profile
	@FindBy (id= "edit_profile_bttn")
	public WebElement submitButton_In_Profile;
	
	public void click_SubmitButton_In_Profile()
	{
		submitButton_In_Profile.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the profile default emoji
	@FindBy (id= "profile_pic_iv")
	public WebElement profileemoji_In_Profile;
	
	public boolean read_From_Profileemoji_In_Profile()
	{
		boolean value_From_Profileemoji_In_Profile= profileemoji_In_Profile.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Profileemoji_In_Profile;
	}
	
	// To click on the profile image section
	@FindBy (id= "profile_pic_iv")
	public WebElement profilePic_In_Profile;
	
	public void click_On_ProfilePic_In_Profile()
	{
		profilePic_In_Profile.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the name field
	@FindBy (id= "name_et")
	public WebElement name_In_Profile;
	
	public String read_From_Name_In_Profile()
	{
		String value_From_Name_In_Profile= name_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Name_In_Profile;
	}
	
	// To click and write on the name field
	@FindBy (id= "name_et")
	public WebElement name_field_In_Profile;
	
	public void write_on_Name_Field_In_Profile(String name_From_Excel)
	{
		name_field_In_Profile.sendKeys(name_From_Excel);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the Gender field text
	@FindBy (id= "gender_tv")
	public WebElement gender_In_Profile;
	
	public String read_From_Gender_In_Profile()
	{
		String value_From_Gender_In_Profile= gender_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Gender_In_Profile;
	}
	
	// To assert the male field text
	@FindBy (id= "rb_male")
	public WebElement male_In_Profile;
	
	public String read_From_Male_In_Profile()
	{
		String value_From_Male_In_Profile= male_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Male_In_Profile;
	}
	
	// To check whether the male radio button by default selected or not!!
	@FindBy (id= "rb_male")
	public WebElement male_radioButton_In_Profile;
	
	public boolean read_From_Male_radioButton_In_Profile()
	{
		boolean value_From_Male_radioButton_In_Profile= male_radioButton_In_Profile.isEnabled();
		andrdCmnUtil.implicit_Wait();
		return value_From_Male_radioButton_In_Profile;
	}
	
	// To assert the female field text
	@FindBy (id= "rb_female")
	public WebElement female_In_Profile;
	
	public String read_From_Female_In_Profile()
	{
		String value_From_Female_In_Profile= female_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Female_In_Profile;
	}
	
	// To check whether female radio button is selected or not!!
	@FindBy (id= "rb_female")
	public WebElement femaleRadioButton_In_Profile;
	
	public boolean check_For_FemaleRadioButton_In_Profile()
	{
		boolean value_From_FemaleRadioButton_In_Profile= femaleRadioButton_In_Profile.isEnabled();
		andrdCmnUtil.implicit_Wait();
		return value_From_FemaleRadioButton_In_Profile;
	}
	
	
	// To assert the dob field text
	@FindBy (id= "dob_et")
	public WebElement dob_In_Profile;
	
	public String read_From_DOB_In_Profile()
	{
		String value_From_DOB_In_Profile= dob_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_DOB_In_Profile;
	}
	
	// To assert the Email field text
	@FindBy (id= "email_et")
	public WebElement email_In_Profile;
	
	public String read_From_Email_In_Profile()
	{
		String value_From_Email_In_Profile= email_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Email_In_Profile;
	}
	
	// To write on the Email field 
	@FindBy (id= "email_et")
	public WebElement email_Field_In_Profile;
	
	public void wrtite_On_Email_In_Profile(String email_From_Excel)
	{
		email_Field_In_Profile.sendKeys(email_From_Excel);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	// To assert the mobileno field text
	@FindBy (id= "mobile_no")
	public WebElement mobileno_In_Profile;
	
	public String read_From_mobileno_In_Profile()
	{
		String value_From_mobileno_In_Profile= mobileno_In_Profile.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_mobileno_In_Profile;
	}
	
	// To click on the Mobile number edit button In My profile
	@FindBy (id= "mobile_edit_iv")
	public WebElement editMobileNo_In_Profile;
	
	public void click_editMobileNo_In_Profile()
	{
		editMobileNo_In_Profile.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	// To click on the address field edit button In My profile
	@FindBy (id= "edit_profile_address_iv")
	public WebElement editAddress_In_Profile;
	
	public void click_editAddress_In_Profile()
	{
		editAddress_In_Profile.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	// To click on the male radio button
	@FindBy (id= "rb_male")
	public WebElement male_rb_In_Profile;
	
	public void click_On_male_rb_In_Profile()
	{
		male_rb_In_Profile.click();
		andrdCmnUtil.implicit_Wait();
		
		
	}
	
	// To click on the female radio button
	@FindBy (id= "rb_female")
	public WebElement female_rb_In_Profile;
	
	public void click_On_Female_rb_In_Profile()
	{
		female_rb_In_Profile.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the change mobile number text in change mobile number screen
	@FindBy (id= "tv1")
	public WebElement changeMobileNumber_EmailID_Text;
	
	public String read_From_ChangeMobileNumber_EmailID_Text()
	{
		String value_From_ChangeMobileNumber_EmailID_Text= changeMobileNumber_EmailID_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_ChangeMobileNumber_EmailID_Text;
	}
	
	// To clcik on the cross icon on the Change mobile number/email id screen
	@FindBy (id= "close")
	public WebElement closeButton_In_ChangeMobileno_EmaildID;
	
	public void click_On_CloseButton_In_ChangeMobileno_EmaildID()
	{
		closeButton_In_ChangeMobileno_EmaildID.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To click on the Request OTP button in change mobile number screen (This will also work for verify button)
	@FindBy (id= "request_otp_bttn")
	public WebElement requestOTP_In_ChangeMobileno_EmaildID;
	
	public void click_On_RequestOTP_In_ChangeMobileno_EmaildID()
	{
		requestOTP_In_ChangeMobileno_EmaildID.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To write on the mobile number field inside change mobile number screen
	@FindBy (id= "input_mobile_no")
	public WebElement mobileNoField_In_ChangeMobileno_Screen;
	
	public void write_On_MobileNoField_In_ChangeMobileno_Screen(String mobileno_From_Excel)
	{
		mobileNoField_In_ChangeMobileno_Screen.sendKeys(mobileno_From_Excel);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	// To write on the mobile number field inside change mobile number screen
	@FindBy (id= "input_mobile_no")
	public WebElement mobileNoField_In_VerifyOTP_Screen;
	
	public String read_From_mobileNoField_In_VerifyOTP_Screen()
	{
		String value_From_mobileNoField_In_VerifyOTP_Screen=  mobileNoField_In_VerifyOTP_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_mobileNoField_In_VerifyOTP_Screen;
		
	}
	
	
	// To click on the edit mobile number field on Change mobile number screen
	@FindBy (id= "edit_moile_no")
	public WebElement mobilenoEdit_In_ChangeMobileno_Screen;
	
	public void click_mobilenoEdit_In_ChangeMobileno_Screen()
	{
		mobilenoEdit_In_ChangeMobileno_Screen.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the text Please enter the OTP sent to <mobile no> in change mobile no screen
	// To assert the Text please enter the OTP sent to <emailID> in change email ID screen
	@FindBy (id= "enter_mobile_tv")
	public WebElement enterTheOTP_Text;
	
	public String read_From_EnterTheOTP_Text()
	{
		String value_From_EnterTheOTP_Text= enterTheOTP_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_EnterTheOTP_Text;
	}
	
	// To click on the edit button of the email ID field
	@FindBy (id= "email_edit_iv")
	public WebElement editButton_On_EmailID_Field;
	
	public void click_EditButton_On_EmailID_Field()
	{
		editButton_On_EmailID_Field.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To enter the Email id from the excel sheet, In change EmailID screen
	@FindBy (id= "input_email")
	public WebElement edit_In_ChangeEmailID_Field;
	
	public void write_On_ChangeEmailID_Field(String emailID_From_Excel)
	{
		edit_In_ChangeEmailID_Field.sendKeys(emailID_From_Excel);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the updated eamil ID configured
	@FindBy (id= "input_email")
	public WebElement emailID_In_ChangeEmailID_Screen;
	
	public String read_From_ChangeEmailID_Screen()
	{
		String value_From_EmailID_In_ChangeEmailID_Screen= emailID_In_ChangeEmailID_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_EmailID_In_ChangeEmailID_Screen;
	}
	

	
	
	
	
	
	
	
	

}
