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
import app.appium.PageFactory.DocBoxPageFactory;

public class DocBoxImplementation extends DriverIgnit {
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	DocBoxPageFactory dbPage;
	CommonElementPage cmnelementpage;
	ExcelLibrary excelLib;
	String value_From_Invoices_Module_In_DocBox;
	String value_From_Documents_Module_In_DocBox;
	String value_From_NoInvoices_Documents_Text_In_DocBox;
	String value_From_AddInvoice_Document_Text_In_DocBox;
	String value_From_FileDetails_Text_In_Dialog;
	String value_From_FileName_ValidationText_In_Dialog;
	String invoice_File_Name;
	String document_File_Name;
	String value_From_FileName_Text_In_InvoiceTab;
	String value_From_FileName_Text_In_DocumentTab;
	String pdf_Invoice_Name;
	String document_File2_Name;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {
		dbPage = new DocBoxPageFactory(driver);
		cmnelementpage = new CommonElementPage(driver);
		excelLib = new ExcelLibrary();
		invoice_File_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.DOCBOX_TESTDATA_SHEETNAME, 1, 1);
		document_File_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.DOCBOX_TESTDATA_SHEETNAME, 2, 1);
		pdf_Invoice_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.DOCBOX_TESTDATA_SHEETNAME, 3, 1);
		document_File2_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.DOCBOX_TESTDATA_SHEETNAME, 4, 1);
	}

	public void verify_UI() throws InterruptedException {

		// To comment-out below two line of codes while running through TestNG (It will
		// run after SR module)
		// appgenericlib.clickOn_MyDXcard();
		cmnelementpage.click_On_dk_Image_On_GridView();

		dbPage.click_On_DocBox_Module_On_MobileAppMenu();

		// To assert the toolbar title of Docbox screen
		String docBox_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "DOC BOX";
		String actual_Result_ToolbarTitle = docBox_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Docbox toolbar title got verified successfully:" + actual_Result_ToolbarTitle);

		// To assert the Invoice tab header
		value_From_Invoices_Module_In_DocBox = dbPage.read_From_Invoices_Module_In_DocBox();
		String expected_Result_InvoiceTab = "INVOICE";
		String actual_Result_InvoiceTab = value_From_Invoices_Module_In_DocBox;
		Assert.assertEquals(actual_Result_InvoiceTab, expected_Result_InvoiceTab);
		System.out.println("Invoice tab header got verified successfully:" + actual_Result_InvoiceTab);

		// To assert the Documents tab header
		value_From_Documents_Module_In_DocBox = dbPage.read_From_Documents_Module_In_DocBox();
		String expected_Result_DocumentTab = "DOCUMENT";
		String actual_Result_DocumentTab = value_From_Documents_Module_In_DocBox;
		Assert.assertEquals(actual_Result_DocumentTab, expected_Result_DocumentTab);
		System.out.println("Document tab header got verified successfully:" + actual_Result_DocumentTab);

		// To check whether the No doc emoji is showing or not!
		boolean value_From_Emoji_Module_In_DocBox = dbPage.check_Emoji_Module_In_DocBox();
		if (value_From_Emoji_Module_In_DocBox == true) {
			System.out.println("Its showing the no files uploaded emoji" + value_From_Emoji_Module_In_DocBox);

			// To assert the No invoices available text in doc box
			value_From_NoInvoices_Documents_Text_In_DocBox = dbPage.read_From_NoInvoices_Documents_Text_In_DocBox();
			String expected_Result_NoInvoiceTab = "No invoices available.";
			String actual_Result_NoInvoiceTab = value_From_NoInvoices_Documents_Text_In_DocBox;
			Assert.assertEquals(actual_Result_NoInvoiceTab, expected_Result_NoInvoiceTab);
			System.out.println("No invoices text got verified successfully:" + actual_Result_NoInvoiceTab);

			// To assert the "You can add an invoice by clicking on +" text in doc box
			value_From_AddInvoice_Document_Text_In_DocBox = dbPage.read_From_AddInvoice_Document_Text_In_DocBox();
			String expected_Result_AddInvoiceTab = " You can add an invoice by clicking on   +  ";
			String actual_Result_AddInvoiceTab = value_From_AddInvoice_Document_Text_In_DocBox;
			Assert.assertEquals(actual_Result_AddInvoiceTab, expected_Result_AddInvoiceTab);
			System.out.println("Add invoices text got verified successfully:" + actual_Result_AddInvoiceTab);

			// To click on the Documents tab
			dbPage.click_On_Documents_Tab_In_DocBox();

			// To check whether the Add documents is showing or not
			boolean value_From_Add_Option_In_DocBox = dbPage.read_From_Add_Option_In_DocBox();
			if (value_From_Add_Option_In_DocBox == true) {
				System.out.println("Its showing the Add option inside Docbox:" + value_From_Add_Option_In_DocBox);
			}

			// To assert the No documents text in documents section
			String value_From_NoInvoices_Documents_Text_In_DocBox1 = dbPage
					.read_From_NoInvoices_Documents_Text_In_DocBox();
			String expected_Result_NoDocumentTab = "No documents available";
			String actual_Result_NoDocumentTab = value_From_NoInvoices_Documents_Text_In_DocBox1;
			Assert.assertEquals(actual_Result_NoDocumentTab, expected_Result_NoDocumentTab);
			System.out.println("No documents text got verified successfully:" + actual_Result_NoDocumentTab);

			// To assert the "You can add document by clicking on +" text in doc box
			String value_From_AddInvoice_Document_Text_In_DocBox1 = dbPage
					.read_From_AddInvoice_Document_Text_In_DocBox();
			String expected_Result_AddDocumentTab = " You can add document by clicking on   +  ";
			String actual_Result_AddDocumentTab = value_From_AddInvoice_Document_Text_In_DocBox1;
			Assert.assertEquals(actual_Result_AddDocumentTab, expected_Result_AddDocumentTab);
			System.out.println("Add Documents text got verified successfully:" + actual_Result_AddDocumentTab);

			// To click on the Invoice Tab
			dbPage.click_On_Invoice_Tab_In_DocBox();

		}

	}

	public void add_Invoice_Document_Files() throws InterruptedException {

		// To click on the Add documents icon inside doc box screen
		dbPage.click_On_Add_Option_In_DocBox();

		// To click on the allow button for the media access pop-up confirmation
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();

		// To click on the camera option in scan document dialog
		cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();

		// To click on the allow button for the media access pop-up confirmation
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(4000);

		// To click on the camera record button to take picture
		cmnelementpage.takePicture_In_NewRequestScreen_Attachment();
		Thread.sleep(4000);

		// To click on the delete button on the preview screen
		cmnelementpage.Click_DeleteButton_In_Attachment_Preview_Screen();

		// To assert the deletion message on pop-up confirmation
		String value_From_PopUp_Message_Text1 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_In_PopupConfirmation = "Would you like to delete this attachment?";
		String actual_Result_In_PopupConfirmation = value_From_PopUp_Message_Text1;
		Assert.assertEquals(actual_Result_In_PopupConfirmation, expected_Result_In_PopupConfirmation);
		System.out.println(
				"Attachment deletion pop-up text got verified successfully:" + actual_Result_In_PopupConfirmation);

		// To click on the confirm button on confirmation pop-up
		cmnelementpage.clickOn_Ok_On_Popup();

		// To click on the Add documents icon inside doc box screen
		dbPage.click_On_Add_Option_In_DocBox();

		// To click on the camera option in scan document dialog
		cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();

		// To click on the camera record button to take picture
		cmnelementpage.takePicture_In_NewRequestScreen_Attachment();

		// To click on the tick mark on the Attachment preview screen
		cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();

		// To assert the "File details" text on File details dialog
		value_From_FileDetails_Text_In_Dialog = dbPage.read_From_FileDetails_Text_In_Dialog();
		String expected_FileDetails_DialogText = "FILE DETAILS";
		String actual_FileDetails_DialogText = value_From_FileDetails_Text_In_Dialog;
		Assert.assertEquals(actual_FileDetails_DialogText, expected_FileDetails_DialogText);
		System.out.println("File Details dialog text got verified successfully:" + actual_FileDetails_DialogText);

		// To click on the cancel button on the File details dialog
		dbPage.click_On_Cancel_Button_In_FileDetails_Dialog();

		// To click on the Add documents icon inside doc box screen
		dbPage.click_On_Add_Option_In_DocBox();

		// To click on the camera option in scan document dialog
		cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();

		// To click on the camera record button to take picture
		cmnelementpage.takePicture_In_NewRequestScreen_Attachment();

		// To click on the tick mark on the Attachment preview screen
		cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
		Thread.sleep(3000);

		// To click on the upload button on the file details dialog
		dbPage.click_On_Upload_Button_In_FileDetails_Dialog();

		// To assert the File name validation, on File details dialog
		String value_From_FileName_ValidationText_In_Dialog = dbPage.read_From_FileName_ValidationText_In_Dialog();
		String expected_FileName_Validation_DialogText = "Please enter a file name";
		String actual_FileName_Validation_DialogText = value_From_FileName_ValidationText_In_Dialog;
		Assert.assertEquals(actual_FileName_Validation_DialogText, expected_FileName_Validation_DialogText);
		System.out.println(
				"File Name Validation dialog text got verified successfully:" + actual_FileName_Validation_DialogText);

		// To check whether the Invoice radio button is selected by default or not!
		boolean invoice_Option_In_FileDetails_Dialog = dbPage.read_From_Invoice_Option_In_FileDetails_Dialog();

		if (invoice_Option_In_FileDetails_Dialog == true) {
			System.out.println(" Invoice radio button has selected by default:" + invoice_Option_In_FileDetails_Dialog);
			Thread.sleep(3000);

			// To Give input in File name field, from excel
			dbPage.write_On_EditText_FileName_In_FileDetails_Dialog(invoice_File_Name);

			// To click on the upload button
			dbPage.click_On_Upload_Button_In_FileDetails_Dialog();

			// To assert the Success message in the pop-up
			String value_From_InvoiceAttachment_SuccessPopup = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_Success_PopupMessage = "Invoice uploaded successfully";
			String actual_Success_PopupMessage = value_From_InvoiceAttachment_SuccessPopup;
			Assert.assertEquals(actual_Success_PopupMessage, expected_Success_PopupMessage);
			System.out.println("Success pop-up text got verified successfully:" + actual_Success_PopupMessage);

			// To click on the ok button on the pop-up message
			cmnelementpage.clickOn_Ok_On_Popup();

			// To assert the name of the attachment that has been attached in invoice
			value_From_FileName_Text_In_InvoiceTab = dbPage.read_From_FileName_Text_In_InvoiceORDocumentTab();
			String expected_FileName = invoice_File_Name;
			String actual_FileName = value_From_FileName_Text_In_InvoiceTab;
			Assert.assertEquals(actual_FileName, expected_FileName);
			System.out.println("Attached File name got verified successfully:" + actual_FileName);

			// To click on the Add documents icon inside doc box screen
			dbPage.click_On_Add_Option_In_DocBox();

			// To click on the first image from the list of the files
			cmnelementpage.click_On_FirstImage_In_list_Of_Images_In_ScanDocument_Screen();
			Thread.sleep(4000);

			// To click on the tick mark on the Attachment preview screen
			cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
			Thread.sleep(3000);

			// To select the Document radio button
			dbPage.click_On_Document_RadioButton_In_FileDetails_Dialog();
			Thread.sleep(2000);

			// To Give input in File name field, from excel
			dbPage.write_On_EditText_FileName_In_FileDetails_Dialog(document_File_Name);

			// To click on the upload button
			dbPage.click_On_Upload_Button_In_FileDetails_Dialog();

			// To click on the ok of the success pop-up
			cmnelementpage.clickOn_Ok_On_Popup();

			// To click on the Document tab
			dbPage.click_On_Documents_Tab_In_DocBox();
			Thread.sleep(4000);

			// To assert the Document that has attached from the device
			value_From_FileName_Text_In_DocumentTab = dbPage.read_From_FileName_Text_In_InvoiceORDocumentTab();
			String expected_FileName_In_DocumentTab = document_File_Name;
			String actual_FileName_In_DocumentTab = value_From_FileName_Text_In_DocumentTab;
			Assert.assertEquals(actual_FileName_In_DocumentTab, expected_FileName_In_DocumentTab);
			System.out.println("Attached File name got verified successfully:" + actual_FileName_In_DocumentTab);

			// To click on the attached file
			dbPage.click_On_AttachedFile_In_DocumentsORInvoice_Tab();
			Thread.sleep(4000);

			/*
			 * // To assert the preview screen String preview_ToolbarTitle=
			 * cmnelementpage.read_From_Toolbar_Title(); String expected_ToolbarTitle=
			 * "PREVIEW"; String actual_ToolbarTitle = preview_ToolbarTitle;
			 * Assert.assertEquals(actual_ToolbarTitle, expected_ToolbarTitle);
			 * System.out.println("Toolbar Title got verified successfully:"
			 * +actual_ToolbarTitle );
			 */

			// To click on the Share option
			dbPage.click_On_ShareOption_In_DocumentsORInvoice_PreviewTab();
			Thread.sleep(5000);
			System.out.println("Its showing the options through which attached file can be shared");

			// To click the device back button
			andrdCmnUtil.Click_DeviceBackButton();

			// To click on the delete option on the preview screen
			dbPage.click_On_DeleteOption_In_DocumentsORInvoice_PreviewTab();

			// To click on the cancel button on the confirmation popup
			cmnelementpage.clickOn_Cancel_On_Popup();

			// To click on the delete option on the preview screen
			dbPage.click_On_DeleteOption_In_DocumentsORInvoice_PreviewTab();

			// To click on the confirm button on the confirmation pop-up
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(4000);

			// To assert the "no documents" message in document screen after deleting the
			// only attachment configured
			String value_From_NoInvoices_Documents_Text_In_DocBox1 = dbPage
					.read_From_NoInvoices_Documents_Text_In_DocBox();
			String expected_Result_NoDocumentTab = "No documents available";
			String actual_Result_NoDocumentTab = value_From_NoInvoices_Documents_Text_In_DocBox1;
			Assert.assertEquals(actual_Result_NoDocumentTab, expected_Result_NoDocumentTab);
			System.out.println("No documents text got verified successfully:" + actual_Result_NoDocumentTab);
			Thread.sleep(3000);

			// To click on the add attachment button
			dbPage.click_On_Add_Option_In_DocBox();

			// To click on the gallery on Scan document pop-up
			cmnelementpage.clickOn_Gallery_On_ScanDocument_dialog();

			/*
			 * // To click on the mobile Downloads for attachment
			 * cmnelementpage.clickOn_Downloads_In_Mobile(); Thread.sleep(4000);
			 */

			// To click on the first pdf file inside downloads
			cmnelementpage.clickOn_FirstPDF_In_Downloads();

			// To click on the done button on preview screen
			cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();

			// To give the name of the pdf in file name field
			dbPage.write_On_EditText_FileName_In_FileDetails_Dialog(pdf_Invoice_Name);

			// To click on the upload button
			dbPage.click_On_Upload_Button_In_FileDetails_Dialog();

			// To click on the ok button
			cmnelementpage.clickOn_Ok_On_Popup();

			// To assert whether the pdf is showing or not in invoice screen or not
			String value_From_PDF_Attachment = dbPage.read_From_FileName_Text_In_InvoiceORDocumentTab();
			String expected_Result_ForPDF_File = pdf_Invoice_Name;
			String actual_Result_ForPDF_File = value_From_PDF_Attachment;
			Assert.assertEquals(actual_Result_ForPDF_File, expected_Result_ForPDF_File);
			System.out.println("PDF attachment file name got verified successfully:" + actual_Result_ForPDF_File);

			// To attach another image file in documents by taking a picture
			dbPage.click_On_Add_Option_In_DocBox();
			cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();
			Thread.sleep(4000);
			cmnelementpage.takePicture_In_NewRequestScreen_Attachment();
			cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
			dbPage.write_On_EditText_FileName_In_FileDetails_Dialog(document_File2_Name);
			dbPage.click_On_Upload_Button_In_FileDetails_Dialog();
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(2000);

			// To click on the invoice tab
			dbPage.click_On_Invoice_Tab_In_DocBox();
			Thread.sleep(4000);

			// To take the count and print the number of attached files inside Invoice Tab
			dbPage.count_list_Of_Invoices_In_InvoiceTab();
			Thread.sleep(4000);

			// To click on the documents tab
			dbPage.click_On_Documents_Tab_In_DocBox();
			Thread.sleep(4000);

			// To take the count and print the number of attached files inside Document Tab
			dbPage.count_list_Of_Documents_In_DocumentTab();
			Thread.sleep(4000);

			System.out.println("All Testcases executed successfully");
		} else {
			System.out.println(" Invoice radio button has not been selected by default, Hence Showing error here.");
		}

		// To click the device back button
		andrdCmnUtil.Click_DeviceBackButton();

		// To click on the more option
		cmnelementpage.clickOn_More_Option();

	}

	/*
	 * public void LogOut() throws InterruptedException { //tearDown();
	 * 
	 * //To scroll down to the logout option cmnelementpage.clickOn_More_Option();
	 * andrdCmnUtil.scrollAndClick("Logout");
	 * 
	 * //To click on the ok button of the success pop-up
	 * cmnelementpage.clickOn_Ok_On_Popup(); System.out.println("Logout performed");
	 * System.out.println(" Successfully done with the logout functionality"); }
	 */

}
