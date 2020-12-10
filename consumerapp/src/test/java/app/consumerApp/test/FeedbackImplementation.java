package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.PageFactory.FeedbackPageFactory;

public class FeedbackImplementation extends DriverIgnit {
	
	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	FeedbackPageFactory feedbackpage ;
	
	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		feedbackpage = new FeedbackPageFactory(driver);
		
		
	}
	
	public void verify_Functionality() throws InterruptedException {
		
		
		cmnelementpage.clickOn_More_Option();
		try {
		andrdCmnUtil.scrollAndClick("Feedback");
		}catch (Exception e) {
			System.out.println("No Need to Scroll");
		}
		
		//To click on the allow button on the allow access pop-up
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(2000);
		
		System.out.println("Its showing the share through different media option.");
		
		cmnelementpage.clickOn_CancelButton();
		Thread.sleep(2000);
		
		try {
		andrdCmnUtil.scrollAndClick("Feedback");
		}catch (Exception e) {
			System.out.println("No Need to Scroll");
			
		}
		
		// To click on the Gmail option on the dialouge
		feedbackpage.click_On_Gmail_On_Share_Dialogue();
		Thread.sleep(6000);
		
		// To assert the From Label in gmail
		String Value_Of_fromLabel_In_Gmail = feedbackpage.read_Value_Of_fromLabel_In_Gmail();
		String expected_Result1 = "From";
		String actual_Result1 = Value_Of_fromLabel_In_Gmail;
		Assert.assertEquals(actual_Result1, expected_Result1);
		System.out.println("From label in Gmail got verified successfully:" + actual_Result1);
		andrdCmnUtil.implicit_Wait();
		
		// To assert the To field value in gmail
		String detail_Of_toFieldValue_In_Gmail = feedbackpage.read_Detail_Of_toFieldValue_In_Gmail();
		String expected_Result2 = "<support@nhancenow.com>, ";
		String actual_Result2 = detail_Of_toFieldValue_In_Gmail;
		Assert.assertEquals(actual_Result2, expected_Result2);
		System.out.println("To Field value in Gmail got verified successfully:" + actual_Result2);
		andrdCmnUtil.implicit_Wait();
		
		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(3000);
		
		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(3000);
		
		cmnelementpage.clickOn_dk_Option_On_Footer();
		
		System.out.println("Feedback module is working fine.");
		
		
		
	}
	
}
