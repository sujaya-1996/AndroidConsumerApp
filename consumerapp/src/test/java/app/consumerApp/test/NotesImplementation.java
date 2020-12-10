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
import app.appium.PageFactory.NotesPageFactory;
import app.appium.PageFactory.ProductDetailsForNotesPageFactory;

public class NotesImplementation extends DriverIgnit {
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	CommonElementPage cmnelementpage;
	ExcelLibrary excelLib;
	NotesPageFactory notespage ;
	String model_Number;
	String manufacturer;
	String notes_Title;
	String notes_Content;
	String Search_Value_for_Notes_Search_Field;
	ProductDetailsForNotesPageFactory productdetailspage;

	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		cmnelementpage = new CommonElementPage(driver);
		productdetailspage = new ProductDetailsForNotesPageFactory(driver);
		notespage = new NotesPageFactory(driver);
		excelLib = new ExcelLibrary();
		notes_Title = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.Notes_TESTDATA_SHEETNAME, 1, 1);
		notes_Content = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.Notes_TESTDATA_SHEETNAME, 2, 1);
		Search_Value_for_Notes_Search_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.Notes_TESTDATA_SHEETNAME, 3, 1);
		model_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.Notes_TESTDATA_SHEETNAME, 4, 1);
		manufacturer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.Notes_TESTDATA_SHEETNAME, 5, 1);

	}

	public void verify_Notes_UI() throws InterruptedException {
		cmnelementpage.click_On_dk_Image_On_GridView();
		notespage.click_On_Notes_Module_On_MobileAppMenu();
		Thread.sleep(8000);

		// To check the no notes emoji is showing or not!!
		boolean value_For_No_Notes_Emoji = notespage.read_From_Value_For_No_Notes_Emoji();
		if (value_For_No_Notes_Emoji == true) {
			System.out.println("Its showing the no notes emoji: " + value_For_No_Notes_Emoji);

			// To assert the tool-bar title of Notes screen
			String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
			String expected_Result_ToolbarTitle = "NOTES";
			String actual_Result_ToolbarTitle = buy_Toolbar_Title;
			Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
			System.out.println("Notes toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
			andrdCmnUtil.implicit_Wait();

			// To assert the no notes available text
			String value_From_noNotesAvailable_Text = notespage.read_Value_From_noNotesAvailable_Text();
			String expected_Result_NotesScreen1 = "No notes available";
			String actual_Result_NotesScreen1 = value_From_noNotesAvailable_Text;
			Assert.assertEquals(actual_Result_NotesScreen1, expected_Result_NotesScreen1);
			System.out.println("No notes available text got verified successfully:" + actual_Result_NotesScreen1);
			andrdCmnUtil.implicit_Wait();

			// To assert the no notes available additional text
			String value_From_noNotesAvailable_AdditionalText = notespage
					.read_Value_From_noNotesAvailable_AdditionalText();
			String expected_Result_NotesScreen2 = " You can add notes by clicking on   +  ";
			String actual_Result_NotesScreen2 = value_From_noNotesAvailable_AdditionalText;
			Assert.assertEquals(actual_Result_NotesScreen2, expected_Result_NotesScreen2);
			System.out.println(
					"No notes available additional text got verified successfully:" + actual_Result_NotesScreen2);
			andrdCmnUtil.implicit_Wait();

		} else {
			System.out.println("Its not showing the no notes emoji: " + value_For_No_Notes_Emoji);
		}

	}

	public void verify_AddNotes_Functionality() throws InterruptedException {

		// To click on add notes icon
		notespage.click_On_AddNotes_Icon();

		// To assert the tool-bar title of Add Notes screen
		String AddNotes_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "ADD NOTE";
		String actual_Result_ToolbarTitle = AddNotes_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Add Notes toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_AddNotesScreen1 = "Note title cannot be empty";
		String actual_Result_AddNotesScreen1 = value_From_PopUp_Message_Text;
		Assert.assertEquals(actual_Result_AddNotesScreen1, expected_Result_AddNotesScreen1);
		System.out
				.println("Note title cant be empty message got verified successfully:" + actual_Result_AddNotesScreen1);
		andrdCmnUtil.implicit_Wait();

		// To click on the okay button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To assert the placeholder title of the note
		String value_From_notesTitle_Placeholder = notespage.read_Value_From_notesTitle_Placeholder();
		String expected_Result_AddNotesScreen2 = "Title";
		String actual_Result_AddNotesScreen2 = value_From_notesTitle_Placeholder;
		Assert.assertEquals(actual_Result_AddNotesScreen2, expected_Result_AddNotesScreen2);
		System.out.println("Title placeholder got verified successfully:" + actual_Result_AddNotesScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the placeholder content of the note
		String value_From_notesContent_Placeholder = notespage.read_Value_From_notesContent_Placeholder();
		String expected_Result_AddNotesScreen3 = "Write a Note for" + " " + manufacturer + " " + model_Number;
		String actual_Result_AddNotesScreen3 = value_From_notesContent_Placeholder;
		Assert.assertEquals(actual_Result_AddNotesScreen3, expected_Result_AddNotesScreen3);
		System.out.println("Title content placeholder got verified successfully:" + actual_Result_AddNotesScreen3);
		andrdCmnUtil.implicit_Wait();

		// To write on Notes title field from excel sheet
		notespage.write_On_NotesTitle_Value(notes_Title);

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text1 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_AddNotesScreen4 = "Note content cannot be empty";
		String actual_Result_AddNotesScreen4 = value_From_PopUp_Message_Text1;
		Assert.assertEquals(actual_Result_AddNotesScreen4, expected_Result_AddNotesScreen4);
		System.out.println(
				"Notes content cant be empty message got verified successfully:" + actual_Result_AddNotesScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on the okay button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To write on Notes content field from excel sheet
		notespage.write_On_NotesContent_value(notes_Content);

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();

		// To assert the Text showing in the success Pop-up message
		String value_From_PopUp_Message_Text2 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_AddNotesScreen5 = "Notes saved successfully";
		String actual_Result_AddNotesScreen5 = value_From_PopUp_Message_Text2;
		Assert.assertEquals(actual_Result_AddNotesScreen5, expected_Result_AddNotesScreen5);
		System.out.println("Success message got verified successfully:" + actual_Result_AddNotesScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on the okay button
		cmnelementpage.clickOn_Ok_On_Popup();

	}

	public void verify_Functionality_AfterAddingNotes() throws InterruptedException {

		// To click on notes search icon
		notespage.click_On_notesSearch_Icon();

		// To write some values Search field
		cmnelementpage.write_Value_On_SearchField(Search_Value_for_Notes_Search_Field);

		// To assert the configured notes with excel value
		String value_From_notesTitle = notespage.read_Value_From_notesTitle();
		String expected_Result_NotesScreen1 = notes_Title;
		String actual_Result_AddNotesScreen1 = value_From_notesTitle;
		Assert.assertEquals(actual_Result_AddNotesScreen1, expected_Result_NotesScreen1);
		System.out.println("Notes title got verified successfully:" + actual_Result_AddNotesScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the configured content of the note with the excel value
		String value_From_notesContent = notespage.read_Value_From_notesContent();
		String expected_Result_NotesScreen2 = notes_Content;
		String actual_Result_AddNotesScreen2 = value_From_notesContent;
		Assert.assertEquals(actual_Result_AddNotesScreen2, expected_Result_NotesScreen2);
		System.out.println("Notes Content got verified successfully:" + actual_Result_AddNotesScreen2);
		andrdCmnUtil.implicit_Wait();

		// To click on the cross icon on Search field
		cmnelementpage.click_CrossOption_On_SearchField();

		// To click on the search field back button
		cmnelementpage.click_On_SearchField_BackButton();
		Thread.sleep(3000);

		andrdCmnUtil.Click_DeviceBackButton();

	}

	public void verify_NotesFunctionality_In_ProductDetails() throws InterruptedException {

		// To click on the Product image to open the product details
		productdetailspage.click_On_ProductImage();

		// To assert the notes label in the product details screen
		String value_For_notesLabel_In_ProductDetailScreen = productdetailspage
				.check_Value_For_notesLabel_In_ProductDetailScreen();
		String expected_Result_ProductDetailsScreen1 = "NOTES";
		String actual_Result_ProductDetailsScreen1 = value_For_notesLabel_In_ProductDetailScreen;
		Assert.assertEquals(actual_Result_ProductDetailsScreen1, expected_Result_ProductDetailsScreen1);
		System.out.println("Notes Label in product details screen got verified successfully:"
				+ actual_Result_ProductDetailsScreen1);
		andrdCmnUtil.implicit_Wait();

		// To scroll down till NotesTitle Text
		try {
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "notesTitle");
		} catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}

		// To assert the configured notes with excel value
		String value_From_notesTitle = productdetailspage.read_Value_From_notesTitle();
		String expected_Result_ProductDetailsScreen2 = notes_Title;
		String actual_Result_ProductDetailsScreen2 = value_From_notesTitle;
		Assert.assertEquals(actual_Result_ProductDetailsScreen2, expected_Result_ProductDetailsScreen2);
		System.out.println("Notes title got verified successfully:" + actual_Result_ProductDetailsScreen2);
		andrdCmnUtil.implicit_Wait();

		// To scroll down till NotesContent Text
		try {
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "notesContent");
		} catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}

		// To assert the configured content of the note with the excel value
		String value_From_notesContent = productdetailspage.read_Value_From_notesContent();
		String expected_Result_ProductDetailsScreen3 = notes_Content;
		String actual_Result_ProductDetailsScreen3 = value_From_notesContent;
		Assert.assertEquals(actual_Result_ProductDetailsScreen3, expected_Result_ProductDetailsScreen3);
		System.out.println("Notes Content got verified successfully:" + actual_Result_ProductDetailsScreen3);
		andrdCmnUtil.implicit_Wait();

		// To scroll down till Notes edit button
		try {
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "editNote");
		} catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}

		// To click on the edit note button
		productdetailspage.click_On_EditNote_Option();

		// To assert the tool-bar title of Add Notes screen
		String editNotes_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "EDIT NOTE";
		String actual_Result_ToolbarTitle = editNotes_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Edit Notes toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the configured title of the note
		String value_From_notesTitle1 = notespage.read_Value_From_notesTitle_Placeholder();
		String expected_Result_EditNotesScreen1 = notes_Title;
		String actual_Result_EditNotesScreen1 = value_From_notesTitle1;
		Assert.assertEquals(actual_Result_EditNotesScreen1, expected_Result_EditNotesScreen1);
		System.out.println("Configured Notes Title got verified successfully:" + actual_Result_EditNotesScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the configured notes content of the note
		String value_From_notesContent1 = notespage.read_Value_From_notesContent_Placeholder();
		String expected_Result_EditNotesScreen2 = notes_Content;
		String actual_Result_EditNotesScreen2 = value_From_notesContent1;
		Assert.assertEquals(actual_Result_EditNotesScreen2, expected_Result_EditNotesScreen2);
		System.out.println("Configured Title Content got verified successfully:" + actual_Result_EditNotesScreen2);
		andrdCmnUtil.implicit_Wait();
		Thread.sleep(3000);

		// To click on the delete note button in edit note screen
		productdetailspage.click_On_Delete_Note_Option();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_EditNotesScreen3 = "Would you like to delete your Notes?";
		String actual_Result_EditNotesScreen3 = value_From_PopUp_Message_Text;
		Assert.assertEquals(actual_Result_EditNotesScreen3, expected_Result_EditNotesScreen3);
		System.out.println("Delete pop-up message got verified successfully:" + actual_Result_EditNotesScreen3);
		andrdCmnUtil.implicit_Wait();

		// To click on ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text1 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_EditNotesScreen4 = "Notes deleted successfully";
		String actual_Result_EditNotesScreen4 = value_From_PopUp_Message_Text1;
		Assert.assertEquals(actual_Result_EditNotesScreen4, expected_Result_EditNotesScreen4);
		System.out.println("Delete Success message got verified successfully:" + actual_Result_EditNotesScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on ok button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To assert the no notes available label in the product details screen
		String value_For_noNotes_Label_In_ProductDetailScreen = productdetailspage
				.check_Value_For_noNotes_Label_In_ProductDetailScreen();
		String expected_Result_ProductDetailsScreen5 = "No notes available";
		String actual_Result_ProductDetailsScreen5 = value_For_noNotes_Label_In_ProductDetailScreen;
		Assert.assertEquals(actual_Result_ProductDetailsScreen5, expected_Result_ProductDetailsScreen5);
		System.out.println("Delete Success message got verified successfully:" + actual_Result_ProductDetailsScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on the Add note button
		productdetailspage.click_On_AddNote_Option();

		// To assert the tool-bar title of Add Notes screen
		String AddNotes_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle1 = "ADD NOTE";
		String actual_Result_ToolbarTitle1 = AddNotes_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle1, expected_Result_ToolbarTitle1);
		System.out.println("Add Notes toolbar title got verified successfully:" + actual_Result_ToolbarTitle1);
		andrdCmnUtil.implicit_Wait();

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text2 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_AddNotesScreen1 = "Note title cannot be empty";
		String actual_Result_AddNotesScreen1 = value_From_PopUp_Message_Text2;
		Assert.assertEquals(actual_Result_AddNotesScreen1, expected_Result_AddNotesScreen1);
		System.out
				.println("Note title cant be empty message got verified successfully:" + actual_Result_AddNotesScreen1);
		andrdCmnUtil.implicit_Wait();

		// To click on the okay button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To assert the placeholder title of the note
		String value_From_notesTitle_Placeholder = notespage.read_Value_From_notesTitle_Placeholder();
		String expected_Result_AddNotesScreen2 = "Title";
		String actual_Result_AddNotesScreen2 = value_From_notesTitle_Placeholder;
		Assert.assertEquals(actual_Result_AddNotesScreen2, expected_Result_AddNotesScreen2);
		System.out.println("Title placeholder got verified successfully:" + actual_Result_AddNotesScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the placeholder content of the note
		String value_From_notesContent_Placeholder = notespage.read_Value_From_notesContent_Placeholder();
		String expected_Result_AddNotesScreen3 = "Write a Note for" + " " + manufacturer + " " + model_Number;
		String actual_Result_AddNotesScreen3 = value_From_notesContent_Placeholder;
		Assert.assertEquals(actual_Result_AddNotesScreen3, expected_Result_AddNotesScreen3);
		System.out.println("Title content placeholder got verified successfully:" + actual_Result_AddNotesScreen3);
		andrdCmnUtil.implicit_Wait();

		// To write on Notes title field from excel sheet
		notespage.write_On_NotesTitle_Value(notes_Title);

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text3 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_AddNotesScreen4 = "Note content cannot be empty";
		String actual_Result_AddNotesScreen4 = value_From_PopUp_Message_Text3;
		Assert.assertEquals(actual_Result_AddNotesScreen4, expected_Result_AddNotesScreen4);
		System.out.println(
				"Notes content cant be empty message got verified successfully:" + actual_Result_AddNotesScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on the okay button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To write on Notes content field from excel sheet
		notespage.write_On_NotesContent_value(notes_Content);

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();

		// To assert the Text showing in the success Pop-up message
		String value_From_PopUp_Message_Text4 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_AddNotesScreen5 = "Notes saved successfully";
		String actual_Result_AddNotesScreen5 = value_From_PopUp_Message_Text4;
		Assert.assertEquals(actual_Result_AddNotesScreen5, expected_Result_AddNotesScreen5);
		System.out.println("Success message got verified successfully:" + actual_Result_AddNotesScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on the okay button
		cmnelementpage.clickOn_Ok_On_Popup();

		// To scroll down till NotesTitle Text
		try {
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "notesTitle");
		} catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}

		// To assert the configured notes with excel value
		String value_From_notesTitle2 = productdetailspage.read_Value_From_notesTitle();
		String expected_Result_ProductDetailsScreen6 = notes_Title;
		String actual_Result_ProductDetailsScreen6 = value_From_notesTitle2;
		Assert.assertEquals(actual_Result_ProductDetailsScreen6, expected_Result_ProductDetailsScreen6);
		System.out.println("Notes title got verified successfully:" + actual_Result_ProductDetailsScreen6);
		andrdCmnUtil.implicit_Wait();

		// To scroll down till NotesContent Text
		try {
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "notesContent");
		} catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}

		// To assert the configured content of the note with the excel value
		String value_From_notesContent2 = productdetailspage.read_Value_From_notesContent();
		String expected_Result_ProductDetailsScreen7 = notes_Content;
		String actual_Result_ProductDetailsScreen7 = value_From_notesContent2;
		Assert.assertEquals(actual_Result_ProductDetailsScreen7, expected_Result_ProductDetailsScreen7);
		System.out.println("Notes Content got verified successfully:" + actual_Result_ProductDetailsScreen7);
		andrdCmnUtil.implicit_Wait();

		// To scroll down till Notes edit button
		try {
			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "deleteNote");
		} catch (Exception e) {
			System.out.println("Scrolling is not happening");
		}

		// To click on the edit note button
		productdetailspage.click_On_DeleteNote_Option();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text5 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_EditNotesScreen6 = "Would you like to delete your Notes?";
		String actual_Result_EditNotesScreen6 = value_From_PopUp_Message_Text5;
		Assert.assertEquals(actual_Result_EditNotesScreen6, expected_Result_EditNotesScreen6);
		System.out.println("Delete pop-up message got verified successfully:" + actual_Result_EditNotesScreen6);
		andrdCmnUtil.implicit_Wait();
		Thread.sleep(3000);

		// To click on ok button
		cmnelementpage.clickOn_Ok_On_Popup();
		Thread.sleep(3000);
		
//		andrdCmnUtil.Click_DeviceBackButton();
//		Thread.sleep(3000);

//		cmnelementpage.click_On_dk_Image_On_GridView();
//		Thread.sleep(3000);

//		// To click on the Product image to open the product details
//		productdetailspage.click_On_ProductImage();

		// To click on the Add note button
		productdetailspage.click_On_AddNote_Option();
		
		// To write on Notes title field from excel sheet
		notespage.write_On_NotesTitle_Value(notes_Title);

		// To write on Notes content field from excel sheet
		notespage.write_On_NotesContent_value(notes_Content);

		// To click on save note icon
		notespage.click_On_Save_Note_Icon();
		
		// To click on ok button
		cmnelementpage.clickOn_Ok_On_Popup();
		
		// To click on the device back button
		andrdCmnUtil.Click_DeviceBackButton();

	}

}
