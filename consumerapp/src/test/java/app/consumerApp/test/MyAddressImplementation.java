package app.consumerApp.test;

import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.PageFactory.MyAddressPage;

public class MyAddressImplementation extends DriverIgnit
{
	
	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	MyAddressPage myadrspage;
	static String addressBook_Title_Text;
	String value_Of_City_Field_Of_AddNewAddress;
	String value_From_PopUp_Message_Text;
	String value_From_Primary_Address_In_AddressBook;
	
	public void configure_Address() throws InterruptedException 
	{
		cmnelementpage = new CommonElementPage(driver);
		myadrspage = new MyAddressPage(driver);

		
		
		// To assert the Tool-bar title of Address book
		addressBook_Title_Text = myadrspage.read_AddressBook_Title_Text();
		String expected_Title_Result= "ADDRESS BOOK";
		String actual_Title_Result = addressBook_Title_Text ; 
		Assert.assertEquals(actual_Title_Result, expected_Title_Result,"Assertion passed");
		System.out.println("Addressbook Toolbar Title text verified successfully: " + actual_Title_Result);
		andrdCmnUtil.implicit_Wait();
		
		// To Click on Use my current location option
		myadrspage.click_UseMyCurrentLocation();
		Thread.sleep(4000);
		
		/*// To assert the Tool-bar Title of Use my current location module
		String addressBook_Title_Text1 = myadrspage.read_AddressBook_Title_Text();
		String expected_UMCL_Result= "ADD NEW ADDRESS";
		String actual_UMCL_Result = addressBook_Title_Text1 ; 
		Assert.assertEquals(actual_UMCL_Result, expected_UMCL_Result,"Assertion passed");
		System.out.println("Use My current location screen Tool bar Title text verified successfully: " + actual_UMCL_Result);
		andrdCmnUtil.implicit_Wait();*/
		
		// To click on the allow button of the media access confirmation pop-up
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(3000);
		
		// To assert the value from City field of Use My current location screen
		value_Of_City_Field_Of_AddNewAddress = myadrspage.read_City_Field_Of_AddNewAddress();
		if(value_Of_City_Field_Of_AddNewAddress!=null)
		{
		String actual_City_UMCL_Result = value_Of_City_Field_Of_AddNewAddress ; 
		System.out.println("The City value fetched form screen is : "+ actual_City_UMCL_Result);
		//Assert.assertEquals(actual_City_UMCL_Result, expected_City_UMCL_Result,"Assertion passed");
		andrdCmnUtil.implicit_Wait();
		
		//To click on the submit button of the Use My current location screen
		cmnelementpage.clickOn_submit_Button();
		Thread.sleep(4000);
		
		// To assert the Text showing in the Pop-up message
		value_From_PopUp_Message_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Success_Result= "Address added successfully.";
		String actual_Success_Result = value_From_PopUp_Message_Text ; 
		Assert.assertEquals(actual_Success_Result, expected_Success_Result,"Assertion passed");
		System.out.println("By using Use my current location, Address got added successfully: " + actual_Success_Result);
		andrdCmnUtil.implicit_Wait();
		
		
		// To click on the ok button on the confirmation pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		
		
		// To click on the first address (Address 01) to make it default address
		myadrspage.selecting_DefaultAddress_In_Myaddress();
		Thread.sleep(4000);
		
		// To assert the Text showing in the Pop-up message, when the pop-up shows for making the address to default address
		String value_From_PopUp_Message_Text1 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Confirmation_Result= "Would you like to set this as your default address?";
		String actual_Confirmation_Result = value_From_PopUp_Message_Text1 ; 
		Assert.assertEquals(actual_Confirmation_Result, expected_Confirmation_Result,"Assertion passed");
		System.out.println("default address confirmation popup text got verified successfully: " + actual_Confirmation_Result);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the continue button on the confirmation pop-up for the default address
		cmnelementpage.clickOn_Ok_On_Popup();
		Thread.sleep(4000);
		
		// To assert the Text showing in the Pop-up message, when address set to default address
		String value_From_PopUp_Message_Text2 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Confirmation_Result1= "Address updated successfully and selected as your default address";
		String actual_Confirmation_Result1= value_From_PopUp_Message_Text2 ; 
		Assert.assertEquals(actual_Confirmation_Result1, expected_Confirmation_Result1,"Assertion passed");
		System.out.println("address set to default address, popup text got verified successfully: " + actual_Confirmation_Result1);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the ok button on the success pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		
		System.out.println("My address is working properly");
		

		
	
		
		
		}
		else
		{
			System.out.println("The City field value is null...........");
		}
		
		
	}
	
