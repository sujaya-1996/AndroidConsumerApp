package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class LoyaltyPageFactory {
	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String points_ForThe_FirstEntry;
	String int_points_ForThe_FirstEntry;
	String ValueFrom_Earnedlabel_In_SummaryScreen;
	String ValueFrom_SourceOfPoint_In_SummaryScreen;

	public LoyaltyPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// To assert the summary tab label
	@FindBy(xpath = "//android.widget.TextView[@text='SUMMARY']")
	private WebElement summaryTab;

	public String read_Value_From_SummaryTab() {
		String Value_From_SummaryTab = summaryTab.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_SummaryTab;
	}

	// To click on the summary tab
	@FindBy(xpath = "//android.widget.TextView[@text='SUMMARY']")
	private WebElement summaryTab_In_Loyalty;

	public void click_On_SummaryTab() {
		summaryTab_In_Loyalty.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the coupons tab value
	@FindBy(xpath = "//android.widget.TextView[@text='COUPONS']")
	private WebElement couponsTab;

	public String read_Value_From_CouponsTab() {
		String Value_From_CouponsTab = couponsTab.getText();
		andrdCmnUtil.implicit_Wait();
		return Value_From_CouponsTab;
	}

	// To click on the coupons tab
	@FindBy(xpath = "//android.widget.TextView[@text='COUPONS']")
	private WebElement couponsTab_In_Loyalty;

	public void click_On_CouponsTab() {
		couponsTab_In_Loyalty.click();
		andrdCmnUtil.implicit_Wait();

	}
	
	// To check whether the coupons tab is selected or not!!
	@FindBy(xpath = "//android.widget.TextView[@text='COUPONS']")
	private WebElement couponsTab_Status;

	public boolean read_Status_From_CouponsTab() {
		boolean value_From_CouponsTab = couponsTab_Status.isSelected();
		andrdCmnUtil.implicit_Wait();
		return value_From_CouponsTab;
	}

	// To check whether the profile default pic is showing or not!!
	@FindBy(id = "profile_pic_iv")
	private WebElement profilePic_In_Loyalty;

	public boolean read_valueFrom_profilePic_In_Loyalty() {
		boolean valueFrom_profilePic_In_Loyalty = profilePic_In_Loyalty.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return valueFrom_profilePic_In_Loyalty;

	}

	// To click on the redeem button
	@FindBy(id = "redeem_tv")
	private WebElement redeemButtton_In_Loyalty;

	public void click_On_redeemButtton_In_Loyalty() {
		redeemButtton_In_Loyalty.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To click on the earnmore button
	@FindBy(id = "earn_more_tv")
	private WebElement earnmore_In_Loyalty;

	public void click_On_earnmore_In_Loyalty() {
		earnmore_In_Loyalty.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Description from how to earn more screen
	@FindBy(xpath = "//android.widget.TextView[@text='Use promocode 'Use promocode 'EVENT150' while buying event tickets on Paytm.Book now onto-https://paytm.com/events/bengaluru']")
	private WebElement value_Of_earnmore_In_Loyalty;

	public String read_Value_Of_earnmore_In_Loyalty() {
		String value_From_earnmore_In_Loyalty = value_Of_earnmore_In_Loyalty.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_earnmore_In_Loyalty;

	}

	// To assert the loyalty balance label value
	@FindBy(id = "loyalty_balance_lbl")
	private WebElement loyaltyBalance_In_Loyalty;

	public String read_Value_From_loyaltyBalance_In_Loyalty() {
		String value_From_loyaltyBalance_In_Loyalty = loyaltyBalance_In_Loyalty.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_loyaltyBalance_In_Loyalty;

	}

	// To assert the share referral code label value
	@FindBy(id = "referral_code_title_tv")
	private WebElement shareReferralCode_In_Loyalty;

	public String read_Value_From_shareReferralCode_In_Loyalty() {
		String value_From_shareReferralCode_In_Loyalty = shareReferralCode_In_Loyalty.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_shareReferralCode_In_Loyalty;

	}

	// To click on the share option
	@FindBy(id = "share_refral_iv")
	private WebElement shareOption_In_Loyalty;

	public void click_On_ShareOption_In_Loyalty() {
		shareOption_In_Loyalty.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Lifetime Earnings label
	@FindBy(id = "lifetime_earn_lbl")
	private WebElement lifetimeearn_In_Loyalty;

	public String read_Value_From_lifetimeearn_In_Loyalty() {
		String value_From_lifetimeearn_In_Loyalty = lifetimeearn_In_Loyalty.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_lifetimeearn_In_Loyalty;

	}

	// To assert the Lifetime Redemption label
	@FindBy(id = "lifetime_redeem_lbl")
	private WebElement lifetimeredeem_In_Loyalty;

	public String read_Value_From_lifetimeredeem_In_Loyalty() {
		String value_From_lifetimeredeem_In_Loyalty = lifetimeredeem_In_Loyalty.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_lifetimeredeem_In_Loyalty;

	}

	// To check whether the No coupons available text is showing or not!!
	@FindBy(id = "negative_scenario_text")
	private WebElement noCouponsText_In_Loyalty;

	public String read_Value_From_noCouponsText_In_Loyalty() {
		String value_From_noCouponsText_In_Loyalty = noCouponsText_In_Loyalty.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_noCouponsText_In_Loyalty;

	}

	// To check whether coupons description is showing or not!! 
	@FindBy(id = "coupon_description")
	private WebElement couponDescription_In_CouponsScreen;

	public String read_Value_From_couponDescription_In_CouponsScreen() {
		String value_From_couponDescription_In_CouponsScreen = couponDescription_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_couponDescription_In_CouponsScreen;

	}

	// To click on the Redeem now button in Coupons screen
	@FindBy(id = "redeem")
	private WebElement redeemButton_In_Loyalty;

	public void click_On_RedeemButton_In_CouponsScreen() {
		redeemButton_In_Loyalty.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the Terms and conditions text !
	@FindBy(id = "coupon_terms_and_conditions")
	private WebElement coupon_terms_and_conditions_In_CouponsScreen;

	public String read_Value_From_Coupon_terms_and_conditions_In_CouponsScreen() {
		String value_From_coupon_terms_and_conditions_In_CouponsScreen = coupon_terms_and_conditions_In_CouponsScreen
				.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_coupon_terms_and_conditions_In_CouponsScreen;

	}

	// To Assert the validation popup when the available points are less than the
	// required points
	@FindBy(id = "points_available_label")
	private WebElement points_Available_Label_In_CouponsScreen;

	public String read_Value_From_Points_Available_Label_In_CouponsScreen() {
		String value_From_Points_Available_Label_In_CouponsScreen = points_Available_Label_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Points_Available_Label_In_CouponsScreen;

	}

	// To assert the points Available from the validation popup
	@FindBy(id = "points_available")
	private WebElement points_Available_In_CouponsScreen;

	public String read_Value_From_points_Available_In_CouponsScreen() {
		String value_From_Points_Available_In_CouponsScreen = points_Available_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Points_Available_In_CouponsScreen;

	}
	
	// To assert the Integer converted points Available from the validation popup
	@FindBy(id = "points_available")
	private WebElement points_AvailableInt_In_CouponsScreen;

	public int read_int_Value_From_Points_Available_In_CouponsScreen() {
		String value_From_Points_Available_In_CouponsScreen = points_AvailableInt_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Integer.parseInt(value_From_Points_Available_In_CouponsScreen);
		

	}

	// To Assert the validation popup when the available points are less than the
	// required points
	@FindBy(id = "points_required_label")
	private WebElement points_Required_Label_In_CouponsScreen;

	public String read_Value_From_Points_Requierd_Label_In_CouponsScreen() {
		String value_From_Points_Required_Label_In_CouponsScreen = points_Required_Label_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Points_Required_Label_In_CouponsScreen;

	}

	// To assert the points Required from the validation popup
	@FindBy(id = "points_required")
	private WebElement points_Required_In_CouponsScreen;

	public String read_Value_From_Points_Requierd_In_CouponsScreen() {
		String value_From_Points_Required_In_CouponsScreen = points_Required_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return value_From_Points_Required_In_CouponsScreen;

	}
	
	// To assert the Integer converted points Required from the validation popup
	@FindBy(id = "points_required")
	private WebElement points_RequiredInt_In_CouponsScreen;

	public int read_int_Value_From_Points_Requierd_In_CouponsScreen() {
		String value_From_Points_Required_In_CouponsScreen = points_RequiredInt_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Integer.parseInt(value_From_Points_Required_In_CouponsScreen);
		

	}

	// To click on the Earn more button on the validation pop-up in coupons screen
	@FindBy(id = "negative_btn")
	private WebElement earnMoreButton_In_CouponsScreen;

	public void click_On_EarnMoreButton_In_CouponsScreen() {
		earnMoreButton_In_CouponsScreen.click();
		andrdCmnUtil.implicit_Wait();

	}

	// To assert the loyalty balance points in summary screen
	@FindBy(id = "points_tv")
	private WebElement loyaltyBalancePoints_In_SummaryScreen;

	public String read_Value_From_LoyaltyBalancePoints_In_SummaryScreen() {
		String valueFrom_loyaltyBalancePoints_In_SummaryScreen = loyaltyBalancePoints_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return valueFrom_loyaltyBalancePoints_In_SummaryScreen;

	}
	
	// To assert the Integer converted loyalty balance points in summary screen
	@FindBy(id = "points_tv")
	private WebElement loyaltyBalancePointsInt_In_SummaryScreen;

	public int read_int_Value_From_LoyaltyBalancePoints_In_SummaryScreen() {
		String valueFrom_loyaltyBalancePoints_In_SummaryScreen = loyaltyBalancePointsInt_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Integer.parseInt(valueFrom_loyaltyBalancePoints_In_SummaryScreen);
		

	}
	
	// To assert the Lifetime Earnings points in summary screen
	@FindBy(id = "lifetime_earn_points_tv")
	private WebElement lifetimeEarningsPoints_In_SummaryScreen;

	public String read_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen() {
		String valueFrom_lifetimeEarningsPoints_In_SummaryScreen = lifetimeEarningsPoints_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return valueFrom_lifetimeEarningsPoints_In_SummaryScreen;

	}

	// To assert the Integer converted Lifetime Earnings points in summary screen
	@FindBy(id = "lifetime_earn_points_tv")
	private WebElement lifetimeEarningsPointsInt_In_SummaryScreen;

	public int read_int_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen() {
		String valueFrom_lifetimeEarningsPoints_In_SummaryScreen = lifetimeEarningsPointsInt_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Integer.parseInt(valueFrom_lifetimeEarningsPoints_In_SummaryScreen);
		
		
	}

	// To assert the Lifetime Redemption points in summary screen
	@FindBy(id = "lifetime_redeem_points_tv")
	private WebElement lifetimeRedeemPoints_In_SummaryScreen;

	public String read_ValueFrom_lifetimeRedeemPoints_In_SummaryScreen() {
		String valueFrom_lifetimeRedeemPoints_In_SummaryScreen = lifetimeRedeemPoints_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return valueFrom_lifetimeRedeemPoints_In_SummaryScreen;

	}
	
	// To assert the Integer converted Lifetime Redemption points in summary screen
	@FindBy(id = "lifetime_redeem_points_tv")
	private WebElement lifetimeRedeemPointsInt_In_SummaryScreen;

	public int read_int_ValueFrom_lifetimeRedeemPoints_In_SummaryScreen() {
		String valueFrom_lifetimeRedeemPoints_In_SummaryScreen = lifetimeRedeemPointsInt_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return Integer.parseInt(valueFrom_lifetimeRedeemPoints_In_SummaryScreen);
		

	}

	// To assert the Referral code in summary screen
	@FindBy(id = "referral_code_tv")
	private WebElement referralCode_In_SummaryScreen;

	public String read_ValueFrom_ReferralCode_In_SummaryScreen() {
		String ValueFrom_ReferralCode_In_SummaryScreen = referralCode_In_SummaryScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_ReferralCode_In_SummaryScreen;

	}

	// To assert the Earned Label in summary screen
	@FindBy(id = "point_type")
	private List<WebElement> earnedlabel_In_SummaryScreen;

	public String read_ValueFrom_Earnedlabel_In_SummaryScreen() {
		for (int i = 0; i < earnedlabel_In_SummaryScreen.size();) {
			ValueFrom_Earnedlabel_In_SummaryScreen = earnedlabel_In_SummaryScreen.get(i).getText();
			break;

		}
		return ValueFrom_Earnedlabel_In_SummaryScreen;

	}

	// To assert the points thats on the top of the list for the activity entries
	@FindBy(id = "points")
	private List<WebElement> points_In_SummaryScreen;

	public String readFrom_Points_In_SummaryScreen() {
		for (int i = 0; i < points_In_SummaryScreen.size();) {
			points_ForThe_FirstEntry = points_In_SummaryScreen.get(i).getText();
			break;

		}
		return points_ForThe_FirstEntry;
	}
	
	// To assert the Integer converted points thats on the top of the list for the activity entries
	@FindBy(id = "points")
	private List<WebElement> int_points_In_SummaryScreen;

	public int readFrom_int_Points_In_SummaryScreen() {
		for (int i = 0; i < int_points_In_SummaryScreen.size();) {
			int_points_ForThe_FirstEntry = int_points_In_SummaryScreen.get(i).getText();
			break;

		}
		return Integer.parseInt(int_points_ForThe_FirstEntry);
		
	}

	// To assert the Earning Activity Text
	@FindBy(id = "source_of_point")
	private List<WebElement> sourceOfPoint_In_SummaryScreen;

	public String read_ValueFrom_SourceOfPoint_In_SummaryScreen() {
		for (int i = 0; i < sourceOfPoint_In_SummaryScreen.size();) {
			ValueFrom_SourceOfPoint_In_SummaryScreen = sourceOfPoint_In_SummaryScreen.get(i).getText();
			break;

		}
		return ValueFrom_SourceOfPoint_In_SummaryScreen;

	}

	// To assert the Expires date for the coupon
	@FindBy(id = "coupon_expire_details")
	private WebElement coupon_expire_details_In_CouponsScreen;

	public String read_ValueFrom_Coupon_expire_details_In_CouponsScreen() {
		String ValueFrom_Coupon_expire_details_In_CouponsScreen = coupon_expire_details_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_expire_details_In_CouponsScreen;

	}

	// To assert the coupon required points its showing in coupons screen
	@FindBy(id = "coupon_points")
	private WebElement coupon_Points_In_CouponsScreen;

	public String read_ValueFrom_Coupon_Points_In_CouponsScreen() {
		String ValueFrom_Coupon_Points_In_CouponsScreen = coupon_Points_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_Points_In_CouponsScreen;

	}

	// To assert the coupon warning label showing in coupons screen
	@FindBy(id = "coupon_warning_label")
	private WebElement coupon_Warning_Label_In_CouponsScreen;

	public String read_ValueFrom_Coupon_Warning_Label_In_CouponsScreen() {
		String ValueFrom_Coupon_Warning_Label_In_CouponsScreen = coupon_Warning_Label_In_CouponsScreen.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_Warning_Label_In_CouponsScreen;

	}

	// To check the coupon customer logo
	@FindBy(id = "customer_logo")
	private WebElement coupon_CustomerLogo;

	public boolean read_ValueFrom_Coupon_CustomerLogo() {
		boolean ValueFrom_Coupon_CustomerLogo = coupon_CustomerLogo.isDisplayed();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_CustomerLogo;

	}

	// To assert the coupon congrats Text
	@FindBy(id = "congratulations_text_tv")
	private WebElement coupon_Congratulations_Text;

	public String read_ValueFrom_Coupon_Congratulations_Text() {
		String ValueFrom_Coupon_Congratulations_Text = coupon_Congratulations_Text.getText();
		andrdCmnUtil.implicit_Wait();
		return ValueFrom_Coupon_Congratulations_Text;

	}

	// To click on the coupon cross icon
	@FindBy(id = "close_dialog_iv")
	private WebElement coupon_CrossIcon;

	public void click_On_Coupon_CrossIcon() {
		coupon_CrossIcon.click();
		andrdCmnUtil.implicit_Wait();

	}

}
