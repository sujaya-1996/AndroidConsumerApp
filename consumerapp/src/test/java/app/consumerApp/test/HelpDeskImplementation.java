package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.HelpDeskPageFactory;

public class HelpDeskImplementation extends DriverIgnit {

	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	HelpDeskPageFactory helpdeskpage;
	ExcelLibrary excelLib;
	String helpDesk_Email;
	String helpDesk_Number;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		helpdeskpage = new HelpDeskPageFactory(driver);
		excelLib = new ExcelLibrary();
		helpDesk_Email = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPDESK_TESTDATA_SHEETNAME, 1, 1);
		helpDesk_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPDESK_TESTDATA_SHEETNAME, 2, 1);

	}

	public void verify_UI_And_Functionality() throws InterruptedException {

		cmnelementpage.click_On_dk_Image_On_GridView();

		helpdeskpage.click_On_HelpDesk_Module_On_MobileAppMenu();

		// To click on the cancel button
		helpdeskpage.click_On_Helpdesk_Dialog_Header_CancelButton();

		helpdeskpage.click_On_HelpDesk_Module_On_MobileAppMenu();

		// To assert the helpdesk dialog header
		String value_From_Helpdesk_Dialog_Header = helpdeskpage.read_From_Helpdesk_Dialog_Header();
		String expected_Result1 = "HELP DESK";
		String actual_Result1 = value_From_Helpdesk_Dialog_Header;
		Assert.assertEquals(actual_Result1, expected_Result1);
		System.out.println("Helpdesk dialog header got verified successfully:" + actual_Result1);

		// To assert the Email in helpdesk
		String value_From_Email_In_HelpDesk = helpdeskpage.read_Value_From_Email_In_HelpDesk();
		String expected_Result2 = helpDesk_Email;
		String actual_Result2 = value_From_Email_In_HelpDesk;
		Assert.assertEquals(actual_Result2, expected_Result2);
		System.out.println("Helpdesk email got verified successfully:" + actual_Result2);

		// To assert the Number in helpdesk
		String value_From_Number_In_HelpDesk = helpdeskpage.read_Value_From_Number_In_HelpDesk();
		String expected_Result3 = helpDesk_Number;
		String actual_Result3 = value_From_Number_In_HelpDesk;
		Assert.assertEquals(actual_Result3, expected_Result3);
		System.out.println("Helpdesk number got verified successfully:" + actual_Result3);

		// To click on the helpdesk email
		helpdeskpage.click_On_Email_In_HelpDesk();
		Thread.sleep(2000);

		// To click on the cancel button of the android device
		cmnelementpage.clickOn_CancelButton();

		helpdeskpage.click_On_HelpDesk_Module_On_MobileAppMenu();

		// To click on the Number in helpdesk
		helpdeskpage.click_On_Number_In_HelpDesk();

		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(3000);
		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(3000);
		andrdCmnUtil.Click_DeviceBackButton();

	}
}