	public void configure_Address_For_Buy() throws InterruptedException 
	{
		cmnelementpage = new CommonElementPage(driver);
		myadrspage = new MyAddressPage(driver);

		
		
		// To assert the Tool-bar title of Address book
		addressBook_Title_Text = myadrspage.read_AddressBook_Title_Text();
		String expected_Title_Result= "ADDRESS BOOK";
		String actual_Title_Result = addressBook_Title_Text ; 
		Assert.assertEquals(actual_Title_Result, expected_Title_Result,"Assertion passed");
		System.out.println("Addressbook Toolbar Title text verified successfully: " + actual_Title_Result);
		andrdCmnUtil.implicit_Wait();
		
		// To Click on Use my current location option
		myadrspage.click_UseMyCurrentLocation();
		Thread.sleep(4000);
		
		/*// To assert the Tool-bar Title of Use my current location module
		String addressBook_Title_Text1 = myadrspage.read_AddressBook_Title_Text();
		String expected_UMCL_Result= "ADD NEW ADDRESS";
		String actual_UMCL_Result = addressBook_Title_Text1 ; 
		Assert.assertEquals(actual_UMCL_Result, expected_UMCL_Result,"Assertion passed");
		System.out.println("Use My current location screen Tool bar Title text verified successfully: " + actual_UMCL_Result);
		andrdCmnUtil.implicit_Wait();*/
		
		// To click on the allow button of the media access confirmation pop-up
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(3000);
		
		// To assert the value from City field of Use My current location screen
		value_Of_City_Field_Of_AddNewAddress = myadrspage.read_City_Field_Of_AddNewAddress();
		if(value_Of_City_Field_Of_AddNewAddress!=null)
		{
		String actual_City_UMCL_Result = value_Of_City_Field_Of_AddNewAddress ; 
		System.out.println("The City value fetched form screen is : "+ actual_City_UMCL_Result);
		//Assert.assertEquals(actual_City_UMCL_Result, expected_City_UMCL_Result,"Assertion passed");
		andrdCmnUtil.implicit_Wait();
		
		//To click on the submit button of the Use My current location screen
		cmnelementpage.clickOn_submit_Button();
		Thread.sleep(4000);
		
		// To assert the Text showing in the Pop-up message
		value_From_PopUp_Message_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Success_Result= "Address added successfully.";
		String actual_Success_Result = value_From_PopUp_Message_Text ; 
		Assert.assertEquals(actual_Success_Result, expected_Success_Result,"Assertion passed");
		System.out.println("By using Use my current location, Address got added successfully: " + actual_Success_Result);
		andrdCmnUtil.implicit_Wait();
		
		
		// To click on the ok button on the confirmation pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		
		
		// To click on the first address (Address 01) to make it default address
		myadrspage.selecting_DefaultAddress_In_Myaddress();
		Thread.sleep(4000);
		
		// To assert the Text showing in the Pop-up message, when the pop-up shows for making the address to default address
		String value_From_PopUp_Message_Text1 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Confirmation_Result= "Would you like to add this address for purchase delivery?";
		String actual_Confirmation_Result = value_From_PopUp_Message_Text1 ; 
		Assert.assertEquals(actual_Confirmation_Result, expected_Confirmation_Result,"Assertion passed");
		System.out.println("default address confirmation popup text got verified successfully: " + actual_Confirmation_Result);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the continue button on the confirmation pop-up for the default address
		cmnelementpage.clickOn_Ok_On_Popup();
		Thread.sleep(4000);
		
//		// To assert the Text showing in the Pop-up message, when address set to default address
//		String value_From_PopUp_Message_Text2 = cmnelementpage.read_From_PopUp_Message_Text();
//		String expected_Confirmation_Result1= "Address updated successfully and selected as your default address";
//		String actual_Confirmation_Result1= value_From_PopUp_Message_Text2 ; 
//		Assert.assertEquals(actual_Confirmation_Result1, expected_Confirmation_Result1,"Assertion passed");
//		System.out.println("address set to default address, popup text got verified successfully: " + actual_Confirmation_Result1);
//		andrdCmnUtil.implicit_Wait();
//		
//		// To click on the ok button on the success pop-up
//		cmnelementpage.clickOn_Ok_On_Popup();
//		
//		System.out.println("My address is working properly");
		

		
	
		
		
		}
		else
		{
			System.out.println("The City field value is null...........");
		}
		
		
	}

}
