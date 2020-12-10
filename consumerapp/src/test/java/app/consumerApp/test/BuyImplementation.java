package app.consumerApp.test;

import java.io.IOException;
import java.util.Set;

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
import app.appium.PageFactory.BuyPageFactory;

public class BuyImplementation extends DriverIgnit {
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	CommonElementPage cmnelementpage;
	MyAddressImplementation myadrsimpl;
	ExcelLibrary excelLib;
	BuyPageFactory buypage;
	String accessory_Title;
	String accessory_Description;
	String accessory_Price;
	String email;
	String insurance_Title;
	String insurance_Description;
	String insurance_Price;
	String insurance_Period;

	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		cmnelementpage = new CommonElementPage(driver);
		buypage = new BuyPageFactory(driver);
		excelLib = new ExcelLibrary();
		myadrsimpl = new MyAddressImplementation();
		accessory_Title = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 1, 1);
		accessory_Description = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 2, 1);
		accessory_Price = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 3, 1);
		insurance_Title = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 4, 1);
		insurance_Description = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 5, 1);
		insurance_Price = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 6, 1);
		insurance_Period = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.BUY_TESTDATA_SHEETNAME, 7, 1);
	}

	public void verify_Buy_UI() throws InterruptedException {
		// appgenericlib.clickOn_MyDXcard();
		// cmnelementpage.clickOn_dk_Option_On_Footer();
		cmnelementpage.click_On_dk_Image_On_GridView();
		buypage.click_On_Buy_Module_On_MobileAppMenu();
		Thread.sleep(8000);

		// To assert the tool-bar title of Buy screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "BUY";
		String actual_Result_ToolbarTitle = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Buy toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert Number of items label
		String value_From_NumberOfItemsLabel_Inside_buy = buypage.read_Value_From_NumberOfItemsLabel_Inside_buy();
		String expected_Result_BuyScreen1 = "2 Items Found";
		String actual_Result_BuyScreen1 = value_From_NumberOfItemsLabel_Inside_buy;
		Assert.assertEquals(actual_Result_BuyScreen1, expected_Result_BuyScreen1);
		System.out.println("No of items got verified successfully:" + actual_Result_BuyScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the title of the first Accessory
		String value_For_title_Of_Accessory = buypage.readFrom_Value_For_title_Of_Accessory();
		String expected_Result_BuyScreen2 = accessory_Title;
		String actual_Result_BuyScreen2 = value_For_title_Of_Accessory;
		Assert.assertEquals(actual_Result_BuyScreen2, expected_Result_BuyScreen2);
		System.out.println("First accessory title got verified successfully:" + actual_Result_BuyScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory description of the first Accessory
		String value_For_description_Of_Accessory = buypage.read_From_Value_For_description_Of_Accessory();
		String expected_Result_BuyScreen3 = accessory_Description;
		String actual_Result_BuyScreen3 = value_For_description_Of_Accessory;
		Assert.assertEquals(actual_Result_BuyScreen3, expected_Result_BuyScreen3);
		System.out.println("First accessory description got verified successfully:" + actual_Result_BuyScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory price of the first Accessory
		String value_For_Price_Of_Accessory = buypage.read_From_Value_For_Price_Of_Accessory();
		String expected_Result_BuyScreen4 = accessory_Price;
		String actual_Result_BuyScreen4 = value_For_Price_Of_Accessory;
		Assert.assertEquals(actual_Result_BuyScreen4, expected_Result_BuyScreen4);
		System.out.println("First accessory price got verified successfully:" + actual_Result_BuyScreen4);
		andrdCmnUtil.implicit_Wait();

		// To click on the cart icon
		buypage.click_On_Cart_Icon();

		// To check the cart logo is showing or not after clicking on the cart.
		boolean value_For_check_Cart_Logo = buypage.read_From_Value_For_check_Cart_Logo();

		if (value_For_check_Cart_Logo == true) {

			// To assert the "Your cart" header message in the dialogue
			String value_From_HeaderDialogue_Inside_Yourcart = buypage.read_Value_From_HeaderDialogue_Inside_Yourcart();
			String expected_Result_BuyScreen5 = "YOUR CART";
			String actual_Result_BuyScreen5 = value_From_HeaderDialogue_Inside_Yourcart;
			Assert.assertEquals(actual_Result_BuyScreen5, expected_Result_BuyScreen5);
			System.out.println("You cart label got verified successfully:" + actual_Result_BuyScreen5);
			andrdCmnUtil.implicit_Wait();

			// To assert the your cart is empty label in the dialogue
			String value_From_CartEmpty_Inside_Yourcart = buypage.read_Value_From_CartEmpty_Inside_Yourcart();
			String expected_Result_BuyScreen6 = "Your Cart is Empty";
			String actual_Result_BuyScreen6 = value_From_CartEmpty_Inside_Yourcart;
			Assert.assertEquals(actual_Result_BuyScreen6, expected_Result_BuyScreen6);
			System.out.println("You cart is empty label got verified successfully:" + actual_Result_BuyScreen6);
			andrdCmnUtil.implicit_Wait();

			// To assert the label below your cart is empty label in the dialogue
			String value_From_DummyMessage_Inside_Yourcart = buypage.read_Value_From_DummyMessage_Inside_Yourcart();
			String expected_Result_BuyScreen7 = "Add something to make me happy :)";
			String actual_Result_BuyScreen7 = value_From_DummyMessage_Inside_Yourcart;
			Assert.assertEquals(actual_Result_BuyScreen7, expected_Result_BuyScreen7);
			System.out.println("Dummy message label got verified successfully:" + actual_Result_BuyScreen7);
			andrdCmnUtil.implicit_Wait();

			// To click device back button
			andrdCmnUtil.Click_DeviceBackButton();

		} else {
			System.out.println("Cart icon is not showing, hence the flow will break here.");
		}

	}

	public void verify_AccessoryBuy_FirstScreen_Functionality() {

		// To select the first and second the accessory/others
		buypage.select_accessory();

		// To click on the cart option
		buypage.click_On_Cart_Icon();

		// To assert the product title in the dialogue
		String value_From_ProductTitle_Inside_Yourcart = buypage.read_Value_From_ProductTitle_Inside_Yourcart();
		String expected_Result_Dialogue1 = accessory_Title;
		String actual_Result_Dialogue1 = value_From_ProductTitle_Inside_Yourcart;
		Assert.assertEquals(actual_Result_Dialogue1, expected_Result_Dialogue1);
		System.out.println("product title in the dialogue got verified successfully:" + actual_Result_Dialogue1);
		andrdCmnUtil.implicit_Wait();

		// To assert the product price in the dialogue
		String value_From_ProductPrice_Inside_Yourcart = buypage.read_Value_From_ProductPrice_Inside_Yourcart();
		String expected_Result_Dialogue2 = "₹ 200.00 x 1";
		String actual_Result_Dialogue2 = value_From_ProductPrice_Inside_Yourcart;
		Assert.assertEquals(actual_Result_Dialogue2, expected_Result_Dialogue2);
		System.out.println("product price in the dialogue got verified successfully:" + actual_Result_Dialogue2);
		andrdCmnUtil.implicit_Wait();

		// To click on the remove product option inside the your cart dialogue
		buypage.click_On_Remove_Product_Option();

		// To click device back button
		andrdCmnUtil.Click_DeviceBackButton();

		// To select the first and second the accessory/others
		buypage.select_accessory();

		// To click on the cart option
		buypage.click_On_Cart_Icon();

		// To click on the clear cart icon inside the your cart dialogue
		buypage.click_On_Clearcart_Option();

		// To click device back button
		andrdCmnUtil.Click_DeviceBackButton();

		// To select the first and second the accessory/others
		buypage.select_accessory();

		// To click on the cart option
		buypage.click_On_Cart_Icon();

		// To assert the Total label in the dialogue
		String value_From_Total_Label_Inside_Yourcart = buypage.read_Value_From_Total_Label_Inside_Yourcart();
		String expected_Result_Dialogue3 = "TOTAL";
		String actual_Result_Dialogue3 = value_From_Total_Label_Inside_Yourcart;
		Assert.assertEquals(actual_Result_Dialogue3, expected_Result_Dialogue3);
		System.out.println("Total label the dialogue got verified successfully:" + actual_Result_Dialogue3);
		andrdCmnUtil.implicit_Wait();

		// To click on the remove product option inside the your cart dialogue
		buypage.click_On_Confirm_Order_Option();

	}

	public void verify_AccessoryBuy_ConfirmOrderScreen_Functionality() throws InterruptedException {

		// To assert the tool-bar title of confirm order screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle_ConfirmOrder_Screen = "CONFIRM ORDER";
		String actual_Result_ToolbarTitle_ConfirmOrder_Screen = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle_ConfirmOrder_Screen,
				expected_Result_ToolbarTitle_ConfirmOrder_Screen);
		System.out.println("Confirm order screen toolbar title got verified successfully:"
				+ actual_Result_ToolbarTitle_ConfirmOrder_Screen);
		andrdCmnUtil.implicit_Wait();

		// To assert the item label in the confirm order screen
		String value_From_Items_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Items_Label_In_Confirm_Order_Screen();
		String expected_Result_From_ConfirmOrder_Screen1 = "Items (1)";
		String actual_Result_From_ConfirmOrder_Screen1 = value_From_Items_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_From_ConfirmOrder_Screen1, expected_Result_From_ConfirmOrder_Screen1);
		System.out
				.println("Number of items label got verified successfully:" + actual_Result_From_ConfirmOrder_Screen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the title of the first Accessory
		String value_For_title_Of_Accessory = buypage.readFrom_Value_For_title_Of_Accessory();
		String expected_Result_From_ConfirmOrder_Screen2 = accessory_Title;
		String actual_Result_From_ConfirmOrder_Screen2 = value_For_title_Of_Accessory;
		Assert.assertEquals(actual_Result_From_ConfirmOrder_Screen2, expected_Result_From_ConfirmOrder_Screen2);
		System.out
				.println("First accessory title got verified successfully:" + actual_Result_From_ConfirmOrder_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory description of the first Accessory
		String value_For_description_Of_Accessory = buypage.read_From_Value_For_description_Of_Accessory();
		String expected_Result_From_ConfirmOrder_Screen3 = accessory_Description;
		String actual_Result_From_ConfirmOrder_Screen3 = value_For_description_Of_Accessory;
		Assert.assertEquals(actual_Result_From_ConfirmOrder_Screen3, expected_Result_From_ConfirmOrder_Screen3);
		System.out.println(
				"First accessory description got verified successfully:" + actual_Result_From_ConfirmOrder_Screen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory price of the first Accessory
		String value_For_Price_Of_Accessory = buypage.read_From_Value_For_Price_Of_Accessory();
		String expected_Result_BuyScreen4 = accessory_Price;
		String actual_Result_BuyScreen4 = value_For_Price_Of_Accessory;
		Assert.assertEquals(actual_Result_BuyScreen4, expected_Result_BuyScreen4);
		System.out.println("First accessory price got verified successfully:" + actual_Result_BuyScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the quantity label in confirm order screen
		String value_From_Quantity_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Quantity_Label_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen5 = "Qty";
		String actual_Result_BuyScreen5 = value_From_Quantity_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen5, expected_Result_BuyScreen5);
		System.out.println("Quantity label got verified successfully:" + actual_Result_BuyScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on the Remove in the confirm order screen
		buypage.click_On_Remove_Option();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_BuyScreen6 = "Do you really want to remove this item from cart?";
		String actual_Result_BuyScreen6 = value_From_PopUp_Message_Text;
		Assert.assertEquals(actual_Result_BuyScreen6, expected_Result_BuyScreen6);
		System.out.println("Alert pop-up message got verified successfully:" + actual_Result_BuyScreen6);
		andrdCmnUtil.implicit_Wait();

		// To click on the cancel button on the pop-up
		cmnelementpage.clickOn_Cancel_On_Popup();

		// To click on the Remove in the confirm order screen
		buypage.click_On_Remove_Option();

		// To click on the confirm button on the pop-up message
		cmnelementpage.clickOn_Ok_On_Popup();

		// To click on the cart option
		buypage.click_On_Cart_Icon();

		// To click on the remove product option inside the your cart dialogue
		buypage.click_On_Confirm_Order_Option();

		// To assert the price details label in confirm order screen
		String value_From_Price_Details_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Price_Details_Label_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen7 = "PRICE DETAILS";
		String actual_Result_BuyScreen7 = value_From_Price_Details_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen7, expected_Result_BuyScreen7);
		System.out.println("Price details label got verified successfully:" + actual_Result_BuyScreen7);
		andrdCmnUtil.implicit_Wait();

		// To assert the Cart total label from confirm order screen
		String value_From_CardTotal_In_Confirm_Order_Screen = buypage
				.read_Value_From_CardTotal_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen8 = "Cart Total";
		String actual_Result_BuyScreen8 = value_From_CardTotal_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen8, expected_Result_BuyScreen8);
		System.out.println("Cart Total label got verified successfully:" + actual_Result_BuyScreen8);
		andrdCmnUtil.implicit_Wait();

		// To assert the cart amount from confirm order screen
		String value_From_Cart_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Cart_Amount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen9 = accessory_Price;
		String actual_Result_BuyScreen9 = value_From_Cart_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen9, expected_Result_BuyScreen9);
		System.out.println("Cart Total amount got verified successfully:" + actual_Result_BuyScreen9);
		andrdCmnUtil.implicit_Wait();

		// To assert the Coupon Discount label from confirm order screen
		String value_From_Coupon_Discount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Coupon_Discount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen10 = "Coupon Discount";
		String actual_Result_BuyScreen10 = value_From_Coupon_Discount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen10, expected_Result_BuyScreen10);
		System.out.println("Coupon Discount label got verified successfully:" + actual_Result_BuyScreen10);
		andrdCmnUtil.implicit_Wait();

		// To assert the discount amount from confirm order screen
		String value_From_Discount_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Discount_Amount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen11 = "₹ 0.00";
		String actual_Result_BuyScreen11 = value_From_Discount_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen11, expected_Result_BuyScreen11);
		System.out.println("Coupon Discount amount got verified successfully:" + actual_Result_BuyScreen11);
		andrdCmnUtil.implicit_Wait();

		// To assert the Total Payable label from confirm order screen
		String value_From_Total_Payable_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_Label_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen12 = "Total Payable";
		String actual_Result_BuyScreen12 = value_From_Total_Payable_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen12, expected_Result_BuyScreen12);
		System.out.println("Total payable label got verified successfully:" + actual_Result_BuyScreen12);
		andrdCmnUtil.implicit_Wait();

		// To assert the total payable amount from confirm order screen
		String value_From_Total_Payable_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen13 = accessory_Price;
		String actual_Result_BuyScreen13 = value_From_Total_Payable_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen13, expected_Result_BuyScreen13);
		System.out.println("Total payable amount got verified successfully:" + actual_Result_BuyScreen13);
		andrdCmnUtil.implicit_Wait();

		// To assert the total payable amount from confirm order screen
		String value_From_Total_Payable_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_Amount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen14 = accessory_Price;
		String actual_Result_BuyScreen14 = value_From_Total_Payable_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen14, expected_Result_BuyScreen14);
		System.out.println("Total payable amount in the bottom of the screen got verified successfully:"
				+ actual_Result_BuyScreen14);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the Select Address button confirm order screen
		buypage.click_On_Select_Address_Option();

		// To configure the default address, for Buy address
		myadrsimpl.configure_Address_For_Buy();
		
