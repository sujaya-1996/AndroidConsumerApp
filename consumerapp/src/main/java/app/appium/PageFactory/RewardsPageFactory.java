package app.appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class RewardsPageFactory
{
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	public WebDriver driver;
	
	public RewardsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// To click on the offersForMe tab 
	@FindBy(xpath = "//android.widget.TextView[@text=' OFFERS FOR ME']")
	private WebElement OffersForMeTab;

	public void click_On_OffersForMeTab() {
		OffersForMeTab.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	
	// To click on the eye icon on the coupon
	@FindBy(id = "copy_coupon_code_logo")
	private WebElement couponEyeIcon;

	public void click_On_CouponEyeIcon() {
		couponEyeIcon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	// To click on the Info icon on the coupon
	@FindBy(id = "info_logo")
	private WebElement couponInfoIcon;

	public void click_On_CouponInfoIcon() {
		couponInfoIcon.click();
		andrdCmnUtil.implicit_Wait();
	}
	
	


}
