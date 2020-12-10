package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class MyPaymentsPageFactory {
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_From_dateOfPayment_In_MyPayments;
	String value_From_SRN_In_MyPayments;
	String value_From_InvoiceNumber_In_MyPayments;
	String value_From_ServiceType_In_MyPayments;
	String value_From_CurrencySymbol_In_MyPayments;
	String value_From_ServiceFee_In_MyPayments;

	public MyPaymentsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To click on the pending tab in my-payments
	@FindBy(xpath = "//android.widget.TextView[@text='PENDING']")
	private WebElement pending_Tab_In_MyPayments;

	public void click_On_Pending_Tab_In_MyPayments() {
		pending_Tab_In_MyPayments.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the History tab in my-payments
	@FindBy(xpath = "//android.widget.TextView[@text='HISTORY']")
	private WebElement history_Tab_In_MyPayments;

	public void click_On_History_Tab_In_MyPayments() {
		history_Tab_In_MyPayments.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To check the nopendingpayment/nopaymentHistory emoji in mypayment screen
	@FindBy(id = "payment_negative_scenario")
	private WebElement noPendingPaymentEmoji_In_MyPayments;

	public boolean Value_For_NoPaymentEmoji_In_MyPayments() {
		boolean value_For_NoPaymentEmoji_In_MyPayments = noPendingPaymentEmoji_In_MyPayments.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_For_NoPaymentEmoji_In_MyPayments;
	}

	// To check the nopayment Text in mypayment screen
	@FindBy(id = "negative_scenario_text")
	private WebElement noPendingPaymentText_In_MyPayments;

	public String Value_For_NoPaymentText_In_MyPayments() {
		String value_For_NoPaymentText_In_MyPayments = noPendingPaymentText_In_MyPayments.getText();
		andrdCmnUtil.implicit_Wait();
		return value_For_NoPaymentText_In_MyPayments;
	}

	// To assert the date of payment
	@FindBy(id = "date_tv")
	private List<WebElement> dateOfPayment_In_MyPayments;

	public String readFrom_Value_From_dateOfPayment_In_MyPayments() {
		for (int i = 0; i < dateOfPayment_In_MyPayments.size();) {
			value_From_dateOfPayment_In_MyPayments = dateOfPayment_In_MyPayments.get(i).getText();
			break;

		}
		return value_From_dateOfPayment_In_MyPayments;
	}

	// To assert the SRN
	@FindBy(id = "srn_tv")
	private List<WebElement> SRN_In_MyPayments;

	public String readFrom_Value_From_SRN_In_MyPayments() {
		for (int i = 0; i < SRN_In_MyPayments.size();) {
			value_From_SRN_In_MyPayments = SRN_In_MyPayments.get(i).getText();
			break;

		}
		return value_From_SRN_In_MyPayments;
	}

	// To assert the invoice number
	@FindBy(id = "invoice_num_tv")
	private List<WebElement> invoiceNumber_In_MyPayments;

	public String readFrom_Value_From_InvoiceNumber_In_MyPayments() {
		for (int i = 0; i < invoiceNumber_In_MyPayments.size();) {
			value_From_InvoiceNumber_In_MyPayments = invoiceNumber_In_MyPayments.get(i).getText();
			break;

		}
		return value_From_InvoiceNumber_In_MyPayments;
	}

	// To assert the Service Type
	@FindBy(id = "subject_tv")
	private List<WebElement> serviceType_In_MyPayments;

	public String readFrom_Value_From_ServiceType_In_MyPayments() {
		for (int i = 0; i < invoiceNumber_In_MyPayments.size();) {
			value_From_ServiceType_In_MyPayments = serviceType_In_MyPayments.get(i).getText();
			break;

		}
		return value_From_ServiceType_In_MyPayments;
	}

	// To assert the currency symbol
	@FindBy(id = "currency_tv")
	private List<WebElement> currencySymbol_In_MyPayments;

	public String readFrom_Value_From_CurrencySymbol_In_MyPayments() {
		for (int i = 0; i < invoiceNumber_In_MyPayments.size();) {
			value_From_CurrencySymbol_In_MyPayments = currencySymbol_In_MyPayments.get(i).getText();
			break;

		}
		return value_From_CurrencySymbol_In_MyPayments;
	}

	// To assert the Service fee for the SRN
	@FindBy(id = "amount_tv")
	private List<WebElement> serviceFee_In_MyPayments;

	public String readFrom_Value_From_ServiceFee_In_MyPayments() {
		for (int i = 0; i < invoiceNumber_In_MyPayments.size();) {
			value_From_ServiceFee_In_MyPayments = serviceFee_In_MyPayments.get(i).getText();
			break;

		}
		return value_From_ServiceFee_In_MyPayments;
	}

	// To click on the paynow button
	@FindBy(id = "pay_now_button")
	private List<WebElement> payNowButton_In_MyPayments;

	public void click_On_PayNowButton_In_MyPayments() {
		for (int i = 0; i < invoiceNumber_In_MyPayments.size();) {
			payNowButton_In_MyPayments.get(i).click();
			break;

		}

	}
	
	// To click on the view details button
	@FindBy(id = "view_details_button")
	private List<WebElement> viewDetails_In_MyPayments;

	public void click_On_ViewDetails_In_MyPayments() {
		for (int i = 0; i < viewDetails_In_MyPayments.size();) {
			viewDetails_In_MyPayments.get(i).click();
			break;

		}

	}
	
	// To assert the pdf count, while the pdf is previewed 
	@FindBy(id = "pdf_page_count_tv")
	private WebElement pdf_Count_In_PDFPreview;

	public String read_Value_From_pdf_Count_In_PDFPreview() {
		String value_From_pdf_Count_In_PDFPreview = pdf_Count_In_PDFPreview
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_pdf_Count_In_PDFPreview;
	}
	
	

}