//		// To scroll down till change address edit button
//		try {
//			andrdCmnUtil.scrollDownTillAttribute(ConstantVaribale.resoucrceIdPrefix + "change_address_label_tv");
//		} catch (Exception e) {
//			System.out.println("Scrolling is not happening");
//		}
		
//		// To scroll down till change address edit button
//		andrdCmnUtil.scrollAndClick("Change Address");

//		// To click on the Change Address button confirm order screen
//		buypage.click_On_Change_Address_Option();

//		// To assert the address thats showing in the address book
//		String value_From_address_In_AddressBook_Screen = buypage.read_Value_From_address_In_AddressBook_Screen();
//		andrdCmnUtil.Click_DeviceBackButton();
//		String value_From_Delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address = buypage
//				.read_Value_From_Delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address();
//		String expected_Result_BuyScreen15 = value_From_address_In_AddressBook_Screen;
//		String actual_Result_BuyScreen15 = value_From_Delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address;
//		Assert.assertEquals(actual_Result_BuyScreen15, expected_Result_BuyScreen15);
//		System.out.println("Delivery address got verified successfully:" + actual_Result_BuyScreen15);
//		andrdCmnUtil.implicit_Wait();

		// To click on the place order in the confirm order screen
		buypage.click_On_Select_Address_Option();

	}

	public void verify_AccessoryBuy_PaymentOptionsScreen_Functionality() throws InterruptedException {

		// To click on the Cancel button in payment options screen
		buypage.click_On_Cancel_Option();

		// To click on the place order in the confirm order screen
		buypage.click_On_Select_Address_Option();

		// To assert the tool-bar title of paymentOptions screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "PAYMENT OPTIONS";
		String actual_Result_ToolbarTitle = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Payment option toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the Amount payable label from the Payment options screen
		String value_From_Amount_payable_Option_In_Payment_Options_Screen = buypage
				.read_Value_From_Amount_payable_Option_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen1 = "Amount Payable";
		String actual_Result_On_PaymentOptions_Screen1 = value_From_Amount_payable_Option_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen1, expected_Result_On_PaymentOptions_Screen1);
		System.out.println("Amount payable label in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the total payable amount from Payment Options screen
		String value_From_Total_Payable_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_Amount_In_Confirm_Order_Screen();
		String expected_Result_On_PaymentOptions_Screen2 = accessory_Price;
		String actual_Result_On_PaymentOptions_Screen2 = value_From_Total_Payable_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen2, expected_Result_On_PaymentOptions_Screen2);
		System.out.println("Amount payable amount in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the pay now label from the Payment options screen
		String value_From_Pay_Now_In_Payment_Options_Screen = buypage
				.read_Value_From_Pay_Now_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen3 = "Pay Now";
		String actual_Result_On_PaymentOptions_Screen3 = value_From_Pay_Now_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen3, expected_Result_On_PaymentOptions_Screen3);
		System.out.println("Pay now label in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the payment options from the Payment options screen
		String value_From_Payment_Options_In_Payment_Options_Screen = buypage
				.read_Value_From_Payment_Options_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen4 = "Netbanking, Wallet, Credit Card, Debit Card";
		String actual_Result_On_PaymentOptions_Screen4 = value_From_Payment_Options_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen4, expected_Result_On_PaymentOptions_Screen4);
		System.out.println("Pay now options in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the pay later label from the Payment options screen
		String value_From_Pay_Later_In_Payment_Options_Screen = buypage
				.read_Value_From_Pay_Later_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen5 = "Pay Later";
		String actual_Result_On_PaymentOptions_Screen5 = value_From_Pay_Later_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen5, expected_Result_On_PaymentOptions_Screen5);
		System.out.println("Pay Later label in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen5);
		andrdCmnUtil.implicit_Wait();

		// To assert the payment later options from the Payment options screen
		String value_From_PaymentLater_Options_In_Payment_Options_Screen = buypage
				.read_Value_From_PaymentLater_Options_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen6 = "Buy Now, Pay Later";
		String actual_Result_On_PaymentOptions_Screen6 = value_From_PaymentLater_Options_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen6, expected_Result_On_PaymentOptions_Screen6);
		System.out.println("Pay Later options in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen6);
		andrdCmnUtil.implicit_Wait();

		boolean value_From_ePayLater_In_Payment_Options_Screen = buypage
				.read_value_From_ePayLater_In_Payment_Options_Screen();
		if (value_From_ePayLater_In_Payment_Options_Screen == true) {

			// To click on the payment button in payment options screen
			buypage.click_On_Payment_Option();
			Thread.sleep(5000);

			// To allow the Android pop-up
			cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
			Thread.sleep(10000);
			
			Set<String> ctxtnames  = driver.getContextHandles();
			for (int i=0; i<ctxtnames.size(); i++)
			{
				System.out.println("View is:" + ctxtnames);
			}
			
			driver.switchTo().window("WEBVIEW");

			// To write on the email id field (razorpay)
			buypage.write_On_EmailID_Field("sujaya@yopmail.com");

			// To click on proceed button in payment options screen
			buypage.click_On_Proceed_Button();

			// To select net-banking option in payments screen
			buypage.select_Netbanking_In_Payments_Screen();

			// To select sbi bank option in payments screen
			buypage.select_sbi_Netbanking_In_Payments_Screen();

			// To select payment option in payments screen
			buypage.select_Payment_Button_In_Payments_Screen();

			// To select success button in payments screen
			buypage.select_Success_Button_In_Payments_Screen();

		} else {
			System.out.println("Epaylater option is not showing, hence flow is breaking.");
		}

	}

	public void verify_AccessoryBuy_PurchaseConfirmationScreen_Functionality() throws InterruptedException {

		// To assert the tool-bar title of paymentOptions screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "PURCHASE CONFIRMATION";
		String actual_Result_ToolbarTitle = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Payment option toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the thank you message after successfull payment
		String value_From_Thankyou_Message_After_Successfull_Payment = buypage
				.read_Value_From_Thankyou_Message_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen1 = "THANK YOU";
		String actual_Result_On_PurchaseConfirmationScreen1 = value_From_Thankyou_Message_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen1,
				expected_Result_On_PurchaseConfirmationScreen1);
		System.out.println("Thank you message in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the order received label after successfull payment
		String value_From_Order_Received_Label_After_Successfull_Payment = buypage
				.read_Value_From_Order_Received_Label_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen2 = "Your order has been received.";
		String actual_Result_On_PurchaseConfirmationScreen2 = value_From_Order_Received_Label_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen2,
				expected_Result_On_PurchaseConfirmationScreen2);
		System.out.println("Order received message in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the order confirmation label after successfull payment
		String value_From_Order_Confirmation_Label_After_Successfull_Payment = buypage
				.read_Value_From_Order_Confirmation_Label_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen3 = "You will receive an order confirmation email with details of your order.";
		String actual_Result_On_PurchaseConfirmationScreen3 = value_From_Order_Confirmation_Label_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen3,
				expected_Result_On_PurchaseConfirmationScreen3);
		System.out.println("Order received second message in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the product name label after successfull payment
		String value_From_Product_Name_After_Successfull_Payment = buypage
				.read_Value_From_Product_Name_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen4 = accessory_Title;
		String actual_Result_On_PurchaseConfirmationScreen4 = value_From_Product_Name_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen4,
				expected_Result_On_PurchaseConfirmationScreen4);
		System.out.println("Accessory name in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory price of the first Accessory
		String value_For_Price_Of_Accessory = buypage.read_From_Value_For_Price_Of_Accessory();
		String expected_Result_On_PurchaseConfirmationScreen5 = accessory_Price;
		String actual_Result_On_PurchaseConfirmationScreen5 = value_For_Price_Of_Accessory;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen5,
				expected_Result_On_PurchaseConfirmationScreen5);
		System.out.println("Accessory price in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen5);
		andrdCmnUtil.implicit_Wait();

		// To select home button in payments screen
		buypage.select_Home_Button_In_Payments_Screen();

	}

	public void verify_InsuranceBuy_UI() throws InterruptedException {

		buypage.click_On_Buy_Module_On_MobileAppMenu();
		Thread.sleep(8000);

		// To click on the INSURANCE tab inside buy module
		buypage.click_On_InsuranceTab_Inside_Buy();

		// To assert the price range label for insurance
		String value_From_Price_Range_Label_In_Insurance_Screen = buypage
				.read_Value_From_Price_Range_Label_In_Insurance_Screen();
		String expected_Result_On_Insurance_FirstScreen1 = "Select price range";
		String actual_Result_On_Insurance_FirstScreen1 = value_From_Price_Range_Label_In_Insurance_Screen;
		Assert.assertEquals(actual_Result_On_Insurance_FirstScreen1, expected_Result_On_Insurance_FirstScreen1);
		System.out.println(
				"Select price range label got verified successfully:" + actual_Result_On_Insurance_FirstScreen1);
		andrdCmnUtil.implicit_Wait();

		boolean value_From_Nodata_Emoji = buypage.read_Value_From_Nodata_Emoji();
		if (value_From_Nodata_Emoji == true) {
			System.out.println("No data emoji is displaying, hence flow will continue");

		} else {
			System.out.println("No data emoji is not displaying, hence flow is breaking.");
		}
	}

	public void verify_InsuranceBuy_Functionality() throws InterruptedException {

		// To click on the price range dropdown
		buypage.click_Price_Range_Dropdown();

		// To select from the price range dropdown
		buypage.select_Price_Range_From_Dropdown();

		// To assert the warning label for insurance
		String value_From_Warning_Label_In_Insurance_Screen = buypage
				.read_Value_From_Warning_Label_In_Insurance_Screen();
		String expected_Result_On_Insurance_SecondScreen1 = "Note: A digital copy or the original invoice would be needed for verification during any claims process.";
		String actual_Result_On_Insurance_SecondScreen1 = value_From_Warning_Label_In_Insurance_Screen;
		Assert.assertEquals(actual_Result_On_Insurance_SecondScreen1, expected_Result_On_Insurance_SecondScreen1);
		System.out.println("Warning message got verified successfully:" + actual_Result_On_Insurance_SecondScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the plans count label for insurance
		String value_From_Plans_Count_Label_In_Insurance_Screen = buypage
				.read_Value_From_Plans_Count_Label_In_Insurance_Screen();
		String expected_Result_On_Insurance_SecondScreen2 = "1 Plan Found";
		String actual_Result_On_Insurance_SecondScreen2 = value_From_Plans_Count_Label_In_Insurance_Screen;
		Assert.assertEquals(actual_Result_On_Insurance_SecondScreen2, expected_Result_On_Insurance_SecondScreen2);
		System.out.println("Warning message got verified successfully:" + actual_Result_On_Insurance_SecondScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the plans title label for insurance
		String value_From_Purcahse_PLan_Title_In_Insurance_Screen = buypage
				.read_Value_From_Purcahse_PLan_Title_In_Insurance_Screen();
		String expected_Result_On_Insurance_SecondScreen3 = insurance_Title;
		String actual_Result_On_Insurance_SecondScreen3 = value_From_Purcahse_PLan_Title_In_Insurance_Screen;
		Assert.assertEquals(actual_Result_On_Insurance_SecondScreen3, expected_Result_On_Insurance_SecondScreen3);
		System.out.println("Insurance title got verified successfully:" + actual_Result_On_Insurance_SecondScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory price of the first Accessory
		String value_For_Price_Of_InsurancePlan = buypage.read_From_Value_For_Price_Of_Accessory();
		String expected_Result_On_Insurance_SecondScreen4 = insurance_Price;
		String actual_Result_On_Insurance_SecondScreen4 = value_For_Price_Of_InsurancePlan;
		Assert.assertEquals(actual_Result_On_Insurance_SecondScreen4, expected_Result_On_Insurance_SecondScreen4);
		System.out.println("Insurance year got verified successfully:" + actual_Result_On_Insurance_SecondScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the warranty label for insurance
		String value_From_Warranty_Label_In_Insurance_Screen = buypage
				.read_Value_From_Warranty_Label_In_Insurance_Screen();
		String expected_Result_On_Insurance_SecondScreen5 = insurance_Period;
		String actual_Result_On_Insurance_SecondScreen5 = value_From_Warranty_Label_In_Insurance_Screen;
		Assert.assertEquals(actual_Result_On_Insurance_SecondScreen5, expected_Result_On_Insurance_SecondScreen5);
		System.out.println("Insurance period got verified successfully:" + actual_Result_On_Insurance_SecondScreen5);
		andrdCmnUtil.implicit_Wait();

		// To click on the plans title label for insurance
		buypage.click_On_Purcahse_PLan_Title_In_Insurance_Screen();

		// To assert the tool-bar title of paymentOptions screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = insurance_Title;
		String actual_Result_ToolbarTitle = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Payment option toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To click on the device back button
		andrdCmnUtil.Click_DeviceBackButton();

		// To select the first and second the accessory/others
		buypage.select_accessory();

		// To assert the item label in the confirm order screen
		String value_From_Items_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Items_Label_In_Confirm_Order_Screen();
		String expected_Result_From_ConfirmOrder_Screen1 = "Items (1)";
		String actual_Result_From_ConfirmOrder_Screen1 = value_From_Items_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_From_ConfirmOrder_Screen1, expected_Result_From_ConfirmOrder_Screen1);
		System.out
				.println("Number of items label got verified successfully:" + actual_Result_From_ConfirmOrder_Screen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the Insurance Title of the first Insurance
		String value_For_Insurance_Title = buypage.read_From_Value_For_description_Of_Accessory();
		String expected_Result_From_ConfirmOrder_Screen2 = insurance_Title;
		String actual_Result_From_ConfirmOrder_Screen2 = value_For_Insurance_Title;
		Assert.assertEquals(actual_Result_From_ConfirmOrder_Screen2, expected_Result_From_ConfirmOrder_Screen2);
		System.out
				.println("First Insurance Title got verified successfully:" + actual_Result_From_ConfirmOrder_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the Insurance price of the first Insurance
		String value_For_Price_Of_Insurance = buypage.read_From_Value_For_Price_Of_Accessory();
		String expected_Result_BuyScreen3 = accessory_Price;
		String actual_Result_BuyScreen3 = value_For_Price_Of_Insurance;
		Assert.assertEquals(actual_Result_BuyScreen3, expected_Result_BuyScreen3);
		System.out.println("First Insurance price got verified successfully:" + actual_Result_BuyScreen3);
		andrdCmnUtil.implicit_Wait();

		// To click on the Remove in the confirm order screen
		buypage.click_On_Remove_Option();

		// To assert the Text showing in the Pop-up message
		String value_From_PopUp_Message_Text = cmnelementpage.read_From_PopUp_Message_Text();
		String expected_Result_BuyScreen6 = "Do you really want to remove this item from cart?";
		String actual_Result_BuyScreen6 = value_From_PopUp_Message_Text;
		Assert.assertEquals(actual_Result_BuyScreen6, expected_Result_BuyScreen6);
		System.out.println("Alert pop-up message got verified successfully:" + actual_Result_BuyScreen6);
		andrdCmnUtil.implicit_Wait();

		// To click on the cancel button on the pop-up
		cmnelementpage.clickOn_Cancel_On_Popup();

		// To click on the Remove in the confirm order screen
		buypage.click_On_Remove_Option();

		// To click on the confirm button on the pop-up message
		cmnelementpage.clickOn_Ok_On_Popup();

		// To select the first and second the accessory/others
		buypage.select_accessory();

		// To assert the price details label in confirm order screen
		String value_From_Price_Details_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Price_Details_Label_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen7 = "PRICE DETAILS";
		String actual_Result_BuyScreen7 = value_From_Price_Details_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen7, expected_Result_BuyScreen7);
		System.out.println("Price details label got verified successfully:" + actual_Result_BuyScreen7);
		andrdCmnUtil.implicit_Wait();

		// To assert the Cart total label from confirm order screen
		String value_From_CardTotal_In_Confirm_Order_Screen = buypage
				.read_Value_From_CardTotal_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen8 = "Cart Total";
		String actual_Result_BuyScreen8 = value_From_CardTotal_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen8, expected_Result_BuyScreen8);
		System.out.println("Cart Total label got verified successfully:" + actual_Result_BuyScreen8);
		andrdCmnUtil.implicit_Wait();

		// To assert the cart amount from confirm order screen
		String value_From_Cart_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Cart_Amount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen9 = insurance_Price;
		String actual_Result_BuyScreen9 = value_From_Cart_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen9, expected_Result_BuyScreen9);
		System.out.println("Cart Total amount got verified successfully:" + actual_Result_BuyScreen9);
		andrdCmnUtil.implicit_Wait();

		// To assert the Coupon Discount label from confirm order screen
		String value_From_Coupon_Discount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Coupon_Discount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen10 = "Coupon Discount";
		String actual_Result_BuyScreen10 = value_From_Coupon_Discount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen10, expected_Result_BuyScreen10);
		System.out.println("Coupon Discount label got verified successfully:" + actual_Result_BuyScreen10);
		andrdCmnUtil.implicit_Wait();

		// To assert the discount amount from confirm order screen
		String value_From_Discount_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Discount_Amount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen11 = "₹ 0.00";
		String actual_Result_BuyScreen11 = value_From_Discount_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen11, expected_Result_BuyScreen11);
		System.out.println("Coupon Discount amount got verified successfully:" + actual_Result_BuyScreen11);
		andrdCmnUtil.implicit_Wait();

		// To assert the Total Payable label from confirm order screen
		String value_From_Total_Payable_Label_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_Label_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen12 = "Total Payable";
		String actual_Result_BuyScreen12 = value_From_Total_Payable_Label_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen12, expected_Result_BuyScreen12);
		System.out.println("Total payable label got verified successfully:" + actual_Result_BuyScreen12);
		andrdCmnUtil.implicit_Wait();

		// To assert the total payable amount from confirm order screen
		String value_From_Total_Payable_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen13 = insurance_Price;
		String actual_Result_BuyScreen13 = value_From_Total_Payable_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen13, expected_Result_BuyScreen13);
		System.out.println("Total payable amount got verified successfully:" + actual_Result_BuyScreen13);
		andrdCmnUtil.implicit_Wait();

		// To assert the total payable amount from confirm order screen
		String value_From_Total_Payable_Amount_In_Confirm_Order_Screen = buypage
				.read_Value_From_Total_Payable_Amount_In_Confirm_Order_Screen();
		String expected_Result_BuyScreen14 = insurance_Price;
		String actual_Result_BuyScreen14 = value_From_Total_Payable_Amount_In_Confirm_Order_Screen;
		Assert.assertEquals(actual_Result_BuyScreen14, expected_Result_BuyScreen14);
		System.out.println("Total payable amount in the bottom of the screen got verified successfully:"
				+ actual_Result_BuyScreen14);
		andrdCmnUtil.implicit_Wait();

		// To click on the select Address in the confirm order screen
		buypage.click_On_Select_Address_Option();

		// To select the default address
		buypage.click_On_Select_DefaultAddress();

		// To select the ok popup
		cmnelementpage.clickOn_Ok_On_Popup();

		// To click on the place order in the confirm order screen
		buypage.click_On_Select_Address_Option();

		// To assert the tool-bar title of paymentOptions screen
		String PaymentOptions_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle1 = "PAYMENT OPTIONS";
		String actual_Result_ToolbarTitle1 = PaymentOptions_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle1, expected_Result_ToolbarTitle1);
		System.out.println("Payment option toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the Amount payable label from the Payment options screen
		String value_From_Amount_payable_Option_In_Payment_Options_Screen = buypage
				.read_Value_From_Amount_payable_Option_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen1 = "Amount Payable";
		String actual_Result_On_PaymentOptions_Screen1 = value_From_Amount_payable_Option_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen1, expected_Result_On_PaymentOptions_Screen1);
		System.out.println("Amount payable label in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the total payable amount from Payment Options screen
		String value_From_Total_Payable_Amount_In_Confirm_Order_Screen1 = buypage
				.read_Value_From_Total_Payable_Amount_In_Confirm_Order_Screen();
		String expected_Result_On_PaymentOptions_Screen2 = insurance_Price;
		String actual_Result_On_PaymentOptions_Screen2 = value_From_Total_Payable_Amount_In_Confirm_Order_Screen1;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen2, expected_Result_On_PaymentOptions_Screen2);
		System.out.println("Amount payable amount in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the pay now label from the Payment options screen
		String value_From_Pay_Now_In_Payment_Options_Screen = buypage
				.read_Value_From_Pay_Now_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen3 = "Pay Now";
		String actual_Result_On_PaymentOptions_Screen3 = value_From_Pay_Now_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen3, expected_Result_On_PaymentOptions_Screen3);
		System.out.println("Pay now label in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the payment options from the Payment options screen
		String value_From_Payment_Options_In_Payment_Options_Screen = buypage
				.read_Value_From_Payment_Options_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen4 = "Netbanking, Wallet, Credit Card, Debit Card";
		String actual_Result_On_PaymentOptions_Screen4 = value_From_Payment_Options_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen4, expected_Result_On_PaymentOptions_Screen4);
		System.out.println("Pay now options in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the pay later label from the Payment options screen
		String value_From_Pay_Later_In_Payment_Options_Screen = buypage
				.read_Value_From_Pay_Later_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen5 = "Pay Later";
		String actual_Result_On_PaymentOptions_Screen5 = value_From_Pay_Later_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen5, expected_Result_On_PaymentOptions_Screen5);
		System.out.println("Pay Later label in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen5);
		andrdCmnUtil.implicit_Wait();

		// To assert the payment later options from the Payment options screen
		String value_From_PaymentLater_Options_In_Payment_Options_Screen = buypage
				.read_Value_From_PaymentLater_Options_In_Payment_Options_Screen();
		String expected_Result_On_PaymentOptions_Screen6 = "Buy Now, Pay Later";
		String actual_Result_On_PaymentOptions_Screen6 = value_From_PaymentLater_Options_In_Payment_Options_Screen;
		Assert.assertEquals(actual_Result_On_PaymentOptions_Screen6, expected_Result_On_PaymentOptions_Screen6);
		System.out.println("Pay Later options in payment Options screen got verified successfully:"
				+ actual_Result_On_PaymentOptions_Screen6);
		andrdCmnUtil.implicit_Wait();

		boolean value_From_ePayLater_In_Payment_Options_Screen = buypage
				.read_value_From_ePayLater_In_Payment_Options_Screen();
		if (value_From_ePayLater_In_Payment_Options_Screen == true) {
			// To click on the payment button in payment options screen
			buypage.click_On_Payment_Option();

			// To allow the Android pop-up
			cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();

			// To write on the email id field (razorpay)
			buypage.write_On_EmailID_Field(email);

			// To click on proceed button in payment options screen
			buypage.click_On_Proceed_Button();

			// To select netbanking option in payments screen
			buypage.select_Netbanking_In_Payments_Screen();

			// To select sbi bank option in payments screen
			buypage.select_sbi_Netbanking_In_Payments_Screen();

			// To select payment option in payments screen
			buypage.select_Payment_Button_In_Payments_Screen();

			// To select success button in payments screen
			buypage.select_Success_Button_In_Payments_Screen();

		} else {
			System.out.println("Epaylater option is not showing, hence flow is breaking.");
		}

	}

	public void verify_InsuranceBuy_PurchaseConfirmationScreen_Functionality() throws InterruptedException {

		// To assert the tool-bar title of paymentOptions screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "PURCHASE CONFIRMATION";
		String actual_Result_ToolbarTitle = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Payment option toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the thank you message after successfull payment
		String value_From_Thankyou_Message_After_Successfull_Payment = buypage
				.read_Value_From_Thankyou_Message_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen1 = "THANK YOU";
		String actual_Result_On_PurchaseConfirmationScreen1 = value_From_Thankyou_Message_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen1,
				expected_Result_On_PurchaseConfirmationScreen1);
		System.out.println("Thank you message in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen1);
		andrdCmnUtil.implicit_Wait();

		// To assert the order received label after successfull payment
		String value_From_Order_Received_Label_After_Successfull_Payment = buypage
				.read_Value_From_Order_Received_Label_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen2 = "Your order has been received.";
		String actual_Result_On_PurchaseConfirmationScreen2 = value_From_Order_Received_Label_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen2,
				expected_Result_On_PurchaseConfirmationScreen2);
		System.out.println("Order received message in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen2);
		andrdCmnUtil.implicit_Wait();

		// To assert the order confirmation label after successfull payment
		String value_From_Order_Confirmation_Label_After_Successfull_Payment = buypage
				.read_Value_From_Order_Confirmation_Label_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen3 = "You will receive an order confirmation email with details of your order.";
		String actual_Result_On_PurchaseConfirmationScreen3 = value_From_Order_Confirmation_Label_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen3,
				expected_Result_On_PurchaseConfirmationScreen3);
		System.out.println("Order received second message in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the product name label after successfull payment
		String value_From_Product_Name_After_Successfull_Payment = buypage
				.read_Value_From_Product_Name_After_Successfull_Payment();
		String expected_Result_On_PurchaseConfirmationScreen4 = insurance_Title;
		String actual_Result_On_PurchaseConfirmationScreen4 = value_From_Product_Name_After_Successfull_Payment;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen4,
				expected_Result_On_PurchaseConfirmationScreen4);
		System.out.println("Accessory name in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen4);
		andrdCmnUtil.implicit_Wait();

		// To assert the Accessory price of the first Accessory
		String value_For_Price_Of_Accessory = buypage.read_From_Value_For_Price_Of_Accessory();
		String expected_Result_On_PurchaseConfirmationScreen5 = insurance_Price;
		String actual_Result_On_PurchaseConfirmationScreen5 = value_For_Price_Of_Accessory;
		Assert.assertEquals(actual_Result_On_PurchaseConfirmationScreen5,
				expected_Result_On_PurchaseConfirmationScreen5);
		System.out.println("Accessory price in purchase confirmtaion screen got verified successfully:"
				+ actual_Result_On_PurchaseConfirmationScreen5);
		andrdCmnUtil.implicit_Wait();

		// To select home button in payments screen
		buypage.select_Home_Button_In_Payments_Screen();

	}

}
