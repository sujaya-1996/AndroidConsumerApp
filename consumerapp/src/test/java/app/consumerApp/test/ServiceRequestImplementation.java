package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.LoginPage;
import app.appium.PageFactory.MyAddressPage;
import app.appium.PageFactory.ProfilePage;
import app.appium.PageFactory.ServiceRequestPage;

public class ServiceRequestImplementation extends DriverIgnit
{
	
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	MyAddressImplementation myadrsimpl= new MyAddressImplementation();
	ProfileImplementation prflimpl = new ProfileImplementation();
	LoginPage loginpage;
	ProfilePage prflpage;
	MyAddressPage myadrspage;
	BusinessClass businesscls = new BusinessClass();
	CommonElementPage cmnelementpage;
	ExcelLibrary excelLib;
	ServiceRequestPage srpage;
	String check_Value_From_Toolbar_Title_Text;
	String sr_No_Request_Found_Text;
	String sr_Conversation_Tab_Text;
	String sr_NewRequest_Tab_Text;
	String sr_Faq_Tab_Text;
	String sr_VideoSupport_Tab_Text;
	String serviceType_Name_Text;
	String messageInNewServiceRequestScreen;
	String default_Address_In_SR_Text;
	String value_From_DefaultAddress_In_Profile;
	String value_From_PopUp_Message_Text;
	String valueOf_Message_Of_SR_In_ConvresationScreen;
	String value_From_AddressText_In_AddressBook;
	String value_From_Primary_Address_In_AddressBook;
	String value_Of_Address2_In_SR_Addressbook;
	String value_Of_Message_In_SR_ChatScreen;
	String type_A_Message_In_SR_Chat_Screen;
	String value_Of_Message_Of_SR_In_ChatScreen;
	String value_AttachmentLabel_In_NewRequestScreen;
	String read_Toolbar_Title;
	String type_A_Message_In_Attachment_Screen;
	String messageOfAttachment_Of_SR_On_ChatScreen;
	String type_A_Message_In_File_Attachment_Screen;
	String messageOfFileAttachment_Of_SR_On_ChatScreen;
	
	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 loginpage= new LoginPage(driver);
		 businesscls = new BusinessClass();
		 excelLib = new ExcelLibrary();
		 srpage = new ServiceRequestPage(driver);
		 cmnelementpage = new CommonElementPage(driver);
		 prflpage = new ProfilePage(driver);
		 myadrspage = new MyAddressPage(driver);
		 messageInNewServiceRequestScreen= ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.SERVICEREQUEST_TESTDATA_SHEETNAME, 1, 1);
		 type_A_Message_In_SR_Chat_Screen= ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.SERVICEREQUEST_TESTDATA_SHEETNAME, 2, 1);
		 type_A_Message_In_Attachment_Screen =  ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.SERVICEREQUEST_TESTDATA_SHEETNAME, 3, 1);
		 type_A_Message_In_File_Attachment_Screen = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.SERVICEREQUEST_TESTDATA_SHEETNAME, 4, 1);
		 
	}
	
	public void verify_UI () throws InterruptedException
	{
		
		
		
		//appgenericlib.clickOn_MyDXcard();
		//cmnelementpage.clickOn_dk_Option_On_Footer();
		cmnelementpage.click_On_dk_Image_On_GridView();
		srpage.click_On_SR_Module_On_MobileAppMenu();
		Thread.sleep(8000);
		
		// To assert the tool bar title of SR screen
		check_Value_From_Toolbar_Title_Text = appgenericlib.check_Toolbar_Title_Text();
		String expected_Toolbar_Title= "SERVICE REQUEST";
		String actual_Toolbar_Title = check_Value_From_Toolbar_Title_Text ; 
		Assert.assertEquals(actual_Toolbar_Title, expected_Toolbar_Title,"Assertion passed");
		System.out.println("Toolbar Title verified successfully: " + actual_Toolbar_Title);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the conversations screen
		srpage.click_On_Conversations_tab();
		Thread.sleep(2000);
		
		//To check the emoji is showing or not when there is no SR in SR conversations screen
		boolean srimage = srpage.read_sr_No_Request_Found_image();
		if (srimage == true)
		{
			System.out.println("No request found Emoji is showing"+ srimage);
			
			// To assert the "No request found" text under the emoji
			sr_No_Request_Found_Text = srpage.read_SR_No_Request_Found();
			String expected_Result= "No request found";
			String actual_Result = sr_No_Request_Found_Text ; 
			Assert.assertEquals(actual_Result, expected_Result,"Assertion passed");
			System.out.println("No request found text verified successfully: " + actual_Result);
			andrdCmnUtil.implicit_Wait();
			
			// To assert the Conversations tab text
			sr_Conversation_Tab_Text = srpage.read_From_Conversation_Tab_Text();
			String expectedResult_ConvTab= "Conversations";
			String actualResult_ConvTab = sr_Conversation_Tab_Text ; 
			Assert.assertEquals(actualResult_ConvTab, expectedResult_ConvTab,"Assertion passed");
			System.out.println("Conversation tab text verified successfully: " + actualResult_ConvTab);
			andrdCmnUtil.implicit_Wait();
			
			// To assert the New Request tab text
			sr_NewRequest_Tab_Text = srpage.read_From_newRequest_Tab_Text();
			String expectedResult_NRTab= "New Request";
			String actualResult_NRTab = sr_NewRequest_Tab_Text ; 
			Assert.assertEquals(actualResult_NRTab, expectedResult_NRTab,"Assertion passed");
			System.out.println("New Request tab text verified successfully: " + actualResult_NRTab);
			andrdCmnUtil.implicit_Wait();
			
			// To assert the FAQ tab text
			sr_Faq_Tab_Text = srpage.read_From_FAQ_Tab_Text();
			String expectedResult_FAQTab= "FAQ";
			String actualResult_FAQTab = sr_Faq_Tab_Text ; 
			Assert.assertEquals(actualResult_FAQTab, expectedResult_FAQTab,"Assertion passed");
			System.out.println("FAQ tab text verified successfully: " + actualResult_FAQTab);
			andrdCmnUtil.implicit_Wait();
			
			// To assert the Video Support tab text
			sr_VideoSupport_Tab_Text = srpage.read_From_videoSupport_Tab_Text();
			String expectedResult_VSTab= "Video support";
			String actualResult_VSTab = sr_VideoSupport_Tab_Text ; 
			Assert.assertEquals(actualResult_VSTab, expectedResult_VSTab,"Assertion passed");
			System.out.println("Video Support tab text verified successfully: " + actualResult_VSTab);
			andrdCmnUtil.implicit_Wait();
			
		}
		else
		{
			System.out.println("There are Service requests on the conversations screen, because of what No request found Emoji is not showing"+ srimage + "........ Test Case Failed for login_Password_Set Method");
		}
		
	}
	
	public void raiseNewRequest1() throws InterruptedException 
	{
	
		prflimpl = new ProfileImplementation();
		// To check the pop-up validation for the address, if its not selected and user is trying to submit
		srpage.click_On_Newrequest_tab();
		srpage.click_On_submitButton_In_New_SR();
		
		// To assert the mandatory address pop-up validation
		String value_From_PopUp_Message_Text5 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_For_AddressField= "Please enter a valid address";
		String actual_Result_For_AddressField= value_From_PopUp_Message_Text5 ; 
		Assert.assertEquals(actual_Result_For_AddressField, expected_Result_For_AddressField,"Assertion passed");
		System.out.println("Pop-up text got verified successfully for address field in New request screen: " + actual_Result_For_AddressField);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the ok button of the pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		
		
		andrdCmnUtil.Click_DeviceBackButton();
		cmnelementpage.clickOn_More_Option();
		andrdCmnUtil.scrollAndClick("My Address");
		myadrsimpl.configure_Address();
		
		// To assert the primary address on address book
		value_From_Primary_Address_In_AddressBook = myadrspage.read_From_Primary_Address_In_AddressBook();
		String expected_Result_For_PrimaryAddress= "(Primary)";
		String actual_Result_For_PrimaryAddress= value_From_Primary_Address_In_AddressBook ; 
		Assert.assertEquals(actual_Result_For_PrimaryAddress, expected_Result_For_PrimaryAddress,"Assertion passed");
		System.out.println("Primary text got verified successfully on the addressbook screen: " + actual_Result_For_PrimaryAddress);
		andrdCmnUtil.implicit_Wait();
		Thread.sleep(2000);
		
		// To click on the device back button, from addressbook
		andrdCmnUtil.Click_DeviceBackButton();
		
		// To check the address in my profile
		prflimpl.checkAddressInProfile();
		
		// To click on the dk option on the footer
		cmnelementpage.clickOn_dk_Option_On_Footer();
		
		
		// To click on the SR module on the mobile app menu
		srpage.click_On_SR_Module_On_MobileAppMenu();
		
		// To click on New request option
		srpage.click_On_Newrequest_tab();
		
		// To assert the Service Type name which is selected by the user  
		serviceType_Name_Text= srpage.read_From_ServiceType_Name_Text();
		String expected_Result_For_ServiceType= "Serviceone Request";
		String actual_Result_For_ServiceType= serviceType_Name_Text ; 
		Assert.assertEquals(actual_Result_For_ServiceType, expected_Result_For_ServiceType,"Assertion passed");
		System.out.println("Service Type name got verified successfully on the New request screen: " + actual_Result_For_ServiceType);
		andrdCmnUtil.implicit_Wait();
		

		
		//To assert the default Address inside New request screen, by checking whether its showing the Change address option or not!! 
		boolean chngAdrs= srpage.read_Change_Address();
		if (chngAdrs==true)
		{
			System.out.println("Default address is showing in SR screen");
			
			//To assert the default address that has configured before as primary address
			default_Address_In_SR_Text= srpage.read_From_default_Address_In_SR();
			andrdCmnUtil.Click_DeviceBackButton();
			cmnelementpage.clickOn_More_Option();
			andrdCmnUtil.scrollAndClick("My Profile");
			value_From_DefaultAddress_In_Profile= prflpage.read_DefaultAddress_In_Profile();
			String expected_Result_For_Address= value_From_DefaultAddress_In_Profile;
			String actual_Result_For_Address= default_Address_In_SR_Text; 
			Assert.assertEquals(actual_Result_For_Address, expected_Result_For_Address,"Assertion passed");
			System.out.println("Default address got verified successfully on the New request screen: " + actual_Result_For_Address);
			andrdCmnUtil.implicit_Wait();
			
			andrdCmnUtil.Click_DeviceBackButton();
			cmnelementpage.clickOn_dk_Option_On_Footer();
			srpage.click_On_SR_Module_On_MobileAppMenu();
			srpage.click_On_Newrequest_tab();
			
			// To click on the submit button without configuring the message 
			srpage.click_On_submitButton_In_New_SR();
			
			// To assert the pop-up text, when user clicks on the submit button without giving the message 
			String value_From_PopUp_Message_Text4 = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Result_For_MessageBox= "For a better service please enter a relevant message";
			String actual_Result_For_MessageBox= value_From_PopUp_Message_Text4 ; 
			Assert.assertEquals(actual_Result_For_MessageBox, expected_Result_For_MessageBox,"Assertion passed");
			System.out.println("Pop-up text got verified successfully in New request screen: " + actual_Result_For_MessageBox);
			andrdCmnUtil.implicit_Wait();
			
			// To click on the ok button
			cmnelementpage.clickOn_Ok_On_Popup();
			
			// To write on the message field in New SR screen
			srpage.write_On_MessageBox_In_SR(messageInNewServiceRequestScreen);
			
			
			
			// To click on the submit button and creating the SR
			srpage.click_On_submitButton_In_New_SR();
			
			// To assert the pop-up text, upon creating a SR in New SR screen
			value_From_PopUp_Message_Text =cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Result_For_Success= "Your service request has been placed";
			String actual_Result_For_Success= value_From_PopUp_Message_Text; 
			Assert.assertEquals(actual_Result_For_Success, expected_Result_For_Success,"Assertion passed");
			System.out.println("Success pop-up got verified successfully upon creating new request : " + actual_Result_For_Success);
			andrdCmnUtil.implicit_Wait();
			
			//To click on the OK button of the success pop-up, and upon doing this screen will navigate to dashboard showing that DK
			cmnelementpage.clickOn_Ok_On_Popup();			
		}
		else 
		{
			System.out.println("Its not showing the change address option, which means default address is not configured for that user");
			
		}
		
	}
	
	public void verifyConversationScreen()
	{
		
		srpage.click_On_SR_Module_On_MobileAppMenu();
		
		// To assert the message of the SR in Conversation screen
		valueOf_Message_Of_SR_In_ConvresationScreen = srpage.read_Message_Of_SR_In_ConvresationScreen(messageInNewServiceRequestScreen);
		String expected_MessageValue1= messageInNewServiceRequestScreen;
		String actual_MessageValue1= valueOf_Message_Of_SR_In_ConvresationScreen; 
		Assert.assertEquals(actual_MessageValue1, expected_MessageValue1,"Assertion passed");
		System.out.println("Created SR is showing on the conversation screen with the message: " + actual_MessageValue1);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	public void raiseNewRequest2() throws InterruptedException
	{
	
		
		// To click on the New request tab
		srpage.click_On_Newrequest_tab();
		
		// To check whether the change address is showing or not, if showing then continuing the flow
		boolean chngAdrs= srpage.read_Change_Address();
		if (chngAdrs==true)
		{
			// To click on the change address button on new request screen
			srpage.click_Change_Address();
			
			//To check the primary label whether its showing or not on address book
			value_From_Primary_Address_In_AddressBook=myadrspage.read_From_Primary_Address_In_AddressBook();
			String expected_MessageValue1= "(Primary)";
			String actual_MessageValue1= value_From_Primary_Address_In_AddressBook; 
			Assert.assertEquals(actual_MessageValue1, expected_MessageValue1,"Assertion passed");
			System.out.println("It's showing the primary label on the address book: " + actual_MessageValue1);
			andrdCmnUtil.implicit_Wait();
			
			// To click on the use my current location
			myadrspage.click_UseMyCurrentLocation();
			Thread.sleep(4000);
			
			// To click on the submit button 
			cmnelementpage.clickOn_submit_Button();
			Thread.sleep(4000);
			
			//To assert the text on the pop-up, upon address getting added successfully
			String value_From_PopUp_Message_Text1 = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Success_Result= "Address added successfully.";
			String actual_Success_Result = value_From_PopUp_Message_Text1 ; 
			Assert.assertEquals(actual_Success_Result, expected_Success_Result,"Assertion passed");
			System.out.println("By using Use my current location, Address got added successfully: " + actual_Success_Result);
			andrdCmnUtil.implicit_Wait();
			
			// To click on the ok button of the pop-up
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(4000);
			
			// To assert whether the address02 is showing or not on addressbook
			myadrspage.read_From_Address2Text_In_AddressBook();
			Thread.sleep(4000);
			
			//To click on the address02, to configure the same to Raise a SR
			myadrspage.click_On_Address2_In_AddressBook();
			Thread.sleep(4000);
			
			//To assert the pop-up text, when the address02 is clicked to get selected to place a SR
			value_Of_Address2_In_SR_Addressbook = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_PopupText_Result= "Would you like to select this address to place service request?";
			String actual_PopupText_Result = value_Of_Address2_In_SR_Addressbook ; 
			Assert.assertEquals(actual_PopupText_Result, expected_PopupText_Result,"Assertion passed");
			System.out.println("Text from pop-up got verified successfully: " + actual_PopupText_Result);
			andrdCmnUtil.implicit_Wait();
			
			// To click on the continue button on the pop-up
			cmnelementpage.clickOn_Ok_On_Popup();
			
			// To give the message in message box in New request screen
			srpage.write_On_MessageBox_In_SR(messageInNewServiceRequestScreen);
			
			// To click on the submit button on New request screen
			srpage.click_On_submitButton_In_New_SR();
			
			// To assert the pop-up text, upon creating a SR in New SR screen By changing the address
			String value_From_PopUp_Message_Text2 =cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Result_For_Success= "Your service request has been placed";
			String actual_Result_For_Success= value_From_PopUp_Message_Text2; 
			Assert.assertEquals(actual_Result_For_Success, expected_Result_For_Success,"Assertion passed");
			System.out.println("Success pop-up got verified successfully upon creating new request : " + actual_Result_For_Success);
			andrdCmnUtil.implicit_Wait();
			
			//To click on the OK button of the success pop-up, and upon doing this screen will navigate to dashboard showing that DK
			cmnelementpage.clickOn_Ok_On_Popup();	
			
			
			
		}
		else 
		{
			System.out.println("Its not showing the change address option, which means default address is not configured for that user");
			
		}
		
	}
	
	public void serviecRequest_Reply() throws InterruptedException
	{

		
		//To click on the SR module on Mobile app menu
		srpage.click_On_SR_Module_On_MobileAppMenu();
		
		//To click on the first SR, which is there on the SR conversation screen
		srpage.click_On_FirstSR_list_Of_SR_In_ConvresationScreen();
		Thread.sleep(4000);
		
		// To assert the message in SR chat screen, which is there on the conversation screen
		value_Of_Message_In_SR_ChatScreen= srpage.read_From_message_In_SR_ChatScreen();
		andrdCmnUtil.Click_DeviceBackButton();
		String valueOf_Message_Of_SR_In_ConvresationScreen3=srpage.read_Message_Of_SR_In_ConvresationScreen(messageInNewServiceRequestScreen);
		String expected_Result_For_ChatMessage= valueOf_Message_Of_SR_In_ConvresationScreen3;
		String actual_Result_For_ChatMessage= value_Of_Message_In_SR_ChatScreen; 
		Assert.assertEquals(actual_Result_For_ChatMessage, expected_Result_For_ChatMessage,"Assertion passed");
		System.out.println("Message in Chat screen got verified successfully : " + actual_Result_For_ChatMessage);
		andrdCmnUtil.implicit_Wait();
		
		//To click on the first SR, which is there on the SR conversation screen
		srpage.click_On_FirstSR_list_Of_SR_In_ConvresationScreen();
		
		//  To click on the attachment icon on the SR chat screen
		srpage.click_AttachmentIcon_On_ChatScreen();
		
		// To allow the media access, when it shows upon clicking on Attachments
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		
		//  To click on the Cancel button on Scan document dialog
		cmnelementpage.click_CancelButton_On_ScanDocument();
		
		//  To click on the attachment icon on the SR chat screen
		srpage.click_AttachmentIcon_On_ChatScreen();
		
		// To click on the camera icon on the scan document pop-up screen
		cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();
		
		// To allow the media access, when it shows upon clicking on Attachments
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(3000);
		
		// To take a picture by clicking on the click option the mobile camera
		cmnelementpage.takePicture_In_NewRequestScreen_Attachment();
		
		// To assert the title of the Track request screen, In chat screen attachment
		read_Toolbar_Title= cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_For_Chat_TrackRequestScreen= "TRACK REQUEST";
		String actual_Result_For_Chat_TrackRequestScreen= read_Toolbar_Title; 
		Assert.assertEquals(actual_Result_For_Chat_TrackRequestScreen, expected_Result_For_Chat_TrackRequestScreen,"Assertion passed");
		System.out.println("Track Request screen title in Chat screen, got verified successfully : " + actual_Result_For_Chat_TrackRequestScreen);
		
		// To give the message in Type a message field
		srpage.write_On_TypeAMessage_ChatScreen(type_A_Message_In_Attachment_Screen);
		
		// To click on the send button in the type a message field
		srpage.click_SendButton_On_ChatScreen();
		
		// To click on the ok button of the success pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		
		// To assert the message given in attachment (captured image), in chat screen
		messageOfAttachment_Of_SR_On_ChatScreen = srpage.read_AttachmentMessage_Of_SR_In_Chat_Screen(type_A_Message_In_Attachment_Screen);
		System.out.println("The text message fetched from UI is : "+ messageOfAttachment_Of_SR_On_ChatScreen);
		String expected_Result_For_AttachmentMessage= type_A_Message_In_Attachment_Screen;
		System.out.println("The text message fetched from Excel is : "+ expected_Result_For_AttachmentMessage);
		String actual_Result_For_AttachmentMessage= messageOfAttachment_Of_SR_On_ChatScreen; 
		Assert.assertEquals(actual_Result_For_AttachmentMessage, expected_Result_For_AttachmentMessage,"Assertion passed");
		System.out.println(" Message given in captured image attachment, in chat screen got verified successfully : " + actual_Result_For_AttachmentMessage);
		andrdCmnUtil.implicit_Wait();
		
		//  To click on the attachment icon on the SR chat screen
		srpage.click_AttachmentIcon_On_ChatScreen();
		
		// To click on the first image of all the images in scan document screen
		cmnelementpage.click_On_FirstImage_In_list_Of_Images_In_ScanDocument_Screen();
		
		// To click on done button on the attachment preview screen
		cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
		Thread.sleep(4000);
		
		// To give the message in Type a message field (this message we are giving for the attached image, not for captured image)
		srpage.write_On_TypeAMessage_ChatScreen(type_A_Message_In_File_Attachment_Screen);
		
		// To click on the send button in the type a message field
		srpage.click_SendButton_On_ChatScreen();
		
		// To click on the ok button of the success pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		
		// To assert the message given in attachment (attached image from device), in chat screen
		messageOfFileAttachment_Of_SR_On_ChatScreen = srpage.read_AttachmentMessage_Of_SR_In_Chat_Screen(type_A_Message_In_File_Attachment_Screen);
		System.out.println("The text message fetched from UI is : "+ messageOfFileAttachment_Of_SR_On_ChatScreen);
		String expected_Result_For_FileAttachmentMessage= type_A_Message_In_File_Attachment_Screen;
		System.out.println("The text message fetched from Excel is : "+ expected_Result_For_FileAttachmentMessage);
		String actual_Result_For_FileAttachmentMessage= messageOfFileAttachment_Of_SR_On_ChatScreen; 
		Assert.assertEquals(actual_Result_For_FileAttachmentMessage, expected_Result_For_FileAttachmentMessage,"Assertion passed");
		System.out.println(" Message given in File attachment, in chat screen got verified successfully : " + actual_Result_For_FileAttachmentMessage);
		andrdCmnUtil.implicit_Wait();
		
		
		// To give message in Type a message field, In chat screen
		srpage.write_On_TypeAMessage_ChatScreen(type_A_Message_In_SR_Chat_Screen);
		
		// To assert the send arrow in chat screen and click on that
		srpage.click_SendButton_On_ChatScreen();
		Thread.sleep(4000);
		
		// To assert the message on the pop-up, after replying from chat screen
		String value_From_PopUp_Message_Text3=cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_For_Chat_Popup_Message= "Reply Successful.";
		String actual_Result_For_Chat_Popup_Message= value_From_PopUp_Message_Text3; 
		Assert.assertEquals(actual_Result_For_Chat_Popup_Message, expected_Result_For_Chat_Popup_Message,"Assertion passed");
		System.out.println("Reply Pop-up Message in Chat screen got verified successfully : " + actual_Result_For_Chat_Popup_Message);
		
		// To click on the Ok button on the popup
		cmnelementpage.clickOn_Ok_On_Popup();
		Thread.sleep(4000);
		
		// To assert the reply message on SR chat screen
		value_Of_Message_Of_SR_In_ChatScreen = srpage.read_replyMessage_Of_SR_In_Chat_Screen(type_A_Message_In_SR_Chat_Screen);
		System.out.println("The text message fetched from UI is : "+ value_Of_Message_Of_SR_In_ChatScreen);
		String expected_Result_For_ChatMessage1= type_A_Message_In_SR_Chat_Screen;
		System.out.println("The text message fetched from Excel is : "+ expected_Result_For_ChatMessage1);
		String actual_Result_For_ChatMessage1= value_Of_Message_Of_SR_In_ChatScreen; 
		Assert.assertEquals(actual_Result_For_ChatMessage1, expected_Result_For_ChatMessage1,"Assertion passed");
		System.out.println("Reply Message in Chat screen got verified successfully : " + actual_Result_For_ChatMessage1);
		andrdCmnUtil.implicit_Wait();
		
		//To click on the device back button
		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(4000);
		
		// To assert the message in conversation screen, which has earlier given as reply in chat screen
		String value_Of_Message_Of_SR_In_ConversationScreen4 = srpage.read_Message_Of_SR_In_ConvresationScreen(type_A_Message_In_SR_Chat_Screen);
		srpage.click_On_FirstSR_list_Of_SR_In_ConvresationScreen();
		String value_Of_Message_Of_SR_In_ChatScreen2 = srpage.read_replyMessage_Of_SR_In_Chat_Screen(type_A_Message_In_SR_Chat_Screen);
		String expected_Result_For_ChatMessage2= value_Of_Message_Of_SR_In_ChatScreen2;
		String actual_Result_For_ChatMessage2= value_Of_Message_Of_SR_In_ConversationScreen4; 
		Assert.assertEquals(actual_Result_For_ChatMessage2, expected_Result_For_ChatMessage2,"Assertion passed");
		System.out.println("Reply Message in configured in chat screen,  got verified successfully On conversation screen: " + actual_Result_For_ChatMessage2);
		andrdCmnUtil.implicit_Wait();

	}

	
	
	public void verifyAttachment_And_ScheduleDateTime () throws InterruptedException
	{
		myadrspage= new MyAddressPage(driver);
		cmnelementpage = new CommonElementPage(driver);
		srpage = new ServiceRequestPage(driver);
		andrdCmnUtil.Click_DeviceBackButton();
		
	/*	appgenericlib.clickOn_MyDXcard();
		cmnelementpage.click_On_dk_Image_On_GridView();
		srpage.click_On_SR_Module_On_MobileAppMenu();
		Thread.sleep(4000);*/
		
		srpage.click_On_Newrequest_tab();
		Thread.sleep(3000);
		
		// To write on the message field in New SR screen
		srpage.write_On_MessageBox_In_SR(messageInNewServiceRequestScreen);
		
		// To scroll down and click on the attachment option
		try 
		{
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix+ "browse_doc_iv");
		}
		catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}
	
		
		// To click on the Attachment icon on the new request screen
		srpage.click_AttachmentOption_In_NewRequestScreen();
		
		// To click on the camera icon, on the scan document screen, after clicking on the attachment
		cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();
		Thread.sleep(3000);
		
		// To click on the camera click button, when the phone camera is enabled
		cmnelementpage.takePicture_In_NewRequestScreen_Attachment();
		
		// To click on the select button, after taking the picture successfully
		cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
		
		andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix+ "browse_doc_iv");
		
		// To click on the schedule date and time field
	    srpage.write_On_scheduleDate_Time();
		
		// To check the number attachments up-to what number of attachments its taking!!
		srpage.count_Attachments_In_NewRequest_Screen();
		
		
		// Doing this for the time being, as there is a bug which is not allowing the user to configure five attachments
		//cmnelementpage.clickOn_Ok_On_Popup();
		//srpage.click_AttachmentOption_In_NewRequestScreen(); 
		//cmnelementpage.click_On_FirstImage_In_list_Of_Images_In_ScanDocument_Screen();
		//cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
		
		boolean attachmentIcon = srpage.status_Of_Attachment_Icon();
		if (attachmentIcon==false)
		{
			System.out.println("Its allowing more than 5 attachments, which it should not");
		}
		else
		{		
			// To click on the submit button
			srpage.click_On_submitButton_In_New_SR();
			Thread.sleep(8000);
			
			cmnelementpage.clickOn_Ok_On_Popup();
		}
		
		System.out.println("working successfully");
		
		// To click on the more section
		cmnelementpage.clickOn_More_Option();
	}
	


}
