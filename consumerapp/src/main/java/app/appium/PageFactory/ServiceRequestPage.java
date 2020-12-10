package app.appium.PageFactory;




import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;

public class ServiceRequestPage 
{
	
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	CommonElementPage cmnelementpage;
	String message_Of_SR;
	String message_Of_SR_On_ChatScreen;
	String messageOfAttachment_Of_SR_On_ChatScreen;
	AppGenericLibrary appGeneric = new AppGenericLibrary();
	
	
	public ServiceRequestPage (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	
	// To click on the Service request module on Mobile app menus
	@FindBy (xpath="//android.widget.TextView[@text='Service Request']")
	private WebElement sr_Module_On_MobileAppMenu;
	
	public void click_On_SR_Module_On_MobileAppMenu()
	{
		sr_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the conversation screen when there is no SR on conversation screen
	@FindBy (id= "negative_scenario_text")
	private WebElement sr_No_Request_Found;
	
	public String read_SR_No_Request_Found()
	{
		String sr_No_Request_Found_Text= sr_No_Request_Found.getText();
		andrdCmnUtil.implicit_Wait();
		return sr_No_Request_Found_Text;
	}
	
	// To assert the conversation screen default Emoji when there is no SR on conversation screen
	@FindBy (id= "negative_scenario_image")
	private WebElement sr_No_Request_Found_image;
	
	public boolean read_sr_No_Request_Found_image()
	{
		boolean srimage= sr_No_Request_Found_image.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return srimage;
	}
	
	// To assert the Conversations tab
	@FindBy (xpath="//android.widget.TextView[@text='Conversations']")
	private WebElement conversation_Tab_Text;
	
	public String read_From_Conversation_Tab_Text()
	{
		String sr_Conversation_Tab_Text = conversation_Tab_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return sr_Conversation_Tab_Text;
		
	}
	
	// To assert the New Request tab
	@FindBy (xpath="//android.widget.TextView[@text='New Request']")
	private WebElement newRequest_Tab_Text;
	
	public String read_From_newRequest_Tab_Text()
	{
		String sr_NewRequest_Tab_Text= newRequest_Tab_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return sr_NewRequest_Tab_Text;
	}
	
	// To assert the FAQ tab
	@FindBy (id= "third_label")
	private WebElement faq_Tab_Text;
	
	public String read_From_FAQ_Tab_Text()
	{
		String sr_Faq_Tab_Text= faq_Tab_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return sr_Faq_Tab_Text;
	}
	
	// To assert the Video Support tab
	@FindBy (id= "fourth_label")
	private WebElement videoSupport_Tab_Text;
	
	public String read_From_videoSupport_Tab_Text()
	{
		String sr_VideoSupport_Tab_Text= videoSupport_Tab_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return sr_VideoSupport_Tab_Text;
	}
	
	// To click on the conversations Tab
	@FindBy (xpath="//android.widget.TextView[@text='Conversations']")
	private WebElement conversations_tab;
	
	public void click_On_Conversations_tab()
	{
		conversations_tab.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the New request Tab
	@FindBy (xpath="//android.widget.TextView[@text='New Request']")
	private WebElement newrequest_tab;
	
	public void click_On_Newrequest_tab()
	{
		newrequest_tab.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the FAQ Tab
	@FindBy (id= "third_image")
	private WebElement faq_tab;
	
	public void click_On_FAQ_tab()
	{
		faq_tab.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the Video support Tab
	@FindBy (id= "fourth_image")
	private WebElement videoSupport_tab;
	
	public void click_On_videoSupport_tab()
	{
		videoSupport_tab.click();
		andrdCmnUtil.implicit_Wait();
	}
	

	// To assert the Service Type name which is selected by the user  
	@FindBy (id= "service_type_name")
	private WebElement serviceType_Name;
	
	public String read_From_ServiceType_Name_Text()
	{
		String serviceType_Name_Text=serviceType_Name.getText();
		andrdCmnUtil.implicit_Wait();
		return serviceType_Name_Text;
	}
	
	// To find the path and to write in the message field 
	@FindBy (id= "input_sr_message")
	private WebElement messageBox_In_SR;
	
	public void write_On_MessageBox_In_SR(String message_In_SR)
	{
		messageBox_In_SR.sendKeys(message_In_SR);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	//To assert the default Address inside New request screen, by checking whether its showing the Change address option or not!! 
	@FindBy (id= "edit_address_tv")
	private WebElement change_Address;
	
	public boolean read_Change_Address()
	{
		boolean chngAdrs= change_Address.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return chngAdrs;		
	}
	
	//To assert the default address that has configured before as primary address
	@FindBy (id= "default_address_tv")
	private WebElement default_Address_In_SR;
	
	public String read_From_default_Address_In_SR()
	{
		String default_Address_In_SR_Text=default_Address_In_SR.getText();
		andrdCmnUtil.implicit_Wait();
		return default_Address_In_SR_Text;
	}
	
	// To click on the submit button inside New request screen
	@FindBy (id= "place_request_bttn")
	private WebElement submitButton_In_New_SR;
	
	public void click_On_submitButton_In_New_SR()
	{
		submitButton_In_New_SR.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the message of the SR in Conversation screen
	@FindBy (id= "sr_last_history_message_tv")
	private List<WebElement> message_Of_SR_In_ConvresationScreen;
	
	public String read_Message_Of_SR_In_ConvresationScreen(String message_From_Excel)
	{
		for (int i=0;i< message_Of_SR_In_ConvresationScreen.size();i++)
		{
			message_Of_SR= message_Of_SR_In_ConvresationScreen.get(i).getText().trim();
			if(message_Of_SR.equals(message_From_Excel))
			{
				return message_Of_SR;
			}
			break;
		}
		return "The texts are not matching";
		
	}
	
	//To click on Change address button on New request screen
	@FindBy (id= "edit_address_tv")
	private WebElement check_Change_Address;
	
	public void click_Change_Address()
	{
		check_Change_Address.click();
		andrdCmnUtil.implicit_Wait();
				
	}
	
	//To assert the pop-up text, when the address02 is clicked to get selected to place a SR
	@FindBy (id= "address_tv")
	private WebElement address2_In_SR_Addressbook;
	
	public String read_From_address2_In_SR_Addressbook()
	{
		String value_Of_Address2_In_SR_Addressbook=address2_In_SR_Addressbook.getText();
		andrdCmnUtil.implicit_Wait();
		return value_Of_Address2_In_SR_Addressbook;
	}
	
	//To click on the first SR, which is there on the SR conversation screen
	@FindBy (id= "card_lay2")
	private List<WebElement> list_Of_SR_In_ConvresationScreen;
	
	public void click_On_FirstSR_list_Of_SR_In_ConvresationScreen()
	{
		for (int i=0;i< list_Of_SR_In_ConvresationScreen.size();)
		{
			list_Of_SR_In_ConvresationScreen.get(i).click();
			break;
		}
		
	}
	
	// To assert the message in SR chat screen, which is there on the conversation screen
	@FindBy (id= "sr_track_message_with_doc_tv")
	private WebElement message_In_SR_ChatScreen;
	
	public String read_From_message_In_SR_ChatScreen()
	{
		String Value_Of_Message_In_SR_ChatScreen=message_In_SR_ChatScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_Of_Message_In_SR_ChatScreen;
	}
	
	// To assert the Type a message field, In chat screen
	@FindBy (id= "sr_track_reply_msg_et")
	private WebElement typeAMessage_ChatScreen;
	
	public void write_On_TypeAMessage_ChatScreen(String message_From_Excel_For_ChatScreen)
	{
		typeAMessage_ChatScreen.sendKeys(message_From_Excel_For_ChatScreen);
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the send arrow in chat screen and click on that
	@FindBy (id= "sr_track_send_msg_btn")
	private WebElement sendButton_On_ChatScreen;
	
	public void click_SendButton_On_ChatScreen()
	{
		sendButton_On_ChatScreen.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the reply message on SR chat screen
	@FindBy (id= "sr_track_message_with_doc_tv")
	private List<WebElement> replyMessage_Of_SR_In_Chat_Screen;
	
	public String read_replyMessage_Of_SR_In_Chat_Screen(String message_From_Excel_For_Chat)
	{
		for (int i=0;i< replyMessage_Of_SR_In_Chat_Screen.size();i++)
		{
			message_Of_SR_On_ChatScreen= replyMessage_Of_SR_In_Chat_Screen.get(i).getText().trim();
			if(message_Of_SR_On_ChatScreen.equals(message_From_Excel_For_Chat))
			{
				break;
			}	
		}
		return message_Of_SR_On_ChatScreen;
	}
	
	// To assert whether the Attachments label is showing or not
	@FindBy (id= "attachment_label")
	private WebElement attachmentLabel_In_NewRequestScreen;
	
	public String read_AttachmentLabel_In_NewRequestScreen()
	{
		String value_AttachmentLabel_In_NewRequestScreen=attachmentLabel_In_NewRequestScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_AttachmentLabel_In_NewRequestScreen;
	}
	
	// To click on the Attachment icon on the new request screen
	@FindBy (id= "attachment_layout")
	private WebElement attachmentOption_In_NewRequestScreen;
	
	public void click_AttachmentOption_In_NewRequestScreen()
	{
		attachmentOption_In_NewRequestScreen.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	// To check that, in attachments it should take max five files, and above that it should not allow
	@FindBy (id= "attachments_docs_hsv")
	private List<WebElement> attachments_In_NewRequest_Screen;
	
	public void count_Attachments_In_NewRequest_Screen() throws InterruptedException
	{
		
		cmnelementpage = new CommonElementPage(driver);
		int max_No_Of_Attachments = 4;
		int numberOfAttachmnets=attachments_In_NewRequest_Screen.size();
		for (int i=numberOfAttachmnets;i<=max_No_Of_Attachments;i++)
		{
			attachmentOption_In_NewRequestScreen.click();
			andrdCmnUtil.implicit_Wait();
			cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();
			andrdCmnUtil.implicit_Wait();
			cmnelementpage.takePicture_In_NewRequestScreen_Attachment();
			andrdCmnUtil.implicit_Wait();
			cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();
			andrdCmnUtil.implicit_Wait();
		}
		System.out.println("User is not allowed to attach more than five attachments ");
	
	}
	
	// To assert whether the attachment option is enabled or not, after giving 5 attachments
	@FindBy (id= "browse_doc_iv")
	private WebElement attachment_Icon_Status;
	
	public boolean status_Of_Attachment_Icon()
	{
		boolean attachmentIcon= attachment_Icon_Status.isEnabled();
		andrdCmnUtil.implicit_Wait();
		return attachmentIcon;
	}
	
	// To click on the schedule date and time field
	@FindBy (id= "select_date_label_tv")
	private WebElement scheduleDate_Time;
	
	public void write_On_scheduleDate_Time()
	{
		String timeCapture = appGeneric.getDateAndTimeCombination();
		scheduleDate_Time.sendKeys("Service scheduled on: "+timeCapture);
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the attachment icon on the SR chat screen
	@FindBy (id= "sr_track_attach_ib")
	private WebElement attachmentIcon_On_ChatScreen;
	
	public void click_AttachmentIcon_On_ChatScreen()
	{
		attachmentIcon_On_ChatScreen.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the message given in attachment, in chat screen
	@FindBy (id= "sr_track_message_tv")
	private List<WebElement> attachmentMessage_Of_SR_In_Chat_Screen;
	
	public String read_AttachmentMessage_Of_SR_In_Chat_Screen(String message_From_Excel_For_Chat)
	{
		for (int i=0;i< attachmentMessage_Of_SR_In_Chat_Screen.size();i++)
		{
			messageOfAttachment_Of_SR_On_ChatScreen= attachmentMessage_Of_SR_In_Chat_Screen.get(i).getText().trim();
			if(messageOfAttachment_Of_SR_On_ChatScreen.equals(message_From_Excel_For_Chat))
			{
				break;
			}	
		}
		return messageOfAttachment_Of_SR_On_ChatScreen;
	}
	


}
