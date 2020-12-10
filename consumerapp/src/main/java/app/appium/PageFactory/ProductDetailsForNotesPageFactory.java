package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class ProductDetailsForNotesPageFactory {
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_From_notesTitle;
	String value_From_notesContent;
	
	public ProductDetailsForNotesPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// To click on the Product image to open the product details
	@FindBy(id = "product_iv")
	private WebElement productImage;

	public void click_On_ProductImage() {
		productImage.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the notes label in the product details screen
	@FindBy(id = "prod_comments_tv")
	private WebElement notesLabel_In_ProductDetailScreen;

	public String check_Value_For_notesLabel_In_ProductDetailScreen() {
		String value_For_notesLabel_In_ProductDetailScreen = notesLabel_In_ProductDetailScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_For_notesLabel_In_ProductDetailScreen;
		
	}
	
	// To click on the Add note button
	@FindBy(id = "add_comments_tv")
	private WebElement addNote_Option;

	public void click_On_AddNote_Option() {
		addNote_Option.click();
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
	
	// To click on the edit note button
	@FindBy(id = "editNote")
	private WebElement editNote_Option;

	public void click_On_EditNote_Option() {
		editNote_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the delete note button
	@FindBy(id = "deleteNote")
	private WebElement deleteNote_Option;

	public void click_On_DeleteNote_Option() {
		deleteNote_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the view more notes button
	@FindBy(id = "view_more_notes")
	private WebElement view_More_Notes_Option;

	public void click_On_view_More_Notes_Option() {
		view_More_Notes_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	// To click on the edit note button in edit note screen
	@FindBy(id = "edit_Note")
	private WebElement edit_Note_Option;

	public void click_On_Edit_Note_Option() {
		edit_Note_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the delete note button in edit note screen
	@FindBy(id = "delete_note")
	private WebElement delete_Note_Option;

	public void click_On_Delete_Note_Option() {
		delete_Note_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the no notes available label in the product details screen
	@FindBy(id = "no_notes_hint")
	private WebElement noNotes_Label_In_ProductDetailScreen;

	public String check_Value_For_noNotes_Label_In_ProductDetailScreen() {
		String value_For_noNotes_Label_In_ProductDetailScreen = noNotes_Label_In_ProductDetailScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_For_noNotes_Label_In_ProductDetailScreen;
		
	}
	
}
