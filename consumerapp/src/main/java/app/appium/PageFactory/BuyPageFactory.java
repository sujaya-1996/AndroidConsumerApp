package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;
import io.appium.java_client.MobileElement;

public class BuyPageFactory {

	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_For_title_Of_Accessory;
	String value_For_description_Of_Accessory;
	String value_For_Price_Of_Accessory;
	String value_For_selected_Status_Of_Accessory_Others;
	String value_From_CardTotal_In_Confirm_Order_Screen;
	String value_For_ProductTitle_Inside_Yourcart;
	String value_From_ProductPrice_Inside_Yourcart;
	

	public BuyPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To click on the Buy module on Mobile app menus
	@FindBy(xpath = "//android.widget.TextView[@text='BUY']")
	private WebElement buy_Module_On_MobileAppMenu;

	public void click_On_Buy_Module_On_MobileAppMenu() {
		buy_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the Accessory tab inside buy module
	@FindBy(xpath = "//android.widget.TextView[@text='ACCESSORY']")
	private WebElement accessoryTab_Inside_Buy;

	public void click_On_accessoryTab_Inside_Buy() {
		accessoryTab_Inside_Buy.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the INSURANCE tab inside buy module
	@FindBy(xpath = "//android.widget.TextView[@text='INSURANCE']")
	private WebElement insuranceTab_Inside_Buy;

	public void click_On_InsuranceTab_Inside_Buy() {
		insuranceTab_Inside_Buy.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the EXTENDED WARRANTY tab inside buy module
	@FindBy(xpath = "//android.widget.TextView[@text='EXTENDED WARRANTY']")
	private WebElement ewTab_Inside_Buy;

	public void click_On_EWTab_Inside_Buy() {
		ewTab_Inside_Buy.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert Number of items label
	@FindBy(id = "accessories_count_tv")
	private WebElement numberOfItemsLabel_Inside_buy;

	public String read_Value_From_NumberOfItemsLabel_Inside_buy() {
		String value_From_NumberOfItemsLabel_Inside_buy = numberOfItemsLabel_Inside_buy.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_NumberOfItemsLabel_Inside_buy;
	}

	// To assert the title of the first Accessory
	@FindBy(id = "title")
	private List<WebElement> title_Of_Accessory;

	public String readFrom_Value_For_title_Of_Accessory() {
		for (int i = 0; i < title_Of_Accessory.size();) {
			value_For_title_Of_Accessory = title_Of_Accessory.get(i).getText();
			break;

		}
		return value_For_title_Of_Accessory;
	}

	// To assert the Accessory description of the first Accessory
	@FindBy(id = "purchase_plan_desc_tv")
	private List<WebElement> description_Of_Accessory;

	public String read_From_Value_For_description_Of_Accessory() {
		for (int i = 0; i < description_Of_Accessory.size();) {
			value_For_description_Of_Accessory = description_Of_Accessory.get(i).getText();
			break;

		}
		return value_For_description_Of_Accessory;
	}

	// To assert the Accessory price of the first Accessory
	@FindBy(id = "price_tv")
	private List<WebElement> price_Of_Accessory;

	public String read_From_Value_For_Price_Of_Accessory() {
		for (int i = 0; i < description_Of_Accessory.size();) {
			value_For_Price_Of_Accessory = price_Of_Accessory.get(i).getText();
			break;

		}
		return value_For_Price_Of_Accessory;
	}

	// To click on the Select button of the accessory item
	@FindBy(id = "buy_now_button")
	private WebElement accessory_SelectButton;

	public void click_On_accessory_SelectButton() {
		accessory_SelectButton.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To select the first and second  the accessory/others
	@FindBy(id = "selected_status")
	private List<WebElement> select_accesspries;

	public void select_accessory() {
		for (int i = 0; i < select_accesspries.size();) {
			select_accesspries.get(i).click();
			break;

		}
		
	}

	// To assert the selected status of the accessory/others
	@FindBy(id = "selected_status")
	private List<WebElement> selected_Status_Of_Accessory_Others;

	public String read_From_Selected_Status_Of_Accessory_Others() {
		for (int i = 0; i < selected_Status_Of_Accessory_Others.size();) {
			value_For_selected_Status_Of_Accessory_Others = selected_Status_Of_Accessory_Others.get(i).getText();
			break;

		}
		return value_For_selected_Status_Of_Accessory_Others;
	}

	// To click on the Accessory logo
	@FindBy(id = "purchase_partner_logo_iv")
	private WebElement accessory_Logo;

	public void click_On_Accessory_Logo() {
		accessory_Logo.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the cart icon
	@FindBy(id = "fab")
	private WebElement cart_Icon;

	public void click_On_Cart_Icon() {
		cart_Icon.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To check the cart logo is showing or not after clicking on the cart.
	@FindBy(id = "cart_logo")
	private WebElement check_Cart_Logo;

	public boolean read_From_Value_For_check_Cart_Logo() {
		boolean value_For_check_Cart_Logo = check_Cart_Logo.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_For_check_Cart_Logo;
	}

	// To assert the "Your cart" header message in the dialogue
	@FindBy(id = "your_cart_label")
	private WebElement headerDialogue_Inside_Yourcart;

	public String read_Value_From_HeaderDialogue_Inside_Yourcart() {
		String value_From_HeaderDialogue_Inside_Yourcart = headerDialogue_Inside_Yourcart.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_HeaderDialogue_Inside_Yourcart;
	}
	
	// To assert the your cart is empty label in the dialogue
	@FindBy(id = "appCompatTextView3")
	private WebElement cartEmpty_Inside_Yourcart;

	public String read_Value_From_CartEmpty_Inside_Yourcart() {
		String value_From_CartEmpty_Inside_Yourcart = cartEmpty_Inside_Yourcart.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_CartEmpty_Inside_Yourcart;
	}
	
	// To assert the label below your cart is empty label in the dialogue
	@FindBy(id = "dummy")
	private WebElement dummyMessage_Inside_Yourcart;

	public String read_Value_From_DummyMessage_Inside_Yourcart() {
		String value_From_DummyMessage_Inside_Yourcart = dummyMessage_Inside_Yourcart.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_DummyMessage_Inside_Yourcart;
	}

	
	// To assert the product title in the dialogue
	@FindBy(id = "product_title")
	private List<WebElement> productTitle_Inside_Yourcart;

	public String read_Value_From_ProductTitle_Inside_Yourcart() {
		for (int i = 0; i < productTitle_Inside_Yourcart.size();) {
			value_For_ProductTitle_Inside_Yourcart = productTitle_Inside_Yourcart.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_For_ProductTitle_Inside_Yourcart;
	}
	
	// To assert the product price in the dialogue
	@FindBy(id = "product_price")
	private List<WebElement> productPrice_Inside_Yourcart;

	public String read_Value_From_ProductPrice_Inside_Yourcart() {
		for (int i = 0; i < productTitle_Inside_Yourcart.size();) {
			value_From_ProductPrice_Inside_Yourcart = productPrice_Inside_Yourcart.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_ProductPrice_Inside_Yourcart;
	}

	// To click on the clear cart icon inside the your cart dialogue
	@FindBy(id = "clear_cart")
	private WebElement clearcart_Option;

	public void click_On_Clearcart_Option() {
		clearcart_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the remove product option inside the your cart dialogue
	@FindBy(id = "remove_product")
	private List<WebElement> remove_Product_Option;

	public void click_On_Remove_Product_Option() {
		for (int i = 0; i < productTitle_Inside_Yourcart.size();) {
			remove_Product_Option.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}

	// To assert the Total label in the dialogue
	@FindBy(id = "total_label")
	private WebElement total_Label_Inside_Yourcart;

	public String read_Value_From_Total_Label_Inside_Yourcart() {
		String value_From_Total_Label_Inside_Yourcart = total_Label_Inside_Yourcart.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Total_Label_Inside_Yourcart;
	}

	// To assert the Total price in the dialogue
	@FindBy(id = "total_price")
	private WebElement total_Price_Inside_Yourcart;

	public String read_Value_From_Total_Price_Inside_Yourcart() {
		String value_From_Total_Price_Inside_Yourcart = total_Price_Inside_Yourcart.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Total_Price_Inside_Yourcart;
	}

	// To click on the remove product option inside the your cart dialogue
	@FindBy(id = "confirm_order")
	private WebElement confirm_Order_Option;

	public void click_On_Confirm_Order_Option() {
		confirm_Order_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the item label in the confirm order screen
	@FindBy(id = "items_tv")
	private WebElement items_Label_In_Confirm_Order_Screen;

	public String read_Value_From_Items_Label_In_Confirm_Order_Screen() {
		String value_From_Items_Label_In_Confirm_Order_Screen = items_Label_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Items_Label_In_Confirm_Order_Screen;
	}

	// To assert the Total label in confirm order screen
	@FindBy(id = "total_label_tv")
	private WebElement total_Label_In_Confirm_Order_Screen;

	public String read_Value_From_Total_Label_In_Confirm_Order_Screen() {
		String value_From_Total_Label_In_Confirm_Order_Screen = total_Label_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Total_Label_In_Confirm_Order_Screen;
	}

	// To assert the quantity label in confirm order screen
	@FindBy(id = "qty_label_tv")
	private WebElement quantity_Label_In_Confirm_Order_Screen;

	public String read_Value_From_Quantity_Label_In_Confirm_Order_Screen() {
		String value_From_Quantity_Label_In_Confirm_Order_Screen = quantity_Label_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Quantity_Label_In_Confirm_Order_Screen;
	}

	// To click on the decrement button in the confirm order screen
	@FindBy(id = "decrement")
	private WebElement decrement_Option;

	public void click_On_Decrement_Option() {
		decrement_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the decrement button in the confirm order screen
	@FindBy(id = "increment")
	private WebElement increment_Option;

	public void click_On_Increment_Option() {
		increment_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the quantity in confirm order screen
	@FindBy(id = "qty_tv")
	private WebElement quantity_In_Confirm_Order_Screen;

	public String read_Value_From_Quantity_In_Confirm_Order_Screen() {
		String value_From_Quantity_In_Confirm_Order_Screen = quantity_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Quantity_In_Confirm_Order_Screen;
	}

	// To click on the Remove in the confirm order screen
	@FindBy(id = "remove_button")
	private WebElement remove_Option;

	public void click_On_Remove_Option() {
		remove_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the price details label in confirm order screen
	@FindBy(id = "price_details_tv")
	private WebElement price_Details_Label_In_Confirm_Order_Screen;

	public String read_Value_From_Price_Details_Label_In_Confirm_Order_Screen() {
		String value_From_Price_Details_Label_In_Confirm_Order_Screen = price_Details_Label_In_Confirm_Order_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Price_Details_Label_In_Confirm_Order_Screen;
	}

	// To assert the Cart total label from confirm order screen
	@FindBy(xpath = "//android.widget.TextView[@text='Cart Total']")
	private WebElement cardTotal_In_Confirm_Order_Screen;

	public String read_Value_From_CardTotal_In_Confirm_Order_Screen() {
		value_From_CardTotal_In_Confirm_Order_Screen = cardTotal_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_CardTotal_In_Confirm_Order_Screen;
	}

	// To assert the Coupon Discount label from confirm order screen
	@FindBy(xpath = "//android.widget.TextView[@text='Coupon Discount']")
	private WebElement coupon_Discount_In_Confirm_Order_Screen;

	public String read_Value_From_Coupon_Discount_In_Confirm_Order_Screen() {
		String value_From_Coupon_Discount_In_Confirm_Order_Screen = coupon_Discount_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Coupon_Discount_In_Confirm_Order_Screen;
	}

	// To assert the Total Payable label from confirm order screen
	@FindBy(xpath = "//android.widget.TextView[@text='Total Payable']")
	private WebElement total_Payable_Label_In_Confirm_Order_Screen;

	public String read_Value_From_Total_Payable_Label_In_Confirm_Order_Screen() {
		String value_From_Total_Payable_Label_In_Confirm_Order_Screen = total_Payable_Label_In_Confirm_Order_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Total_Payable_Label_In_Confirm_Order_Screen;
	}

	// To assert the cart amount from confirm order screen
	@FindBy(id = "cart_amount_tv")
	private WebElement cart_Amount_In_Confirm_Order_Screen;

	public String read_Value_From_Cart_Amount_In_Confirm_Order_Screen() {
		String value_From_Cart_Amount_In_Confirm_Order_Screen = cart_Amount_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Cart_Amount_In_Confirm_Order_Screen;
	}

	// To assert the discount amount from confirm order screen
	@FindBy(id = "discount_amount_tv")
	private WebElement discount_Amount_In_Confirm_Order_Screen;

	public String read_Value_From_Discount_Amount_In_Confirm_Order_Screen() {
		String value_From_Discount_Amount_In_Confirm_Order_Screen = discount_Amount_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Discount_Amount_In_Confirm_Order_Screen;
	}

	// To assert the total payable amount from confirm order screen
	@FindBy(id = "total_payable_tv")
	private WebElement total_Payable_In_Confirm_Order_Screen;

	public String read_Value_From_Total_Payable_In_Confirm_Order_Screen() {
		String value_From_Total_Payable_In_Confirm_Order_Screen = total_Payable_In_Confirm_Order_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Total_Payable_In_Confirm_Order_Screen;
	}

	// To click on the select Address in the confirm order screen
	@FindBy(id = "select_address__bttn")
	private WebElement select_Address_Option;

	public void click_On_Select_Address_Option() {
		select_Address_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To select the default address
	@FindBy(id = "address_title_rg")
	private WebElement select_Address;

	public void click_On_Select_DefaultAddress() {
		select_Address_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the total payable amount from confirm order screen
	@FindBy(id = "total_payable_amount_tv")
	private WebElement total_Payable_Amount_In_Confirm_Order_Screen;

	public String read_Value_From_Total_Payable_Amount_In_Confirm_Order_Screen() {
		String value_From_Total_Payable_Amount_In_Confirm_Order_Screen = total_Payable_Amount_In_Confirm_Order_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Total_Payable_Amount_In_Confirm_Order_Screen;
	}
	
	

	// To assert the delivery address label from confirm order screen
	@FindBy(id = "address_label_tv")
	private WebElement delivery_Address_Lable_In_Confirm_Order_Screen_After_Selecting_Address;

	public String read_Value_From_Delivery_Address_In_Confirm_Order_Screen_After_Selecting_Address() {
		String value_From_Delivery_Address_Lable_In_Confirm_Order_Screen_After_Selecting_Address = delivery_Address_Lable_In_Confirm_Order_Screen_After_Selecting_Address
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Delivery_Address_Lable_In_Confirm_Order_Screen_After_Selecting_Address;
	}

	// To assert the delivery address from confirm order screen
	@FindBy(id = "address_tv")
	private WebElement delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address;

	public String read_Value_From_Delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address() {
		String value_From_Delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address = delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Delivry_Address_In_Confirm_Order_Screen_After_Selecting_Address;
	}

	// To click on the Change Address button confirm order screen
	@FindBy(id = "change_address_label_tv")
	private WebElement change_Address_Option;

	public void click_On_Change_Address_Option() {
		change_Address_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the address thats showing in the address book
	@FindBy(id = "address_tv")
	private WebElement address_In_AddressBook_Screen;

	public String read_Value_From_address_In_AddressBook_Screen() {
		String value_From_address_In_AddressBook_Screen = address_In_AddressBook_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_address_In_AddressBook_Screen;
	}

	// To click on the Cancel button in payment options screen
	@FindBy(id = "toolbar_navigation_text")
	private WebElement cancel_Option;

	public void click_On_Cancel_Option() {
		cancel_Option.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To assert the Amount payable label from the Payment options screen
	@FindBy(id = "payable_amount_label_tv")
	private WebElement amount_payable_Option_In_Payment_Options_Screen;

	public String read_Value_From_Amount_payable_Option_In_Payment_Options_Screen() {
		String value_From_Amount_payable_Option_In_Payment_Options_Screen = amount_payable_Option_In_Payment_Options_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Amount_payable_Option_In_Payment_Options_Screen;
	}
	

	// To assert the pay now label from the Payment options screen
	@FindBy(xpath = "//android.widget.TextView[@text='Pay Now']")
	private WebElement pay_Now_In_Payment_Options_Screen;

	public String read_Value_From_Pay_Now_In_Payment_Options_Screen() {
		String value_From_Pay_Now_In_Payment_Options_Screen = pay_Now_In_Payment_Options_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Pay_Now_In_Payment_Options_Screen;
	}

	// To assert the payment options from the Payment options screen
	@FindBy(xpath = "//android.widget.TextView[@text='Netbanking, Wallet, Credit Card, Debit Card']")
	private WebElement payment_Options_In_Payment_Options_Screen;

	public String read_Value_From_Payment_Options_In_Payment_Options_Screen() {
		String value_From_Payment_Options_In_Payment_Options_Screen = payment_Options_In_Payment_Options_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Payment_Options_In_Payment_Options_Screen;
	}

	// To assert the pay later label from the Payment options screen
	@FindBy(xpath = "//android.widget.TextView[@text='Pay Later']")
	private WebElement pay_Later_In_Payment_Options_Screen;

	public String read_Value_From_Pay_Later_In_Payment_Options_Screen() {
		String value_From_Pay_Later_In_Payment_Options_Screen = pay_Later_In_Payment_Options_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Pay_Later_In_Payment_Options_Screen;
	}

	// To assert the payment later options from the Payment options screen
	@FindBy(xpath = "//android.widget.TextView[@text='Buy Now, Pay Later']")
	private WebElement paymentLater_Options_In_Payment_Options_Screen;

	public String read_Value_From_PaymentLater_Options_In_Payment_Options_Screen() {
		String value_From_PaymentLater_Options_In_Payment_Options_Screen = paymentLater_Options_In_Payment_Options_Screen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_PaymentLater_Options_In_Payment_Options_Screen;
	}

	// To check the epaylater options Payment options screen
	@FindBy(id = "gateway_iv")
	private WebElement ePayLater_In_Payment_Options_Screen;

	public boolean read_value_From_ePayLater_In_Payment_Options_Screen() {
		boolean value_From_ePayLater_In_Payment_Options_Screen = ePayLater_In_Payment_Options_Screen.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_ePayLater_In_Payment_Options_Screen;
	}

	// To click on the payment button in payment options screen
	@FindBy(id = "payment_method_layout")
	private WebElement payment_Option;

	public void click_On_Payment_Option() {
		payment_Option.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	

	// To assert the mobile number in razorpay screen
	@FindBy(id = "contact")
	private WebElement mobileNumber_In_RazorpayScreen;

	public String read_Value_from_MobileNumber_In_RazorpayScreen() {
		String value_from_MobileNumber_In_RazorpayScreen = mobileNumber_In_RazorpayScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_from_MobileNumber_In_RazorpayScreen;
	}
	
	// To assert the price/service fee in razorpay screen
	@FindBy(id = "amount")
	private WebElement amountField_In_RazorpayScreen;

	public String read_Value_from_amountField_In_RazorpayScreen() {
		String value_from_amountField_In_RazorpayScreen = amountField_In_RazorpayScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_from_amountField_In_RazorpayScreen;
	}
	
	// To assert the merchant name fee in razorpay screen
	@FindBy(id = "merchant-name")
	private WebElement merchantName_In_RazorpayScreen;

	public String read_Value_from_MerchantName_In_RazorpayScreen() {
		String value_from_MerchantName_In_RazorpayScreen = merchantName_In_RazorpayScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_from_MerchantName_In_RazorpayScreen;
	}
	
	
	// To assert the merchant description fee in razorpay screen
	@FindBy(id = "merchant-desc")
	private WebElement moduleName_In_RazorpayScreen;

	public String read_Value_from_ModuleName_In_RazorpayScreen() {
		String value_from_ModuleName_In_RazorpayScreen = moduleName_In_RazorpayScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_from_ModuleName_In_RazorpayScreen;
	}
	
	
	
	// To write on the email field in payment options screen
	@FindBy(id = "email")
	private WebElement write_On_EmailID;

	public void write_On_EmailID_Field(String email) {
//		MobileElement ele = (MobileElement) driver.findElement(By.id("email"));
//		ele.setValue(email);
		write_On_EmailID.sendKeys(email);
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on proceed button in payment options screen
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'footer')]")
	private WebElement proceed_Button;

	public void click_On_Proceed_Button() {
		proceed_Button.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	

	// To select netbanking option in payments screen
	@FindBy(xpath = "//android.view.View[@text='Netbanking All Indian banks']")
	private WebElement netbanking_In_Payments_Screen;

	public void select_Netbanking_In_Payments_Screen() {
		netbanking_In_Payments_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To select sbi bank option in payments screen
	@FindBy(xpath = "//android.view.View[@text='SBI']")
	private WebElement sbi_Netbanking_In_Payments_Screen;

	public void select_sbi_Netbanking_In_Payments_Screen() {
		sbi_Netbanking_In_Payments_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To select payment option in payments screen
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'footer')]")
	private WebElement payment_Button_In_Payments_Screen;

	public void select_Payment_Button_In_Payments_Screen() {
		payment_Button_In_Payments_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To select success button in payments screen
	@FindBy(xpath = "//android.widget.Button[@text='Success']")
	private WebElement success_Button_In_Payments_Screen;

	public void select_Success_Button_In_Payments_Screen() {
		success_Button_In_Payments_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To check the success emoji after the successful payment
	@FindBy(id = "rounded_tick_iv")
	private WebElement successEmoji_After_Successfull_Payment;

	public boolean read_Value_From_SuccessEmoji_After_Successfull_Payment() {
		boolean value_From_SuccessEmoji_After_Successfull_Payment = successEmoji_After_Successfull_Payment
				.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_SuccessEmoji_After_Successfull_Payment;
	}

	// To assert the thank you message after successfull payment
	@FindBy(id = "thank_you_tv")
	private WebElement thankyou_Message_After_Successfull_Payment;

	public String read_Value_From_Thankyou_Message_After_Successfull_Payment() {
		String value_From_Thankyou_Message_After_Successfull_Payment = thankyou_Message_After_Successfull_Payment
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Thankyou_Message_After_Successfull_Payment;
	}

	// To assert the order received label after successfull payment
	@FindBy(id = "order_received_label_tv")
	private WebElement order_Received_Label_After_Successfull_Payment;

	public String read_Value_From_Order_Received_Label_After_Successfull_Payment() {
		String value_From_Order_Received_Label_After_Successfull_Payment = order_Received_Label_After_Successfull_Payment
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Order_Received_Label_After_Successfull_Payment;
	}

	// To assert the order confirmation label after successfull payment
	@FindBy(id = "order_confirmation_msg_label_tv")
	private WebElement order_Confirmation_Label_After_Successfull_Payment;

	public String read_Value_From_Order_Confirmation_Label_After_Successfull_Payment() {
		String value_From_Order_Confirmation_Label_After_Successfull_Payment = order_Confirmation_Label_After_Successfull_Payment
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Order_Confirmation_Label_After_Successfull_Payment;
	}

	// To select home button in payments screen
	@FindBy(id = "home")
	private WebElement home_Button_In_Payments_Screen;

	public void select_Home_Button_In_Payments_Screen() {
		home_Button_In_Payments_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the order number label after successfull payment
	@FindBy(id = "order_no_tv")
	private WebElement order_Number_After_Successfull_Payment;

	public String read_Value_From_Order_Number_After_Successfull_Payment() {
		String value_From_Order_Number_After_Successfull_Payment = order_Number_After_Successfull_Payment.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Order_Number_After_Successfull_Payment;
	}

	// To assert the product name label after successfull payment
	@FindBy(id = "prod_name_tv")
	private WebElement product_Name_After_Successfull_Payment;

	public String read_Value_From_Product_Name_After_Successfull_Payment() {
		String value_From_Product_Name_After_Successfull_Payment = product_Name_After_Successfull_Payment.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Product_Name_After_Successfull_Payment;
	}
	
	// To select failure button in payments screen
	@FindBy(xpath = "//android.widget.Button[@text='Failure']")
	private WebElement failure_Button_In_Payments_Screen;

	public void select_Failure_Button_In_Payments_Screen() {
		failure_Button_In_Payments_Screen.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To assert the price range label for insurance
	@FindBy(id = "textView3")
	private WebElement price_Range_Label_In_Insurance_Screen;

	public String read_Value_From_Price_Range_Label_In_Insurance_Screen() {
		String value_From_Price_Range_Label_In_Insurance_Screen = price_Range_Label_In_Insurance_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Price_Range_Label_In_Insurance_Screen;
	}
	
	// To click on the price range dropdown
	@FindBy(id = "android:id/text1")
	private WebElement price_Range_Dropdown;

	public void click_Price_Range_Dropdown() {
		price_Range_Dropdown.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To check the no data found emoji
	@FindBy(id = "no_data_image")
	private WebElement nodata_Emoji;

	public boolean read_Value_From_Nodata_Emoji() {
		boolean value_From_Nodata_Emoji = nodata_Emoji
				.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Nodata_Emoji;
	}
	
	// To select from the price range dropdown
	@FindBy(id = "android:id/text1")
	private List<WebElement> select_Price_Range;

	public void select_Price_Range_From_Dropdown() {
		for (int i = 0; i < select_Price_Range.size();) {
			select_Price_Range.get(i).click();
			break;

		}
		
	}
	
	// To assert the warning label for insurance
	@FindBy(id = "warning_label")
	private WebElement warning_Label_In_Insurance_Screen;

	public String read_Value_From_Warning_Label_In_Insurance_Screen() {
		String value_From_Warning_Label_In_Insurance_Screen = warning_Label_In_Insurance_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Warning_Label_In_Insurance_Screen;
	}
	
	// To assert the plans count label for insurance
	@FindBy(id = "plans_count_tv")
	private WebElement plans_Count_Label_In_Insurance_Screen;

	public String read_Value_From_Plans_Count_Label_In_Insurance_Screen() {
		String value_From_Plans_Count_Label_In_Insurance_Screen = plans_Count_Label_In_Insurance_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Plans_Count_Label_In_Insurance_Screen;
	}
	
	// To assert the plans title label for insurance
	@FindBy(id = "purchase_plan_title_tv")
	private WebElement purcahse_PLan_Title_In_Insurance_Screen;

	public String read_Value_From_Purcahse_PLan_Title_In_Insurance_Screen() {
		String value_From_Purcahse_PLan_Title_In_Insurance_Screen = purcahse_PLan_Title_In_Insurance_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Purcahse_PLan_Title_In_Insurance_Screen;
	}
	
	// To click on the plans title label for insurance
	@FindBy(id = "purchase_plan_title_tv")
	private WebElement click_Purcahse_PLan_Title_In_Insurance_Screen;

	public void click_On_Purcahse_PLan_Title_In_Insurance_Screen() {
		click_Purcahse_PLan_Title_In_Insurance_Screen.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To assert the warranty label for insurance
	@FindBy(id = "warranty_yr_tv")
	private WebElement warranty_Label_In_Insurance_Screen;

	public String read_Value_From_Warranty_Label_In_Insurance_Screen() {
		String value_From_Warranty_Label_In_Insurance_Screen = warranty_Label_In_Insurance_Screen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Warranty_Label_In_Insurance_Screen;
	}
	
	// To check the plan image is showing or not!!
	@FindBy(id = "purchase_partner_logo_iv")
	private WebElement plan_Image;

	public boolean read_Value_From_Plan_Image() {
		boolean value_From_Plan_Image = plan_Image
				.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_Plan_Image;
	}


}
