package app.consumerApp.test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.tools.ant.taskdefs.condition.And;
import org.openqa.selenium.By;
import org.testng.Assert;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.BusinessLibrary.HttpRequest;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.LoginPage;
import app.appium.PageFactory.ProfilePage;

public class ProfileImplementation extends DriverIgnit {

	AndroidCommonUtil andrdCmnUtil ;
	AppGenericLibrary appgenericlib ;
	MyAddressImplementation myadrsimpl ;
	BusinessClass businesscls ;
	CommonElementPage cmnelementpage;
	LoginPage loginpage;
	ProfilePage prflpage;
	String value_From_DefaultAddress_In_Profile;
	String consumerMobileNumber;
	String Consumer_Name;
	String extisting_EmailID_Value;
	String new_Emaild_Value;
	String partial_Mobile_Number;
	String mobile_Number_More_Than_Tweleve_Digits;
	String existing_Mobile_Number;
	String new_Mobile_Number;
	int application_type;
	static String fetchedOTP;
	String country_Flag;
	String invalid_EmailID;
	String update_EmailID;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {
		prflpage = new ProfilePage(driver);
		cmnelementpage = new CommonElementPage(driver);
		loginpage = new LoginPage(driver);
	    andrdCmnUtil = new AndroidCommonUtil();
		appgenericlib = new AppGenericLibrary();
	    myadrsimpl = new MyAddressImplementation();
		businesscls = new BusinessClass();
		
		
		consumerMobileNumber = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 1, 1);
		Consumer_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 1, 1);
		extisting_EmailID_Value = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 2, 1);
		new_Emaild_Value = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 3, 1);
		partial_Mobile_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 4, 1);
		mobile_Number_More_Than_Tweleve_Digits = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 5, 1);
		existing_Mobile_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 6, 1);
		new_Mobile_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 7, 1);
		application_type = ExcelLibrary.getIntegerExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.APPLICATION_TYPE_SHEETNAME, 1, 1);
		country_Flag = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 2, 1);
		invalid_EmailID = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 8, 1);
		update_EmailID = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PROFILE_TESTDATA_SHEETNAME, 9, 1);

	}

	public void checkAddressInProfile() {
		andrdCmnUtil = new AndroidCommonUtil();
		prflpage = new ProfilePage(driver);
		andrdCmnUtil.scrollAndClick("My Profile");

		// To assert the default address in my profile screen
		value_From_DefaultAddress_In_Profile = prflpage.read_DefaultAddress_In_Profile();
		String expected_Address_Result = "Unnamed Road, Unnamed Road, Bhubaneswar, Khordha Dist, Odisha, India  - 751003";
		String actual_Address_Result = value_From_DefaultAddress_In_Profile;
		Assert.assertEquals(actual_Address_Result, expected_Address_Result, "Assertion passed");
		System.out.println("Default address in My profile got verified successfully: " + actual_Address_Result);
		andrdCmnUtil.implicit_Wait();

		// To click on the back button in My profile
		andrdCmnUtil.Click_DeviceBackButton();

	}

	public void verify_UI() throws InterruptedException {
		

		//commenting below line of code, because While running through tesng.xml file, it will be on the more menu itself after change password flow 
		cmnelementpage.clickOn_More_Option();
		try {
		andrdCmnUtil.scrollAndClick("My Profile");
		}catch (Exception e) {
			System.out.println("No Need to Scroll");
		}

		// To assert the profile management Toolbar Title
		String value_From_ToolabarTitle = cmnelementpage.read_From_Toolbar_Title();
		String expected_ToolbarTitle_Result = "PROFILE MANAGEMENT";
		String actual_ToolbarTitle_Result = value_From_ToolabarTitle;
		Assert.assertEquals(actual_ToolbarTitle_Result, expected_ToolbarTitle_Result);
		System.out.println("Toolbar Title in My profile got verified successfully: " + actual_ToolbarTitle_Result);
		andrdCmnUtil.implicit_Wait();

		boolean value_From_Profileemoji_In_Profile = prflpage.read_From_Profileemoji_In_Profile();
		if (value_From_Profileemoji_In_Profile == true) {
			System.out.println("Profile default emoji is showing properly:" + value_From_Profileemoji_In_Profile);

			// To assert the name field
			String value_From_NameField = prflpage.read_From_Name_In_Profile();
			String expected_Name_Result = "Name";
			String actual_Name_Result = value_From_NameField;
			Assert.assertEquals(actual_Name_Result, expected_Name_Result);
			System.out.println("Name field placeholder in My profile got verified successfully: " + actual_Name_Result);
			andrdCmnUtil.implicit_Wait();

			// To assert the Gender field text
			String value_from_Gender_label = prflpage.read_From_Gender_In_Profile();
			String expected_Gender_Result = "GENDER";
			String actual_Gender_Result = value_from_Gender_label;
			Assert.assertEquals(actual_Gender_Result, expected_Gender_Result);
			System.out.println("Gender label in My profile got verified successfully: " + actual_Gender_Result);
			andrdCmnUtil.implicit_Wait();

			boolean value_From_Male_radioButton_In_Profile = prflpage.read_From_Male_radioButton_In_Profile();
			if (value_From_Male_radioButton_In_Profile == true) {
				System.out.println("Male Gender has by default selelcted:" + value_From_Male_radioButton_In_Profile);

				// To assert the male field text
				String value_From_MaleRB = prflpage.read_From_Male_In_Profile();
				String expected_MaleRB_Result = "Male";
				String actual_MaleRB_Result = value_From_MaleRB;
				Assert.assertEquals(actual_MaleRB_Result, expected_MaleRB_Result);
				System.out.println("Male RB in My profile got verified successfully: " + actual_MaleRB_Result);
				andrdCmnUtil.implicit_Wait();

				// To assert the Female field text
				String value_From_FemaleRB = prflpage.read_From_Female_In_Profile();
				String expected_FemaleRB_Result = "Female";
				String actual_FemaleRB_Result = value_From_FemaleRB;
				Assert.assertEquals(actual_FemaleRB_Result, expected_FemaleRB_Result);
				System.out.println("Female RB in My profile got verified successfully: " + actual_FemaleRB_Result);
				andrdCmnUtil.implicit_Wait();

				// To assert the DOB field text
				String value_From_DOBField = prflpage.read_From_DOB_In_Profile();
				String expected_DOB_Result = "Date of Birth";
				String actual_DOB_Result = value_From_DOBField;
				Assert.assertEquals(actual_DOB_Result, expected_DOB_Result);
				System.out.println("DOB field Text in My profile got verified successfully: " + actual_DOB_Result);
				andrdCmnUtil.implicit_Wait();

				// To assert the emailID field text
				String value_From_EmailID = prflpage.read_From_Email_In_Profile();
				String expected_EmailID_Result = "Email ID";
				String actual_EmailID_Result = value_From_EmailID;
				Assert.assertEquals(actual_EmailID_Result, expected_EmailID_Result);
				System.out.println(
						"EmailID field Text in My profile got verified successfully: " + actual_EmailID_Result);
				andrdCmnUtil.implicit_Wait();

				// To assert the Mobile number field value
				String value_From_MobileNo = prflpage.read_From_mobileno_In_Profile();
				String expected_MobileNo_Result = consumerMobileNumber;
				String actual_MobileNo_Result = value_From_MobileNo;
				Assert.assertEquals(actual_MobileNo_Result, expected_MobileNo_Result);
				System.out.println(
						"Mobile number field value in My profile got verified successfully: " + actual_MobileNo_Result);
				andrdCmnUtil.implicit_Wait();

				// To assert the country-code field text
				String value_From_MobileNo_CountryCode = cmnelementpage.read_From_countryCode_In_Profile();
				String expected_MobileNo_CountryCode_Result = "+91";
				String actual_MobileNo_CountryCode_Result = value_From_MobileNo_CountryCode;
				Assert.assertEquals(actual_MobileNo_CountryCode_Result, expected_MobileNo_CountryCode_Result);
				System.out.println("Mobile number Country code field value in My profile got verified successfully: "
						+ actual_MobileNo_CountryCode_Result);
				andrdCmnUtil.implicit_Wait();

			} else {
				System.out.println("Male Gender has not been selected by default, Hence showing error");
			}

		} else {

			System.out.println("Profile emoji is showing not in the My profile screen,Hence showing error.");
		}

	}

	public void configure_Details() throws InterruptedException {

		

		// To take an image and configure for profile pic
		prflpage.click_On_ProfilePic_In_Profile();

		// To click on the allow option, on the media access pop-up
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();

		// To click on the cancel button of the profile photo dialog
		cmnelementpage.click_CancelButton_On_ScanDocument();

		// To take an image and configure for profile pic
		prflpage.click_On_ProfilePic_In_Profile();

		// To click on the first image from the list
		cmnelementpage.click_On_FirstImage_In_list_Of_Images_In_ScanDocument_Screen();

		// To click on the done button on the preview page
		cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();

		// To write on name field
		prflpage.write_on_Name_Field_In_Profile(Consumer_Name);

		// To click on the female radio button
		prflpage.click_On_Female_rb_In_Profile();

		// To give the input in date of birth field

		// To give an existing email value in the email field
		prflpage.wrtite_On_Email_In_Profile(extisting_EmailID_Value);

		// To click on the edit button on the Address field
		prflpage.click_editAddress_In_Profile();
		Thread.sleep(3000);

		// To configure the default address, for Profile address
		myadrsimpl.configure_Address();

		// To assert the default address in my profile screen
		String value_From_DefaultAddress_In_Profile1 = prflpage.read_DefaultAddress_In_Profile();
		String expected_Address_Result = "Unnamed Road, Unnamed Road, Bhubaneswar, Khordha Dist, Odisha, India  - 751003";
		String actual_Address_Result = value_From_DefaultAddress_In_Profile1;
		Assert.assertEquals(actual_Address_Result, expected_Address_Result, "Assertion passed");
		System.out.println("Default address in My profile got verified successfully: " + actual_Address_Result);
		andrdCmnUtil.implicit_Wait();

		// To click on the submit button
		prflpage.click_SubmitButton_In_Profile();

		// To assert the email pop-up validation Text
		String value_Form_Popup_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Popup_value = "This email Id is already registered in our system.";
		String actual_Popup_value = value_Form_Popup_Text;
		Assert.assertEquals(actual_Popup_value, expected_Popup_value);
		System.out.println(
				"Email id Popup validation text in My profile got verified successfully: " + actual_Popup_value);
		andrdCmnUtil.implicit_Wait();

		// To click on the Ok button on the popup
		cmnelementpage.clickOn_Ok_On_Popup();

		// To clear the email field and to configure new value
		cmnelementpage.clear_Values_From_EmailID_Field();

		// To give new and valid input in email id field
		prflpage.wrtite_On_Email_In_Profile(new_Emaild_Value);

		// To click on the submit button
		prflpage.click_SubmitButton_In_Profile();

		// To assert the success pop-up Text
		String value_Form_Success_Popup_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Success_Popup_value = "Your profile has been updated";
		String actual_Success_Popup_value = value_Form_Success_Popup_Text;
		Assert.assertEquals(actual_Success_Popup_value, expected_Success_Popup_value);
		System.out.println("Success popup text in My profile got verified successfully: " + actual_Success_Popup_value);
		andrdCmnUtil.implicit_Wait();

		// To click on the Ok button on the popup
		cmnelementpage.clickOn_Ok_On_Popup();

		// To click on the My profile menu
		andrdCmnUtil.scrollAndClick("My Profile");

		// To assert the name field
		String value_From_NameField = prflpage.read_From_Name_In_Profile();
		String expected_Name_Result = Consumer_Name;
		String actual_Name_Result = value_From_NameField;
		Assert.assertEquals(actual_Name_Result, expected_Name_Result);
		System.out.println("Name value in My profile got verified successfully: " + actual_Name_Result);
		andrdCmnUtil.implicit_Wait();

		// To assert the email id field value
		String value_From_EmailIDField = prflpage.read_From_Email_In_Profile();
		String expected_EmailID_Result = new_Emaild_Value;
		String actual_EmailID_Result = value_From_EmailIDField;
		Assert.assertEquals(actual_EmailID_Result, expected_EmailID_Result);
		System.out.println("EmailID value in My profile got verified successfully: " + actual_EmailID_Result);
		andrdCmnUtil.implicit_Wait();

	}

	public void change_MobileNumber() throws Exception {
		

		// To assert the gender field whether its male or female
		boolean value_From_FemaleRadioButton_In_Profile = prflpage.check_For_FemaleRadioButton_In_Profile();
		if (value_From_FemaleRadioButton_In_Profile == true) {
			System.out.println("Gender selected as female" + value_From_FemaleRadioButton_In_Profile);

			// To click on the mobile number edit button
			prflpage.click_editMobileNo_In_Profile();

			// To assert the change mobile number text in change mobile number screen
			String value_From_ChangeMobileNumberText = prflpage.read_From_ChangeMobileNumber_EmailID_Text();
			String expected_Result_In_ChangeMobileNumberScreen = "Change Mobile Number";
			String actual_Result_In_ChangeMobileNumberScreen = value_From_ChangeMobileNumberText;
			Assert.assertEquals(actual_Result_In_ChangeMobileNumberScreen, expected_Result_In_ChangeMobileNumberScreen);
			System.out.println("change mobile number text in change mobile number screen got verified successfully: "
					+ actual_Result_In_ChangeMobileNumberScreen);
			andrdCmnUtil.implicit_Wait();

			// To click on the RequestOTP button
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the validation for mobile number field (without giving any mobile
			// number/ less than 4 digits/more than 12 digits)
			String value_From_Validation1 = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
			String expected_Result_In_ChangeMobileNumberScreen1 = "Please enter valid Mobile Number";
			String actual_Result_In_ChangeMobileNumberScreen1 = value_From_Validation1;
			Assert.assertEquals(actual_Result_In_ChangeMobileNumberScreen1,
					expected_Result_In_ChangeMobileNumberScreen1);
			System.out
					.println("Mobile Number validation text in change mobile number screen got verified successfully: "
							+ actual_Result_In_ChangeMobileNumberScreen1);
			andrdCmnUtil.implicit_Wait();

			// To give partial mobile number less than 4 digits
			prflpage.write_On_MobileNoField_In_ChangeMobileno_Screen(partial_Mobile_Number);

			// To click on the RequestOTP button
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the validation for mobile number field (without giving any mobile
			// number/ less than 4 digits/more than 12 digits)
			String value_From_Validation2 = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
			String expected_Result_In_ChangeMobileNumberScreen2 = "Mobile number should be between 4 & 12 digits";
			String actual_Result_In_ChangeMobileNumberScreen2 = value_From_Validation2;
			Assert.assertEquals(actual_Result_In_ChangeMobileNumberScreen2,
					expected_Result_In_ChangeMobileNumberScreen2);
			System.out
					.println("Mobile Number validation text in change mobile number screen got verified successfully: "
							+ actual_Result_In_ChangeMobileNumberScreen2);
			andrdCmnUtil.implicit_Wait();

			// To clear the value from mobile number field
			cmnelementpage.clear_Values_From_MobileNo_Field();

			// To give partial mobile number less than 4 digits
			prflpage.write_On_MobileNoField_In_ChangeMobileno_Screen(mobile_Number_More_Than_Tweleve_Digits);

			// To click on the RequestOTP button
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the validation for mobile number field (without giving any mobile
			// number/ less than 4 digits/more than 12 digits)
			String value_From_Validation3 = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
			String expected_Result_In_ChangeMobileNumberScreen3 = "Mobile number should be between 4 & 12 digits";
			String actual_Result_In_ChangeMobileNumberScreen3 = value_From_Validation3;
			Assert.assertEquals(actual_Result_In_ChangeMobileNumberScreen3,
					expected_Result_In_ChangeMobileNumberScreen3);
			System.out
					.println("Mobile Number validation text in change mobile number screen got verified successfully: "
							+ actual_Result_In_ChangeMobileNumberScreen3);
			andrdCmnUtil.implicit_Wait();

			// To clear the value from mobile number field
			cmnelementpage.clear_Values_From_MobileNo_Field();

			// To give partial mobile number less than 4 digits
			prflpage.write_On_MobileNoField_In_ChangeMobileno_Screen(existing_Mobile_Number);

			// To click on the RequestOTP button
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the popup validation text
			String value_From_ValidationPopup_Text = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Result_In_ChangeMobileNumberScreen4 = "This mobile number is already registered in our system.";
			String actual_Result_In_ChangeMobileNumberScreen4 = value_From_ValidationPopup_Text;
			Assert.assertEquals(actual_Result_In_ChangeMobileNumberScreen4,
					expected_Result_In_ChangeMobileNumberScreen4);
			System.out.println(
					"Mobile Number validation pop-up text in change mobile number screen got verified successfully: "
							+ actual_Result_In_ChangeMobileNumberScreen4);
			andrdCmnUtil.implicit_Wait();

			// To click on the Okay button on the Pop-up
			cmnelementpage.clickOn_Ok_On_Popup();

			// To clear the value from mobile number field
			cmnelementpage.clear_Values_From_MobileNo_Field();

			// To give partial mobile number less than 4 digits
			prflpage.write_On_MobileNoField_In_ChangeMobileno_Screen(consumerMobileNumber);

			// To click on the RequestOTP button
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the popup validation text
			String value_From_ValidationPopup_Text1 = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
			String expected_Result_In_ChangeMobileNumberScreen5 = "New mobile number is same as previous mobile number";
			String actual_Result_In_ChangeMobileNumberScreen5 = value_From_ValidationPopup_Text1;
			Assert.assertEquals(actual_Result_In_ChangeMobileNumberScreen5,
					expected_Result_In_ChangeMobileNumberScreen5);
			System.out
					.println("Mobile Number validation text in change mobile number screen got verified successfully: "
							+ actual_Result_In_ChangeMobileNumberScreen5);
			andrdCmnUtil.implicit_Wait();

			// To clear the value from mobile number field
			cmnelementpage.clear_Values_From_MobileNo_Field();

			// To give partial mobile number less than 4 digits
			prflpage.write_On_MobileNoField_In_ChangeMobileno_Screen(new_Mobile_Number);

			// To click on the RequestOTP button
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To click on the ok button
			cmnelementpage.clickOn_Ok_On_Popup();

			Thread.sleep(2000);
			// fetchedOTP = HttpRequest.getOTPByApi(new_Mobile_Number, application_type);
			// System.out.println("The OTP fetched from API for New Mobile Number is :
			// "+fetchedOTP);

			// To assert the text Please enter the OTP sent to <mobile no> in change mobile
			// no screen
			String countryCode = cmnelementpage.read_From_countryCode_In_Profile();
			String value_Form_ChangeMobileNUmberScreen = prflpage.read_From_EnterTheOTP_Text();
			String expected_Result_In_VerifyOTPScreen1 = "Please enter the OTP Sent to " + countryCode + " "
					+ new_Mobile_Number;
			String actual_Result_In_VerifyOTPScreen1 = value_Form_ChangeMobileNUmberScreen;
			Assert.assertEquals(actual_Result_In_VerifyOTPScreen1, expected_Result_In_VerifyOTPScreen1);
			System.out.println("OTP sent to text in change mobile number screen got verified successfully: "
					+ actual_Result_In_VerifyOTPScreen1);
			andrdCmnUtil.implicit_Wait();

			// To assert the mobile number in mobile number field, in verify OTP screen
			String value_From_mobileNoField_In_VerifyOTP_Screen = prflpage
					.read_From_mobileNoField_In_VerifyOTP_Screen();
			String expected_Result_In_VerifyOTPScreen = new_Mobile_Number;
			String actual_Result_In_VerifyOTPScreen = value_From_mobileNoField_In_VerifyOTP_Screen;
			Assert.assertEquals(actual_Result_In_VerifyOTPScreen, expected_Result_In_VerifyOTPScreen);
			System.out.println("Mobile number in verify mobile number screen got verified successfully: "
					+ actual_Result_In_VerifyOTPScreen);
			andrdCmnUtil.implicit_Wait();

			// To click on Verify OTP
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the error field validation Text
			String valueFromValidationMessage2 = cmnelementpage.read_From_EnterValidOTP_Validation_Text();
			String expected_Result_In_VerifyOTPScreen3 = "You need to enter a valid OTP to proceed";
			String actual_Result_In_VerifyOTPScreen3 = valueFromValidationMessage2;
			Assert.assertEquals(actual_Result_In_VerifyOTPScreen3, expected_Result_In_VerifyOTPScreen3);
			System.out.println("Error validation Text in verify mobile number screen got verified successfully: "
					+ actual_Result_In_VerifyOTPScreen3);
			andrdCmnUtil.implicit_Wait();

			// To give the partial OTP, in the OTP field
			cmnelementpage.clickOn_OTPBOX();
			andrdCmnUtil.Write_On_Keypad("123");
			andrdCmnUtil.Hide_Keyboard();

			// To click on Request OTP
			prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

			// To assert the error field validation Text
			String valueFromValidationMessage1 = cmnelementpage.read_From_EnterValidOTP_Validation_Text();
			String expected_Result_In_VerifyOTPScreen2 = "OTP field should have 6 digits";
			String actual_Result_In_VerifyOTPScreen2 = valueFromValidationMessage1;
			Assert.assertEquals(actual_Result_In_VerifyOTPScreen2, expected_Result_In_VerifyOTPScreen2);
			System.out.println("Error validation Text in verify mobile number screen got verified successfully: "
					+ actual_Result_In_VerifyOTPScreen2);
			andrdCmnUtil.implicit_Wait();

			// To clear the Written OTP from the OTP field
			andrdCmnUtil.deletingDataFromEditBoxUsingKeyboardKey(3);
			Thread.sleep(3000);

			// To give the OTP, in the OTP field
			cmnelementpage.clickOn_OTPBOX();
			andrdCmnUtil.Write_On_Keypad("123455");
			andrdCmnUtil.Hide_Keyboard();
			Thread.sleep(4000);

			// To assert the validation message from the popup
			String validationFromPopup = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Result_In_VerifyOTPScreen5 = "Invalid OTP, please try again.";
			String actual_Result_In_VerifyOTPScreen5 = validationFromPopup;
			Assert.assertEquals(actual_Result_In_VerifyOTPScreen5, expected_Result_In_VerifyOTPScreen5);
			System.out.println("Error validation pop-up Text in verify mobile number screen got verified successfully: "
					+ actual_Result_In_VerifyOTPScreen5);
			andrdCmnUtil.implicit_Wait();

			// To click on the ok button
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(3000);

			// To clear the Written OTP from the OTP field
			cmnelementpage.clickOn_OTPBOX();
			andrdCmnUtil.deletingDataFromEditBoxUsingKeyboardKey(6);
			Thread.sleep(1000);

			// To give the OTP, in the OTP field
			cmnelementpage.clickOn_OTPBOX();
			andrdCmnUtil.Write_On_Keypad("123456");
			andrdCmnUtil.Hide_Keyboard();
			Thread.sleep(4000);

			// To assert the success message text from the popup
			String value_From_Success_Popup = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Result_In_VerifyOTPScreen4 = "Mobile number updated successfully";
			String actual_Result_In_VerifyOTPScreen4 = value_From_Success_Popup;
			Assert.assertEquals(actual_Result_In_VerifyOTPScreen4, expected_Result_In_VerifyOTPScreen4);
			System.out.println("Success popup Text in verify mobile number screen got verified successfully: "
					+ actual_Result_In_VerifyOTPScreen4);
			andrdCmnUtil.implicit_Wait();

			// To click on the ok button
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(4000);

			System.out.println("Logout performed successfully");

			// To click the country selector and selecting the India country code
			businesscls.select_for_countryCode(country_Flag);
			Thread.sleep(2000);

			// To write the old consumer number and to check whether its showing Signup flow
			// for it or not!
			loginpage.write_on_mobileNumberEditBox(consumerMobileNumber);
			loginpage.click_GetOTP_Button();

			// To assert the sign up screen for the old mobile number
			String Value_From_SignUp_Page = loginpage.check_Value_From_SignUp_LogIn_Page();
			String expectedResult_In_Signup = "Let's Get Started";
			String actualResult_In_Signup = Value_From_SignUp_Page;
			Assert.assertEquals(actualResult_In_Signup, expectedResult_In_Signup);
			System.out.println("Signup page has verified successfully," + actualResult_In_Signup);
			andrdCmnUtil.implicit_Wait();

			// To assert the text under the let's get started text, with the old mobile
			// number
			countryCode = loginpage.read_Value_From_CountryCode();
			String countryCode_with_MobileNumber = loginpage.read_Value_From_CountryCode_With_MobileNumber();
			String expectedResult_For_OldUser = "Please enter the OTP Sent to " + countryCode + " "
					+ consumerMobileNumber;
			String actualResult_For_OldUser = driver.findElement(By.id("forgot_pswd_tv2")).getText() + " "
					+ countryCode_with_MobileNumber;
			Assert.assertEquals(actualResult_For_OldUser, expectedResult_For_OldUser);
			System.out.println("Old mobile number details verified successfully: ," + actualResult_For_OldUser);
			andrdCmnUtil.implicit_Wait();

			// To click on the device back button
			andrdCmnUtil.Click_DeviceBackButton();

			// To clear the mobile number field
			cmnelementpage.clear_Values_From_Login_Mobileno_Field();

			// To give the new configured mobile number and check the details
			loginpage.write_on_mobileNumberEditBox(new_Mobile_Number);
			loginpage.click_GetOTP_Button();

			// To assert the login screen, for the existing user with the new mobile number
			String Value_From_SignUp_LogIn_Page = loginpage.check_Value_From_SignUp_LogIn_Page();
			String expectedResult_In_LogIn = "Welcome Back," + "\n" + Consumer_Name;
			String actualResult_In_LogIn = Value_From_SignUp_LogIn_Page;
			Assert.assertEquals(actualResult_In_LogIn, expectedResult_In_LogIn, "Assertion passed");
			System.out.println("Login Page has been verified successfully for the existing user with his name:,"
					+ actualResult_In_LogIn);
			andrdCmnUtil.implicit_Wait();

			// To assert the text under the Welcome back text, with the mobile number
			countryCode = loginpage.read_Value_From_CountryCode();
			countryCode_with_MobileNumber = loginpage.read_Value_From_CountryCode_With_MobileNumber();
			String expectedResult_For_RegUser = "Please enter the OTP Sent to " + countryCode + " " + new_Mobile_Number;
			String actualResult_For_RegUser = driver.findElement(By.id("forgot_pswd_tv2")).getText() + " "
					+ countryCode_with_MobileNumber;
			Assert.assertEquals(actualResult_For_RegUser, expectedResult_For_RegUser, "Assertion passed");
			System.out.println(
					"Registered user verified successfully with his new mobile number: ," + actualResult_For_RegUser);
			andrdCmnUtil.implicit_Wait();

			// To give the OTP in the OTP field
			cmnelementpage.clickOn_OTPBOX();
			andrdCmnUtil.Write_On_Keypad("123456");
			andrdCmnUtil.Hide_Keyboard();
			Thread.sleep(4000);

			// Click on the login Button
			loginpage.clickOn_LogIn_Signup();

			// Click on more menu
			cmnelementpage.clickOn_More_Option();
			andrdCmnUtil.scrollAndClick("My Profile");

			// To assert the new configured mobile number in mobile number field
			String value_From_MobileNo = prflpage.read_From_mobileno_In_Profile();
			String expected_MobileNo_Result = new_Mobile_Number;
			String actual_MobileNo_Result = value_From_MobileNo;
			Assert.assertEquals(actual_MobileNo_Result, expected_MobileNo_Result);
			System.out.println("New configured Mobile number field value in My profile got verified successfully: "
					+ actual_MobileNo_Result);
			andrdCmnUtil.implicit_Wait();

			System.out.println("Change mobile number flow is working properly");
		} else {
			System.out.println("Gender is not selected as female, hence its breaking.");
		}
		
		// To click on the back button and go to more menu
		andrdCmnUtil.Click_DeviceBackButton();

	}

	/*public void change_EmaiID() throws Exception {

		

		// To click on the emailID edit button
		prflpage.click_EditButton_On_EmailID_Field();

		// To assert the change EmailID text in change EmailID screen
		String value_From_ChangeEmailIDText = prflpage.read_From_ChangeMobileNumber_EmailID_Text();
		String expected_Result_In_ChangeEmailIDScreen = "Change Email ID";
		String actual_Result_In_ChangeEmailIDScreen = value_From_ChangeEmailIDText;
		Assert.assertEquals(actual_Result_In_ChangeEmailIDScreen, expected_Result_In_ChangeEmailIDScreen);
		System.out.println("change EmailID text in change EmailID screen got verified successfully: "
				+ actual_Result_In_ChangeEmailIDScreen);
		andrdCmnUtil.implicit_Wait();

		// To click on the RequestOTP button
		prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

		// To assert the validation for EmailID field (without giving any emailID)
		String value_From_EmailValidation1 = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
		String expected_Result_In_ChangeEmailIDScreen1 = "Please enter your new Email ID";
		String actual_Result_In_ChangeEmailIDScreen1 = value_From_EmailValidation1;
		Assert.assertEquals(actual_Result_In_ChangeEmailIDScreen1, expected_Result_In_ChangeEmailIDScreen1);
		System.out.println("EmailID validation text in change EmailID screen got verified successfully: "
				+ actual_Result_In_ChangeEmailIDScreen1);
		andrdCmnUtil.implicit_Wait();

		// To click on the close icon on the change Emailid screen
		prflpage.click_On_CloseButton_In_ChangeMobileno_EmaildID();
		Thread.sleep(2000);

		// To click on the emailID edit button
		prflpage.click_EditButton_On_EmailID_Field();

		// To configure invalid email id
		prflpage.write_On_ChangeEmailID_Field(invalid_EmailID);

		// To click on the RequestOTP button
		prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

		// To assert the validation for EmailID field (By giving invalid emailID)
		String value_From_EmailValidation2 = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
		String expected_Result_In_ChangeEmailIDScreen2 = "Email entered in an incorrect format";
		String actual_Result_In_ChangeEmailIDScreen2 = value_From_EmailValidation2;
		Assert.assertEquals(actual_Result_In_ChangeEmailIDScreen2, expected_Result_In_ChangeEmailIDScreen2);
		System.out.println("EmailID validation text in change EmailID screen got verified successfully: "
				+ actual_Result_In_ChangeEmailIDScreen2);
		andrdCmnUtil.implicit_Wait();

		// To clear the input value from emailid field
		cmnelementpage.clear_Values_From_changeEmail_Field();

		// To configure existing email id
		prflpage.write_On_ChangeEmailID_Field(extisting_EmailID_Value);

		// To click on the RequestOTP button
		prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

		// To assert the validation text from popup message
		String valueFromEmailVAlidationPopup = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_In_ChangeEmailIDScreen3 = "This email Id is already registered in our system.";
		String actual_Result_In_ChangeEmailIDScreen3 = valueFromEmailVAlidationPopup;
		Assert.assertEquals(actual_Result_In_ChangeEmailIDScreen3, expected_Result_In_ChangeEmailIDScreen3);
		System.out.println("EmailID validation text from pop-up in change EmailID screen got verified successfully: "
				+ actual_Result_In_ChangeEmailIDScreen3);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To clear the input value from emailid field
		cmnelementpage.clear_Values_From_changeEmail_Field();

		// To give new emailID and update the email id
		prflpage.write_On_ChangeEmailID_Field(update_EmailID);

		// To click on the RequestOTP button
		prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

		// To assert the success text from popup message
		String valueFromEmailSuccessPopup = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_In_ChangeEmailIDScreen4 = "You will receive your OTP shortly.";
		String actual_Result_In_ChangeEmailIDScreen4 = valueFromEmailSuccessPopup;
		Assert.assertEquals(actual_Result_In_ChangeEmailIDScreen4, expected_Result_In_ChangeEmailIDScreen4);
		System.out.println("EmailID success text from pop-up in change EmailID screen got verified successfully: "
				+ actual_Result_In_ChangeEmailIDScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To assert the text Please enter the OTP sent to <emailID> in change EmailID
		// screen
		String value_Form_ChangeEmailIDScreen = prflpage.read_From_EnterTheOTP_Text();
		String expected_Result_In_VerifyOTPScreen1 = "Please enter the OTP Sent to " + update_EmailID;
		String actual_Result_In_VerifyOTPScreen1 = value_Form_ChangeEmailIDScreen;
		Assert.assertEquals(actual_Result_In_VerifyOTPScreen1, expected_Result_In_VerifyOTPScreen1);
		System.out.println("OTP sent to text in change EmailID screen got verified successfully: "
				+ actual_Result_In_VerifyOTPScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the updated emaild ID configured
		String value_From_EmailID_In_ChangeEmailID_Screen = prflpage.read_From_ChangeEmailID_Screen();
		String expected_Result_In_VerifyOTPScreen2 = update_EmailID;
		String actual_Result_In_VerifyOTPScreen2 = value_From_EmailID_In_ChangeEmailID_Screen;
		Assert.assertEquals(actual_Result_In_VerifyOTPScreen2, expected_Result_In_VerifyOTPScreen2);
		System.out.println("Updated emaildID in change EmailID screen got verified successfully: "
				+ actual_Result_In_VerifyOTPScreen2);
		andrdCmnUtil.implicit_Wait();

		// To click on Verify OTP
		prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

		// To assert the error field validation Text
		String valueFromValidationMessage2 = cmnelementpage.read_From_EnterValidOTP_Validation_Text();
		String expected_Result_In_VerifyOTPScreen3 = "You need to enter a valid OTP to proceed";
		String actual_Result_In_VerifyOTPScreen3 = valueFromValidationMessage2;
		Assert.assertEquals(actual_Result_In_VerifyOTPScreen3, expected_Result_In_VerifyOTPScreen3);
		System.out.println("Error validation Text in verify EmailID screen got verified successfully: "
				+ actual_Result_In_VerifyOTPScreen3);
		andrdCmnUtil.implicit_Wait();

		// To give the partial OTP, in the OTP field
		cmnelementpage.clickOn_OTPBOX();
		andrdCmnUtil.Write_On_Keypad("123");
		andrdCmnUtil.Hide_Keyboard();

		// To click on Request OTP
		prflpage.click_On_RequestOTP_In_ChangeMobileno_EmaildID();

		// To assert the error field validation Text
		String valueFromValidationMessage1 = cmnelementpage.read_From_EnterValidOTP_Validation_Text();
		String expected_Result_In_VerifyOTPScreen4 = "OTP field should have 6 digits";
		String actual_Result_In_VerifyOTPScreen4 = valueFromValidationMessage1;
		Assert.assertEquals(actual_Result_In_VerifyOTPScreen4, expected_Result_In_VerifyOTPScreen4);
		System.out.println("Error validation Text in verify EmailID screen got verified successfully: "
				+ actual_Result_In_VerifyOTPScreen4);
		andrdCmnUtil.implicit_Wait();

		// To clear the Written OTP from the OTP field
		andrdCmnUtil.deletingDataFromEditBoxUsingKeyboardKey(3);
		Thread.sleep(1000);

		// To give the OTP, in the OTP field
		cmnelementpage.clickOn_OTPBOX();
		andrdCmnUtil.Write_On_Keypad("123456");
		andrdCmnUtil.Hide_Keyboard();
		Thread.sleep(4000);

		// To assert the validation message from the popup
		String validationFromPopup = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_In_VerifyOTPScreen5 = "Invalid OTP, please try again.";
		String actual_Result_In_VerifyOTPScreen5 = validationFromPopup;
		Assert.assertEquals(actual_Result_In_VerifyOTPScreen5, expected_Result_In_VerifyOTPScreen5);
		System.out.println("Error validation pop-up Text in verify EmailID screen got verified successfully: "
				+ actual_Result_In_VerifyOTPScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To clear the Written OTP from the OTP field
		cmnelementpage.clickOn_OTPBOX();
		andrdCmnUtil.deletingDataFromEditBoxUsingKeyboardKey(6);
		Thread.sleep(1000);

		// // To give the OTP, in the OTP field
		// cmnelementpage.clickOn_OTPBOX();
		// andrdCmnUtil.Write_On_Keypad("123456");
		// andrdCmnUtil.Hide_Keyboard();
		// Thread.sleep(4000);

		fetchedOTP = HttpRequest.getOTPByApi(update_EmailID, application_type);
		System.out.println("The OTP fetched from API for New EmailID is :" + fetchedOTP);

		// To assert the success message text from the popup
		String value_From_Success_Popup = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_In_VerifyOTPScreen6 = "Email ID updated successfully";
		String actual_Result_In_VerifyOTPScreen6 = value_From_Success_Popup;
		Assert.assertEquals(actual_Result_In_VerifyOTPScreen6, expected_Result_In_VerifyOTPScreen6);
		System.out.println("Success popup Text in verify EmailID screen got verified successfully: "
				+ actual_Result_In_VerifyOTPScreen6);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To assert the updated EmailID in My profile
		String valueFromEmailIDInMyProfile = prflpage.read_From_Email_In_Profile();
		String expected_Result_In_Myprofile = update_EmailID;
		String actual_Result_In_Myprofile = valueFromEmailIDInMyProfile;
		Assert.assertEquals(actual_Result_In_Myprofile, expected_Result_In_Myprofile);
		System.out.println("Updated Email ID got verified successfully: " + actual_Result_In_Myprofile);
		andrdCmnUtil.implicit_Wait();

		// Click on submit in myprofile
		prflpage.click_SubmitButton_In_Profile();

		// To click on the ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		System.out.println("All the testcases are running fine, and the after clicking on the ok button for the sucess message in my profile, it will redirect to menu screen");

	}*/

}
