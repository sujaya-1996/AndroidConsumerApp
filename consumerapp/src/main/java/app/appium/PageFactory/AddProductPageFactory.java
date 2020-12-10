package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class AddProductPageFactory {
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String dropdownValues;

	public AddProductPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To assert the Appliances Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Appliances']")
	private WebElement appliancesSupercategory;

	public String read_Value_From_AppliancesSupercategory() {
		String Value_From_AppliancesSupercategory = appliancesSupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_AppliancesSupercategory;
	}
	
	// To click on the Appliances Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Appliances']")
	private WebElement clickappliancesSupercategory;

	public void click_On_AppliancesSupercategory() {
		clickappliancesSupercategory.click();
		andrdCmnUtil.implicit_Wait();
		
	}

	// To assert the automobile Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Automobile']")
	private WebElement automobileSupercategory;

	public String read_Value_From_AutomobileSupercategory() {
		String Value_From_AutomobileSupercategory = automobileSupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_AutomobileSupercategory;
	}

	// To assert the Finance & Insurance Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Finance & Insurance']")
	private WebElement finance_InsuranceSupercategory;

	public String read_Value_From_Finance_InsuranceSupercategory() {
		String Value_From_Finance_InsuranceSupercategory = finance_InsuranceSupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_Finance_InsuranceSupercategory;
	}

	// To assert the jewellery Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Jewellery']")
	private WebElement jewellerySupercategory;

	public String read_Value_From_JewellerySupercategory() {
		String Value_From_JewellerySupercategory = jewellerySupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_JewellerySupercategory;
	}

	// To assert the health Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Health']")
	private WebElement healthSupercategory;

	public String read_Value_From_HealthSupercategory() {
		String Value_From_HealthSupercategory = healthSupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_HealthSupercategory;
	}

	// To assert the travel Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Travel']")
	private WebElement travelSupercategory;

	public String read_Value_From_TravelSupercategory() {
		String Value_From_TravelSupercategory = travelSupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_TravelSupercategory;
	}

	// To assert the Property Super-category label
	@FindBy(xpath = "//android.widget.TextView[@text='Property']")
	private WebElement PropertySupercategory;

	public String read_Value_From_PropertySupercategory() {
		String Value_From_PropertySupercategory = PropertySupercategory.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_PropertySupercategory;
	}

	// To assert the unfill Circle1 In CreateDXCard Screen
	@FindBy(id = "unfill_circle1")
	private WebElement unfill_Circle1_In_CreateDXCard_Screen;

	public boolean read_Value_From_Unfill_Circle1_In_CreateDXCard_Screen() {
		boolean Value_From_Unfill_Circle1_In_CreateDXCard_Screen = unfill_Circle1_In_CreateDXCard_Screen.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return Value_From_Unfill_Circle1_In_CreateDXCard_Screen;
	}

	// To assert the dialogue title
	@FindBy(id = "title_tv")
	private WebElement title_Of_CreateDXCard_dialogue;

	public String read_Value_From_Title_Of_CreateDXCard_dialouge() {
		String Value_From_Title_Of_CreateDXCard_dialogue = title_Of_CreateDXCard_dialogue.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_Title_Of_CreateDXCard_dialogue;
	}

	// To assert the manually in create dx card dialogue
	@FindBy(id = "manually_tv")
	private WebElement manually_Option_In_CreateDXCard_dialogue;

	public String read_Value_From_Manually_Option_In_CreateDXCard_dialogue() {
		String Value_From_Manually_Option_In_CreateDXCard_dialogue = manually_Option_In_CreateDXCard_dialogue.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_Manually_Option_In_CreateDXCard_dialogue;
	}

	// To click on the manually in create dx card dialogue
	@FindBy(id = "manually_tv")
	private WebElement manually_Option_In_CreateADXCard_dialogue;

	public void click_On_Manually_Option_In_CreateDXCard_dialogue() {
		manually_Option_In_CreateADXCard_dialogue.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Scan Invoice in create dx card dialogue
	@FindBy(id = "add_new_address_tv")
	private WebElement scanInvoice_In_CreateDXCard_dialogue;

	public String read_Value_From_ScanInvoice_In_CreateDXCard_dialogue() {
		String Value_From_ScanInvoice_In_CreateDXCard_dialogue = scanInvoice_In_CreateDXCard_dialogue.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_ScanInvoice_In_CreateDXCard_dialogue;
	}

	// To click on the Scan Invoice in create dx card dialogue
	@FindBy(id = "add_new_address_tv")
	private WebElement scanInvoice_In_CreateADXCard_dialogue;

	public void click_On_ScanInvoice_In_CreateDXCard_dialogue() {
		scanInvoice_In_CreateADXCard_dialogue.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the OR text on create dx card dialogue
	@FindBy(id = "textView")
	private WebElement or_Text_On_CreateADXCard_dialogue;

	public String read_Value_From_OR_Text_On_CreateADXCard_dialogue() {
		String value_From_OR_Text_On_CreateADXCard_dialogue = or_Text_On_CreateADXCard_dialogue.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_OR_Text_On_CreateADXCard_dialogue;

	}

	// To assert the Selected Super-Category/Category name
	@FindBy(id = "selected_category_tv")
	private WebElement selected_Category_Name;

	public String read_Value_From_selected_Category_Name() {
		String value_From_selected_Category_Name = selected_Category_Name.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_selected_Category_Name;

	}

	// To assert the Category/Brand/Manufacturer Search field placeholder
	@FindBy(id = "mSearch")
	private WebElement categorySearchField;

	public String read_value_From_categorySearchField() {
		String value_From_categorySearchField = categorySearchField.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_categorySearchField;

	}

	// To give value and search the same in category search field
	@FindBy(id = "mSearch")
	private WebElement category_SearchField;

	public void write_On_Category_SearchField(String categoryName_From_Excel) {
		category_SearchField.sendKeys(categoryName_From_Excel);
		andrdCmnUtil.implicit_Wait();

	}

	// To clear the configured text from Category/Brand/Manufacturer Search field
	@FindBy(id = "mSearch")
	private WebElement clear_CategorySearchField;

	public void clear_Text_From_CategorySearchField() {
		clear_CategorySearchField.clear();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Can't find sub-category label
	@FindBy(id = "no_data_available")
	private WebElement no_Data_Available_Label_In_CategoryScreen;

	public String read_Value_From_cantFindSubcategory_Label_In_CategoryScreen() {
		String value_From_no_Data_Available_Label_In_CategoryScreen = no_Data_Available_Label_In_CategoryScreen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_no_Data_Available_Label_In_CategoryScreen;

	}

	// To click on add one option
	@FindBy(id = "add_now_tv")
	private WebElement addOne_Option_In_CategoryScreen;

	public void click_On_AddOne_Option_In_CategoryScreen() {
		addOne_Option_In_CategoryScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on Cancel button on the Sub-Category Add dialogue
	@FindBy(id = "cancel_select_brand_tv")
	private WebElement cancel_Option_On_SubCategorydialogue;

	public void click_On_Cancel_Option_On_SubCategorydialogue() {
		cancel_Option_On_SubCategorydialogue.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on Add button on the Sub-Category Add dialogue
	@FindBy(id = "submit_address_tv")
	private WebElement add_Option_On_SubCategorydialogue;

	public void click_On_Add_Option_On_SubCategorydialogue() {
		add_Option_On_SubCategorydialogue.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To give the value in enter subcategory dialogue box
	@FindBy(id = "input_lay_model_no")
	private WebElement enterSubcategoryName_On_SubCategorydialogue;

	public void write_On_EnterSubcategoryName_On_SubCategorydialogue(String subcategory_From_excel) {
		enterSubcategoryName_On_SubCategorydialogue.sendKeys(subcategory_From_excel);
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Selected Sub-Category/Brand name
	@FindBy(id = "selected_sub_category_tv")
	private WebElement selected_Brand_Name;

	public String read_Value_From_selected_Brand_Name() {
		String value_From_selected_Brand_Name = selected_Brand_Name.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_selected_Brand_Name;

	}

	// To assert the Selected Super-Category/Sub-Category/Brand combination name
	@FindBy(id = "title")
	private WebElement superCategory_SubCategory_Brand_Combination;

	public String read_value_From_SuperCategory_SubCategory_Brand_Combination() {
		String value_From_SuperCategory_SubCategory_Brand_Combination = superCategory_SubCategory_Brand_Combination
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_SuperCategory_SubCategory_Brand_Combination;

	}

	// To assert the Model Number placeholder
	@FindBy(id = "text_with_scan")
	private WebElement modelNumber_Field_In_CreateDXCardScreen;

	public String read_value_From_ModelNumber_Field_In_CreateDXCardScreen() {
		String value_From_ModelNumber_Field_In_CreateDXCardScreen = modelNumber_Field_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_ModelNumber_Field_In_CreateDXCardScreen;

	}

	// To click on the Model Number field
	@FindBy(id = "text_with_scan")
	private WebElement modelNumber_Field_In_CreateADXCardScreen;

	public void click_On_ModelNumber_Field_In_CreateADXCardScreen() {
		modelNumber_Field_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To assert the Serial Number placeholder
	@FindBy(id = "purchase_date_rl")
	private WebElement serialNumber_Field_In_CreateDXCardScreen;

	public String read_value_From_SerialNumber_Field_In_CreateDXCardScreen() {
		String value_From_SerialNumber_Field_In_CreateDXCardScreen = serialNumber_Field_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_SerialNumber_Field_In_CreateDXCardScreen;

	}
	
	// To write on serial number field
	@FindBy(id = "purchase_date_rl")
	private WebElement serialNumber_In_CreateDXCardScreen;

	public void write_In_SerialNumber_Field_In_CreateDXCardScreen(String serialNumber_From_Excel) {
		serialNumber_In_CreateDXCardScreen.sendKeys(serialNumber_From_Excel);
		andrdCmnUtil.implicit_Wait();
		

	}
	
	

	// To assert the UnderWarranty label
	@FindBy(id = "under_warranty_tv")
	private WebElement underWarrantyLabel_In_CreateDXCardScreen;

	public String read_Value_From_UnderWarrantyLabel_In_CreateDXCardScreen() {
		String value_From_UnderWarrantyLabel_In_CreateDXCardScreen = underWarrantyLabel_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_UnderWarrantyLabel_In_CreateDXCardScreen;

	}

	// To click on the Yes radio button
	@FindBy(id = "rb_yes")
	private WebElement yesButton_In_CreateADXCardScreen;

	public void click_On_yesButton_In_CreateADXCardScreen() {
		yesButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the No radio button
	@FindBy(id = "rb_no")
	private WebElement noButton_In_CreateADXCardScreen;

	public void click_On_NoButton_In_CreateADXCardScreen() {
		noButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To check whether no radio button is selected Or not!!
	@FindBy(id = "rb_no")
	private WebElement noButton_Status_In_CreateADXCardScreen;

	public boolean read_Value_From_NoButton_In_CreateADXCardScreen() {
		boolean noButton_In_CreateADXCardScreen = noButton_Status_In_CreateADXCardScreen.isEnabled();
		andrdCmnUtil.implicit_Wait();
		return noButton_In_CreateADXCardScreen;

	}
	
	// To assert the Under warranty field placeholder
	@FindBy(xpath = "//android.widget.EditText[@text='Under Warranty']")
	private WebElement underWarrantyPlaceholder_In_CreateDXCardScreen;

	public String read_Value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen() {
		String value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen = underWarrantyPlaceholder_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_UnderWarrantyPlaceholder_In_CreateDXCardScreen;

	}
	
	// To assert the Scan document text in the scan document dialog
	@FindBy(xpath = "//android.widget.TextView[@text='SCAN DOCUMENT']")
	private WebElement scanDocument_Text;

	public String read_value_Of_scanDocument_Text() {
		String value_Of_scanDocument_Text = scanDocument_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return value_Of_scanDocument_Text;

	}
	
	// To click on the Under warranty field 
	@FindBy(xpath = "//android.widget.EditText[@text='Under Warranty']")
	private WebElement underWarrantyField_In_CreateDXCardScreen;

	public void click_On_UnderWarrantyField_In_CreateDXCardScreen() {
		underWarrantyField_In_CreateDXCardScreen.click();
		andrdCmnUtil.implicit_Wait();
		

	}
	
	// To assert the Purchase date field placeholder
	@FindBy(xpath = "//android.widget.EditText[@text='Purchase Date']")
	private WebElement purchaseDatePlaceholder_In_CreateDXCardScreen;

	public String read_Value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen() {
		String value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen = purchaseDatePlaceholder_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_PurchaseDatePlaceholder_In_CreateDXCardScreen;

	}
	
	// To click On the Purchase date field 
	@FindBy(xpath = "//android.widget.EditText[@text='Purchase Date']")
	private WebElement purchaseDateField_In_CreateDXCardScreen;

	public void click_On_PurchaseDateField_In_CreateDXCardScreen() {
		purchaseDateField_In_CreateDXCardScreen.click();
		andrdCmnUtil.implicit_Wait();
		

	} 


	// To assert the Invoice Copy label
	@FindBy(id = "invoice_copy_tv")
	private WebElement invoiceCopylabel_In_CreateDXCardScreen;

	public String read_value_From_InvoiceCopylabel_In_CreateDXCardScreen() {
		String value_From_InvoiceCopylabel_In_CreateDXCardScreen = invoiceCopylabel_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_InvoiceCopylabel_In_CreateDXCardScreen;

	}

	// To click on add invoice plus button
	@FindBy(id = "invoice_copy_plus_iv")
	private WebElement addInvoiceButton_In_CreateADXCardScreen;

	public void click_On_AddInvoiceButton_In_CreateADXCardScreen() {
		addInvoiceButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To click on the done button
	@FindBy(id = "done_add_product_ll")
	private WebElement doneButton_In_CreateADXCardScreen;

	public void click_On_DoneButton_In_CreateADXCardScreen() {
		doneButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the dynamic radiobutton label
	@FindBy(id = "dynamic_radio_label")
	private WebElement dynamicradioButtonLabel_In_CreateDXCardScreen;

	public String read_Value_From_DynamicradioButtonLabel_In_CreateDXCardScreen() {
		String value_From_DynamicradioButtonLabel_In_CreateDXCardScreen = dynamicradioButtonLabel_In_CreateDXCardScreen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_DynamicradioButtonLabel_In_CreateDXCardScreen;

	}

	// To click on any of the radio button dynamic values, that has configured in
	// superuser
	@FindBy(xpath = "//android.widget.RadioButton[@text='Radio1']")
	private WebElement firstDynamicRadioButton;

	public void click_On_FirstDynamicRadioButton() {
		firstDynamicRadioButton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on any of the radio button dynamic values, that has configured in
	// superuser
	@FindBy(xpath = "//android.widget.RadioButton[@text='Radio2']")
	private WebElement secondDynamicRadioButton;

	public void click_On_SecondDynamicRadioButton() {
		secondDynamicRadioButton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on any of the radio button dynamic values, that has configured in
	// superuser
	@FindBy(xpath = "//android.widget.RadioButton[@text='Radio3']")
	private WebElement thirdDynamicRadioButton;

	public void click_On_ThirdDynamicRadioButton() {
		thirdDynamicRadioButton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on any of the radio button dynamic values, that has configured in
	// superuser
	@FindBy(xpath = "//android.widget.RadioButton[@text='Radio4']")
	private WebElement fourthDynamicRadioButton;

	public void click_On_FourthDynamicRadioButton() {
		fourthDynamicRadioButton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the dynamic Multiselect Dropdown
	@FindBy(id = "multi_select_label")
	private WebElement multiSelectDropdownLabel_In_CreateDXCardScreen;

	public String read_Value_From_MultiSelectDropdownLabel_In_CreateDXCardScreen() {
		String value_From_MultiSelectDropdownLabel_In_CreateDXCardScreen = multiSelectDropdownLabel_In_CreateDXCardScreen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_MultiSelectDropdownLabel_In_CreateDXCardScreen;

	}

	// To click on the dynamic Multiselect Dropdown
	@FindBy(id = "multi_select_label")
	private WebElement multiSelectDropdownLabel_In_CreateADXCardScreen;

	public void click_On_MultiSelectDropdownLabel_In_CreateADXCardScreen() {
		multiSelectDropdownLabel_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Pick Up Address label for location
	@FindBy(id = "property_address")
	private WebElement pickUpAddressLabel_In_CreateDXCardScreen;

	public String read_Value_From_PickUpAddressLabel_In_CreateDXCardScreen() {
		String value_From_PickUpAddressLabel_In_CreateDXCardScreen = pickUpAddressLabel_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_PickUpAddressLabel_In_CreateDXCardScreen;

	}

	// To click on the plus button for location
	@FindBy(id = "add_address")
	private WebElement addLocationPlusButton_In_CreateADXCardScreen;

	public void click_On_AddLocationPlusButton_In_CreateADXCardScreen() {
		addLocationPlusButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Notes label
	@FindBy(id = "Notes")
	private WebElement notesLabel_In_CreateDXCardScreen;

	public String read_Value_From_NotesLabel_In_CreateDXCardScreen() {
		String value_From_NotesLabel_In_CreateDXCardScreen = notesLabel_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_NotesLabel_In_CreateDXCardScreen;

	}

	// To assert the Notes Text value
	@FindBy(id = "informative_value")
	private WebElement notesValue_In_CreateDXCardScreen;

	public String read_Value_From_NotesValue_In_CreateDXCardScreen() {
		String value_From_NotesValue_In_CreateDXCardScreen = notesValue_In_CreateDXCardScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_NotesValue_In_CreateDXCardScreen;

	}

	// To click on invoice cross icon
	@FindBy(id = "invoice_copy_delete_iv")
	private WebElement invoiceCrossButton_In_CreateADXCardScreen;

	public void click_On_InvoiceCrossButton_In_CreateADXCardScreen() {
		invoiceCrossButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on Multiple dropdown cancel icon
	@FindBy(id = "toolbar_navigation_text")
	private WebElement multipleDropdownCancelButton_In_CreateADXCardScreen;

	public void click_On_MultipleDropdownCancelButton_In_CreateADXCardScreen() {
		multipleDropdownCancelButton_In_CreateADXCardScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// // To assert the multiple dropdown values
	// @FindBy(xpath = "//android.widget.TextView[@text='value1']")
	// private WebElement firstValue_From_MultipleDropdownScreen;
	//
	// public String read_Value_From_FirstValue_From_MultipleDropdownScreen() {
	// String Value_From_FirstValue_From_MultipleDropdownScreen =
	// firstValue_From_MultipleDropdownScreen.getText();
	// andrdCmnUtil.implicit_Wait();
	// return Value_From_FirstValue_From_MultipleDropdownScreen;
	// }
	//
	// // To assert the multiple dropdown values
	// @FindBy(xpath = "//android.widget.TextView[@text='value1']")
	// private WebElement firstValue_From_MultipleDropdownScreen;
	//
	// public String read_Value_From_FirstValue_From_MultipleDropdownScreen() {
	// String Value_From_FirstValue_From_MultipleDropdownScreen =
	// firstValue_From_MultipleDropdownScreen.getText();
	// andrdCmnUtil.implicit_Wait();
	// return Value_From_FirstValue_From_MultipleDropdownScreen;
	// }
	//

	// To print all the Multi dropdown values those are showing
	@FindBy(id = "option_label")
	private List<WebElement> multiDropdownValues;

	public void read_Values_From_MultiDropdownValues() {
		for (int i = 0; i < multiDropdownValues.size(); i++) {
			dropdownValues = multiDropdownValues.get(i).getText().trim();
			System.out.println("Sequential values are: " + dropdownValues);
		}
		System.out.println("So there are " + multiDropdownValues.size() + "values in total.");
	}

	// To select all the Multi dropdown values those are showing
	@FindBy(id = "checkbox")
	private List<WebElement> multiDropdown_Values;

	public void select_Values_From_MultiDropdownValues() {
		for (int i = 0; i < multiDropdown_Values.size(); i++) {
			multiDropdownValues.get(i).click();
			
		}System.out.println("All the checkboxes are selected.");

	}

	// To Un-select the first value from Multi dropdown values those are showing
	@FindBy(id = "checkbox")
	private List<WebElement> first_multiDropdown_Value;

	public void unselect_FirstValue_From_MultiDropdownValues() {
		for (int i = 0; i < first_multiDropdown_Value.size();) {
			multiDropdownValues.get(i).click();
			break;
			
		}System.out.println("Selected first checkbox is now unselected.");

	}

	// To click on done button Multiple drop-down screen
	@FindBy(id = "submit_multiple_choice")
	private WebElement doneButton_On_MultipleDropdownScreen;

	public void click_On_DoneButton_On_MultipleDropdownScreen() {
		doneButton_On_MultipleDropdownScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the count those are selected from multiple drop-down screen
	@FindBy(id = "selected_date_ll")
	private List<WebElement> selectedValuesFromMultiDropdownScreen;

	public void count_SelectedValuesFromMultiDropdownScreen() {
		int i = selectedValuesFromMultiDropdownScreen.size();
		System.out.println("Total number of selected values is: " + i);

	}

	// To remove the first value from those values which are selected from multiple
	// drop-down screen
	@FindBy(id = "clear_date_selection_iv")
	private List<WebElement> clearFirstValueFromMultiDropdownValues;

	public void clearFirstValue_From_SelectedValuesFromMultiDropdown() {
		for (int i = 0; i < clearFirstValueFromMultiDropdownValues.size();) {
			clearFirstValueFromMultiDropdownValues.get(i).click();
			break;

		}
		System.out.println("Selected first value is now removed.");

	}

	// To click on the pick current location button
	@FindBy(id = "btnFloatingAction")
	private WebElement pickCurrentLocationButton;

	public void click_On_PickCurrentLocationButton() {
		pickCurrentLocationButton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the screen back button on the location screen
	@FindBy(xpath = "//android.widget.ImageButton")
	private WebElement backButtonLocationScreen;

	public void click_On_BackButtonLocationScreen() {
		backButtonLocationScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To write on the Search field on the location screen
	@FindBy(id = "search")
	private WebElement searchFieldaOnLocationScreen;

	public void writeOn_SearchField_On_LocationScreen(String location_From_Excel) {
		searchFieldaOnLocationScreen.sendKeys(location_From_Excel);
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the tick mark besides the search field on the location screen
	@FindBy(id = "action_voice")
	private WebElement tickMarkOnLocationScreen;

	public void clickOnTickMarkOnLocationScreen() {
		tickMarkOnLocationScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Select location label
	@FindBy(xpath = "//android.widget.TextView[@text='SELECT LOCATION']")
	private WebElement selectLocationLabelOnLocationScreen;

	public String read_Value_From_SelectLocationLabelOnLocationScreen() {
		String Value_From_SelectLocationLabelOnLocationScreen = selectLocationLabelOnLocationScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_SelectLocationLabelOnLocationScreen;
	}

	// To assert the value from Your location field
	@FindBy(id = "street_city_zipcode")
	private WebElement yourLocationFieldOnLocationScreen;

	public String read_Value_From_yourLocationFieldOnLocationScreen() {
		String Value_From_yourLocationFieldOnLocationScreen = yourLocationFieldOnLocationScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_yourLocationFieldOnLocationScreen;
	}

	// To click on the cross mark besides the search field on the location screen
	@FindBy(id = "clear_search_image")
	private WebElement crossMarkOnLocationScreen;

	public void clickOnCrossMarkOnLocationScreen() {
		crossMarkOnLocationScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the suggested location showing on the location screen
	@FindBy(id = "location_name")
	private WebElement suggestedLocationOnLocationScreen;

	public void clickOnSuggestedLocationOnLocationScreen() {
		suggestedLocationOnLocationScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To write on the Complete Address field on the location screen
	@FindBy(id = "house_no_building_name")
	private WebElement completeAddressOnLocationScreen;

	public void writeOn_CompleteAddressOnLocationScreen(String complete_location_From_Excel) {
		completeAddressOnLocationScreen.sendKeys(complete_location_From_Excel);
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the First model number (eos1500d, for the time being)
	@FindBy(xpath = "//android.widget.TextView[@text='eos1500d']")
	private WebElement select_First_ValueFromModelnumbers;

	public void select_First_ValueFromModelnumbers() {
			select_First_ValueFromModelnumbers.click();

		

	}

	// To assert the Edit label for the Location added
	@FindBy(id = "edit_label")
	private WebElement locationEditLabel;

	public String read_Value_From_LocationEditLabel() {
		String Value_From_LocationEditLabel = locationEditLabel.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_LocationEditLabel;
	}

	// To assert the Edit label for the Location added
	@FindBy(id = "delete_label")
	private WebElement locationDeleteLabel;

	public String read_Value_From_LocationDeleteLabel() {
		String Value_From_LocationDeleteLabel = locationDeleteLabel.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_LocationDeleteLabel;
	}

	// To click on the location edit option
	@FindBy(id = "edit")
	private WebElement LocationEditbutton;

	public void clickOnLocationEditbutton() {
		LocationEditbutton.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the location Delete option
	@FindBy(id = "delete")
	private WebElement LocationDeletebutton;

	public void clickOnLocationDeletebutton() {
		LocationDeletebutton.click();
		andrdCmnUtil.implicit_Wait();

	}

}
