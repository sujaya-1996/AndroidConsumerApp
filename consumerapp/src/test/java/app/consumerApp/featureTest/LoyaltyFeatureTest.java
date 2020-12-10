package app.consumerApp.featureTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.DocBoxImplementation;
import app.consumerApp.test.LoyaltyImplementation;

public class LoyaltyFeatureTest extends DriverIgnit {
	DocBoxImplementation dbimpl = new DocBoxImplementation();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	LoyaltyImplementation loyaltyimpl = new LoyaltyImplementation();

	@BeforeTest
	public void beforeTest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		appLaunch();
		businesscls.enable_Toggle();
		appgenericlib = new AppGenericLibrary();
		appgenericlib.login_Functionality();
	}

	@BeforeMethod
	public void Test_SetupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		loyaltyimpl.setupVariables();

	}

	@Test(priority = 1, description = "To check the Loyalty Balance for Referrer Before the referral code used by the referee")
	public void Test_Check_Referrer_LoyaltyBalance()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		loyaltyimpl.check_Referrer_LoyaltyBalance();

	}

	@Test(priority = 2, description = "To check the UI and functionalities of loyalty points Summary Screen")
	public void check_verify_SummaryScreen_UI_Functionalities()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		loyaltyimpl.verify_SummaryScreen_UI_Functionalities();

	}

	@Test(priority = 3, description = "To check the UI and functionalities of loyalty points Coupons Screen")
	public void check_verify_CouponsScreen_UI_Functionalities() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		loyaltyimpl.verify_CouponsScreen_UI_Functionalities();

	}

	@Test(priority = 4, description = "To check the coupon in rewards screen")
	public void check_verify_Coupon_In_RewardsSection() throws InterruptedException {
		loyaltyimpl.verify_Coupon_In_RewardsSection();

	}

	@Test(priority = 5, description = "To check the Loyalty Balance for Referrer After the referral code used by the referee")
	public void Test_Check_Points_For_referrer()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		loyaltyimpl.Check_Points_For_referrer();

	}

	@AfterTest
	public void Test_After_Test() throws InterruptedException {
		businesscls.LogOut();
	}

}
