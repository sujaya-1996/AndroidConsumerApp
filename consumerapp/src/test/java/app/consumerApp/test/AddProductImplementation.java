package app.consumerApp.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.AddProductPageFactory;

public class AddProductImplementation extends DriverIgnit {

	CommonElementPage cmnelementpage;
	BusinessClass businesslib = new BusinessClass();
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AddProductPageFactory addproductpage;
	ExcelLibrary excelLib;
	String value_For_Select_Subcategory_Search_Field;
	String value_For_Enter_Subcategory_Field;
	String value_For_Enter_Brand_Field;
	String vlaue_For_Enter_Model_Number_Field;
	String value_For_Select_Brand_Search_Field;
	String value_From_selected_Category_Name;
	String value_For_Serial_Number_Field;
	String selected_Date_For_UnderWarranty;
	String selected_PurchaseDate;
	String value_For_Search_Field_In_ModelNumber_Screen;
	String selected_ModelNumber;
	String value_For_Location_Search_Field;
	String value_For_Notes_Field;

	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		excelLib = new ExcelLibrary();
		cmnelementpage = new CommonElementPage(driver);
		addproductpage = new AddProductPageFactory(driver);
		value_For_Select_Subcategory_Search_Field = ExcelLibrary.getStringExcelTestData(
				ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 1, 1);
		value_For_Enter_Subcategory_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 2, 1);
		value_For_Enter_Brand_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 3, 1);
		vlaue_For_Enter_Model_Number_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 4, 1);
		value_For_Select_Brand_Search_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 5, 1);
		value_For_Serial_Number_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 6, 1);
		value_For_Search_Field_In_ModelNumber_Screen = ExcelLibrary.getStringExcelTestData(
				ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 9, 1);
		value_For_Location_Search_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 11, 1);
		value_For_Notes_Field = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 12, 1);
	}

	public void verify_UI_And_Functionaity_For_AddProduct_Till_SupercategorySelection() throws InterruptedException {
		Thread.sleep(3000);

		// To click on the add button
		cmnelementpage.click_On_AddProduct_Plus_Button();

		// To click on the cross button on the select super-category screen
		cmnelementpage.clickOn_On_Close();

		// To assert the alert pop-up text
		String valueFromAlertPopupTextMessage1 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_MessageFromPopup = "Your process is incomplete. Do you wish to exit?";
		String actual_MessageFromPopup = valueFromAlertPopupTextMessage1;
		assertEquals(actual_MessageFromPopup, expected_MessageFromPopup);
		System.out.println("Alert popup message has been verified successfully: " + actual_MessageFromPopup);
		andrdCmnUtil.implicit_Wait();

		// To click on the yes button of the alert popup
		cmnelementpage.clickOn_Cancel_On_Popup();

		// To click on the add button
		cmnelementpage.click_On_AddProduct_Plus_Button();

//		// To assert the Toolbar Title for create DX card screen
//		String valueFromToolbarTitle1 = cmnelementpage.read_From_Toolbar_Title();
//		String expected_ValueFromToolbarTitle1 = "CREATE DX CARD";
//		String actual_valueFromToolbarTitle1 = valueFromToolbarTitle1;
//		assertEquals(actual_valueFromToolbarTitle1, expected_ValueFromToolbarTitle1);
//		System.out.println("Toolbar Title has been verified successfully: " + actual_valueFromToolbarTitle1);
//		andrdCmnUtil.implicit_Wait();

		// To assert Appliances super-category
		String Value_From_AppliancesSupercategory = addproductpage.read_Value_From_AppliancesSupercategory();
		String expected_ValueFromCreateDXCardScreen1 = "Appliances";
		String actual_ValueFromCreateDXCardScreen1 = Value_From_AppliancesSupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen1, expected_ValueFromCreateDXCardScreen1);
		System.out.println(
				"Appliances super category has been verified successfully: " + actual_ValueFromCreateDXCardScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the automobile Super-category label
		String Value_From_AutomobileSupercategory = addproductpage.read_Value_From_AutomobileSupercategory();
		String expected_ValueFromCreateDXCardScreen2 = "Automobile";
		String actual_ValueFromCreateDXCardScreen2 = Value_From_AutomobileSupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen2, expected_ValueFromCreateDXCardScreen2);
		System.out.println(
				"Automobiles super category has been verified successfully: " + actual_ValueFromCreateDXCardScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Finance & Insurance Super-category label
		String Value_From_Finance_InsuranceSupercategory = addproductpage
				.read_Value_From_Finance_InsuranceSupercategory();
		String expected_ValueFromCreateDXCardScreen3 = "Finance & Insurance";
		String actual_ValueFromCreateDXCardScreen3 = Value_From_Finance_InsuranceSupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen3, expected_ValueFromCreateDXCardScreen3);
		System.out.println("Finance & Insurance  super category has been verified successfully: "
				+ actual_ValueFromCreateDXCardScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the jewellery Super-category label
		String Value_From_JewellerySupercategory = addproductpage.read_Value_From_JewellerySupercategory();
		String expected_ValueFromCreateDXCardScreen4 = "Jewellery";
		String actual_ValueFromCreateDXCardScreen4 = Value_From_JewellerySupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen4, expected_ValueFromCreateDXCardScreen4);
		System.out.println(
				"jewellery super category has been verified successfully: " + actual_ValueFromCreateDXCardScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the health Super-category label
		String Value_From_HealthSupercategory = addproductpage.read_Value_From_HealthSupercategory();
		String expected_ValueFromCreateDXCardScreen5 = "Health";
		String actual_ValueFromCreateDXCardScreen5 = Value_From_HealthSupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen5, expected_ValueFromCreateDXCardScreen5);
		System.out.println(
				"health super category has been verified successfully: " + actual_ValueFromCreateDXCardScreen5);
		andrdCmnUtil.implicit_Wait();

		// To assert the travel Super-category label
		String Value_From_TravelSupercategory = addproductpage.read_Value_From_TravelSupercategory();
		String expected_ValueFromCreateDXCardScreen6 = "Travel";
		String actual_ValueFromCreateDXCardScreen6 = Value_From_TravelSupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen6, expected_ValueFromCreateDXCardScreen6);
		System.out.println(
				"travel super category has been verified successfully: " + actual_ValueFromCreateDXCardScreen6);
		andrdCmnUtil.implicit_Wait();

		// To assert the Property Super-category label
		String Value_From_PropertySupercategory = addproductpage.read_Value_From_PropertySupercategory();
		String expected_ValueFromCreateDXCardScreen7 = "Property";
		String actual_ValueFromCreateDXCardScreen7 = Value_From_PropertySupercategory;
		assertEquals(actual_ValueFromCreateDXCardScreen7, expected_ValueFromCreateDXCardScreen7);
		System.out.println(
				"Property super category has been verified successfully: " + actual_ValueFromCreateDXCardScreen7);
		andrdCmnUtil.implicit_Wait();

		// To click on the Appliances super-category
		addproductpage.click_On_AppliancesSupercategory();

		// To assert the dialogue title
		String Value_From_Title_Of_CreateDXCard_dialogue = addproductpage
				.read_Value_From_Title_Of_CreateDXCard_dialouge();
		String expected_ValueInDialogue1 = "CREATE A DX CARD";
		String actual_ValueInDialogue1 = Value_From_Title_Of_CreateDXCard_dialogue;
		assertEquals(actual_ValueInDialogue1, expected_ValueInDialogue1);
		System.out.println("dialogue title has been verified successfully: " + actual_ValueInDialogue1);
		andrdCmnUtil.implicit_Wait();

		// To assert the Manually text in dialogue
		String Value_From_Manually_Option_In_CreateDXCard_dialogue = addproductpage
				.read_Value_From_Manually_Option_In_CreateDXCard_dialogue();
		String expected_ValueInDialogue2 = "Manually";
		String actual_ValueInDialogue2 = Value_From_Manually_Option_In_CreateDXCard_dialogue;
		assertEquals(actual_ValueInDialogue2, expected_ValueInDialogue2);
		System.out.println("Manually text in dialogue has been verified successfully: " + actual_ValueInDialogue2);
		andrdCmnUtil.implicit_Wait();

		// To assert the OR text on create dx card dialogue
		String value_From_OR_Text_On_CreateADXCard_dialogue = addproductpage
				.read_Value_From_OR_Text_On_CreateADXCard_dialogue();
		String expected_ValueInDialogue3 = "OR";
		String actual_ValueInDialogue3 = value_From_OR_Text_On_CreateADXCard_dialogue;
		assertEquals(actual_ValueInDialogue3, expected_ValueInDialogue3);
		System.out.println(
				"OR text on create dx card dialogue has been verified successfully: " + actual_ValueInDialogue3);
		andrdCmnUtil.implicit_Wait();

		// To assert the Scan Invoice in create dx card dialogue
		String Value_From_ScanInvoice_In_CreateDXCard_dialogue = addproductpage
				.read_Value_From_ScanInvoice_In_CreateDXCard_dialogue();
		String expected_ValueInDialogue4 = "Scan Invoice";
		String actual_ValueInDialogue4 = Value_From_ScanInvoice_In_CreateDXCard_dialogue;
		assertEquals(actual_ValueInDialogue4, expected_ValueInDialogue4);
		System.out.println(
				"Scan Invoice in create dx card dialogue has been verified successfully: " + actual_ValueInDialogue4);
		andrdCmnUtil.implicit_Wait();

	}

	public void verify_UI_And_Functionaity_AddProductThroughScanInvoice() throws InterruptedException {
		// To click on the Scan Invoice in create dx card dialogue
		addproductpage.click_On_ScanInvoice_In_CreateDXCard_dialogue();
		Thread.sleep(3000);
		
		// To click on the allow button on the popup
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(2000);
		
		// To click on the allow button on the popup
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(4000);

		// To click on the camera click option
		cmnelementpage.takePicture_In_NewRequestScreen_Attachment();

		// To click on the tick mark on the preview screen
		cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();

		// To assert the success message
		String valueFromPopupSuccessMessage = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_ValueInSuccessPopup = "Thank you for providing the details. Your DX Card will be activated in 24 hours!";
		String actual_ValueInSuccessPopup = valueFromPopupSuccessMessage;
		assertEquals(actual_ValueInSuccessPopup, expected_ValueInSuccessPopup);
		System.out.println("After creating a dummy dx card, sucess message text has been verified successfully: "
				+ actual_ValueInSuccessPopup);
		andrdCmnUtil.implicit_Wait();

		// To click on the ok button on the pop-up
		cmnelementpage.clickOn_Ok_On_Popup();

	}

	public void verify_UI_Functionality_For_SelectSubcategoryScreen() throws InterruptedException {
		// To click on the add product button
		cmnelementpage.click_On_AddProduct_Plus_Button();

		// To click on the Appliances super category
		addproductpage.click_On_AppliancesSupercategory();

		// To click on the Manually option in the dialogue
		addproductpage.click_On_Manually_Option_In_CreateDXCard_dialogue();

		// To click on the close button on the screen
		cmnelementpage.clickOn_On_Close();

		// To assert the alert pop-up text
		String valueFromAlertPopupTextMessage2 = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_ValueInSelectSubcategoryScreen3 = "Your process is incomplete. Do you wish to exit?";
		String actual_ValueInSelectSubcategoryScreen3 = valueFromAlertPopupTextMessage2;
		assertEquals(actual_ValueInSelectSubcategoryScreen3, expected_ValueInSelectSubcategoryScreen3);
		System.out.println(
				"Alert popup message has been verified successfully: " + actual_ValueInSelectSubcategoryScreen3);
		andrdCmnUtil.implicit_Wait();

		// To click on ok on the pop-up
		cmnelementpage.clickOn_Cancel_On_Popup();

		// To click on the add product button
		cmnelementpage.click_On_AddProduct_Plus_Button();

		// To click on the Appliances super category
		addproductpage.click_On_AppliancesSupercategory();

		// To click on the Manually option in the dialogue
		addproductpage.click_On_Manually_Option_In_CreateDXCard_dialogue();
		Thread.sleep(2000);

		// To assert the Selected Super-Category/Category name
		String value_From_selected_Category_Name = addproductpage.read_Value_From_selected_Category_Name();
		String expected_ValueInSelectSubcategoryScreen1 = "Appliances";
		String actual_ValueInSelectSubcategoryScreen1 = value_From_selected_Category_Name;
		assertEquals(actual_ValueInSelectSubcategoryScreen1, expected_ValueInSelectSubcategoryScreen1);
		System.out.println("Selected Super-Category/Category name has been verified successfully: "
				+ actual_ValueInSelectSubcategoryScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the Category/Brand/Manufacturer Search field placeholder
		String value_From_categorySearchField = addproductpage.read_value_From_categorySearchField();
		String expected_ValueInSelectSubcategoryScreen2 = "Select from sub-category";
		String actual_ValueInSelectSubcategoryScreen2 = value_From_categorySearchField;
		assertEquals(actual_ValueInSelectSubcategoryScreen2, expected_ValueInSelectSubcategoryScreen2);
		System.out.println("Category Search field placeholder has been verified successfully: "
				+ actual_ValueInSelectSubcategoryScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Toolbar Title for create DX card screen
		String valueFromToolbarTitle1 = cmnelementpage.read_From_Toolbar_Title();
		String expected_ValueFromToolbarTitle1 = "CREATE DX CARD";
		String actual_valueFromToolbarTitle1 = valueFromToolbarTitle1;
		assertEquals(actual_valueFromToolbarTitle1, expected_ValueFromToolbarTitle1);
		System.out.println("Toolbar Title has been verified successfully: " + actual_valueFromToolbarTitle1);
		andrdCmnUtil.implicit_Wait();

		// To write some values in Search field for Sub-category
		addproductpage.write_On_Category_SearchField(value_For_Select_Subcategory_Search_Field);

		// To clear the configured text from Category Search field
		addproductpage.clear_Text_From_CategorySearchField();

		// To assert the Can't find sub-category label
		String value_From_no_Data_Available_Label_In_CategoryScreen = addproductpage
				.read_Value_From_cantFindSubcategory_Label_In_CategoryScreen();
		String expected_ValueInSelectSubcategoryScreen4 = "Can't find sub-category ? ";
		String actual_ValueInSelectSubcategoryScreen4 = value_From_no_Data_Available_Label_In_CategoryScreen;
		assertEquals(actual_ValueInSelectSubcategoryScreen4, expected_ValueInSelectSubcategoryScreen4);
		System.out.println("Can't find sub-category label has been verified successfully: "
				+ actual_ValueInSelectSubcategoryScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on add one option
		addproductpage.click_On_AddOne_Option_In_CategoryScreen();

		// To click on the cancel button
		addproductpage.click_On_Cancel_Option_On_SubCategorydialogue();

		// To click on add one option
		addproductpage.click_On_AddOne_Option_In_CategoryScreen();

		// To assert the dialogue title
		String Value_From_Title_Of_CreateDXCard_dialogue = addproductpage
				.read_Value_From_Title_Of_CreateDXCard_dialouge();
		String expected_ValueInSelectSubcategoryScreen5 = "SUB-CATEGORY";
		String actual_ValueInSelectSubcategoryScreen5 = Value_From_Title_Of_CreateDXCard_dialogue;
		assertEquals(actual_ValueInSelectSubcategoryScreen5, expected_ValueInSelectSubcategoryScreen5);
		System.out.println("dialogue title has been verified successfully: " + actual_ValueInSelectSubcategoryScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on Add button on the Sub-Category Add dialogue
		addproductpage.click_On_Add_Option_On_SubCategorydialogue();

		// To assert the field validation message
		String value_From_EnterSubcategoryField_Validation_Text = cmnelementpage
				.read_From_MobilenoEmailID_Validation_Text();
		String expected_ValueInSelectSubcategoryScree6 = "Field cannot be empty";
		String actual_ValueInSelectSubcategoryScreen6 = value_From_EnterSubcategoryField_Validation_Text;
		assertEquals(actual_ValueInSelectSubcategoryScreen6, expected_ValueInSelectSubcategoryScree6);
		System.out.println(
				"Field validation message has been verified successfully: " + actual_ValueInSelectSubcategoryScreen6);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the cancel button
		addproductpage.click_On_Cancel_Option_On_SubCategorydialogue();

//		// To give the value in enter sub-category dialogue box
//		addproductpage.write_On_EnterSubcategoryName_On_SubCategorydialogue(value_For_Enter_Subcategory_Field);
//
//		// To click on Add button on the Sub-Category Add dialogue
//		addproductpage.click_On_Add_Option_On_SubCategorydialogue();
//
//		// To assert the Add Brand dialogue title
//		String Value_From_Title_Of_AddBrand_dialogue = addproductpage.read_Value_From_Title_Of_CreateDXCard_dialouge();
//		String expected_ValueInAddBrandDialogue = "BRAND";
//		String actual_ValueInAddBrandDialogue = Value_From_Title_Of_AddBrand_dialogue;
//		assertEquals(actual_ValueInAddBrandDialogue, expected_ValueInAddBrandDialogue);
//		System.out.println("dialogue title has been verified successfully: " + actual_ValueInAddBrandDialogue);
//		andrdCmnUtil.implicit_Wait();
//
//		// To click on Add button on the Sub-Category Add dialogue
//		addproductpage.click_On_Add_Option_On_SubCategorydialogue();
//
//		// To assert the field validation message
//		String value_From_EnterBrandField_Validation_Text = cmnelementpage.read_From_MobilenoEmailID_Validation_Text();
//		String expected_ValueInAddBrandDialogue1 = "Field cannot be empty";
//		String actual_ValueInAddBrandDialogue1 = value_From_EnterBrandField_Validation_Text;
//		assertEquals(actual_ValueInAddBrandDialogue1, expected_ValueInAddBrandDialogue1);
//		System.out
//				.println("Field validation message has been verified successfully: " + actual_ValueInAddBrandDialogue1);
//		andrdCmnUtil.implicit_Wait();
//
//		// To give the value in enter sub-category dialogue box
//		addproductpage.write_On_EnterSubcategoryName_On_SubCategorydialogue(value_For_Enter_Brand_Field);
//
//		// To click on Add button on the Sub-Category Add dialogue
//		addproductpage.click_On_Add_Option_On_SubCategorydialogue();
//
//		// To assert the Add Model Number dialogue title
//		String Value_From_Title_Of_AddModelNumber_dialogue = addproductpage
//				.read_Value_From_Title_Of_CreateDXCard_dialouge();
//		String expected_ValueInAddModelNumberDialogue = "ADD MODEL NUMBER";
//		String actual_ValueInAddModelNumberDialogue = Value_From_Title_Of_AddModelNumber_dialogue;
//		assertEquals(actual_ValueInAddModelNumberDialogue, expected_ValueInAddModelNumberDialogue);
//		System.out.println("dialogue title has been verified successfully: " + actual_ValueInAddModelNumberDialogue);
//		andrdCmnUtil.implicit_Wait();
//
//		// To click on Add button on the Sub-Category Add dialogue
//		addproductpage.click_On_Add_Option_On_SubCategorydialogue();
//
//		// To assert the field validation message
//		String value_From_EnterModelNumberField_Validation_Text = cmnelementpage
//				.read_From_MobilenoEmailID_Validation_Text();
//		String expected_ValueInAddModelNumberDialogue1 = "Field cannot be empty";
//		String actual_ValueInAddModelNumberDialogue1 = value_From_EnterModelNumberField_Validation_Text;
//		assertEquals(actual_ValueInAddModelNumberDialogue1, expected_ValueInAddModelNumberDialogue1);
//		System.out.println(
//				"Field validation message has been verified successfully: " + actual_ValueInAddModelNumberDialogue1);
//		andrdCmnUtil.implicit_Wait();
//
//		// To give the value in enter sub-category dialogue box
//		addproductpage.write_On_EnterSubcategoryName_On_SubCategorydialogue(vlaue_For_Enter_Model_Number_Field);
//
//		// To click on Add button on the Sub-Category Add dialogue
//		addproductpage.click_On_Add_Option_On_SubCategorydialogue();
//
//		// To assert the Model Number which has added new
//		String value_From_ModelNumber_Field_In_CreateDXCardScreen1 = addproductpage
//				.read_value_From_ModelNumber_Field_In_CreateDXCardScreen();
//		String expected_ValueInCreateDXCardScreen = vlaue_For_Enter_Model_Number_Field;
//		String actual_ValueInCreateDXCardScreen = value_From_ModelNumber_Field_In_CreateDXCardScreen1;
//		assertEquals(actual_ValueInCreateDXCardScreen, expected_ValueInCreateDXCardScreen);
//		System.out.println(
//				"Model number which is added, has been verified successfully: " + actual_ValueInCreateDXCardScreen);
//		andrdCmnUtil.implicit_Wait();
//
//		// To click on the device back button
//		andrdCmnUtil.Click_DeviceBackButton();
//
//		// To click on the device back button
//		andrdCmnUtil.Click_DeviceBackButton();

		System.out.println("Now the user is on the Select Sub-category screen again.");
		Thread.sleep(2000);

		// To scroll down and select any particular sub-category from the drop-down
		andrdCmnUtil.scrollAndClick("Camera");

	}

	public void verify_UI_Functionality_For_SelectBrandScreen() {

		// To assert the Toolbar Title for create DX card screen
		String valueFromToolbarTitle1 = cmnelementpage.read_From_Toolbar_Title();
		String expected_ValueFromToolbarTitle1 = "CREATE DX CARD";
		String actual_valueFromToolbarTitle1 = valueFromToolbarTitle1;
		assertEquals(actual_valueFromToolbarTitle1, expected_ValueFromToolbarTitle1);
		System.out.println("Toolbar Title has been verified successfully: " + actual_valueFromToolbarTitle1);
		andrdCmnUtil.implicit_Wait();

		// To assert the category-brand combination
		String value_From_selected_Brand_Name = addproductpage.read_Value_From_selected_Brand_Name();
		String expected_ValueSelectBrandNameScreen1 = "Appliances / Camera";
		String actual_ValueSelectBrandNameScreen1 = value_From_selected_Brand_Name;
		assertEquals(actual_ValueSelectBrandNameScreen1, expected_ValueSelectBrandNameScreen1);
		System.out.println(
				"Model number which is added, has been verified successfully: " + actual_ValueSelectBrandNameScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the Brand Search field placeholder
		String value_From_BrandSearchField = addproductpage.read_value_From_categorySearchField();
		String expected_ValueInSelectBrandNameScreen2 = "Select from brand";
		String actual_ValueInSelectBrandNameScreen2 = value_From_BrandSearchField;
		assertEquals(actual_ValueInSelectBrandNameScreen2, expected_ValueInSelectBrandNameScreen2);
		System.out.println("Brand Search field placeholder has been verified successfully: "
				+ actual_ValueInSelectBrandNameScreen2);
		andrdCmnUtil.implicit_Wait();

		// To write some values in Search field for Brand
		addproductpage.write_On_Category_SearchField(value_For_Select_Brand_Search_Field);

		// To clear the configured text from Brand Search field
		addproductpage.clear_Text_From_CategorySearchField();

		// To assert the Can't find Brand label
		String value_From_no_Data_Available_Label_In_CategoryScreen = addproductpage
				.read_Value_From_cantFindSubcategory_Label_In_CategoryScreen();
		String expected_ValueInSelectBrandNameScreen5 = "Can't find brand ? ";
		String actual_ValueInSelectBrandNameScreen5 = value_From_no_Data_Available_Label_In_CategoryScreen;
		assertEquals(actual_ValueInSelectBrandNameScreen5, expected_ValueInSelectBrandNameScreen5);
		System.out.println(
				"Can't find Brand label has been verified successfully: " + actual_ValueInSelectBrandNameScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on Add one button on Select Brand Screen
		addproductpage.click_On_AddOne_Option_In_CategoryScreen();

		// To assert the Add Brand dialogue title
		String Value_From_Title_Of_AddBrand_dialogue = addproductpage.read_Value_From_Title_Of_CreateDXCard_dialouge();
		String expected_ValueInAddBrandDialogue = "BRAND";
		String actual_ValueInAddBrandDialogue = Value_From_Title_Of_AddBrand_dialogue;
		assertEquals(actual_ValueInAddBrandDialogue, expected_ValueInAddBrandDialogue);
		System.out.println("dialogue title has been verified successfully: " + actual_ValueInAddBrandDialogue);
		andrdCmnUtil.implicit_Wait();

		// To click on the cancel button
		addproductpage.click_On_Cancel_Option_On_SubCategorydialogue();

		// To scroll down and select any particular Brand from the list
		andrdCmnUtil.scrollAndClick("Canon");

	}

	public void verify_UI_Functionality_For_ModelNumberScreen()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {

		// To assert the Toolbar Title for create DX card screen
		String valueFromToolbarTitle1 = cmnelementpage.read_From_Toolbar_Title();
		String expected_ValueFromToolbarTitle1 = "CREATE DX CARD";
		String actual_valueFromToolbarTitle1 = valueFromToolbarTitle1;
		assertEquals(actual_valueFromToolbarTitle1, expected_ValueFromToolbarTitle1);
		System.out.println("Toolbar Title has been verified successfully: " + actual_valueFromToolbarTitle1);
		andrdCmnUtil.implicit_Wait();

		// To assert the Selected Super-Category/Sub-Category/Brand combination name
		String value_From_SuperCategory_SubCategory_Brand_Combination = addproductpage
				.read_value_From_SuperCategory_SubCategory_Brand_Combination();
		String expected_ValueInAddBrandDialogue = "Appliances / Camera / Canon";
		String actual_ValueInAddBrandDialogue = value_From_SuperCategory_SubCategory_Brand_Combination;
		assertEquals(actual_ValueInAddBrandDialogue, expected_ValueInAddBrandDialogue);
		System.out.println("dialogue title has been verified successfully: " + actual_ValueInAddBrandDialogue);
		andrdCmnUtil.implicit_Wait();

		// To assert the Model Number placeholder
		String value_From_ModelNumber_Field_In_CreateDXCardScreen = addproductpage
				.read_value_From_ModelNumber_Field_In_CreateDXCardScreen();
		String expected_ValueInCreateDXCardScreen1 = "Model Number • ";
		String actual_ValueInCreateDXCardScreen1 = value_From_ModelNumber_Field_In_CreateDXCardScreen;
		assertEquals(actual_ValueInCreateDXCardScreen1, expected_ValueInCreateDXCardScreen1);
		System.out.println(
				"Model Number placeholder has been verified successfully: " + actual_ValueInCreateDXCardScreen1);
		andrdCmnUtil.implicit_Wait();

		// To click on the Model Number field
		addproductpage.click_On_ModelNumber_Field_In_CreateADXCardScreen();

		// To click on the cancel button
		cmnelementpage.clickOn_SearchField_Back_Button();

		// To click on the Model Number field
		addproductpage.click_On_ModelNumber_Field_In_CreateADXCardScreen();

		// To click on the search icon
		cmnelementpage.click_On_SearchIcon();

		// To assert the Search field place holder
		String valueFrom_SearchFieldPlaceholder = cmnelementpage.read_ValueFrom_SearchFieldPlaceholder();
		String expected_ValueInCreateDXCardScreen6 = "Search..";
		String actual_ValueInCreateDXCardScreen6 = valueFrom_SearchFieldPlaceholder;
		assertEquals(actual_ValueInCreateDXCardScreen6, expected_ValueInCreateDXCardScreen6);
		System.out.println(
				"Search field placeholder has been verified successfully: " + actual_ValueInCreateDXCardScreen6);
		andrdCmnUtil.implicit_Wait();

		// To write on Search field of model number screen
		cmnelementpage.write_Value_On_SearchField(value_For_Search_Field_In_ModelNumber_Screen);

		// To click on the First model number (eos1500d, for the time being)
		addproductpage.select_First_ValueFromModelnumbers();

		// To write the selected Model Number in excel
		selected_ModelNumber = addproductpage.read_value_From_ModelNumber_Field_In_CreateDXCardScreen();
		ExcelLibrary.writeStringTestDataInExcelSheet(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 10, 1, selected_ModelNumber);
		Thread.sleep(2000);

//		// To assert the Serial Number placeholder
//		String value_From_SerialNumber_Field_In_CreateDXCardScreen = addproductpage
//				.read_value_From_SerialNumber_Field_In_CreateDXCardScreen();
//		String expected_ValueInCreateDXCardScreen2 = "Serial Number • ";
//		String actual_ValueInCreateDXCardScreen2 = value_From_SerialNumber_Field_In_CreateDXCardScreen;
//		assertEquals(actual_ValueInCreateDXCardScreen2, expected_ValueInCreateDXCardScreen2);
//		System.out.println(
//				"Serial Number placeholder has been verified successfully: " + actual_ValueInCreateDXCardScreen2);
//		andrdCmnUtil.implicit_Wait();
//
//		// To write on serial number field
//		addproductpage.write_In_SerialNumber_Field_In_CreateDXCardScreen(value_For_Serial_Number_Field);

		// To assert the UnderWarranty label
		String value_From_UnderWarrantyLabel_In_CreateDXCardScreen = addproductpage
				.read_Value_From_UnderWarrantyLabel_In_CreateDXCardScreen();
		String expected_ValueInCreateDXCardScreen3 = "Under Warranty";
		String actual_ValueInCreateDXCardScreen3 = value_From_UnderWarrantyLabel_In_CreateDXCardScreen;
		assertEquals(actual_ValueInCreateDXCardScreen3, expected_ValueInCreateDXCardScreen3);
		System.out.println("UnderWarranty label has been verified successfully: " + actual_ValueInCreateDXCardScreen3);
		andrdCmnUtil.implicit_Wait();

		// To check whether no radio button is selected Or not!!
		boolean noButton_In_CreateADXCardScreen = addproductpage.read_Value_From_NoButton_In_CreateADXCardScreen();

		if (noButton_In_CreateADXCardScreen == true) {
			System.out.println("NO option is by default selected for Under-Waranty.");

			// To click on the Yes radio button
			addproductpage.click_On_yesButton_In_CreateADXCardScreen();

			// To assert the Under warranty field placeholder
			String value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen = addproductpage
					.read_Value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen4 = "Under Warranty";
			String actual_ValueInCreateDXCardScreen4 = value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen;
			assertEquals(actual_ValueInCreateDXCardScreen4, expected_ValueInCreateDXCardScreen4);
			System.out.println("Under warranty field placeholder has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen4);
			andrdCmnUtil.implicit_Wait();

			// To click on the Under warranty field
			addproductpage.click_On_UnderWarrantyField_In_CreateDXCardScreen();

			// To select any particular date from calendar
			businesslib.selectNextMonthsDate_From_calendar();

//			// To write the selected date for underwarranty in excel
//			selected_Date_For_UnderWarranty = addproductpage
//					.read_Value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen();
//			ExcelLibrary.writeStringTestDataInExcelSheet(ConstantVaribale.EXCEL_FILE_PATH,
//					ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 7, 1, selected_Date_For_UnderWarranty);
//			Thread.sleep(2000);

			// To assert the Purchase date field placeholder
			String value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen = addproductpage
					.read_Value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen5 = "Purchase Date";
			String actual_ValueInCreateDXCardScreen5 = value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen;
			assertEquals(actual_ValueInCreateDXCardScreen5, expected_ValueInCreateDXCardScreen5);
			System.out.println("Purchase date field placeholder has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen5);
			andrdCmnUtil.implicit_Wait();

			// To click On the Purchase date field
			addproductpage.click_On_PurchaseDateField_In_CreateDXCardScreen();

			// To select todays' date from calendar
			businesslib.selectCurrentDate_From_Calendar();

//			// To write the selected purchase date in excel
//			selected_PurchaseDate = addproductpage.read_Value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen();
//			ExcelLibrary.writeStringTestDataInExcelSheet(ConstantVaribale.EXCEL_FILE_PATH,
//					ConstantVaribale.ADDPRODUCT_TESTDATA_SHEETNAME, 8, 1, selected_PurchaseDate);
//			Thread.sleep(2000);

			// To assert the Invoice Copy label
			String value_From_InvoiceCopylabel_In_CreateDXCardScreen = addproductpage
					.read_value_From_InvoiceCopylabel_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen7 = "INVOICE • ";
			String actual_ValueInCreateDXCardScreen7 = value_From_InvoiceCopylabel_In_CreateDXCardScreen;
			assertEquals(actual_ValueInCreateDXCardScreen7, expected_ValueInCreateDXCardScreen7);
			System.out
					.println("Invoice Copy label has been verified successfully: " + actual_ValueInCreateDXCardScreen7);
			andrdCmnUtil.implicit_Wait();

			// To click on add invoice plus button
			addproductpage.click_On_AddInvoiceButton_In_CreateADXCardScreen();

			// To assert the Scan document text in the scan document dialog
			String value_Of_scanDocument_Text = addproductpage.read_value_Of_scanDocument_Text();
			String expected_ValueInCreateDXCardScreen8 = "SCAN DOCUMENT";
			String actual_ValueInCreateDXCardScreen8 = value_Of_scanDocument_Text;
			assertEquals(actual_ValueInCreateDXCardScreen8, expected_ValueInCreateDXCardScreen8);
			System.out.println("Scan document text in the scan document dialog has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen8);
			andrdCmnUtil.implicit_Wait();

			// To click on the camera icon, on the scan document screen
			cmnelementpage.click_CameraOption_In_ScanDocument_PopupScreen();

//			// To click on the allow option on the allow media pop-up
//			cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();

			// To take picture from the device camera
			cmnelementpage.takePicture_In_NewRequestScreen_Attachment();
			Thread.sleep(3000);

			// To click on the tick mark on the image preview screen
			cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();

			// To click on invoice cross icon
			addproductpage.click_On_InvoiceCrossButton_In_CreateADXCardScreen();

			// To assert the Text showing in the pop-up confirmation
			String textMessage_From_PopupConfirmation = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_ValueInCreateDXCardScreen9 = "Would you like to delete this attachment?";
			String actual_ValueInCreateDXCardScreen9 = textMessage_From_PopupConfirmation;
			assertEquals(actual_ValueInCreateDXCardScreen9, expected_ValueInCreateDXCardScreen9);
			System.out.println("Text showing in the pop-up confirmation has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen9);
			andrdCmnUtil.implicit_Wait();

			// To click on the confirm on the popup confirmation
			cmnelementpage.clickOn_Ok_On_Popup();

			// To assert the Invoice Copy label
			String value_From_InvoiceCopylabel_In_CreateDXCardScreen1 = addproductpage
					.read_value_From_InvoiceCopylabel_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen10 = "INVOICE • ";
			String actual_ValueInCreateDXCardScreen10 = value_From_InvoiceCopylabel_In_CreateDXCardScreen1;
			assertEquals(actual_ValueInCreateDXCardScreen10, expected_ValueInCreateDXCardScreen10);
			System.out.println(
					"Invoice Copy label has been verified successfully: " + actual_ValueInCreateDXCardScreen10);
			andrdCmnUtil.implicit_Wait();

			// To click on add invoice plus button
			addproductpage.click_On_AddInvoiceButton_In_CreateADXCardScreen();

			// To click and select the first image, which is there in Scan document pop-up
			// screen
			cmnelementpage.click_On_FirstImage_In_list_Of_Images_In_ScanDocument_Screen();

			// To click on the tick mark on the image preview screen
			cmnelementpage.Click_DoneButton_In_Attachment_Preview_Screen();

			// To click on the done button
			addproductpage.click_On_DoneButton_In_CreateADXCardScreen();
			Thread.sleep(2000);

			// To assert the text message in the confirmation popup
			String textMessageInPopup = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_ValueInCreateDXCardScreen11 = "Please enter radio  button";
			String actual_ValueInCreateDXCardScreen11 = textMessageInPopup;
			assertEquals(actual_ValueInCreateDXCardScreen11, expected_ValueInCreateDXCardScreen11);
			System.out.println("Text message in the confirmation popup has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen11);
			andrdCmnUtil.implicit_Wait();

			// To click the Ok button
			cmnelementpage.clickOn_Ok_On_Popup();

//			// To scroll down till Multi dropdown field
//			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "property_label");
			
			// To scroll down till Multi dropdown field
			andrdCmnUtil.scrollAndClickTillVissibleText("Location •");

			// To assert the dynamic radiobutton label
			String value_From_DynamicradioButtonLabel_In_CreateDXCardScreen = addproductpage
					.read_Value_From_DynamicradioButtonLabel_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen12 = "Radio  button •";
			String actual_ValueInCreateDXCardScreen12 = value_From_DynamicradioButtonLabel_In_CreateDXCardScreen;
			assertEquals(actual_ValueInCreateDXCardScreen12, expected_ValueInCreateDXCardScreen12);
			System.out.println(
					"Dynamic radiobutton label has been verified successfully: " + actual_ValueInCreateDXCardScreen12);
			andrdCmnUtil.implicit_Wait();

			// To click on any of the radio button dynamic values, that has configured in
			// superuser
			addproductpage.click_On_FirstDynamicRadioButton();

			// To assert the dynamic Multiselect Dropdown
			String value_From_MultiSelectDropdownLabel_In_CreateDXCardScreen = addproductpage
					.read_Value_From_MultiSelectDropdownLabel_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen13 = "multiple dropdown • ";
			String actual_ValueInCreateDXCardScreen13 = value_From_MultiSelectDropdownLabel_In_CreateDXCardScreen;
			assertEquals(actual_ValueInCreateDXCardScreen13, expected_ValueInCreateDXCardScreen13);
			System.out.println("Dynamic Multiselect Dropdown has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen13);
			andrdCmnUtil.implicit_Wait();

			// To click on the dynamic Multiselect Dropdown
			addproductpage.click_On_MultiSelectDropdownLabel_In_CreateADXCardScreen();

			// To click on Multiple dropdown cancel icon
			addproductpage.click_On_MultipleDropdownCancelButton_In_CreateADXCardScreen();

			// To click on the dynamic Multiselect Dropdown
			addproductpage.click_On_MultiSelectDropdownLabel_In_CreateADXCardScreen();

			// To print all the Multi dropdown values those are showing
			addproductpage.read_Values_From_MultiDropdownValues();

			// To select all the Multi dropdown values those are showing
			addproductpage.select_Values_From_MultiDropdownValues();

			// To Un-select the first value from Multi dropdown values those are showing
			addproductpage.unselect_FirstValue_From_MultiDropdownValues();

			// To click on done button Multiple drop-down screen
			addproductpage.click_On_DoneButton_On_MultipleDropdownScreen();

			// To assert the count those are selected from multiple drop-down screen
			addproductpage.count_SelectedValuesFromMultiDropdownScreen();

			// To remove the first value from those values which are selected from multiple
			// drop-down screen
			addproductpage.clearFirstValue_From_SelectedValuesFromMultiDropdown();

			// To assert the count those are selected from multiple drop-down screen
			addproductpage.count_SelectedValuesFromMultiDropdownScreen();
			
			// To scroll down till Notes field
			andrdCmnUtil.scrollAndClickTillVissibleText("Notes");
			Thread.sleep(4000);

			// To click on the pick current location button
			addproductpage.click_On_AddLocationPlusButton_In_CreateADXCardScreen();
			
			// To click on the allow button
			cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
			Thread.sleep(3000);

			// To click on the screen back button on the location screen
			addproductpage.click_On_BackButtonLocationScreen();

			// To click on the pick current location button
			addproductpage.click_On_AddLocationPlusButton_In_CreateADXCardScreen();
			
			// To click on the tick mark on location screen
			addproductpage.clickOnTickMarkOnLocationScreen();
			Thread.sleep(2000);

//			// To assert the location details in model number screen
//			String Value_From_yourLocationFieldOnLocationScreen = addproductpage
//					.read_Value_From_yourLocationFieldOnLocationScreen();
//			addproductpage.clickOnTickMarkOnLocationScreen();
//			String value_From_PickUpAddressLabel_In_CreateDXCardScreen = addproductpage
//					.read_Value_From_PickUpAddressLabel_In_CreateDXCardScreen();
//			String expected_ValueInCreateDXCardScreen14 = value_From_PickUpAddressLabel_In_CreateDXCardScreen;
//			String actual_ValueInCreateDXCardScreen14 = Value_From_yourLocationFieldOnLocationScreen;
//			assertEquals(actual_ValueInCreateDXCardScreen14, expected_ValueInCreateDXCardScreen14);
//			System.out.println("Loctaion has been verified successfully: " + actual_ValueInCreateDXCardScreen14);
//			andrdCmnUtil.implicit_Wait();

			// To assert the Edit label for the Location added
			addproductpage.clickOnLocationDeletebutton();
			Thread.sleep(2000);

			// To assert the delete popup confirmation message
			String popupTextMessage1 = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_ValueInCreateDXCardScreen15 = "Would you like to delete this address?";
			String actual_ValueInCreateDXCardScreen15 = popupTextMessage1;
			assertEquals(actual_ValueInCreateDXCardScreen15, expected_ValueInCreateDXCardScreen15);
			System.out.println(
					"Delete location message has been verified successfully: " + actual_ValueInCreateDXCardScreen15);
			andrdCmnUtil.implicit_Wait();

			// To click on the confirm button the popup text
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(2000);

			// To click on the pick current location button
			addproductpage.click_On_AddLocationPlusButton_In_CreateADXCardScreen();
			Thread.sleep(2000);

			// To write on the Search field on the location screen
			addproductpage.writeOn_SearchField_On_LocationScreen(value_For_Location_Search_Field);
			Thread.sleep(2000);

			// To click on the suggested location showing on the location screen
			addproductpage.clickOnSuggestedLocationOnLocationScreen();
			Thread.sleep(2000);

			// To assert the Select location label
			String Value_From_SelectLocationLabelOnLocationScreen = addproductpage
					.read_Value_From_SelectLocationLabelOnLocationScreen();
			String expected_ValueInCreateDXCardScreen16 = "SELECT LOCATION";
			String actual_ValueInCreateDXCardScreen16 = Value_From_SelectLocationLabelOnLocationScreen;
			assertEquals(actual_ValueInCreateDXCardScreen16, expected_ValueInCreateDXCardScreen16);
			System.out.println(
					"Select location label has been verified successfully: " + actual_ValueInCreateDXCardScreen16);
			andrdCmnUtil.implicit_Wait();
			
			// To click on the tick option
			addproductpage.clickOnTickMarkOnLocationScreen();

//			// To assert the location details in model number screen
//			String Value_From_yourLocationFieldOnLocationScreen1 = addproductpage
//					.read_Value_From_yourLocationFieldOnLocationScreen();
//			addproductpage.clickOnTickMarkOnLocationScreen();
//			String value_From_PickUpAddressLabel_In_CreateDXCardScreen1 = addproductpage
//					.read_Value_From_PickUpAddressLabel_In_CreateDXCardScreen();
//			String expected_ValueInCreateDXCardScreen17 = value_From_PickUpAddressLabel_In_CreateDXCardScreen1;
//			String actual_ValueInCreateDXCardScreen17 = Value_From_yourLocationFieldOnLocationScreen1;
//			assertEquals(actual_ValueInCreateDXCardScreen17, expected_ValueInCreateDXCardScreen17);
//			System.out.println("Loctaion has been verified successfully: " + actual_ValueInCreateDXCardScreen17);
//			andrdCmnUtil.implicit_Wait();

//			// To scroll down till Notes field
//			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "informative_value");
			
			// To scroll down till Notes field
			andrdCmnUtil.scrollAndClickTillVissibleText("Notes");

			// To assert the Notes value
			String value_From_NotesValue_In_CreateDXCardScreen = addproductpage
					.read_Value_From_NotesValue_In_CreateDXCardScreen();
			String expected_ValueInCreateDXCardScreen18 = value_For_Notes_Field;
			String actual_ValueInCreateDXCardScreen18 = value_From_NotesValue_In_CreateDXCardScreen;
			assertEquals(actual_ValueInCreateDXCardScreen18, expected_ValueInCreateDXCardScreen18);
			System.out.println("Notes value has been verified successfully: " + actual_ValueInCreateDXCardScreen18);
			andrdCmnUtil.implicit_Wait();

			// To click on the done button
			addproductpage.click_On_DoneButton_In_CreateADXCardScreen();

			// To assert the Thankyou popup confirmation message
			String popupTextMessage2 = cmnelementpage.read_From_PopUp_Message_Text();
			String expected_ValueInCreateDXCardScreen19 = "Thank you for providing your product details. Access your DX Card now!";
			String actual_ValueInCreateDXCardScreen19 = popupTextMessage2;
			assertEquals(actual_ValueInCreateDXCardScreen19, expected_ValueInCreateDXCardScreen19);
			System.out.println("Thankyou popup confirmation message message has been verified successfully: "
					+ actual_ValueInCreateDXCardScreen19);
			andrdCmnUtil.implicit_Wait();

			// To click on ok on the popup
			cmnelementpage.clickOn_Ok_On_Popup();

			// To click on the grid view first dk
			cmnelementpage.clickOn_AddedProduct_In_GridView();

			System.out.println("Its showing the manufacturer-model number combination properly, that has been added.");

		} else {
			System.out.println("NO option is not selected bydefault for Under-Waranty, Hence the Flow is breaking.");
		}

	}

}
