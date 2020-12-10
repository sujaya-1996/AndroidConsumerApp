package app.appium.PageFactory;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class NotesPageFactory {
	
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_From_notesTitle;
	String value_From_notesContent;
	
	public NotesPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// To click on the notes module on Mobile app menus
	@FindBy(xpath = "//android.widget.TextView[@text='Notes']")
	private WebElement buy_Module_On_MobileAppMenu;

	public void click_On_Notes_Module_On_MobileAppMenu() {
		buy_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To check the no notes emoji is showing 
	@FindBy(id = "no_data_image")
	private WebElement no_Notes_Emoji;

	public boolean read_From_Value_For_No_Notes_Emoji() {
		boolean value_For_No_Notes_Emoji = no_Notes_Emoji.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_For_No_Notes_Emoji;
	}
	
	// To assert the no notes available text
	@FindBy(id = "no_data_hint")
	private WebElement noNotesAvailable_Text;

	public String read_Value_From_noNotesAvailable_Text() {
		String value_From_noNotesAvailable_Text = noNotesAvailable_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_noNotesAvailable_Text;
	}
	
	// To assert the no notes available additional text
	@FindBy(id = "additionalHintTv")
	private WebElement noNotesAvailable_AdditionalText;

	public String read_Value_From_noNotesAvailable_AdditionalText() {
		String value_From_noNotesAvailable_AdditionalText = noNotesAvailable_AdditionalText.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_noNotesAvailable_AdditionalText;
	}
	
	// To click on notes search icon
	@FindBy(id = "note_search")
	private WebElement notesSearch_Icon;

	public void click_On_notesSearch_Icon() {
		notesSearch_Icon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on add notes icon
	@FindBy(id = "add_note")
	private WebElement addNotes_Icon;

	public void click_On_AddNotes_Icon() {
		addNotes_Icon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on alarm icon
	@FindBy(id = "alarm_note")
	private WebElement alarm_Icon;

	public void click_On_Alarm_Icon() {
		alarm_Icon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on save note icon
	@FindBy(id = "save_note")
	private WebElement save_Note_Icon;

	public void click_On_Save_Note_Icon() {
		save_Note_Icon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the placeholder title of the note 
	@FindBy(id = "noteTitle")
	private WebElement notesTitle_Placeholder;

	public String read_Value_From_notesTitle_Placeholder() {
		String value_From_notesTitle_Placeholder = notesTitle_Placeholder.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_notesTitle_Placeholder;
	}
	
	// To write on Notes title field from excel sheet
	@FindBy(id = "noteTitle")
	private WebElement notesTitle_value;

	public void write_On_NotesTitle_Value(String notesTitle) {
		notesTitle_value.sendKeys(notesTitle);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the placeholder content of the note
	@FindBy(id = "noteContent")
	private WebElement notesContent_Placeholder;

	public String read_Value_From_notesContent_Placeholder() {
		String value_From_notesContent_Placeholder = notesContent_Placeholder.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_notesContent_Placeholder;
	}
	
	// To write on Notes content field from excel sheet
	@FindBy(id = "noteContent")
	private WebElement notesContent_value;

	public void write_On_NotesContent_value(String notesContent) {
		notesContent_value.sendKeys(notesContent);
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the configured notes with excel value
	@FindBy(id = "notesTitle")
	private List<WebElement> notesTitle;

	public String read_Value_From_notesTitle() {
		for (int i = 0; i < notesTitle.size();) {
			value_From_notesTitle = notesTitle.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_notesTitle;
	}
	
	
	// To assert the configured content of the note with the excel value
	@FindBy(id = "notesContent")
	private List<WebElement> notesContent;

	public String read_Value_From_notesContent() {
		for (int i = 0; i < notesTitle.size();) {
			value_From_notesContent = notesContent.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_notesContent;
	}

}
