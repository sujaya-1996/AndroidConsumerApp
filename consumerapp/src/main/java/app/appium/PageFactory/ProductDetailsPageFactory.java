package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class ProductDetailsPageFactory {

	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_product_Category;
	String value_product_SubCategory;
	String value_From_ModelNumberLabel;
	String value_From_Product_Manafacturer;
	String value_From_Seller_Label;

	public ProductDetailsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To check whether globe icon is showing or not!!
	@FindBy(id = "isoCodeIv")
	private WebElement globeIcon;

	public boolean check_For_GlobeIcon() {
		boolean check_For_GlobeIcon = globeIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_GlobeIcon;
	}
	
	// To check whether Country code icon is showing properly or not!!
	@FindBy(id = "isoCodeTv")
	private WebElement countryCode;

	public String read_Value_From_CountryCode() {
		String value_From_countryCode = countryCode.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_countryCode;
	}
	
	// To click on the grid view icon
	@FindBy(id = "action_view_toggle")
	private WebElement gridViewIcon;

	public void click_on_GridViewIcon() {
		gridViewIcon.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the all tab text from gridview
	@FindBy(xpath = "//android.widget.TextView[@text='ALL']")
	private WebElement all_Tab_In_GridView;

	public String read_Value_From_All_Tab_In_GridView() {
		String Value_From_All_Tab_In_GridView = all_Tab_In_GridView.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_All_Tab_In_GridView;
	}
	
	// To check whether notification icon is showing or not!!
	@FindBy(id = "action_view_push_notification_inbox")
	private WebElement notificationIcon;

	public boolean check_For_NotificationIcon() {
		boolean check_For_NotificationIcon = notificationIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_NotificationIcon;
	}
	
	// To assert the dk count..
	@FindBy(id = "current_dk_tv")
	private WebElement dkCount;

	public String read_Value_From_DkCount() {
		String Value_From_DkCount = dkCount.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_DkCount;
	}
	
	// To check whether brand logo is showing or not!!
	@FindBy(id = "customer_logo_iv")
	private WebElement bradnLogo;

	public boolean check_For_BradnLogo() {
		boolean check_For_BradnLogo = bradnLogo.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_BradnLogo;
	}
	
	// To check whether product image/default image is showing or not!!
	@FindBy(id = "product_iv")
	private WebElement productImage;

	public boolean check_For_ProductImage() {
		boolean check_For_ProductImage = productImage.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_ProductImage;
	}
	
	// To click on the dk..
	@FindBy(id = "product_iv")
	private WebElement productClick;

	public void Click_On_DkImage() {
		productClick.click();
		andrdCmnUtil.implicit_Wait();
		
	}
	
	// To assert the dk name
	@FindBy(id = "brand_name_tv")
	private WebElement dkName;

	public String read_Value_From_DkName() {
		String Value_From_DkName = dkName.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_DkName;
	}
	
	// To check whether event icon in footer section is showing or not!!
	@FindBy(id = "navigation_home")
	private WebElement eventModuleIcon;

	public boolean check_For_EventModuleIcon() {
		boolean check_For_EventModuleIcon = eventModuleIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_EventModuleIcon;
	}
	
	// To check whether dk icon in footer section is showing or not!!
	@FindBy(id = "navigation_dk")
	private WebElement dkModuleIcon;

	public boolean check_For_DkModuleIcon() {
		boolean check_For_DkModuleIcon = dkModuleIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_DkModuleIcon;
	}
	
	// To check whether add product + icon in footer section is showing or not!!
	@FindBy(id = "floatingActionButton")
	private WebElement addProductIcon;

	public boolean check_For_AddProductIcon() {
		boolean check_For_AddProductIcon = addProductIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_AddProductIcon;
	}
	
	// To check whether rewards icon in footer section is showing or not!!
	@FindBy(id = "navigation_rewards")
	private WebElement rewardsIcon;

	public boolean check_For_RewardsIcon() {
		boolean check_For_RewardsIcon = rewardsIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_RewardsIcon;
	}
	
	// To check whether more menu icon in footer section is showing or not!!
	@FindBy(id = "navigation_more_settings")
	private WebElement moreMenuIcon;

	public boolean check_For_MoreMenuIcon() {
		boolean check_For_MoreMenuIcon = moreMenuIcon.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_MoreMenuIcon;
	}
	
	
	// To check whether product image in details is showing or not!!
	@FindBy(id = "prod_image")
	private WebElement productImage_In_DetailsPage;

	public boolean check_For_ProductImage_In_DetailsPage() {
		boolean check_For_ProductImage_In_DetailsPage = productImage_In_DetailsPage.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return check_For_ProductImage_In_DetailsPage;
	}
	
	// To assert the dk name, on details page
	@FindBy(id = "title_tv")
	private WebElement productName_On_DetailsPage;

	public String read_Value_From_ProductName_On_DetailsPage() {
		String Value_From_ProductName_On_DetailsPage = productName_On_DetailsPage.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_ProductName_On_DetailsPage;
	}
	
	
	// To assert the product category label in details page
	@FindBy(id = "lable_tv")
	private List<WebElement> product_Category;

	public String read_value_From_Product_CategoryLabel() {
		for (int i = 0; i < product_Category.size();) {
			value_product_Category = product_Category.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_product_Category;
	}
	
	// To assert the product subcategory label in details page
	@FindBy(id = "lable_tv")
	private List<WebElement> product_SubCategory;

	public String read_value_From_Product_SubCategory() {
		for (int i = 1; i < product_SubCategory.size();) {
			value_product_SubCategory = product_SubCategory.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_product_SubCategory;
	}
	
	
	// To assert the model number label in details page
	@FindBy(id = "lable_tv")
	private List<WebElement> modelNumber;

	public String read_Value_From_ModelNumberLabel() {
		for (int i = 2; i < modelNumber.size();) {
			value_From_ModelNumberLabel = modelNumber.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_ModelNumberLabel;
	}
	
	
	// To assert the product manufacturer label in details page
	@FindBy(id = "lable_tv")
	private List<WebElement> product_Manafacturer;

	public String read_Value_From_Product_Manafacturer() {
		for (int i = 3; i < product_Manafacturer.size();) {
			value_From_Product_Manafacturer = product_Manafacturer.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Product_Manafacturer;
	}
	
	
	// To assert the Seller label in details page
	@FindBy(id = "lable_tv")
	private List<WebElement> seller;

	public String read_Value_From_Seller_Label() {
		for (int i = 3; i < seller.size();) {
			value_From_Seller_Label = seller.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Seller_Label;
	}
	

}
