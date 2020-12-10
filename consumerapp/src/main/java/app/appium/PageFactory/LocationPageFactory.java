package app.appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class LocationPageFactory {

	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();

	public WebDriver driver;

	public LocationPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To click on the Location module on Mobile app menus
	@FindBy(xpath = "//android.widget.TextView[@text='Location']")
	private WebElement location_Module_On_MobileAppMenu;

	public void click_On_Location_Module_On_MobileAppMenu() {
		location_Module_On_MobileAppMenu.click();
		andrdCmnUtil.implicit_Wait();
	}

	// To click on the my location button
	@FindBy(id = "my_location")
	private WebElement myLocation_Button;

	public void click_On_MyLocation_Button() {
		myLocation_Button.click();
		andrdCmnUtil.implicit_Wait();
		}
	
	// To check the location emoji is showing or not!!
	@FindBy(id = "location_iv")
	private WebElement location_Emoji;

	public boolean read_From_Value_For_Location_Emoji() {
		boolean value_For_Location_Emoji = location_Emoji.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_For_Location_Emoji;
	}
	
	// To check the distance emoji is showing or not!!
	@FindBy(id = "distance_iv")
	private WebElement distnace_Emoji;

	public boolean read_From_Value_For_Distnace_Emoji() {
		boolean value_For_Distnace_Emoji = distnace_Emoji.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_For_Distnace_Emoji;
	}
	
	// To assert the address from the card
	@FindBy(id = "address_tv")
	private WebElement address_On_The_Card;

	public String read_Value_From_Address_On_The_Card() {
		String value_From_Address_On_The_Card = address_On_The_Card.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Address_On_The_Card;
	}
	
	// To click on the address card, which will navigate to google maps.
	@FindBy(id = "address_tv")
	private WebElement address_Card;

	public void click_On_Address_Card() {
		address_Card.click();
		andrdCmnUtil.implicit_Wait();
		}
	
	// To assert the distance on the card
	@FindBy(id = "distance_tv")
	private WebElement distance_On_The_Card;

	public String read_Value_From_Distance_On_The_Card() {
		String value_From_Distance_On_The_Card = distance_On_The_Card.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Distance_On_The_Card;
	}
	
	//To check whether screen navigated to google maps or not!!
	@FindBy(xpath = "android.widget.ImageView[@content-desc='Overflow menu']")
	private WebElement threedots_On_Googlemaps;

	public boolean read_Value_From_threedots_On_Googlemaps() {
		boolean value_From_threedots_On_Googlemaps= threedots_On_Googlemaps.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_From_threedots_On_Googlemaps;
	}
	
	// To check the call emoji is showing or not!!
	@FindBy(id = "phone_iv")
	private WebElement call_Emoji;

	public boolean read_From_Value_For_Call_Emoji() {
		boolean value_For_Call_Emoji = call_Emoji.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return value_For_Call_Emoji;
	}
	
	// To assert the phone number on the card
	@FindBy(id = "phone_tv")
	private WebElement phoneNumber_On_The_Card;

	public String read_Value_From_PhoneNumber_On_The_Card() {
		String value_From_PhoneNumber_On_The_Card= phoneNumber_On_The_Card.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_PhoneNumber_On_The_Card;
	}
	
}
	
	
