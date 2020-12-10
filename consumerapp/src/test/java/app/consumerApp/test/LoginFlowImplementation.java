package app.consumerApp.test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import app.appium.BusinessLibrary.BusinessClass;
import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.LoginPage;

public class LoginFlowImplementation extends DriverIgnit {

	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	LoginPage loginpage;
	BusinessClass businesscls = new BusinessClass();
	CommonElementPage cmnelementpage;
	ExcelLibrary excelLib;

	String consumerMobileNumber;
	String countryCode;
	String countryCode_with_MobileNumber;
	String country_Flag;
	String invalid_Password;
	String valid_Old_Password;
	String partial_Password;
	String new_Password;
	String Mobile_Number_Less_Than_Four_Digits;
	String Mobile_Number_More_Than_Twelve_Digits;
	String Value_From_MobileNumber_Field;
	String country_Flag_For_Dubai;
	String referral_Code;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		loginpage = new LoginPage(driver);
		businesscls = new BusinessClass();
		excelLib = new ExcelLibrary();
		cmnelementpage = new CommonElementPage(driver);
		Thread.sleep(3000);
		consumerMobileNumber = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 1, 1);
		country_Flag = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 2, 1);
		invalid_Password = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 4, 1);
		valid_Old_Password = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 5, 1);
		partial_Password = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 6, 1);
		new_Password = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 7, 1);
		Mobile_Number_Less_Than_Four_Digits = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 8, 1);
		Mobile_Number_More_Than_Twelve_Digits = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 9, 1);
		country_Flag_For_Dubai =  ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 10, 1); 
		referral_Code = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 11, 1); 
		System.out.println("The mobile number of the consumer is: " + consumerMobileNumber);
		System.out.println("The Country Flag selected is: " + country_Flag);
		System.out.println("The given invalid password is: " + invalid_Password);
		System.out.println("The given valid Old Password is: " + valid_Old_Password);
		System.out.println("The given partial Password is: " + partial_Password);
		System.out.println("The given new Password is: " + new_Password);
		System.out.println("The given Mobile Number Less Than Four Digits is: " + Mobile_Number_Less_Than_Four_Digits);
		System.out.println(
				"The given Mobile Number More Than Twelve Digits is: " + Mobile_Number_More_Than_Twelve_Digits);
	}

	public void signupPossitiveFlow() throws InterruptedException {

		// To enable the notification toggle, in the pop-up
		// businesscls.enable_Toggle();
		System.out.println("The mentioned method is running:"+ "signupPossitiveFlow");
		// To assert the landing page
		String expectedTitle = "PERSONALIZED" + "\n" + "DX CARD";
		String actualTitle = driver.findElement(By.id("tv1")).getText();
		Assert.assertEquals(actualTitle, expectedTitle, "Assertion Passed");
		System.out.println("Landing page text verified successfully," + actualTitle);
		andrdCmnUtil.implicit_Wait();

		// To click the country selector and selecting the India country code, using
		// page-factory
		businesscls.select_for_countryCode(country_Flag);

		// To assert the country code field, after selecting country value
		String expected_Country_code = "+91";
		String actual_Country_code = driver.findElement(By.id("country_mobile_code_tv")).getText();
		Assert.assertEquals(actual_Country_code, expected_Country_code, "Assertion Passed");
		System.out.println("Country code asserted successfully," + actual_Country_code);
		andrdCmnUtil.implicit_Wait();

		// To check the validation for mobile number field, without giving any mobile
		// number
		loginpage.click_GetOTP_Button();
		andrdCmnUtil.implicit_Wait();

		// To assert the validation pop-up text message (not giving any mobile number)
		String expected_Validation_Message_For_Mobileno = "Please enter valid Mobile Number";
		String actual_Validation_Message_For_Mobileno = driver.findElement(By.id("alert_message")).getText();
		Assert.assertEquals(actual_Validation_Message_For_Mobileno, expected_Validation_Message_For_Mobileno,
				"Assertion Passed");
		System.out.println("Mobile number field with no input has been verified successfully, "
				+ actual_Validation_Message_For_Mobileno);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button of the validation message
		loginpage.click_OK_On_Validation_Popup();
		andrdCmnUtil.implicit_Wait();

		// To give mobile number less than 4 digits and check the validation
		loginpage.write_on_mobileNumberEditBox(Mobile_Number_Less_Than_Four_Digits);
		andrdCmnUtil.implicit_Wait();

		// To check the validation for mobile number field, By giving less than 4 digit
		// mobile number
		loginpage.click_GetOTP_Button();
		andrdCmnUtil.implicit_Wait();

		// To assert the validation pop-up text message (By giving any mobile number
		// less than 4 digits)
		String expected_Validation2_Message_For_Mobileno = "Mobile number should be between 4 & 12 digits";
		String actual_Validation2_Message_For_Mobileno = driver.findElement(By.id("alert_message")).getText();
		Assert.assertEquals(actual_Validation2_Message_For_Mobileno, expected_Validation2_Message_For_Mobileno,
				"Assertion Passed");
		System.out.println("Mobile number field with input less than 4 digits, has been verified successfully, "
				+ actual_Validation2_Message_For_Mobileno);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button of the validation message
		loginpage.click_OK_On_Validation_Popup();
		andrdCmnUtil.implicit_Wait();

		// To give mobile number than 12 digits and check the validation
		loginpage.write_on_mobileNumberEditBox(Mobile_Number_More_Than_Twelve_Digits);
		andrdCmnUtil.implicit_Wait();

		// To check the validation for mobile number field, By giving more than 12 digit
		// mobile number
		loginpage.click_GetOTP_Button();
		andrdCmnUtil.implicit_Wait();

		// To assert the validation pop-up text message (By giving any mobile number
		// more than 12 digits)
		String expected_Validation3_Message_For_Mobileno = "Mobile number should be between 4 & 12 digits";
		String actual_Validation3_Message_For_Mobileno = driver.findElement(By.id("alert_message")).getText();
		Assert.assertEquals(actual_Validation3_Message_For_Mobileno, expected_Validation3_Message_For_Mobileno,
				"Assertion Passed");
		System.out.println("Mobile number field with input more than 12 digits, has been verified successfully, "
				+ actual_Validation3_Message_For_Mobileno);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button of the validation message
		loginpage.click_OK_On_Validation_Popup();
		andrdCmnUtil.implicit_Wait();

		// To give the valid/proper mobile number in the mobile number field, using
		// page-factory
		loginpage.write_on_mobileNumberEditBox(consumerMobileNumber);

		// To click on the Get OTP button using page_fctory
		loginpage.click_GetOTP_Button();
		System.out.println("Selecting country,giving the mobile number and clicking on get OTP successfully");
		Thread.sleep(6000);

		// To check the back Traversal from OTP screen to landing screen
		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(4000);
		andrdCmnUtil.implicit_Wait();

		// To assert the country code that has configured with the number, Before the
		// back Traversal
		countryCode = loginpage.read_Value_From_CountryCode();
		String expectedResult_After_BackTraversal = countryCode;
		String actualResult_After_BackTraversal = driver.findElement(By.id("country_mobile_code_tv")).getText();
		Assert.assertEquals(actualResult_After_BackTraversal, expectedResult_After_BackTraversal, "Assertion passed");
		System.out.println(
				"country code that has configured with the number, Before the back Traversalverified successfully: ,"
						+ actualResult_After_BackTraversal);
		andrdCmnUtil.implicit_Wait();

		// To assert the mobile number that has configured, Before the back Traversal
		Value_From_MobileNumber_Field = loginpage.check_value_From_MobileNumber_Field();
		String expected_Mobileno_After_BackTraversal = consumerMobileNumber;
		String actual_Mobileno_After_BackTraversal = Value_From_MobileNumber_Field;
		Assert.assertEquals(actual_Mobileno_After_BackTraversal, expected_Mobileno_After_BackTraversal,
				"Assertion passed");
		System.out.println("mobile number that has configured, Before the back Traversal verified successfully: ,"
				+ actual_Mobileno_After_BackTraversal);
		andrdCmnUtil.implicit_Wait();

		// To give the valid/proper mobile number in the mobile number field, using
		// page-factory
		loginpage.write_on_mobileNumberEditBox(consumerMobileNumber);

		// To click on the Get OTP button using page_fctory
		loginpage.click_GetOTP_Button();
		System.out.println("Selecting country,giving the mobile number and clicking on get OTP successfully");
		Thread.sleep(4000);

		// To assert the sign up screen
		String expectedResult_In_Signup = "Let's Get Started";
		String actualResult_In_Signup = driver.findElement(By.id("greeting_tv")).getText();
		Assert.assertEquals(actualResult_In_Signup, expectedResult_In_Signup, "Assertion passed");
		System.out.println("Signup page has verified successfully," + actualResult_In_Signup);
		andrdCmnUtil.implicit_Wait();

		// To assert the text under the let's get started text, with the mobile number
		countryCode = loginpage.read_Value_From_CountryCode();
		countryCode_with_MobileNumber = loginpage.read_Value_From_CountryCode_With_MobileNumber();
		String expectedResult_For_NewUser = "Please enter the OTP Sent to " + countryCode + " " + consumerMobileNumber;
		String actualResult_For_NewUser = driver.findElement(By.id("forgot_pswd_tv2")).getText() + " "
				+ countryCode_with_MobileNumber;
		Assert.assertEquals(actualResult_For_NewUser, expectedResult_For_NewUser, "Assertion passed");
		System.out.println("New user verified successfully: ," + actualResult_For_NewUser);
		andrdCmnUtil.implicit_Wait();

		// To click on the Sign-up/login button, it will show the validation message for
		// no OTP,using page-factory
		loginpage.click_SignUp_Button();

		// To assert the Validation message when the otp has not been configured, and
		// clicked on signup
		String expectedResult = "You need to enter a valid OTP to proceed";
		String actualResult = driver.findElement(By.id("error_tv")).getText();
		Assert.assertEquals(actualResult, expectedResult, "Assertion passed");
		System.out.println("Validation message verified when the otp has not been configured, and clicked on signup,"
				+ actualResult);
		andrdCmnUtil.implicit_Wait();

		// To click on the Terms&Conditions and to come-back, using page-factory
		loginpage.click_Terms_conditions_option();
		Thread.sleep(4000);
		andrdCmnUtil.Click_DeviceBackButton();
		System.out.println("Verifying theTerms&Conditions successfully");

		// To click on the Privacy policy,using page-factory
		loginpage.click_Privacy_Policy_option();
		Thread.sleep(4000);
		andrdCmnUtil.Click_DeviceBackButton();
		System.out.println("Verifying Privacy policy successfully");

		/*
		 * //To give the OTP by typing from the number-pad
		 * driver.findElement(By.id("otp_et")).click(); Thread.sleep(4000);
		 * driver.getKeyboard().sendKeys("123455"); Thread.sleep(8000);
		 * driver.hideKeyboard(); Thread.sleep(4000);
		 * 
		 * //To click on the Sign-up/login button
		 * driver.findElement(By.id("send_bttn")).click(); Thread.sleep(10000);
		 * 
		 * //To click on the ok button of validation pop-up message
		 * driver.findElement(By.id("positive_btn")).click();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * 
		 * //To click on Resend otp driver.findElement(By.id("resend_bttn")).click();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElement(By.id("positive_btn")).click(); Thread.sleep(1000);
		 */

		/*
		 * //To give the OTP by typing from the number-pad
		 * driver.findElement(By.id("otp_et")).click(); Thread.sleep(4000);
		 * driver.getKeyboard().sendKeys("123456"); Thread.sleep(8000);
		 * driver.hideKeyboard(); Thread.sleep(4000);
		 */

		// To give the OTP by typing from the number-pad
		loginpage.clickOn_OTPBOX();
		andrdCmnUtil.Write_On_Keypad("123456");
		andrdCmnUtil.Hide_Keyboard();
		
		// To check the referral code placeholder in the signup screen
		String Value_From_Value_From_referralCode_SignUp_Page =loginpage.check_Value_From_Value_From_referralCode_SignUp_Page();
		String expectedResultForReferralField = "Referral code (Optional)";
		String actualResultForReferralField = Value_From_Value_From_referralCode_SignUp_Page;
		Assert.assertEquals(actualResultForReferralField, expectedResultForReferralField);
		System.out.println("Rferral code field label has verified successfully in signup screen:,"
				+ actualResultForReferralField);
		andrdCmnUtil.implicit_Wait();
		
		// To give the referral code in the field
		loginpage.write_On_referralCode_SignUp_Page(referral_Code);
		Thread.sleep(3000);

		// To click on the Sign-up/login button,using page-factory
		loginpage.click_SignUp_Button();
		System.out.println("Giving the correct OTP and doing the signup successfully");

		// //To assert the landing page, where the user will click on the "click on my
		// dx card" option
		// String expected= "How can we help you today?";
		// String actual= driver.findElement(By.id("home_page_label")).getText();
		// Assert.assertEquals(actual, expected,"Assertion passed");
		// System.out.println("Redirected to the Landing page successfully," + actual);
		// andrdCmnUtil.implicit_Wait();
		//

		// //To click on the Show my dx card option,using page-factory
		// cmnelementpage.clickOn_Show_MyDxcard_Field();
		// System.out.println("Clicking on My DX card option");
		// andrdCmnUtil.implicit_Wait();
		// Thread.sleep(2000);

		// To assert the Overview grid page
		String expectedResult_In_Grid = "OVERVIEW";
		String actualResult_In_Grid = driver.findElement(By.id("toolbar_title")).getText();
		Assert.assertEquals(actualResult_In_Grid, expectedResult_In_Grid, "Assertion passed");
		System.out.println("Verified the overview grid screen successfully," + actualResult_In_Grid);
		andrdCmnUtil.implicit_Wait();

		Thread.sleep(3000);
		// To click on the more option, using page-factory
		cmnelementpage.clickOn_More_Option();
		System.out.println("Clicking on More option");

		// To assert the the MENU screen, after clicking on the More option
		String expectedResult_In_Menu = "MENU";
		String actualResult_In_Menu = driver.findElement(By.id("toolbar_title")).getText();
		Assert.assertEquals(actualResult_In_Menu, expectedResult_In_Menu, "Assertion passed");
		System.out.println("Verified the MENU screen successfully," + actualResult_In_Menu);
		andrdCmnUtil.implicit_Wait();

		// To scroll down to the logout option, and
		andrdCmnUtil.scrollAndClick("Logout");
		cmnelementpage.clickOn_Ok_On_Popup();
		Thread.sleep(8000);
		System.out.println("Doing the logout successfully");

	}

	public void login_Password_Set() throws InterruptedException {

		// To click the country selector and selecting the India country code
		//businesscls.enable_Toggle();
		Thread.sleep(4000);
		System.out.println("The mentioned method is running:"+ "login_Password_Set");
		Thread.sleep(4000);
		businesscls.select_for_countryCode(country_Flag);
		Thread.sleep(2000);

		// To assert the country code field, after selecting country value
		String expected_Country_code = "+91";
		String actual_Country_code = driver.findElement(By.id("country_mobile_code_tv")).getText();
		Assert.assertEquals(actual_Country_code, expected_Country_code, "Assertion Passed");
		System.out.println("Country code asserted successfully,and the value is: ," + actual_Country_code);
		andrdCmnUtil.implicit_Wait();

		// To give the mobile number in the mobile number field
		loginpage.write_on_mobileNumberEditBox(consumerMobileNumber);
		Thread.sleep(2000);

		// To click on the Get OTP button
		loginpage.click_GetOTP_Button();
		System.out.println(
				"Selecting country,giving the mobile number with which signup has done and clicking on get OTP successfully");

		// To assert the login screen
		String expectedResult_In_LogIn = "Welcome Back";
		String actualResult_In_LogIn = driver.findElement(By.id("greeting_tv")).getText();
		Assert.assertEquals(actualResult_In_LogIn, expectedResult_In_LogIn, "Assertion passed");
		System.out.println("Login Page has been verified successfully," + actualResult_In_LogIn);
		andrdCmnUtil.implicit_Wait();

		// To assert the text under the Welcome back text, with the mobile number
		countryCode = loginpage.read_Value_From_CountryCode();
		countryCode_with_MobileNumber = loginpage.read_Value_From_CountryCode_With_MobileNumber();
		String expectedResult_For_RegUser = "Please enter the OTP Sent to " + countryCode + " " + consumerMobileNumber;
		String actualResult_For_RegUser = driver.findElement(By.id("forgot_pswd_tv2")).getText() + " "
				+ countryCode_with_MobileNumber;
		Assert.assertEquals(actualResult_For_RegUser, expectedResult_For_RegUser, "Assertion passed");
		System.out.println("Registered user verified successfully: ," + actualResult_For_RegUser);
		andrdCmnUtil.implicit_Wait();

		// To click on the login button
		loginpage.clickOn_LogIn_Signup();

		// To assert the validation message, without giving any otp
		String expectedResult = "You need to enter a valid OTP to proceed";
		String actulaResult = driver.findElement(By.id("error_tv")).getText();
		Assert.assertEquals(actulaResult, expectedResult, "Assertion passed");
		System.out.println("Validation verified successfully," + actulaResult);
		andrdCmnUtil.implicit_Wait();

		// To give the partial OTP by typing from the number-pad
		loginpage.clickOn_OTPBOX();
		andrdCmnUtil.Write_On_Keypad("123");
		andrdCmnUtil.Hide_Keyboard();

		// To click on the login button
		loginpage.clickOn_LogIn_Signup();

		// To assert the validation message,by giving partial otp
		String expectedValidation = "OTP field should have 6 digits";
		String actulaValidation = driver.findElement(By.id("error_tv")).getText();
		Assert.assertEquals(actulaValidation, expectedValidation, "Assertion passed");
		System.out.println("Validation verified successfully" + actulaValidation);
		andrdCmnUtil.implicit_Wait();

		// To clear the partial otp, from OTP field
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		andrdCmnUtil.implicit_Wait();
		andrdCmnUtil.deletingDataFromEditBoxUsingKeyboardKey(3);
		System.out.println("Clearing the otp from the otp field successfully");

		// To check the enable/disable functionality of "Login using password"
		//boolean sts = loginpage.getTheStatusOf_loginUsingPswdLink();
//		if (sts == true) {
//			System.out.println("The login With password link is Enabled : " + sts
//					+ "........ Test Case Failed for login_Password_Set Method");
//		} else {
//			System.out.println("The login With password link is Enabled : " + sts);

			// To give the OTP by typing from the number-pad
			loginpage.clickOn_OTPBOX();
			andrdCmnUtil.Write_On_Keypad("123456");
			andrdCmnUtil.Hide_Keyboard();
			System.out.println("Giving the correct OTP in the OTP successfully");

			// To click on the login button
			loginpage.clickOn_LogIn_Signup();
			System.out.println("Successfully doing the login for the user");

			// //To assert the landing page, where the user will click on the "click on my
			// dx card" option
			// String expected= "How can we help you today?";
			// String actual= driver.findElement(By.id("home_page_label")).getText();
			// Assert.assertEquals(actual, expected,"Assertion passed");
			// System.out.println("Redirected to the Landing page successfully," + actual);
			// andrdCmnUtil.implicit_Wait();
			//
			// //To click on the Show my dx card option
			// cmnelementpage.clickOn_Show_MyDxcard_Field();
			// System.out.println("Clicking on My DX card option");
			// Thread.sleep(2000);

			// To assert the Overview grid page
			String expectedResult_In_Grid = "OVERVIEW";
			String actualResult_In_Grid = driver.findElement(By.id("toolbar_title")).getText();
			Assert.assertEquals(actualResult_In_Grid, expectedResult_In_Grid, "Assertion passed");
			System.out.println("Verified the overview grid screen successfully," + actualResult_In_Grid);
			andrdCmnUtil.implicit_Wait();

			Thread.sleep(3000);
			// To click on the more option
			cmnelementpage.clickOn_More_Option();
			System.out.println("Successfully clicking on more optionand going to Menu");

			// To assert the the MENU screen, after clicking on the More option
			String expectedResult_In_Menu = "MENU";
			String actualResult_In_Menu = driver.findElement(By.id("toolbar_title")).getText();
			Assert.assertEquals(actualResult_In_Menu, expectedResult_In_Menu, "Assertion passed");
			System.out.println("Verified the MENU screen successfully," + actualResult_In_Menu);
			andrdCmnUtil.implicit_Wait();

			// To scroll down to the Create Password option and clicking on that
			andrdCmnUtil.scrollAndClick("Create Password");
			System.out.println("Successfully Scrolling down and clicking on create password");

			// To assert the create password screen
			String expectedResult_In_CreatePassword = "Create Password";
			String actualResult_In_CreatePassword = driver.findElement(By.id("forgot_pswd_tv2")).getText();
			Assert.assertEquals(actualResult_In_CreatePassword, expectedResult_In_CreatePassword, "Assertion passed");
			System.out.println("Verified the create password screen successfully," + actualResult_In_CreatePassword);
			andrdCmnUtil.implicit_Wait();

			// To click on the done button without configuring password
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the validation message on the pop-up (without giving anything,
			// clicking on done button)
			String expectedResult_In_CreatePassword_Validation1 = "Seems you forgot to enter your Password";
			String actualResult_In_CreatePassword_Validation1 = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actualResult_In_CreatePassword_Validation1,
					expectedResult_In_CreatePassword_Validation1, "Assertion passed");
			System.out.println("Verified the create password screen validation1 successfully,"
					+ actualResult_In_CreatePassword_Validation1);
			andrdCmnUtil.implicit_Wait();

			// To click on the OK button on the validation pop-up message
			loginpage.click_OK_On_Validation_Popup();

			// To find the new password field and give invalid value for new password field
			loginpage.write_On_New_password_field(invalid_Password);

			// To click on the done button without configuring password
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the validation message on the pop-up (By giving invalid input in
			// new password field)
			String expectedResult_In_CreatePassword_Validation2 = "Password cannot consist of % symbol, It should contain at least one number and one alphabet";
			String actualResult_In_CreatePassword_Validation2 = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actualResult_In_CreatePassword_Validation2,
					expectedResult_In_CreatePassword_Validation2, "Assertion passed");
			System.out.println("Verified the create password screen validation2 successfully,"
					+ actualResult_In_CreatePassword_Validation2);
			andrdCmnUtil.implicit_Wait();

			// To click on the OK button on the validation pop-up message
			loginpage.click_OK_On_Validation_Popup();

			// To find the new password field and give valid/proper value for new password
			// field
			loginpage.write_On_New_password_field(valid_Old_Password);

			// To click on the done button without configuring password
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the validation message on the pop-up (By giving valid input in new
			// password field, and leaving confirm password field empty)
			String expectedResult_In_CreatePassword_Validation3 = "Please confirm your password";
			String actualResult_In_CreatePassword_Validation3 = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actualResult_In_CreatePassword_Validation3,
					expectedResult_In_CreatePassword_Validation3, "Assertion passed");
			System.out.println("Verified the create password screen validation3 successfully,"
					+ actualResult_In_CreatePassword_Validation3);
			andrdCmnUtil.implicit_Wait();

			// To click on the OK button on the validation pop-up message
			loginpage.click_OK_On_Validation_Popup();

			// To find the confirm password field and give invalid password
			loginpage.write_On_Confirm_password_field(invalid_Password);

			// To click on the done button without configuring password
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the validation message on the pop-up (By giving invalid input in
			// confirm password field)
			String expectedResult_In_CreatePassword_Validation4 = "Please confirm your password";
			String actualResult_In_CreatePassword_Validation4 = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actualResult_In_CreatePassword_Validation4,
					expectedResult_In_CreatePassword_Validation4, "Assertion passed");
			System.out.println("Verified the create password screen validation4 successfully,"
					+ actualResult_In_CreatePassword_Validation4);
			andrdCmnUtil.implicit_Wait();

			// To click on the OK button on the validation pop-up message
			loginpage.click_OK_On_Validation_Popup();

			// To find the confirm password field and give invalid password
			loginpage.write_On_Confirm_password_field(valid_Old_Password);

			// To click on the done button without configuring password
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the success pop-up ,after configuring the proper password
			String expectedResult_In_CreatePassword_Success = "Your password has been updated";
			String actualResult_In_CreatePassword_Success = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actualResult_In_CreatePassword_Success, expectedResult_In_CreatePassword_Success,
					"Assertion passed");
			System.out.println("Verified the create password screen success pop-up successfully,"
					+ actualResult_In_CreatePassword_Success);
			andrdCmnUtil.implicit_Wait();

			// To click on the OK button on the validation pop-up message
			loginpage.click_OK_On_Validation_Popup();
			System.out.println(
					"Successfully checked for all the invalid scenarios by giving wrong inputs and for the valid scenario too. Also created the passsword for the user ");
			
			Thread.sleep(3000);
			// To click on the more option
			cmnelementpage.clickOn_More_Option();

			// To scroll down to the logout option and clicking on the yes button of the
			// pop-up
			andrdCmnUtil.scrollAndClick("Logout");
			System.out.println("Logout performed");

			// To click on the OK button on the logout pop-up validation
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(8000);
			System.out.println("Successfully doing the logout");
			

		

	}

	public void login_Change_Passowrd() throws InterruptedException {
		// To click the country selector and selecting the India country code
		//businesscls.enable_Toggle();
		Thread.sleep(4000);
		System.out.println("The mentioned method is running:"+ "login_Change_Passowrd");
		Thread.sleep(4000);
		businesscls.select_for_countryCode(country_Flag);
		Thread.sleep(2000);

		// To assert the country code field, after selecting country value
		String expected_Country_code = "+91";
		String actual_Country_code = driver.findElement(By.id("country_mobile_code_tv")).getText();
		Assert.assertEquals(actual_Country_code, expected_Country_code, "Assertion Passed");
		System.out.println("Country code asserted successfully," + actual_Country_code);
		andrdCmnUtil.implicit_Wait();

		// To give the mobile number in the mobile number field
		loginpage.write_on_mobileNumberEditBox(consumerMobileNumber);
		Thread.sleep(2000);

		// To click on the Get OTP button
		loginpage.click_GetOTP_Button();
		System.out.println(
				"Selecting country,giving the mobile number with which signup has done and clicking on get OTP successfully");

		// To assert the login screen
		String expectedResult_In_LogIn = "Welcome Back";
		String actualResult_In_LogIn = driver.findElement(By.id("greeting_tv")).getText();
		Assert.assertEquals(actualResult_In_LogIn, expectedResult_In_LogIn, "Assertion passed");
		System.out.println("Login Page has been verified successfully," + actualResult_In_LogIn);
		andrdCmnUtil.implicit_Wait();

		// To assert the text under the Welcome back text, with the mobile number
		countryCode = loginpage.read_Value_From_CountryCode();
		countryCode_with_MobileNumber = loginpage.read_Value_From_CountryCode_With_MobileNumber();
		String expectedResult_For_RegUser = "Please enter the OTP Sent to " + countryCode + " " + consumerMobileNumber;
		String actualResult_For_RegUser = driver.findElement(By.id("forgot_pswd_tv2")).getText() + " "
				+ countryCode_with_MobileNumber;
		Assert.assertEquals(actualResult_For_RegUser, expectedResult_For_RegUser, "Assertion passed");
		System.out.println("Registered user verified successfully: ," + actualResult_For_RegUser);
		andrdCmnUtil.implicit_Wait();

		// To assert the login screen,

		boolean sts = loginpage.getTheStatusOf_loginUsingPswdLink();
		if (sts == true) {
			System.out.println("The login With password link is Enabled : " + sts);

			// To click on the login using password option
			loginpage.click_On_logIn_Using_Password_link();

			// To assert the "login using OTP" option, during the flow of the login using
			// password
			String expectedResult_In_LogInUsingPassword = "Login using OTP?";
			String actualResult_In_LogInUsingPassword = driver.findElement(By.id("login_otp_tv")).getText();
			Assert.assertEquals(actualResult_In_LogInUsingPassword, expectedResult_In_LogInUsingPassword,
					"Assertion passed");
			System.out.println("Login Using OTP option is showing properly," + actualResult_In_LogInUsingPassword);
			andrdCmnUtil.implicit_Wait();

			// To give the password in password field and clicking on the login button
			loginpage.write_On_logIn_Using_Password_field(valid_Old_Password);
			loginpage.clickOn_LogIn_Signup();
			System.out.println(" Successfully gave the valid password and done the login for the same user");

			// //To assert the landing page, where the user will click on the "click on my
			// dx card" option
			// String expected= "How can we help you today?";
			// String actual= driver.findElement(By.id("home_page_label")).getText();
			// Assert.assertEquals(actual, expected,"Assertion passed");
			// System.out.println("Redirected to the Landing page successfully," + actual);
			// andrdCmnUtil.implicit_Wait();
			//
			// //To click on the Show my dx card option
			// cmnelementpage.clickOn_Show_MyDxcard_Field();
			// Thread.sleep(2000);

			// To assert the Overview grid page
			String expectedResult_In_Grid = "OVERVIEW";
			String actualResult_In_Grid = driver.findElement(By.id("toolbar_title")).getText();
			Assert.assertEquals(actualResult_In_Grid, expectedResult_In_Grid, "Assertion passed");
			System.out.println("Verified the overview grid screen successfully," + actualResult_In_Grid);
			andrdCmnUtil.implicit_Wait();
			
			

			Thread.sleep(3000);
			// To click on the more option
			cmnelementpage.clickOn_More_Option();

			// To assert the the MENU screen, after clicking on the More option
			String expectedResult_In_Menu = "MENU";
			String actualResult_In_Menu = driver.findElement(By.id("toolbar_title")).getText();
			Assert.assertEquals(actualResult_In_Menu, expectedResult_In_Menu, "Assertion passed");
			System.out.println("Verified the MENU screen successfully," + actualResult_In_Menu);
			andrdCmnUtil.implicit_Wait();

			// To scroll down to the Create Password option and clicking on that
			andrdCmnUtil.scrollAndClick("Change Password");
			Thread.sleep(4000);

			// To assert the change password screen
			String expectedCpValue = "CHANGE PASSWORD";
			String actualCpValue = driver.findElement(By.id("toolbar_title")).getText();
			Assert.assertEquals(actualCpValue, expectedCpValue, "Assertion passed");
			System.out.println("Verified Change password screen successfully," + actualCpValue);
			andrdCmnUtil.implicit_Wait();

			// To not to configure anything, and clicking on done button
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the change password validation pop-up (without giving anything, and
			// clicking on done button)
			String expected_In_ChangePassword_Validation1 = "Please enter the previous password";
			String actual_In_ChangePassword_Validation1 = driver.findElement(By.id("textinput_error")).getText();
			Assert.assertEquals(actual_In_ChangePassword_Validation1, expected_In_ChangePassword_Validation1,
					"Assertion passed");
			System.out.println(
					"Change password screen validation1 verified successfully," + actual_In_ChangePassword_Validation1);
			andrdCmnUtil.implicit_Wait();

			// To give partial input in current password field, and click on done button
			loginpage.write_On_current_Password_field(partial_Password);
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the change password validation pop-up (By giving partial current
			// password, and clicking on done button)
			String expected_In_ChangePassword_Validation2 = "Password should have minimum 6 characters.";
			String actual_In_ChangePassword_Validation2 = driver.findElement(By.id("textinput_error")).getText();
			Assert.assertEquals(actual_In_ChangePassword_Validation2, expected_In_ChangePassword_Validation2,
					"Assertion passed");
			System.out.println(
					"Change password screen validation2 verified successfully," + actual_In_ChangePassword_Validation2);
			andrdCmnUtil.implicit_Wait();

			// To give wrong input in current password field, and clicking on done button
			loginpage.write_On_current_Password_field(invalid_Password);
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the change password validation pop-up (By giving proper current
			// password, and not giving new password)
			String expected_In_ChangePassword_Validation3 = "Please enter a new password";
			String actual_In_ChangePassword_Validation3 = driver.findElement(By.id("textinput_error")).getText();
			Assert.assertEquals(actual_In_ChangePassword_Validation3, expected_In_ChangePassword_Validation3,
					"Assertion passed");
			System.out.println(
					"Change password screen validation3 verified successfully," + actual_In_ChangePassword_Validation3);
			andrdCmnUtil.implicit_Wait();

			// To give partial input in new password field and clicking on done button
			loginpage.write_On_New_password_field(partial_Password);
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the change password validation pop-up (By giving proper current
			// password, and giving partial password)
			String expected_In_ChangePassword_Validation4 = "For enhanced security we accept 6 characters or more";
			String actual_In_ChangePassword_Validation4 = driver.findElement(By.id("textinput_error")).getText();
			Assert.assertEquals(actual_In_ChangePassword_Validation4, expected_In_ChangePassword_Validation4,
					"Assertion passed");
			System.out.println(
					"Change password screen validation4 verified successfully," + actual_In_ChangePassword_Validation4);
			andrdCmnUtil.implicit_Wait();

			// To give proper/valid new password and clicking on done button, clicking ok on
			// the validation pop-up
			loginpage.write_On_New_password_field(new_Password);
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the change password validation pop-up (when the new password is
			// proper, but the current password is wrong)
			String expected_In_ChangePassword_Validation5 = "The previous password entered is incorrect";
			String actual_In_ChangePassword_Validation5 = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actual_In_ChangePassword_Validation5, expected_In_ChangePassword_Validation5,
					"Assertion passed");
			System.out.println(
					"Change password screen validation5 verified successfully," + actual_In_ChangePassword_Validation5);
			andrdCmnUtil.implicit_Wait();

			// To click on the OK button on the validation pop-up
			loginpage.click_OK_On_Validation_Popup();

			// To clear the current password field and give proper current password, and
			// clicking on done button,
			// clicking on ok success pop-up
			loginpage.clear_Value_From_current_Password_field();
			loginpage.write_On_current_Password_field(valid_Old_Password);
			loginpage.click_On_Submit_Button_In_Create_Or_changePassword();

			// To assert the change password success pop-up (upon successfully changing the
			// password)
			String expected_In_ChangePassword_Success = "Your password has been updated.";
			String actual_In_ChangePassword_Success = driver.findElement(By.id("alert_message")).getText();
			Assert.assertEquals(actual_In_ChangePassword_Success, expected_In_ChangePassword_Success,
					"Assertion passed");
			System.out.println(
					"Change password screen validation5 verified successfully," + actual_In_ChangePassword_Success);
			andrdCmnUtil.implicit_Wait();

			loginpage.click_OK_On_Validation_Popup();
			System.out.println(
					"Successfully verified all the validation scenarios by giving wrong inputs and for the valid scenario too. Successfully updated the password too");
			andrdCmnUtil.implicit_Wait();

			/*
			 * //To scroll down to the logout option andrdCmnUtil.scrollAndClick("Logout");
			 * 
			 * //To click on the ok button of the success pop-up
			 * loginpage.clickOn_LogOut_Popup(); System.out.println("Logout performed");
			 * System.out.println(" Successfully done with the logout functionality");
			 */

		}

		else {
			System.out.println("The login With password link is Enabled : " + sts
					+ " ........ Test Case Failed for login_Change_Passowrd1 Method ");

		}
	}

	/*
	 * public void LogOut() throws InterruptedException { //tearDown();
	 * 
	 * //To scroll down to the logout option andrdCmnUtil.scrollAndClick("Logout");
	 * 
	 * //To click on the ok button of the success pop-up
	 * cmnelementpage.clickOn_Ok_On_Popup(); System.out.println("Logout performed");
	 * System.out.println(" Successfully done with the logout functionality"); }
	 */

}
