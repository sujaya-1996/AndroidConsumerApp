package app.appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.ExcelLibrary;

public class LoginPage 
{
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	ExcelLibrary excelLib = new ExcelLibrary();
	
	public LoginPage (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="android:id/button1") 
	private WebElement androidOkayBtn;
	
	public void click_On_androidOkayBtn()
	{
		androidOkayBtn.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	@FindBy(id="android:id/checkbox") 
	private WebElement androidToggleButton;
	
	public void click_On_androidToggleButton()
	{
		androidToggleButton.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	@FindBy(id="miui:id/up") 
	private WebElement androidBackButton;
	
	public void click_On_androidBackButton()
	{
		androidBackButton.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	@FindBy(id="mobile_no_et") 
	private WebElement mobileNumberEditBox;
	
	public void write_on_mobileNumberEditBox (String Mobile_number_from_Excel)
	{
		mobileNumberEditBox.sendKeys(Mobile_number_from_Excel);
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="country_lay") 
	private WebElement countryCode_EditBox;
	
	public void click_On_countryCode_EditBox()
	{
		countryCode_EditBox.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="toolbar_navigation_text") 
	private WebElement countryScreen_Cancel_button;
	
	public void click_On_countryScreen_Cancel_button()
	{
		countryScreen_Cancel_button.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="action_search") 
	private WebElement countryScreen_SearchIcon;
	
	public void click_On_countryScreen_SearchIcon()
	{
		countryScreen_SearchIcon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="search_src_text") 
	private WebElement countryScreen_searchField;
	
	public void write_On_countryScreen_searchField(String Country_flag)
	{
		countryScreen_searchField.sendKeys(Country_flag);
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="item_lay") 
	private WebElement countryScreen_CountryFlag;
	
	public void select_countryScreen_CountryFlag()
	{
		countryScreen_CountryFlag.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="search_close_btn") 
	private WebElement countryScreen_cross_Icon;
	
	public void clickOn_countryScreen_cross_Icon( )
	{
		countryScreen_cross_Icon.click();
		andrdCmnUtil.implicit_Wait();
	}
	

	@FindBy(id="toolbar_navigation_text") 
	private WebElement countryScreen_Back_Button;
	
	public void clickOn_countryScreen_Back_Button( )
	{
		countryScreen_Back_Button.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	
	@FindBy(id="btn_otp") 
	private WebElement click_GetOTP;
	
	public void click_GetOTP_Button () throws InterruptedException
	{
		click_GetOTP.click();
		andrdCmnUtil.implicit_Wait();	 
	}
	
	@FindBy(id="send_bttn") 
	private WebElement click_SisgnUp;
	
	public void click_SignUp_Button ()
	{
		click_SisgnUp.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	@FindBy(id="terms_of_use_tv") 
	private WebElement click_Terms_conditions;
	
	public void click_Terms_conditions_option ()
	{
		click_Terms_conditions.click();
		andrdCmnUtil.implicit_Wait();
	}	

	@FindBy(id="privacy_policy") 
	private WebElement click_Privacy_Policy;
	
	public void click_Privacy_Policy_option ()
	{
		click_Privacy_Policy.click();
		andrdCmnUtil.implicit_Wait();
	}	

	@FindBy(id="otp_et") 
	private WebElement OTPBOX;
	
	public void clickOn_OTPBOX () throws InterruptedException
	{
		OTPBOX.click();
		andrdCmnUtil.implicit_Wait();
		
	}		

	
	@FindBy(id="send_bttn") 
	private WebElement click_On_LogIn_Signup_Button;
	
	public void clickOn_LogIn_Signup() throws InterruptedException
	{
		click_On_LogIn_Signup_Button.click();
		andrdCmnUtil.implicit_Wait();
		
	}	
	
	@FindBy(id="change_pswd_bttn") 
	private WebElement click_On_Submit_Button_In_Create_Or_changePassword_screen;
	
	public void click_On_Submit_Button_In_Create_Or_changePassword() throws InterruptedException
	{
		click_On_Submit_Button_In_Create_Or_changePassword_screen.click();
		andrdCmnUtil.implicit_Wait();
		
	}	
	
	//To click on the Ok button in the validation confirmation pop-up
	@FindBy(id="positive_btn") 
	private WebElement click_OK_Button_On_Validation_Popup ;
	
	public void click_OK_On_Validation_Popup() throws InterruptedException
	
	{
		click_OK_Button_On_Validation_Popup.click();
		andrdCmnUtil.implicit_Wait();
	}	
	
	//To click on the cancel/delete button in the validation confirmartion pop-up
	@FindBy(id="negative_btn") 
	private WebElement click_Cancel_Button_On_Validation_Popup ;
	
	public void click_Cancel_On_Validation_Popup() throws InterruptedException
	
	{
		click_Cancel_Button_On_Validation_Popup.click();
		andrdCmnUtil.implicit_Wait();
	}	
	
	//To Find the New password (Create password Screen), and to give value in that
	@FindBy(id="input_new_pswd") 
	private WebElement new_password_field ;
	
	public void write_On_New_password_field(String pswd) throws InterruptedException
	
	{
		new_password_field.sendKeys(pswd);
		andrdCmnUtil.implicit_Wait();
	}	
	
	
	//To Find the Confirm password (Create password Screen), and to give value in that
	@FindBy(id="input_confirm_pswd") 
	private WebElement confirm_password_field ;
	
	public void write_On_Confirm_password_field(String pswd) throws InterruptedException
	
	{
		confirm_password_field.sendKeys(pswd);
		andrdCmnUtil.implicit_Wait();
	}	
	
	
	//To click on "login using password" option
	@FindBy(id="login_pass_tv") 
	private WebElement logIn_Using_Password_link ;
	
	public void click_On_logIn_Using_Password_link() throws InterruptedException
	
	{
		logIn_Using_Password_link.click();
		andrdCmnUtil.implicit_Wait();
	}	
	
	//To give value in password field during login
	@FindBy(id="pswd_et") 
	private WebElement logIn_Using_Password_field ;
	
	public void write_On_logIn_Using_Password_field(String pwd) throws InterruptedException
	
	{
		logIn_Using_Password_field.sendKeys(pwd);
		andrdCmnUtil.implicit_Wait();
	}	
	
	//To find and give value in current password (change password module)
	@FindBy(id="input_current_pswd") 
	private WebElement current_Password_field ;
	
	public void write_On_current_Password_field(String pswd) throws InterruptedException
	
	{
		current_Password_field.sendKeys(pswd);
		andrdCmnUtil.implicit_Wait();
	}	
	
	
	//To find and clear the value from current password (change password module)
	@FindBy(id="input_current_pswd") 
	private WebElement clear_current_Password_field ;
	
	public void clear_Value_From_current_Password_field() throws InterruptedException
	
	{
		clear_current_Password_field.clear();
		andrdCmnUtil.implicit_Wait();
	}	
	
	//To check the enable/disable functionality for "login using password"
	@FindBy(id="login_pass_tv") 
	private WebElement login_Using_Password_Button ;
	
	public boolean getTheStatusOf_loginUsingPswdLink()
	{
		boolean sts = login_Using_Password_Button.isEnabled();
		return sts;	
	}
	
	public void clickOn_Login_Using_Password_Button() throws InterruptedException
	
	{
		login_Using_Password_Button.click();
		andrdCmnUtil.implicit_Wait();
	}	
	
	//To find the Country code that's already selected
	@FindBy(id="country_mobile_code_tv") 
	private WebElement read_CountryCode ;
	
	public String read_Value_From_CountryCode() throws InterruptedException
	
	{
		String countryCode = read_CountryCode.getText();
		andrdCmnUtil.implicit_Wait();
		return countryCode;
	}	
	
	
	//To find the Country code that's already selected
	@FindBy(id="country_mobile_code_tv") 
	private WebElement CountryCode ;
	
	public void click_On_CountryCode() throws InterruptedException
	
	{
		CountryCode.click();
		andrdCmnUtil.implicit_Wait();
		
	}	
	
	
	//To find the Country code with the mobile number in login with OTP screen (In the purpose of asserting the value)
	@FindBy(id="login_pricipal") 
	private WebElement read_CountryCode_With_MobileNumber ;
	
	public String read_Value_From_CountryCode_With_MobileNumber() throws InterruptedException
	
	{
		String countryCode_with_MobileNumber = read_CountryCode_With_MobileNumber.getText();
		andrdCmnUtil.implicit_Wait();
		return countryCode_with_MobileNumber;
	}	
	
	@FindBy(id="mobile_no_et") 
	private WebElement read_Value_From_MobileNumber_Field;
	
	public String check_value_From_MobileNumber_Field ()
	{
		String Value_From_MobileNumber_Field= read_Value_From_MobileNumber_Field.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_MobileNumber_Field;
	}
	
	@FindBy(id="greeting_tv") 
	private WebElement read_Value_From_SignUp_LogIn_Page;
	
	public String check_Value_From_SignUp_LogIn_Page ()
	{
		String Value_From_SignUp_LogIn_Page= read_Value_From_SignUp_LogIn_Page.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_SignUp_LogIn_Page;
	}
	
	@FindBy(id="referral_code_input") 
	private WebElement read_Value_From_referralCode_SignUp_Page;
	
	public String check_Value_From_Value_From_referralCode_SignUp_Page ()
	{
		String Value_From_Value_From_referralCode_SignUp_Page= read_Value_From_referralCode_SignUp_Page.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_Value_From_referralCode_SignUp_Page;
	}
	
	@FindBy(id="referral_code_input") 
	private WebElement referralCode_SignUp_Page;
	
	public void write_On_referralCode_SignUp_Page (String referralCode)
	{
		referralCode_SignUp_Page.sendKeys(referralCode);
		andrdCmnUtil.implicit_Wait();
		
	}

}