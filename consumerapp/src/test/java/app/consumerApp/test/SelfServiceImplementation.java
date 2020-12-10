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
import app.appium.PageFactory.SelfServicePageFactory;

public class SelfServiceImplementation extends DriverIgnit {

	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	SelfServicePageFactory selfservicepage;
	ExcelLibrary excelLib;
	String value_From_Videos_Module_In_SelfService;
	String value_From_Documents_Module_In_SelfService;
	String value_From_FileTitle;
	String video_Name;
	String document_Name;
	String additional_Document_Name;
	String value_From_FileTitle1;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {
		selfservicepage = new SelfServicePageFactory(driver);
		cmnelementpage = new CommonElementPage(driver);
		excelLib = new ExcelLibrary();
		video_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.SelfService_TESDATA_SHEETNAME, 1, 1);
		document_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.SelfService_TESDATA_SHEETNAME, 2, 1);
		additional_Document_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.SelfService_TESDATA_SHEETNAME, 3, 1);

	}

	public void verify_UI() throws InterruptedException {

		Thread.sleep(4000);
		cmnelementpage.click_On_dk_Image_On_GridView();
		Thread.sleep(3000);
		selfservicepage.click_On_SelfService_Module_On_MobileAppMenu();
		Thread.sleep(3000);
		// To assert the toolbar title of SelfService screen
		String selfService_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "SELF SERVICE";
		String actual_Result_ToolbarTitle = selfService_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("SelfService toolbar title got verified successfully:" + actual_Result_ToolbarTitle);

		// To assert the Videos tab header
		value_From_Videos_Module_In_SelfService = selfservicepage.read_From_Videos_Module_In_SelfService();
		String expected_Result_VideosTab = "VIDEOS";
		String actual_Result_VideosTab = value_From_Videos_Module_In_SelfService;
		Assert.assertEquals(actual_Result_VideosTab, expected_Result_VideosTab);
		System.out.println("Videos tab header got verified successfully:" + actual_Result_VideosTab);

		// To assert the Documents tab header
		value_From_Documents_Module_In_SelfService = selfservicepage.read_From_Documents_Module_In_SelfService();
		String expected_Result_SecondTab = "DOCUMENT";
		String actual_Result_SecondTab = value_From_Documents_Module_In_SelfService;
		Assert.assertEquals(actual_Result_SecondTab, expected_Result_SecondTab);
		System.out.println("Documents tab header got verified successfully:" + actual_Result_SecondTab);

		// To assert the ADDITIONAL DOCUMENT tab header
		String value_From_AdditionalDocuments_Module_In_SelfService = selfservicepage
				.read_From_AdditionalDocuments_Module_In_SelfService();
		String expected_Result_ThirdTab = "ADDITIONAL DOCUMENT ";
		String actual_Result_ThirdTab = value_From_AdditionalDocuments_Module_In_SelfService;
		Assert.assertEquals(actual_Result_ThirdTab, expected_Result_ThirdTab);
		System.out.println("Additional documents tab header got verified successfully:" + actual_Result_ThirdTab);
		Thread.sleep(3000);

	}

	public void verify_Functionality() throws InterruptedException {

		// To check whether the video default image is showing or not!
		Boolean value_From_Video_Default_Image = selfservicepage.check_value_From_Video_Default_Image();
		if (value_From_Video_Default_Image == true) {
			System.out.println("Video default image is showing properly." + value_From_Video_Default_Image);

			// To assert the file name
			value_From_FileTitle = selfservicepage.read_Value_From_FileTitle();
			String expected_Result1 = video_Name;
			String actual_Result1 = value_From_FileTitle;
			Assert.assertEquals(actual_Result1, expected_Result1);
			System.out.println("Video file name got verified successfully:" + actual_Result1);



		// To click on the video to open
		selfservicepage.click_On_Video_Default_Image();
		Thread.sleep(3000);

		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(2000);

		// To click on the Document tab
		selfservicepage.click_On_Document_Tab_In_SelfService();

		// To check whether the document default image is showing or not!
		Boolean value_From_Document_Default_Image = selfservicepage.check_Value_From_Document_Default_Image();
		if (value_From_Document_Default_Image == true) {
			System.out.println("Document default image is showing properly." + value_From_Document_Default_Image);

			// To assert the file name
			value_From_FileTitle = selfservicepage.read_Value_From_FileTitle();
			String expected_Result11 = document_Name;
			String actual_Result11 = value_From_FileTitle;
			Assert.assertEquals(actual_Result11, expected_Result11);
			System.out.println("Document file name got verified successfully:" + actual_Result11);

			// To click on the document file
			selfservicepage.click_on_Document();
			Thread.sleep(2000);

			// To assert the toolbar title of SelfService screen
			String selfService_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
			String expected_Result_ToolbarTitle = "PREVIEW";
			String actual_Result_ToolbarTitle = selfService_Toolbar_Title;
			Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
			System.out.println("Preview toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
			Thread.sleep(3000);

			// To click on the Share option
			selfservicepage.click_On_ShareOption_In_DocumentsORInvoice_PreviewTab();

			// To allow the access files option
			 cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
			 Thread.sleep(3000);

			andrdCmnUtil.Click_DeviceBackButton();
			Thread.sleep(4000);
			
			andrdCmnUtil.Click_DeviceBackButton();
			Thread.sleep(2000);

			// To click on the ADDITIONAL DOCUMENT tab
			selfservicepage.click_On_AdditionalDoc_Module_In_SelfService();

			// To assert the file name
			value_From_FileTitle1 = selfservicepage.read_Value_From_FileTitle();
			String expected_Result2 = additional_Document_Name;
			String actual_Result2 = value_From_FileTitle1;
			Assert.assertEquals(actual_Result2, expected_Result2);
			System.out.println("Additional document file name got verified successfully:" + actual_Result2);

			// To click on the document file
			selfservicepage.click_on_Document();
			Thread.sleep(3000);

			// To assert the toolbar title of SelfService screen
			String selfService_Toolbar_Title1 = cmnelementpage.read_From_Toolbar_Title();
			String expected_Result_ToolbarTitle1 = "PREVIEW";
			String actual_Result_ToolbarTitle1 = selfService_Toolbar_Title1;
			Assert.assertEquals(actual_Result_ToolbarTitle1, expected_Result_ToolbarTitle1);
			System.out.println("Preview toolbar title got verified successfully:" + actual_Result_ToolbarTitle1);

			// To click on the Share option
			selfservicepage.click_On_ShareOption_In_DocumentsORInvoice_PreviewTab();
			Thread.sleep(3000);

			// To allow the access files option
			//cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();

			andrdCmnUtil.Click_DeviceBackButton();
			Thread.sleep(4000);
			
			andrdCmnUtil.Click_DeviceBackButton();
			Thread.sleep(2000);

			// To click on the ADDITIONAL MANUAL tab
			selfservicepage.click_On_AdditionalManual_Module_In_SelfService();
			Thread.sleep(2000);

			// To check whether the No doc emoji is showing or not!
			Boolean value_From_Emoji_Module_In_SelfService = selfservicepage.check_Emoji_Module_In_SelfService();
			if (value_From_Emoji_Module_In_SelfService == true) {
				System.out.println(
						"No documents available emoji is showing properly." + value_From_Emoji_Module_In_SelfService);

				// To assert the No documents available text in self-service
				String value_From_NoDocuments_Text_In_SelfService = selfservicepage
						.read_From_NoDocuments_Text_In_SelfService();
				String expected_Result3 = "No documents available";
				String actual_Result3 = value_From_NoDocuments_Text_In_SelfService;
				Assert.assertEquals(actual_Result3, expected_Result3);
				System.out.println("No documents available text got verified successfully:" + actual_Result3);

				andrdCmnUtil.Click_DeviceBackButton();
				Thread.sleep(2000);

			} else {
				System.out.println(
						"No documents available emoji is not showing." + value_From_Emoji_Module_In_SelfService);
			}

		} else {
			System.out.println("Document default image is not showing." + value_From_Document_Default_Image);
		}
		
		} else {
			System.out.println("Video default image is not showing." + value_From_Video_Default_Image);
		}

	}

}
