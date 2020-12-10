package app.appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class MyAddressPage 
{
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	
	public MyAddressPage (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	// To assert the Address book screen Toolbar Title
	@FindBy (id= "title_address_tv")
	private WebElement addressBook_Title;
	
	public String read_AddressBook_Title_Text()
	{
		String addressBook_Title_Text= addressBook_Title.getText();
		andrdCmnUtil.implicit_Wait();
		return addressBook_Title_Text;
	}	
	
	// To Click on the Use my current location field
	@FindBy (id= "use_my_current_location_rl")
	private WebElement useMyCurrentLocation;
	
	public void click_UseMyCurrentLocation()
	{
		useMyCurrentLocation.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To Click on the "Add New address"
	@FindBy (id= "add_new_address_rl")
	private WebElement addNewAddress;
	
	public void click_addNewAddress()
	{
		addNewAddress.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the City field inside Use My current location screen
	@FindBy (id= "city_edittext")
	private WebElement city_Field_Of_AddNewAddress;
	
	public String read_City_Field_Of_AddNewAddress()
	{
		String value_Of_City_Field_Of_AddNewAddress= city_Field_Of_AddNewAddress.getAttribute("text");
		andrdCmnUtil.implicit_Wait();
		return value_Of_City_Field_Of_AddNewAddress;
		
	}
	
	// To click on the first address (Address 01) to make it default address
	@FindBy (xpath="//android.widget.RadioButton[@text='ADDRESS 01']")
	private WebElement defaultAddress_In_Myaddress;
	
	public void selecting_DefaultAddress_In_Myaddress()
	{
		defaultAddress_In_Myaddress.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the primary address on address book
	@FindBy (id= "default_address")
	private WebElement primary_Address_In_AddressBook;
	
	public String read_From_Primary_Address_In_AddressBook()
	{
		String value_From_Primary_Address_In_AddressBook= primary_Address_In_AddressBook.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Primary_Address_In_AddressBook;
	}	
	
	// To assert the address text in the primary configured address
	@FindBy (id= "address_tv")
	private WebElement addressText_In_AddressBook;
	
	public String read_From_AddressText_In_AddressBook()
	{
		String value_From_AddressText_In_AddressBook= addressText_In_AddressBook.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_AddressText_In_AddressBook;
	}
	
	// To assert the address02 from the address book
	@FindBy (xpath= "//android.widget.RadioButton[@text='ADDRESS 02']")
	private WebElement address2Text_In_AddressBook;
	
	public String read_From_Address2Text_In_AddressBook()
	{
		String value_From_Address2Text_In_AddressBook= address2Text_In_AddressBook.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Address2Text_In_AddressBook;
	}
	
	// To click on the address02 from the address book
	@FindBy (xpath= "//android.widget.RadioButton[@text='ADDRESS 02']")
	private WebElement address2_In_AddressBook;
	
	public void click_On_Address2_In_AddressBook()
	{
		address2_In_AddressBook.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	
	
	
	
	
}
