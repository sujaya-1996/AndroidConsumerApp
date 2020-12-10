package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class HelpDeskPageFactory {
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_From_Email_In_HelpDesk;
	String value_From_Number_In_HelpDesk;
	
	public HelpDeskPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// To click on the Helpdesk module on Mobile app menus
	@FindBy(xpath = "//android.widget.TextView[@text='Help Desk']")
	private WebElement helpDesk_Module_On_MobileAppMenu;

	public void click_On_HelpDesk_Module_On_MobileAppMenu() {
		helpDesk_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the helpdesk dialog header
	@FindBy(id = "title_tv")
	private WebElement helpdesk_Dialog_Header;

	public String read_From_Helpdesk_Dialog_Header() {
		String value_From_Helpdesk_Dialog_Header = helpdesk_Dialog_Header.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Helpdesk_Dialog_Header;
	}
	
	// To click on the cancel button
	@FindBy(id = "cancel_select_brand_tv")
	private WebElement helpdesk_Dialog_Header_CancelButton;

	public void click_On_Helpdesk_Dialog_Header_CancelButton() {
		helpdesk_Dialog_Header_CancelButton.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	// To assert the Email in helpdesk
	@FindBy(id = "tv")
	private List<WebElement> email_In_HelpDesk;

	public String read_Value_From_Email_In_HelpDesk() {
		for (int i = 0; i < email_In_HelpDesk.size();) {
			value_From_Email_In_HelpDesk = email_In_HelpDesk.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Email_In_HelpDesk;
	}
	
	// To click on the Email in helpdesk
	@FindBy(id = "tv")
	private List<WebElement> click_Email_In_HelpDesk;

	public void click_On_Email_In_HelpDesk() {
		for (int i = 0; i < click_Email_In_HelpDesk.size();) {
			click_Email_In_HelpDesk.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}
	
	// To assert the Number in helpdesk
	@FindBy(id = "tv")
	private List<WebElement> number_In_HelpDesk;

	public String read_Value_From_Number_In_HelpDesk() {
		for (int i = 1; i < number_In_HelpDesk.size();) {
			value_From_Number_In_HelpDesk = number_In_HelpDesk.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Number_In_HelpDesk;
	}
	
	// To click on the Number in helpdesk
	@FindBy(id = "tv")
	private List<WebElement> click_Number_In_HelpDesk;

	public void click_On_Number_In_HelpDesk() {
		for (int i = 1; i < number_In_HelpDesk.size();) {
			click_Number_In_HelpDesk.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}


	

}
