package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class MyOrderPageFactory {

	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	boolean value_From_productImage_Of_Insurance;
	boolean value_From_productImage_Of_Accessory;
	String value_From_OrderID_Of_Insurance;
	String value_From_OrderID_Of_Accessory;
	String value_From_Name_Of_Insurance;
	String value_From_Name_Of_Accessory;
	String value_From_orderType_Of_Insurance;
	String value_From_orderType_Of_Accessory;
	String value_From_orderStatusLabel_Of_Insurance;
	String value_From_orderStatusLabel_Of_Accessory;
	String value_From_orderStatus_Of_Insurance;
	String value_From_OrderStatus_Of_Accessory;
	
	public MyOrderPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	// To check the product image of the first item (insurance)
		@FindBy(id = "product_iv")
		private List<WebElement> productImage_Of_Insurance;

		public boolean check_Value_From_productImage_Of_Insurance() {
			for (int i = 0; i < productImage_Of_Insurance.size();) {
				value_From_productImage_Of_Insurance = productImage_Of_Insurance.get(i).isDisplayed();
				andrdCmnUtil.implicit_Wait();
				break;

			}
			return value_From_productImage_Of_Insurance;
		}
		
		// To check the product image of the second item (Accessory)
		@FindBy(id = "product_iv")
		private List<WebElement> productImage_Of_Accessory;

		public boolean check_Value_From_productImage_Of_Accessory() {
			for (int i = 1; i < productImage_Of_Accessory.size();) {
				value_From_productImage_Of_Accessory= productImage_Of_Accessory.get(i).isDisplayed();
				andrdCmnUtil.implicit_Wait();
				break;

			}
			return value_From_productImage_Of_Accessory;
		}
		
		
	// To assert the order id of the first item (insurance)
	@FindBy(id = "order_id_tv")
	private List<WebElement> orderID_Of_Insurance;

	public String read_value_From_OrderID_Of_Insurance() {
		for (int i = 0; i < orderID_Of_Insurance.size();) {
			value_From_OrderID_Of_Insurance = orderID_Of_Insurance.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_OrderID_Of_Insurance;
	}
	
	// To assert the order id of the second item (Accessory)
	@FindBy(id = "order_id_tv")
	private List<WebElement> OrderID_Of_Accessory;

	public String read_value_From_OrderID_Of_Accessory() {
		for (int i = 1; i < orderID_Of_Insurance.size();) {
			value_From_OrderID_Of_Accessory= OrderID_Of_Accessory.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_OrderID_Of_Accessory;
	}
	
	// To assert the name of the first item (insurance)
	@FindBy(id = "order_title_tv")
	private List<WebElement> name_Of_Insurance;

	public String read_Value_From_Name_Of_Insurance() {
		for (int i = 0; i < name_Of_Insurance.size();) {
			value_From_Name_Of_Insurance = name_Of_Insurance.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Name_Of_Insurance;
	}
	
	// To assert the name of the second item (Accessory)
	@FindBy(id = "order_title_tv")
	private List<WebElement> name_Of_Accessory;

	public String read_Value_From_Name_Of_Accessory() {
		for (int i = 1; i < name_Of_Accessory.size();) {
			value_From_Name_Of_Accessory= name_Of_Accessory.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Name_Of_Accessory;
	}
	
	// To assert the order type of the first item (insurance)
	@FindBy(id = "order_type_tv")
	private List<WebElement> orderType_Of_Insurance;

	public String read_Value_From_orderType_Of_Insurance() {
		for (int i = 0; i < orderType_Of_Insurance.size();) {
			value_From_orderType_Of_Insurance = orderType_Of_Insurance.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_orderType_Of_Insurance;
	}
	
	// To assert the order type of the second item (Accessory)
	@FindBy(id = "order_type_tv")
	private List<WebElement> orderType_Of_Accessory;

	public String read_Value_From_orderType_Of_Accessory() {
		for (int i = 1; i < orderType_Of_Accessory.size();) {
			value_From_orderType_Of_Accessory= orderType_Of_Accessory.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_orderType_Of_Accessory;
	}
	
	// To assert the order type label of the first item (insurance)
	@FindBy(id = "order_status_label_tv")
	private List<WebElement> orderStatusLabel_Of_Insurance;

	public String read_Value_From_orderStatusLabel_Of_Insurance() {
		for (int i = 0; i < orderStatusLabel_Of_Insurance.size();) {
			value_From_orderStatusLabel_Of_Insurance = orderStatusLabel_Of_Insurance.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_orderStatusLabel_Of_Insurance;
	}
	
	// To assert the order type label of the second item (Accessory)
	@FindBy(id = "order_status_label_tv")
	private List<WebElement> orderStatusLabel_Of_Accessory;

	public String read_Value_From_orderStatusLabel_Of_Accessory() {
		for (int i = 1; i < orderStatusLabel_Of_Accessory.size();) {
			value_From_orderStatusLabel_Of_Accessory= orderStatusLabel_Of_Accessory.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_orderStatusLabel_Of_Accessory;
	}
	
	
	// To assert the order status of the first item (insurance)
	@FindBy(id = "order_status_tv")
	private List<WebElement> orderStatus_Of_Insurance;

	public String read_Value_From_orderStatus_Of_Insurance() {
		for (int i = 0; i < orderStatusLabel_Of_Insurance.size();) {
			value_From_orderStatus_Of_Insurance = orderStatus_Of_Insurance.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_orderStatus_Of_Insurance;
	}
	
	// To assert the order status of the second item (Accessory)
	@FindBy(id = "order_status_tv")
	private List<WebElement> orderStatus_Of_Accessory;

	public String read_Value_From_OrderStatus_Of_Accessory() {
		for (int i = 1; i < orderStatusLabel_Of_Accessory.size();) {
			value_From_OrderStatus_Of_Accessory= orderStatus_Of_Accessory.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_OrderStatus_Of_Accessory;
	}
	
	// To click on the go arrow of the first item (insurance)
	@FindBy(id = "go_arrow")
	private List<WebElement> goArrow_Of_Insurance;

	public void click_On_GoArrow_Of_Insurance() {
		for (int i = 0; i < goArrow_Of_Insurance.size();) {
			goArrow_Of_Insurance.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}
	
	// To click on the go arrow  of the second item (Accessory)
	@FindBy(id = "go_arrow")
	private List<WebElement> goArrow_Of_Accessory;

	public void click_On_GoArrow_Of_Accessory() {
		for (int i = 1; i < goArrow_Of_Accessory.size();) {
			goArrow_Of_Accessory.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}
	
	
	
	
	
}
