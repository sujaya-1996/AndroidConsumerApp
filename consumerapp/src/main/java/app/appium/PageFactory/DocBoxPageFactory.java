package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class DocBoxPageFactory 
{
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	
	public DocBoxPageFactory (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	
	// To click on the Doc Box module on Mobile app menus
	@FindBy (xpath="//android.widget.TextView[@text='Doc Box']")
	private WebElement docBox_Module_On_MobileAppMenu;
	
	public void click_On_DocBox_Module_On_MobileAppMenu()
	{
		docBox_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the Invoice tab header
	@FindBy (xpath="//android.widget.TextView[@text='INVOICE']")
	private WebElement invoices_Module_In_DocBox;
	
	public String read_From_Invoices_Module_In_DocBox()
	{
		String value_From_Invoices_Module_In_DocBox = invoices_Module_In_DocBox.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Invoices_Module_In_DocBox;
	}
	
	// To assert the Documents tab header
	@FindBy (xpath="//android.widget.TextView[@text='DOCUMENT']")
	private WebElement documents_Module_In_DocBox;
	
	public String read_From_Documents_Module_In_DocBox()
	{
		String value_From_Documents_Module_In_DocBox = documents_Module_In_DocBox.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Documents_Module_In_DocBox;
	}
	
	// To check whether the No doc emoji is showing or not!
	@FindBy (id="iv_no_doc")
	private WebElement emoji_Module_In_DocBox;
	
	public boolean check_Emoji_Module_In_DocBox()
	{
		boolean value_From_Emoji_Module_In_DocBox = emoji_Module_In_DocBox.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Emoji_Module_In_DocBox;
	}
	
	// To assert the No invoices available text in doc box
	@FindBy (id="no_brand_invoices_tv")
	private WebElement noInvoices_Documents_Text_In_DocBox;
	
	public String read_From_NoInvoices_Documents_Text_In_DocBox()
	{
		String value_From_NoInvoices_Documents_Text_In_DocBox = noInvoices_Documents_Text_In_DocBox.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_NoInvoices_Documents_Text_In_DocBox;
	}
	
	// To assert the  "You can add an invoice by clicking on   +"  text in docbox
	@FindBy (id="no_brand_invoices_tv1")
	private WebElement addInvoice_Document_Text_In_DocBox;
	
	public String read_From_AddInvoice_Document_Text_In_DocBox()
	{
		String value_From_AddInvoice_Document_Text_In_DocBox = addInvoice_Document_Text_In_DocBox.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_AddInvoice_Document_Text_In_DocBox;
	}
	
	// To click on the Document tab  
	@FindBy (xpath="//android.widget.TextView[@text='DOCUMENT']")
	private WebElement document_Tab_In_DocBox;
	
	public void click_On_Documents_Tab_In_DocBox()
	{
		document_Tab_In_DocBox.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To check whether the Add documents is showing or not
	@FindBy (id="action_add_doc")
	private WebElement add_Option_In_DocBox;
	
	public boolean read_From_Add_Option_In_DocBox()
	{
		boolean value_From_Add_Option_In_DocBox=add_Option_In_DocBox.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Add_Option_In_DocBox;
		
	}
	
	// To click on the Invoice tab  
	@FindBy (xpath="//android.widget.TextView[@text='INVOICE']")
	private WebElement invoice_Tab_In_DocBox;
	
	public void click_On_Invoice_Tab_In_DocBox()
	{
		invoice_Tab_In_DocBox.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To click on the Add documents icon inside docbox screen
	@FindBy (id="action_add_doc")
	private WebElement add_Button_In_DocBox;
	
	public void  click_On_Add_Option_In_DocBox()
	{
		add_Button_In_DocBox.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the "File details" text on File details dialog
	@FindBy (id="title_tv")
	private WebElement fileDetails_Text_In_Dialog;
	
	public String read_From_FileDetails_Text_In_Dialog()
	{
		String value_From_FileDetails_Text_In_Dialog = fileDetails_Text_In_Dialog.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_FileDetails_Text_In_Dialog;
	}
	
	// To click on the cancel button on the File details dialog screen
	@FindBy (id="cancel_select_brand_tv")
	private WebElement cancel_Button_In_FileDetails_Dialog;
	
	public void  click_On_Cancel_Button_In_FileDetails_Dialog()
	{
		cancel_Button_In_FileDetails_Dialog.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To click on the upload button on the file details dialog
	@FindBy (id="upload_file_iv")
	private WebElement upload_Button_In_FileDetails_Dialog;
	
	public void  click_On_Upload_Button_In_FileDetails_Dialog()
	{
		upload_Button_In_FileDetails_Dialog.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the File name validation, on File details dialog
	@FindBy (id="textinput_error")
	private WebElement fileName_ValidationText_In_Dialog;
	
	public String read_From_FileName_ValidationText_In_Dialog()
	{
		String value_From_FileName_ValidationText_In_Dialog = fileName_ValidationText_In_Dialog.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_FileName_ValidationText_In_Dialog;
	}
	
	// To check whether the Invoice radio button is selected by default or not!
	@FindBy (id="rb_invoice")
	private WebElement invoice_Option_In_FileDetails_Dialog;
	
	public boolean read_From_Invoice_Option_In_FileDetails_Dialog()
	{
		boolean value_From_Invoice_Option_In_FileDetails_Dialog=invoice_Option_In_FileDetails_Dialog.isEnabled();
		andrdCmnUtil.implicit_Wait();
		return value_From_Invoice_Option_In_FileDetails_Dialog;
		
	}
	
	// To Give input in File name field, from excel
	@FindBy (id="file_name_edittext")
	private WebElement editText_FileName_In_FileDetails_Dialog;
	
	public void  write_On_EditText_FileName_In_FileDetails_Dialog(String invoice_Name_From_Excel)
	{
		editText_FileName_In_FileDetails_Dialog.sendKeys(invoice_Name_From_Excel);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the name of the attachment that has been attached in invoice or document
	@FindBy (id="title")
	private WebElement fileName_Text_In_InvoiceORDocumentTab;
	
	public String read_From_FileName_Text_In_InvoiceORDocumentTab()
	{
		String value_FileName_Text_In_InvoiceORDocumentTab = fileName_Text_In_InvoiceORDocumentTab.getText();
		andrdCmnUtil.implicit_Wait();
		return value_FileName_Text_In_InvoiceORDocumentTab;
	}
	
	// To select the Document radio button
	@FindBy (id="rb_document")
	private WebElement document_RadioButton_In_FileDetails_Dialog;
	
	public void  click_On_Document_RadioButton_In_FileDetails_Dialog()
	{
		document_RadioButton_In_FileDetails_Dialog.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To click on the attached file
	@FindBy (id="purchase_partner_logo_iv")
	private WebElement attachedFile_In_DocumentsORInvoice_Tab;
	
	public void  click_On_AttachedFile_In_DocumentsORInvoice_Tab()
	{
		attachedFile_In_DocumentsORInvoice_Tab.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To click on the Share option
	@FindBy (id="fab")
	private WebElement shareOption_In_DocumentsORInvoice_PreviewTab ;
	
	public void  click_On_ShareOption_In_DocumentsORInvoice_PreviewTab()
	{
		shareOption_In_DocumentsORInvoice_PreviewTab.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To click on the delete option on the preview screen
	@FindBy (id="action_view_delete")
	private WebElement deleteOption_In_DocumentsORInvoice_PreviewTab;
	
	public void  click_On_DeleteOption_In_DocumentsORInvoice_PreviewTab()
	{
		deleteOption_In_DocumentsORInvoice_PreviewTab.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	 //To take the count and print the number of attached files inside Invoice Tab
	@FindBy (id="title")
	private List<WebElement> list_Of_Invoices_In_InvoiceTab;
	
	public void count_list_Of_Invoices_In_InvoiceTab()
	{
		
		int number_Of_Invoices=list_Of_Invoices_In_InvoiceTab.size();
		andrdCmnUtil.implicit_Wait();
		System.out.println("Number of Invoices attached is:"+ number_Of_Invoices);
	}
	
	@FindBy (id="title")
	private List<WebElement> list_Of_Documents_In_DocumentTab;
	
	public void count_list_Of_Documents_In_DocumentTab()
	{
		
		int number_Of_Documents=list_Of_Documents_In_DocumentTab.size();
		andrdCmnUtil.implicit_Wait();
		System.out.println("Number of Documents attached is:"+ number_Of_Documents);
	}
}
