package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.BuyPageFactory;
import app.appium.PageFactory.DocBoxPageFactory;
import app.appium.PageFactory.MyPaymentsPageFactory;

public class MyPaymentsImplementation extends DriverIgnit {

	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	CommonElementPage cmnelementpage;
	MyPaymentsPageFactory mypaymentspage;
	BuyPageFactory buypage;
	ExcelLibrary excelLib;
	DocBoxPageFactory dbPage;
	String SRN;
	String invoice_Number;
	String service_Fee;
	String service_Type;
	String service_Fee_In_Razorpay;
	String merchant_Name;
	String merchant_Description;

	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		mypaymentspage = new MyPaymentsPageFactory(driver);
		buypage = new BuyPageFactory(driver);
		dbPage = new DocBoxPageFactory(driver);
		excelLib = new ExcelLibrary();
		SRN = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 2, 1);
		invoice_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 3, 1);
		service_Fee = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 4, 1);
		service_Type = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 1, 1);
		service_Fee_In_Razorpay = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 5, 1);
		merchant_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 6, 1);
		merchant_Description = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYPAYMENTS_TESTDATA_SHEETNAME, 7, 1);

	}

	public void verify_UI_Functionality_For_PendingScreen() throws InterruptedException {
		buypage = new BuyPageFactory(driver);

		cmnelementpage.clickOn_More_Option();

		// To click on the mypayments menu
		try {
			andrdCmnUtil.scrollAndClick("My Payments");
		} catch (Exception e) {
			System.out.println("No Need to Scroll");
		}

		// To assert the tool-bar title of My payments screen
		String payments_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "PAYMENTS";
		String actual_Result_ToolbarTitle = payments_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Payments toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the SRN
		String value_From_SRN_In_MyPayments = mypaymentspage.readFrom_Value_From_SRN_In_MyPayments();
		String expected_Result_In_PendingPaymentScreen1 = SRN;
		String actual_Result__In_PendingPaymentScreen1 = value_From_SRN_In_MyPayments;
		Assert.assertEquals(actual_Result__In_PendingPaymentScreen1, expected_Result_In_PendingPaymentScreen1);
		System.out.println("SRN got verified successfully:" + actual_Result__In_PendingPaymentScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the invoice number
		String value_From_InvoiceNumber_In_MyPayments = mypaymentspage
				.readFrom_Value_From_InvoiceNumber_In_MyPayments();
		String expected_Result_In_PendingPaymentScreen2 = invoice_Number;
		String actual_Result__In_PendingPaymentScreen2 = value_From_InvoiceNumber_In_MyPayments;
		Assert.assertEquals(actual_Result__In_PendingPaymentScreen2, expected_Result_In_PendingPaymentScreen2);
		System.out.println("Invoice number got verified successfully:" + actual_Result__In_PendingPaymentScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Service Type
		String value_From_ServiceType_In_MyPayments = mypaymentspage.readFrom_Value_From_ServiceType_In_MyPayments();
		String expected_Result_In_PendingPaymentScreen3 = service_Type;
		String actual_Result__In_PendingPaymentScreen3 = value_From_ServiceType_In_MyPayments;
		Assert.assertEquals(actual_Result__In_PendingPaymentScreen3, expected_Result_In_PendingPaymentScreen3);
		System.out.println("Service Type got verified successfully:" + actual_Result__In_PendingPaymentScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the currency symbol
		String value_From_CurrencySymbol_In_MyPayments = mypaymentspage
				.readFrom_Value_From_CurrencySymbol_In_MyPayments();
		String expected_Result_In_PendingPaymentScreen4 = "₹";
		String actual_Result__In_PendingPaymentScreen4 = value_From_CurrencySymbol_In_MyPayments;
		Assert.assertEquals(actual_Result__In_PendingPaymentScreen4, expected_Result_In_PendingPaymentScreen4);
		System.out.println("Currency symbol got verified successfully:" + actual_Result__In_PendingPaymentScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the Service fee for the SRN
		String value_From_ServiceFee_In_MyPayments = mypaymentspage.readFrom_Value_From_ServiceFee_In_MyPayments();
		String expected_Result_In_PendingPaymentScreen5 = service_Fee;
		String actual_Result__In_PendingPaymentScreen5 = value_From_ServiceFee_In_MyPayments;
		Assert.assertEquals(actual_Result__In_PendingPaymentScreen5, expected_Result_In_PendingPaymentScreen5);
		System.out.println("Service Fee got verified successfully:" + actual_Result__In_PendingPaymentScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on the paynow button
		mypaymentspage.click_On_PayNowButton_In_MyPayments();

		// To click on the allow access
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();

		// To assert the merchant name fee in razorpay screen
		String value_from_MerchantName_In_RazorpayScreen = buypage.read_Value_from_MerchantName_In_RazorpayScreen();
		String expected_Result_In_RazorpayScreen1 = merchant_Name;
		String actual_Result__In_RazorpayScreen1 = value_from_MerchantName_In_RazorpayScreen;
		Assert.assertEquals(actual_Result__In_RazorpayScreen1, expected_Result_In_RazorpayScreen1);
		System.out.println(
				"Merchant name in razorpay screen got verified successfully:" + actual_Result__In_RazorpayScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the merchant description fee in razorpay screen
		String value_from_ModuleName_In_RazorpayScreen = buypage.read_Value_from_ModuleName_In_RazorpayScreen();
		String expected_Result_In_RazorpayScreen2 = merchant_Description;
		String actual_Result__In_RazorpayScreen2 = value_from_ModuleName_In_RazorpayScreen;
		Assert.assertEquals(actual_Result__In_RazorpayScreen2, expected_Result_In_RazorpayScreen2);
		System.out.println("Merchant description in razorpay screen got verified successfully:"
				+ actual_Result__In_RazorpayScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the price/service fee in razorpay screen
		String value_from_amountField_In_RazorpayScreen = buypage.read_Value_from_amountField_In_RazorpayScreen();
		String expected_Result_In_RazorpayScreen3 = service_Fee_In_Razorpay;
		String actual_Result__In_RazorpayScreen3 = value_from_amountField_In_RazorpayScreen;
		Assert.assertEquals(actual_Result__In_RazorpayScreen3, expected_Result_In_RazorpayScreen3);
		System.out.println(
				"Service Fee in razorpay screen got verified successfully:" + actual_Result__In_RazorpayScreen3);
		andrdCmnUtil.implicit_Wait();

		// To write on the email id field (razorpay)
		buypage.write_On_EmailID_Field("sujaya@yopmail.com");

		// To click on proceed button in payment options screen
		buypage.click_On_Proceed_Button();

		// To select net-banking option in payments screen
		buypage.select_Netbanking_In_Payments_Screen();

		// To select sbi bank option in payments screen
		buypage.select_sbi_Netbanking_In_Payments_Screen();

		// To select payment option in payments screen
		buypage.select_Payment_Button_In_Payments_Screen();

		// To select success button in payments screen
		buypage.select_Success_Button_In_Payments_Screen();

		// To click on Ok pop-up
		cmnelementpage.clickOn_Ok_On_Popup();

	}

	public void verify_UI_Functionality_For_HistoryScreen() throws InterruptedException {
		buypage = new BuyPageFactory(driver);
		dbPage = new DocBoxPageFactory(driver);


		// To click on the History tab
		mypaymentspage.click_On_History_Tab_In_MyPayments();

		// To assert the SRN
		String value_From_SRN_In_MyPayments = mypaymentspage.readFrom_Value_From_SRN_In_MyPayments();
		String expected_Result_In_HistoryPaymentScreen1 = SRN;
		String actual_Result__In_HistoryPaymentScreen1 = value_From_SRN_In_MyPayments;
		Assert.assertEquals(actual_Result__In_HistoryPaymentScreen1, expected_Result_In_HistoryPaymentScreen1);
		System.out.println("SRN got verified successfully:" + actual_Result__In_HistoryPaymentScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the invoice number
		String value_From_InvoiceNumber_In_MyPayments = mypaymentspage
				.readFrom_Value_From_InvoiceNumber_In_MyPayments();
		String expected_Result_In_HistoryPaymentScreen2 = invoice_Number;
		String actual_Result__In_HistoryPaymentScreen2 = value_From_InvoiceNumber_In_MyPayments;
		Assert.assertEquals(actual_Result__In_HistoryPaymentScreen2, expected_Result_In_HistoryPaymentScreen2);
		System.out.println("Invoice number got verified successfully:" + actual_Result__In_HistoryPaymentScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Service Type
		String value_From_ServiceType_In_MyPayments = mypaymentspage.readFrom_Value_From_ServiceType_In_MyPayments();
		String expected_Result_In_HistoryPaymentScreen3 = service_Type;
		String actual_Result__In_HistoryPaymentScreen3 = value_From_ServiceType_In_MyPayments;
		Assert.assertEquals(actual_Result__In_HistoryPaymentScreen3, expected_Result_In_HistoryPaymentScreen3);
		System.out.println("Service Type got verified successfully:" + actual_Result__In_HistoryPaymentScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the currency symbol
		String value_From_CurrencySymbol_In_MyPayments = mypaymentspage
				.readFrom_Value_From_CurrencySymbol_In_MyPayments();
		String expected_Result_In_HistoryPaymentScreen4 = "₹";
		String actual_Result__In_HistoryPaymentScreen4 = value_From_CurrencySymbol_In_MyPayments;
		Assert.assertEquals(actual_Result__In_HistoryPaymentScreen4, expected_Result_In_HistoryPaymentScreen4);
		System.out.println("Currency symbol got verified successfully:" + actual_Result__In_HistoryPaymentScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the Service fee for the SRN
		String value_From_ServiceFee_In_MyPayments = mypaymentspage.readFrom_Value_From_ServiceFee_In_MyPayments();
		String expected_Result_In_HistoryPaymentScreen5 = service_Fee;
		String actual_Result__In_HistoryPaymentScreen5 = value_From_ServiceFee_In_MyPayments;
		Assert.assertEquals(actual_Result__In_HistoryPaymentScreen5, expected_Result_In_HistoryPaymentScreen5);
		System.out.println("Service Fee got verified successfully:" + actual_Result__In_HistoryPaymentScreen5);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the view details button
		mypaymentspage.click_On_ViewDetails_In_MyPayments();
		
		// To assert the tool-bar title of My payments screen
		String preview_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "PREVIEW";
		String actual_Result_ToolbarTitle = preview_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Preview toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();
		
		// To assert the pdf count, while the pdf is previewed
		String value_From_pdf_Count_In_PDFPreview = mypaymentspage.read_Value_From_pdf_Count_In_PDFPreview();
		String expected_Result = "1 / 1";
		String actual_Result = value_From_pdf_Count_In_PDFPreview;
		Assert.assertEquals(actual_Result, expected_Result);
		System.out.println("Pdf count got verified successfully:" + actual_Result);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the Share option
		dbPage.click_On_ShareOption_In_DocumentsORInvoice_PreviewTab();
		Thread.sleep(5000);
		System.out.println("Its showing the options through which attached file can be shared");
		
		// To click on the device back button
		andrdCmnUtil.Click_DeviceBackButton();
	}

}
