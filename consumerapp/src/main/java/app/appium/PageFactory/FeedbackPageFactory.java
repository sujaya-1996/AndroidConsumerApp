package app.appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class FeedbackPageFactory {
	
	
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	 
	
	public FeedbackPageFactory (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	// To assert the From Label in gmail
	@FindBy (id="com.google.android.gm:id/from_label")
	private WebElement fromLabel_In_Gmail;
	
	public String read_Value_Of_fromLabel_In_Gmail()
	{
		String Value_Of_fromLabel_In_Gmail = fromLabel_In_Gmail.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_Of_fromLabel_In_Gmail; 
	}
	
	// To assert the To field value in gmail
	@FindBy (id="com.google.android.gm:id/to")
	private WebElement toFieldValue_In_Gmail;
	
	public String read_Detail_Of_toFieldValue_In_Gmail()
	{
		String detail_Of_toFieldValue_In_Gmail = toFieldValue_In_Gmail.getText();
		andrdCmnUtil.implicit_Wait();
		return detail_Of_toFieldValue_In_Gmail; 
	}
	
	// To click on the Gmail option on the dialouge
	@FindBy (xpath="//android.widget.TextView[@text='Gmail']")
	private WebElement gmail_On_Share_Dialogue;
	
	public void click_On_Gmail_On_Share_Dialogue()
	{
		gmail_On_Share_Dialogue.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	

}
