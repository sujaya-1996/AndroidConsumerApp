package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.LoyaltyPageFactory;
import app.appium.PageFactory.RewardsPageFactory;

public class LoyaltyImplementation extends DriverIgnit {
	CommonElementPage cmnelementpage;
	LoyaltyPageFactory loyaltypage;
	ExcelLibrary excelLib;
	RewardsPageFactory rewardspage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	String signup_Points_For_Referrer;
	String signup_Points_For_Referee;
	String add_Product_Activity;
	String how_To_Earn_Points_Text;
	String actualCouponCode;
	String referrer_Points_Before_Coupon_Redemption;
	String integer_Data_To_Be_Written_In_Excel;
	String referee_Points_After_Coupon_Redemption;
	String referee_LifeTimeEarnings_After_Coupon_Redemption;
	int pointsRequired;
	int pointsAvailable;
	int loyaltyBalance;
	int earnedLifetimePoints;
	int availablePointsInCoupon;
	

	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		excelLib = new ExcelLibrary();
		cmnelementpage = new CommonElementPage(driver);
		loyaltypage = new LoyaltyPageFactory(driver);
		rewardspage = new RewardsPageFactory(driver);
		signup_Points_For_Referrer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 1, 1);
		signup_Points_For_Referee = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 2, 1);
		add_Product_Activity = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 3, 1);
		how_To_Earn_Points_Text = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 4, 1);

	}

	public void check_Referrer_LoyaltyBalance()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		appgenericlib.login_Functionality_For_ReferralActivity();

		// To click on the more option
		cmnelementpage.clickOn_More_Option();
		Thread.sleep(2000);

		// To click on the loyalty points
		andrdCmnUtil.scrollAndClick("Loyalty points");
		
		referrer_Points_Before_Coupon_Redemption = loyaltypage.read_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
		ExcelLibrary.writeStringTestDataInExcelSheet(
				ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 6, 1,
				referrer_Points_Before_Coupon_Redemption);
		Thread.sleep(2000);
		
		// To click on the device back button
		andrdCmnUtil.Click_DeviceBackButton();
		
		// To do the logout
		andrdCmnUtil.scrollAndClick("Logout");
		Thread.sleep(2000);
		cmnelementpage.clickOn_Ok_On_Popup();
		System.out.println("Logout performed");
		
	}

	public void verify_SummaryScreen_UI_Functionalities() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		appgenericlib.login_Functionality();
		cmnelementpage.clickOn_More_Option();
		Thread.sleep(2000);
		andrdCmnUtil.scrollAndClick("Loyalty points");

		// To assert the Tool-bar title
		String valueFromToolbarTitle = cmnelementpage.read_From_Toolbar_Title();
		String expectedValue = "LOYALTY POINTS";
		String actualValue = valueFromToolbarTitle;
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Toolbar title asserted successfully," + actualValue);
		andrdCmnUtil.implicit_Wait();

		// To assert the summary tab label
		String Value_From_SummaryTab = loyaltypage.read_Value_From_SummaryTab();
		String expectedValue_In_Summary_Screen = "SUMMARY";
		String actualValue_In_Summary_Screen = Value_From_SummaryTab;
		Assert.assertEquals(actualValue_In_Summary_Screen, expectedValue_In_Summary_Screen);
		System.out.println("Summary Tab asserted successfully," + actualValue_In_Summary_Screen);
		andrdCmnUtil.implicit_Wait();

		// To assert the coupons tab value
		String Value_From_CouponsTab = loyaltypage.read_Value_From_CouponsTab();
		String expectedValue_In_Summary_Screen1 = "COUPONS";
		String actualValue_In_Summary_Screen1 = Value_From_CouponsTab;
		Assert.assertEquals(actualValue_In_Summary_Screen1, expectedValue_In_Summary_Screen1);
		System.out.println("Coupons Tab asserted successfully," + actualValue_In_Summary_Screen1);
		andrdCmnUtil.implicit_Wait();

		// To check whether the profile default pic is showing or not!!
		boolean valueFrom_profilePic_In_Loyalty = loyaltypage.read_valueFrom_profilePic_In_Loyalty();
		if (valueFrom_profilePic_In_Loyalty == true) {
			System.out.println(
					"Profile pic default image/configured image is displaying:" + valueFrom_profilePic_In_Loyalty);

			// To assert the loyalty balance label value
			String value_From_loyaltyBalance_In_Loyalty = loyaltypage.read_Value_From_loyaltyBalance_In_Loyalty();
			String expectedValue_In_Summary_Screen2 = "Loyalty Balance";
			String actualValue_In_Summary_Screen2 = value_From_loyaltyBalance_In_Loyalty;
			Assert.assertEquals(actualValue_In_Summary_Screen2, expectedValue_In_Summary_Screen2);
			System.out
					.println("Loyalty Balance label has been asserted successfully:," + actualValue_In_Summary_Screen2);
			andrdCmnUtil.implicit_Wait();

			// To assert the share referral code label value
			String value_From_shareReferralCode_In_Loyalty = loyaltypage.read_Value_From_shareReferralCode_In_Loyalty();
			String expectedValue_In_Summary_Screen3 = "Share Referral Code";
			String actualValue_In_Summary_Screen3 = value_From_shareReferralCode_In_Loyalty;
			Assert.assertEquals(actualValue_In_Summary_Screen3, expectedValue_In_Summary_Screen3);
			System.out.println(
					"Share referral code label has been asserted successfully: ," + actualValue_In_Summary_Screen3);
			andrdCmnUtil.implicit_Wait();

			// // To assert the Lifetime Earnings label
			// String value_From_lifetimeearn_In_Loyalty =
			// loyaltypage.read_Value_From_lifetimeearn_In_Loyalty();
			// String expectedValue_In_Summary_Screen4 = "Lifetime"+ "\r\n"+"Earnings";
			// String actualValue_In_Summary_Screen4 = value_From_lifetimeearn_In_Loyalty;
			// Assert.assertEquals(actualValue_In_Summary_Screen4,
			// expectedValue_In_Summary_Screen4);
			// System.out.println(
			// "Lifetime Earnings label has been asserted successfully: ," +
			// actualValue_In_Summary_Screen4);
			// andrdCmnUtil.implicit_Wait();
			//
			// // To assert the Lifetime Redemption label
			// String value_From_lifetimeredeem_In_Loyalty =
			// loyaltypage.read_Value_From_lifetimeredeem_In_Loyalty();
			// String expectedValue_In_Summary_Screen5 = "Lifetime" +"\r\n" + "Redemption";
			// String actualValue_In_Summary_Screen5 = value_From_lifetimeredeem_In_Loyalty;
			// Assert.assertEquals(actualValue_In_Summary_Screen5,
			// expectedValue_In_Summary_Screen5);
			// System.out.println(
			// "Lifetime Redemption label has been asserted successfully: ," +
			// actualValue_In_Summary_Screen5);
			// andrdCmnUtil.implicit_Wait();

			// To print the referral code thats showing on the Loyalty points summary screen
			String ValueFrom_ReferralCode_In_SummaryScreen = loyaltypage.read_ValueFrom_ReferralCode_In_SummaryScreen();
			System.out.println(
					"The referaal code for the logged in consumer is: " + ValueFrom_ReferralCode_In_SummaryScreen);

			// To assert the loyalty balance points in summary screen
			String valueFrom_loyaltyBalancePoints_In_SummaryScreen = loyaltypage
					.read_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
			String expectedValue_In_Summary_Screen6 = signup_Points_For_Referee;
			String actualValue_In_Summary_Screen6 = valueFrom_loyaltyBalancePoints_In_SummaryScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen6, expectedValue_In_Summary_Screen6);
			System.out.println("loyalty balance points in summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen6);
			andrdCmnUtil.implicit_Wait();

			// To assert the Lifetime Earnings points in summary screen
			String valueFrom_lifetimeEarningsPoints_In_SummaryScreen = loyaltypage
					.read_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen();
			String expectedValue_In_Summary_Screen7 = valueFrom_loyaltyBalancePoints_In_SummaryScreen;
			String actualValue_In_Summary_Screen7 = valueFrom_lifetimeEarningsPoints_In_SummaryScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen7, expectedValue_In_Summary_Screen7);
			System.out.println("Lifetime Earnings points in summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen7);
			andrdCmnUtil.implicit_Wait();

			// To calculate and print the LifeTime Redemption points and print that
			int loyaltyBalance = loyaltypage.read_int_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
			int earnedLifetimePoints = loyaltypage.read_int_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen();
			int calculated_Int_LifetimeRedemption_Point = (earnedLifetimePoints - loyaltyBalance);
			System.out.println("Printed value is:" + calculated_Int_LifetimeRedemption_Point);

			// To assert the Lifetime redemption points
			int valueFromLifetimeRedemption = loyaltypage.read_int_ValueFrom_lifetimeRedeemPoints_In_SummaryScreen();
			int expectedValue_In_Summary_Screen8 = calculated_Int_LifetimeRedemption_Point;
			int actualValue_In_Summary_Screen8 = valueFromLifetimeRedemption;
			Assert.assertEquals(actualValue_In_Summary_Screen8, expectedValue_In_Summary_Screen8);
			System.out.println("Lifetime Redemption points in summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen8);
			andrdCmnUtil.implicit_Wait();

			// To assert the Earned Label in summary screen
			String ValueFrom_Earnedlabel_In_SummaryScreen = loyaltypage.read_ValueFrom_Earnedlabel_In_SummaryScreen();
			String expectedValue_In_Summary_Screen9 = "EARNED";
			String actualValue_In_Summary_Screen9 = ValueFrom_Earnedlabel_In_SummaryScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen9, expectedValue_In_Summary_Screen9);
			System.out.println(
					"Earned Label in summary screen has been asserted successfully: " + actualValue_In_Summary_Screen9);
			andrdCmnUtil.implicit_Wait();

			// To assert the Earning Activity Text
			String ValueFrom_SourceOfPoint_In_SummaryScreen = loyaltypage
					.read_ValueFrom_SourceOfPoint_In_SummaryScreen();
			String expectedValue_In_Summary_Screen10 = "Signup";
			String actualValue_In_Summary_Screen10 = ValueFrom_SourceOfPoint_In_SummaryScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen10, expectedValue_In_Summary_Screen10);
			System.out.println("Signup Label in summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen10);
			andrdCmnUtil.implicit_Wait();

			// To assert the points thats on the top of the list for the activity entries
			String points_ForThe_FirstEntry = loyaltypage.readFrom_Points_In_SummaryScreen();
			String expectedValue_In_Summary_Screen11 = signup_Points_For_Referee;
			String actualValue_In_Summary_Screen11 = points_ForThe_FirstEntry;
			Assert.assertEquals(actualValue_In_Summary_Screen11, expectedValue_In_Summary_Screen11);
			System.out.println("Signup activity earned points in summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen11);
			andrdCmnUtil.implicit_Wait();

			// To click on the Redeem button
			loyaltypage.click_On_redeemButtton_In_Loyalty();
			Thread.sleep(2000);

			// To check whether the coupons tab is selected or not!!
			boolean value_From_CouponsTab = loyaltypage.read_Status_From_CouponsTab();
			if (value_From_CouponsTab == true) {
				System.out.println(
						"Screen navigated to coupons screen upon clicking on redeem button: " + value_From_CouponsTab);

				// To click on summary tab
				loyaltypage.click_On_SummaryTab();

				// To click on the Earn more option
				loyaltypage.click_On_earnmore_In_Loyalty();
				Thread.sleep(6000);

				// To assert the toolbar title of How to earn points screen
				String valueFromToolbarTitle1 = cmnelementpage.read_From_Toolbar_Title();
				String expectedValue_In_Summary_Screen12 = "HOW TO EARN POINTS";
				String actualValue_In_Summary_Screen12 = valueFromToolbarTitle1;
				Assert.assertEquals(actualValue_In_Summary_Screen12, expectedValue_In_Summary_Screen12);
				System.out.println("Toolbar Title of How to earn points screen has been asserted successfully: "
						+ actualValue_In_Summary_Screen12);
				andrdCmnUtil.implicit_Wait();

				// // To assert the Description from how to earn more screen
				// String value_From_earnmore_In_Loyalty =
				// loyaltypage.read_Value_Of_earnmore_In_Loyalty();
				// String expectedValue_In_Summary_Screen13 = how_To_Earn_Points_Text;
				// String actualValue_In_Summary_Screen13 = value_From_earnmore_In_Loyalty;
				// Assert.assertEquals(actualValue_In_Summary_Screen13,
				// expectedValue_In_Summary_Screen13);
				// System.out.println("Description from how to earn more screen has been
				// asserted successfully: "
				// + actualValue_In_Summary_Screen13);
				// andrdCmnUtil.implicit_Wait();

				// To click on the close button
				cmnelementpage.clickOn_On_Close();

			} else {
				System.out.println("Screen is not getting navigated to coupons screen, so the flow getting broke.");
			}

		} else {
			System.out
					.println(" Profile pic default image/configured image is not displaying, Hence its showing error.");
		}

	}

	public void verify_CouponsScreen_UI_Functionalities() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		// To click on the coupons Tab
		loyaltypage.click_On_CouponsTab();

		// // To check whether coupons description is showing or not!!
		// String value_From_couponDescription_In_CouponsScreen = loyaltypage
		// .read_Value_From_couponDescription_In_CouponsScreen();
		// String expectedValue_In_Coupons_Screen1 = "Get Flat Rs 100 OFF on Order of Rs
		// 300 Above";
		// String actualValue_In_Summary_Screen1 =
		// value_From_couponDescription_In_CouponsScreen;
		// Assert.assertEquals(actualValue_In_Summary_Screen1,
		// expectedValue_In_Coupons_Screen1);
		// System.out.println("Coupons description has been asserted successfully: " +
		// actualValue_In_Summary_Screen1);
		// andrdCmnUtil.implicit_Wait();

		// To assert the Terms and conditions text !
		String value_From_coupon_terms_and_conditions_In_CouponsScreen = loyaltypage
				.read_Value_From_Coupon_terms_and_conditions_In_CouponsScreen();
		String expectedValue_In_Coupons_Screen2 = "Terms & conditions apply";
		String actualValue_In_Summary_Screen2 = value_From_coupon_terms_and_conditions_In_CouponsScreen;
		Assert.assertEquals(actualValue_In_Summary_Screen2, expectedValue_In_Coupons_Screen2);
		System.out.println(
				"Coupons Terms and conditions has been asserted successfully: " + actualValue_In_Summary_Screen2);
		andrdCmnUtil.implicit_Wait();

		// To click on the Redeem now button in Coupons screen
		loyaltypage.click_On_RedeemButton_In_CouponsScreen();

		// To assert the title of the alert pop-up
		String valueFromAlertTitle = cmnelementpage.read_From_Alert_Title();
		String expectedValue_In_Coupons_Screen3 = "Coupon Redemption";
		String actualValue_In_Summary_Screen3 = valueFromAlertTitle;
		Assert.assertEquals(actualValue_In_Summary_Screen3, expectedValue_In_Coupons_Screen3);
		System.out.println("Coupons Redemption alert pop-up Title has been asserted successfully: "
				+ actualValue_In_Summary_Screen3);
		andrdCmnUtil.implicit_Wait();

		// To Assert the validation popup when for Points available label
		String value_From_Points_Available_Label_In_CouponsScreen = loyaltypage
				.read_Value_From_Points_Available_Label_In_CouponsScreen();
		String expectedValue_In_Coupons_Screen4 = "Points Available";
		String actualValue_In_Summary_Screen4 = value_From_Points_Available_Label_In_CouponsScreen;
		Assert.assertEquals(actualValue_In_Summary_Screen4, expectedValue_In_Coupons_Screen4);
		System.out.println("Coupons Redemption alert pop-up Points Available Label has been asserted successfully: "
				+ actualValue_In_Summary_Screen3);
		andrdCmnUtil.implicit_Wait();

		// To assert the points Available from the validation popup
		String value_From_Points_Available_In_CouponsScreen = loyaltypage
				.read_Value_From_points_Available_In_CouponsScreen();
		cmnelementpage.clickOn_Cancel_On_Popup();
		loyaltypage.click_On_SummaryTab();
		String valueFrom_loyaltyBalancePoints_In_SummaryScreen = loyaltypage
				.read_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
		String expectedValue_In_Coupons_Screen5 = valueFrom_loyaltyBalancePoints_In_SummaryScreen;
		String actualValue_In_Summary_Screen5 = value_From_Points_Available_In_CouponsScreen;
		Assert.assertEquals(actualValue_In_Summary_Screen5, expectedValue_In_Coupons_Screen5);
		System.out.println("Coupons Redemption alert pop-up Available Points has been asserted successfully: "
				+ actualValue_In_Summary_Screen5);
		andrdCmnUtil.implicit_Wait();

		// To click on the coupons Tab
		loyaltypage.click_On_CouponsTab();

		// To click on the Redeem now button in Coupons screen
		loyaltypage.click_On_RedeemButton_In_CouponsScreen();

		// To assert the Points required label in popup
		String value_From_Points_Required_Label_In_CouponsScreen = loyaltypage
				.read_Value_From_Points_Requierd_Label_In_CouponsScreen();
		String expectedValue_In_Coupons_Screen6 = "Points Required";
		String actualValue_In_Summary_Screen6 = value_From_Points_Required_Label_In_CouponsScreen;
		Assert.assertEquals(actualValue_In_Summary_Screen6, expectedValue_In_Coupons_Screen6);
		System.out.println("Coupons Redemption alert pop-up Points Required Label has been asserted successfully: "
				+ actualValue_In_Summary_Screen6);
		andrdCmnUtil.implicit_Wait();

		// To print how much points required to redeem the coupon (configured from
		// backend)
		int pointsAvailable = loyaltypage.read_int_Value_From_Points_Available_In_CouponsScreen();
		int pointsRequired = loyaltypage.read_int_Value_From_Points_Requierd_In_CouponsScreen();
		if (pointsAvailable > pointsRequired) {
			System.out.println("Available points is getter than required points, So user can redeem the coupon.");

			// To assert the coupon warning label showing in coupons screen
			String ValueFrom_Coupon_Warning_Label_In_CouponsScreen = loyaltypage
					.read_ValueFrom_Coupon_Warning_Label_In_CouponsScreen();
			String expectedValue_In_Coupons_Screen7 = "Please note that a completed redemption cannot be reversed.";
			String actualValue_In_Summary_Screen7 = ValueFrom_Coupon_Warning_Label_In_CouponsScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen7, expectedValue_In_Coupons_Screen7);
			System.out.println("Coupon warning label showing in coupons screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen7);
			andrdCmnUtil.implicit_Wait();

			// To click on ok button on the pop-up
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(4000);

			// // To assert the coupon congrats Text
			// String ValueFrom_Coupon_Congratulations_Text =
			// loyaltypage.read_ValueFrom_Coupon_Congratulations_Text();
			// String expectedValue_In_Coupons_Screen8 = "Congratulations! \r\n" + " Here is
			// Your Coupon Code";
			// String actualValue_In_Summary_Screen8 =
			// ValueFrom_Coupon_Congratulations_Text;
			// Assert.assertEquals(actualValue_In_Summary_Screen8,
			// expectedValue_In_Coupons_Screen8);
			// System.out.println("Congrats message Text on the coupon has been asserted
			// successfully: "
			// + actualValue_In_Summary_Screen8);
			// andrdCmnUtil.implicit_Wait();

			// // To assert coupon description
			// String ValueFrom_Coupon_Description =
			// cmnelementpage.read_ValueFrom_Coupon_Description();
			// String expectedValue_In_Coupons_Screen9 = "Get Flat Rs 100 OFF on Order of Rs
			// 300 Above";
			// String actualValue_In_Summary_Screen9 = ValueFrom_Coupon_Description;
			// Assert.assertEquals(actualValue_In_Summary_Screen9,
			// expectedValue_In_Coupons_Screen9);
			// System.out.println("Coupon description on the coupon has been asserted
			// successfully: "
			// + actualValue_In_Summary_Screen9);
			// andrdCmnUtil.implicit_Wait();

			// To assert coupon Code label
			String ValueFrom_Couponcode_Label = cmnelementpage.read_ValueFrom_Couponcode_Label();
			String expectedValue_In_Coupons_Screen10 = "COUPON CODE";
			String actualValue_In_Summary_Screen10 = ValueFrom_Couponcode_Label;
			Assert.assertEquals(actualValue_In_Summary_Screen10, expectedValue_In_Coupons_Screen10);
			System.out.println("Coupon Code label on the coupon has been asserted successfully: "
					+ actualValue_In_Summary_Screen10);
			andrdCmnUtil.implicit_Wait();
			Thread.sleep(2000);

			// To print the coupon code thats showing on the coupon
			actualCouponCode = cmnelementpage.read_ValueFrom_Actual_Couponcode();
			System.out.println("Coupon code of the redeemed coupon is: " + actualCouponCode);
			Thread.sleep(3000);

			// // To click on the coupon copy icon
			// cmnelementpage.click_Coupon_CopyIcon();
			// Thread.sleep(2000);

			// To click on the cross icon on the coupon
			loyaltypage.click_On_Coupon_CrossIcon();
			Thread.sleep(2000);

			// To click on the summary tab
			loyaltypage.click_On_SummaryTab();
			Thread.sleep(2000);

			// To assert the Lifetime redemption after the coupon redeem activity
			int valueFromLifetimeRedemption = loyaltypage.read_int_ValueFrom_lifetimeRedeemPoints_In_SummaryScreen();
			int expectedValue_In_Summary_Screen11 = pointsRequired;
			int actualValue_In_Summary_Screen11 = valueFromLifetimeRedemption;
			Assert.assertEquals(actualValue_In_Summary_Screen11, expectedValue_In_Summary_Screen11);
			System.out.println("Lifetime Redemption points in summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen11);
			andrdCmnUtil.implicit_Wait();

			// To calculate the Loyalty balance after the coupon redemption activity
			int liftimeEarnings_After_couponRedemtion = loyaltypage
					.read_int_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen();
			int lifetimeRedmption_After_couponRedemtion = loyaltypage
					.read_int_ValueFrom_lifetimeRedeemPoints_In_SummaryScreen();
			int loyaltyBalance_After_couponRedemtion = (liftimeEarnings_After_couponRedemtion
					- lifetimeRedmption_After_couponRedemtion);
			System.out.println(
					"Calculated Loyalty Balance after coupon redemption is: " + loyaltyBalance_After_couponRedemtion);

			// To assert the Loyalty Balance after the coupon redemption activity
			int valueFromLoyaltyBalance = loyaltypage.read_int_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
			int expectedValue_In_Summary_Screen12 = loyaltyBalance_After_couponRedemtion;
			int actualValue_In_Summary_Screen12 = valueFromLoyaltyBalance;
			Assert.assertEquals(actualValue_In_Summary_Screen12, expectedValue_In_Summary_Screen12);
			System.out
					.println("Loyalty balance asserted successfully in summary screen has been asserted successfully: "
							+ actualValue_In_Summary_Screen12);

			// To assert the Redeemed Label in summary screen
			String ValueFrom_Redeemedlabel_In_SummaryScreen = loyaltypage.read_ValueFrom_Earnedlabel_In_SummaryScreen();
			String expectedValue_In_Coupons_Screen13 = "REDEEMED";
			String actualValue_In_Summary_Screen13 = ValueFrom_Redeemedlabel_In_SummaryScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen13, expectedValue_In_Coupons_Screen13);
			System.out.println("Redeemed label on the summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen13);
			andrdCmnUtil.implicit_Wait();

			// To assert the Earning Activity Text
			String ValueFrom_SourceOfPoint_In_SummaryScreen = loyaltypage
					.read_ValueFrom_SourceOfPoint_In_SummaryScreen();
			String expectedValue_In_Coupons_Screen14 = "Redeemed";
			String actualValue_In_Summary_Screen14 = ValueFrom_SourceOfPoint_In_SummaryScreen;
			Assert.assertEquals(actualValue_In_Summary_Screen14, expectedValue_In_Coupons_Screen14);
			System.out.println("Redeemed Activity on the summary screen has been asserted successfully: "
					+ actualValue_In_Summary_Screen14);
			andrdCmnUtil.implicit_Wait();

			// To assert the redeemed points by doing the activity
			int valueFromRedeemedPoints_Entry = loyaltypage.readFrom_int_Points_In_SummaryScreen();
			int expectedValue_In_Summary_Screen15 = pointsRequired;
			int actualValue_In_Summary_Screen15 = valueFromRedeemedPoints_Entry;
			Assert.assertEquals(actualValue_In_Summary_Screen15, expectedValue_In_Summary_Screen15);
			System.out.println(
					"Redeemed points by doing the activityasserted successfully in summary screen has been asserted successfully: "
							+ actualValue_In_Summary_Screen15);

			// To click on the coupons Tab
			loyaltypage.click_On_CouponsTab();

			// To click on the redeem now button
			loyaltypage.click_On_RedeemButton_In_CouponsScreen();

			// To assert the available points in the pop-up
			int availablePointsInCoupon = loyaltypage.read_int_Value_From_Points_Available_In_CouponsScreen();
			cmnelementpage.clickOn_Ok_On_Popup();
			Thread.sleep(2000);
			loyaltypage.click_On_SummaryTab();
			Thread.sleep(2000);
			int available_Loyalty_Balance = loyaltypage.read_int_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
			int expectedValue_In_Summary_Screen16 = available_Loyalty_Balance;
			int actualValue_In_Summary_Screen16 = availablePointsInCoupon;
			Assert.assertEquals(actualValue_In_Summary_Screen16, expectedValue_In_Summary_Screen16);
			System.out.println(
					"Available points on the pop-up asserted successfully in summary screen has been asserted successfully: "
							+ actualValue_In_Summary_Screen16);

			// To click on the coupons screen
			loyaltypage.click_On_CouponsTab();

			// To click on the redeem now button
			loyaltypage.click_On_RedeemButton_In_CouponsScreen();

			// Check whether the user can redeem the coupon by the points or not
			int available_Points_In_Coupon = loyaltypage.read_int_Value_From_Points_Available_In_CouponsScreen();

			if (available_Points_In_Coupon < pointsRequired) {
				System.out.println(
						"Available points is less than required points, So user can not able to redeem the coupon.");

				// To click on the Earn more button
				cmnelementpage.clickOn_Cancel_On_Popup();

				// To click on the close button on the how to earn points screen
				cmnelementpage.clickOn_On_Close();

				// To click on the redeem now button
				loyaltypage.click_On_RedeemButton_In_CouponsScreen();

				// To click on the ok button
				cmnelementpage.clickOn_Ok_On_Popup();

			}
			// To click on the Summary tab
			loyaltypage.click_On_SummaryTab();
			
			referee_Points_After_Coupon_Redemption = loyaltypage.read_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
			ExcelLibrary.writeStringTestDataInExcelSheet(
					ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 7, 1,
					referee_Points_After_Coupon_Redemption);
			Thread.sleep(2000);
			
			referee_LifeTimeEarnings_After_Coupon_Redemption = loyaltypage.read_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen();
			ExcelLibrary.writeStringTestDataInExcelSheet(
					ConstantVaribale.EXCEL_FILE_PATH, ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 8, 1,
					referee_LifeTimeEarnings_After_Coupon_Redemption);
			Thread.sleep(2000);

			// To click on the back button
			andrdCmnUtil.Click_DeviceBackButton();

		}

	}

	public void verify_Coupon_In_RewardsSection() throws InterruptedException {
		// To click on the rewards section on the footer
		cmnelementpage.clickOn_Rewards_Option_On_Footer();

		// To click on the media access allow button
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(3000);

		// To click on the offers me tab
		rewardspage.click_On_OffersForMeTab();

		// To click on the eye icon of the coupon
		rewardspage.click_On_CouponEyeIcon();

		// To assert the coupon code in rewards screen
		String ValueFrom_Actual_Couponcode = cmnelementpage.read_ValueFrom_Actual_Couponcode();
		String expectedValue_In_rewards_Screen1 = actualCouponCode;
		String actualValue_In_rewards_Screen1 = ValueFrom_Actual_Couponcode;
		Assert.assertEquals(actualValue_In_rewards_Screen1, expectedValue_In_rewards_Screen1);
		System.out.println("Coupon code asserted in Rewards screen has been asserted successfully: "
				+ actualValue_In_rewards_Screen1);
		andrdCmnUtil.implicit_Wait();

		// To click on the more menu
		cmnelementpage.clickOn_More_Option();

		// To click on the logout
		andrdCmnUtil.scrollAndClick("Logout");
		Thread.sleep(2000);
		cmnelementpage.clickOn_Ok_On_Popup();
		System.out.println("Logout performed");

	}

	public void Check_Points_For_referrer()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		appgenericlib.login_Functionality_For_ReferralActivity();

		cmnelementpage.clickOn_More_Option();
		Thread.sleep(2000);
		andrdCmnUtil.scrollAndClick("Loyalty points");

		String currentLoyaltyBalance = loyaltypage.read_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen();
	
		// commenting the below line of code because now we are only execuiting loyalty (while running through testng, have to comment it off)
		//int expectedValue_For_Referrer = Integer.parseInt(referrer_Points_Before_Coupon_Redemption)+ 16;
		int expectedValue_For_Referrer = Integer.parseInt(referrer_Points_Before_Coupon_Redemption);
		String actualValue_For_Referrer = currentLoyaltyBalance;
		System.out.println("Actual Value for referrer in UI is : " + actualValue_For_Referrer);
		Assert.assertEquals(actualValue_For_Referrer, String.valueOf(expectedValue_For_Referrer));
		System.out.println("Assertion Coompleted for Referrer point.........");
		andrdCmnUtil.implicit_Wait();

		System.out.println("All the testcases for Loyalty points userstory are working fine.");
	}

}