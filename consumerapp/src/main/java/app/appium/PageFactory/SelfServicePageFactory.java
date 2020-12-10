package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class SelfServicePageFactory {

	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_From_FileTitle;

	public SelfServicePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To click on the Self service module on Mobile app menus
	@FindBy(xpath = "//android.widget.TextView[@text='Self Service']")
	private WebElement selfService_Module_On_MobileAppMenu;

	public void click_On_SelfService_Module_On_MobileAppMenu() {
		selfService_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the Videos tab header
	@FindBy(xpath = "//android.widget.TextView[@text='VIDEOS']")
	private WebElement videos_Module_In_SelfService;

	public String read_From_Videos_Module_In_SelfService() {
		String value_From_Videos_Module_In_SelfService = videos_Module_In_SelfService.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Videos_Module_In_SelfService;
	}

	// To assert the Documents tab header
	@FindBy(xpath = "//android.widget.TextView[@text='DOCUMENT']")
	private WebElement documents_Module_In_SelfService;

	public String read_From_Documents_Module_In_SelfService() {
		String value_From_Documents_Module_In_SelfService = documents_Module_In_SelfService.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Documents_Module_In_SelfService;
	}

	// To assert the ADDITIONAL DOCUMENT tab header
	@FindBy(xpath = "//android.widget.TextView[@text='ADDITIONAL DOCUMENT ']")
	private WebElement additionalDocuments_Module_In_SelfService;

	public String read_From_AdditionalDocuments_Module_In_SelfService() {
		String value_From_AdditionalDocuments_Module_In_SelfService = additionalDocuments_Module_In_SelfService
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_AdditionalDocuments_Module_In_SelfService;
	}

	// To click on the Document tab
	@FindBy(xpath = "//android.widget.TextView[@text='DOCUMENT']")
	private WebElement document_Tab_In_SelfService;

	public void click_On_Document_Tab_In_SelfService() {
		document_Tab_In_SelfService.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the ADDITIONAL DOCUMENT tab
	@FindBy(xpath = "//android.widget.TextView[@text='ADDITIONAL DOCUMENT ']")
	private WebElement additionalDoc_Module_In_SelfService;

	public void click_On_AdditionalDoc_Module_In_SelfService() {
		additionalDoc_Module_In_SelfService.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To click on the ADDITIONAL MANUAL tab
	@FindBy(xpath = "//android.widget.TextView[@text='ADDITIONAL MANUAL']")
	private WebElement additionalManual_Module_In_SelfService;

	public void click_On_AdditionalManual_Module_In_SelfService() {
		additionalManual_Module_In_SelfService.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	

	// To check whether the video default image is showing or not!
	@FindBy(id = "purchase_partner_logo_iv")
	private WebElement video_Default_Image;

	public boolean check_value_From_Video_Default_Image() {
		boolean value_From_Video_Default_Image = video_Default_Image.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Video_Default_Image;
	}
	
	// To click on the video to open
	@FindBy(id = "purchase_partner_logo_iv")
	private WebElement click_Video_Default_Image;

	public void click_On_Video_Default_Image() {
		click_Video_Default_Image.click();
		andrdCmnUtil.implicit_Wait();
		
	}

	// To assert the video file name
	@FindBy(id = "title")
	private List<WebElement> FileTitle;

	public String read_Value_From_FileTitle() {
		for (int i = 0; i < FileTitle.size();) {
			value_From_FileTitle = FileTitle.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_FileTitle;
	}

	// To check whether the document default image is showing or not!
	@FindBy(id = "document_rl")
	private WebElement document_Default_Image;

	public boolean check_Value_From_Document_Default_Image() {
		boolean value_From_Document_Default_Image = document_Default_Image.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Document_Default_Image;
	}

	// To click on the document file
	@FindBy(id = "thumbnail_doc")
	private List<WebElement> documentclick;

	public void click_on_Document() {
		for (int i = 0; i < documentclick.size();) {
			documentclick.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}

	}

	// To click on the Share option
	@FindBy(id = "fab")
	private WebElement shareOption_In_DocumentsORInvoice_PreviewTab;

	public void click_On_ShareOption_In_DocumentsORInvoice_PreviewTab() {
		shareOption_In_DocumentsORInvoice_PreviewTab.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To check whether the No doc emoji is showing or not!
	@FindBy (id="no_doc_iv")
	private WebElement emoji_Module_In_SelfService;
	
	public boolean check_Emoji_Module_In_SelfService()
	{
		boolean value_From_Emoji_Module_In_SelfService = emoji_Module_In_SelfService.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Emoji_Module_In_SelfService;
	}
	
	// To assert the No documents available text in selfservice
	@FindBy (id="no_data_label")
	private WebElement noDocuments_Text_In_SelfService;
	
	public String read_From_NoDocuments_Text_In_SelfService()
	{
		String value_From_NoDocuments_Text_In_SelfService = noDocuments_Text_In_SelfService.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_NoDocuments_Text_In_SelfService;
	}

}
