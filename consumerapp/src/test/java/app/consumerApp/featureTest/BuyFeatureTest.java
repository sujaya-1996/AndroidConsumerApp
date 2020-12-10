package app.consumerApp.featureTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.BuyImplementation;

public class BuyFeatureTest extends DriverIgnit{
	
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	BuyImplementation buyimpl = new BuyImplementation();
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		appLaunch();
		businesscls.enable_Toggle();
		appgenericlib = new AppGenericLibrary();
		
		
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		appgenericlib = new AppGenericLibrary();
		appgenericlib.login_Functionality();
		
		
	}
	
	@BeforeMethod
	public void Test_SetupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.setupVariables();

	}
	
	@Test(priority = 1, description = "To test the UI of buy page")
	public void Test_Verify_Buy_UI()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_Buy_UI();

	}
	
	@Test(priority = 2, description = "To test the functionality of Accessory buy First screen")
	public void Test_Verify_AccessoryBuy_FirstScreen_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_AccessoryBuy_FirstScreen_Functionality();

	}
	
	@Test(priority = 3, description = "To test the functionality of Accessory buy Confirm order screen")
	public void Test_Verify_AccessoryBuy_ConfirmOrderScreen_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_AccessoryBuy_ConfirmOrderScreen_Functionality();

	}
	
	@Test(priority = 4, description = "To test the functionality of Accessory buy Payment options screen")
	public void Test_Verify_AccessoryBuy_PaymentOptionsScreen_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_AccessoryBuy_PaymentOptionsScreen_Functionality();

	}
	
	@Test(priority = 5, description = "To test the functionality of Accessory buy Purchase Confirmation screen")
	public void Test_Verify_AccessoryBuy_PurchaseConfirmationScreen_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_AccessoryBuy_PurchaseConfirmationScreen_Functionality();

	}
	
	@Test(priority = 6, description = "To test the Insurance buy UI")
	public void Test_Verify_InsuranceBuy_UI()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_InsuranceBuy_UI();

	}
	
	@Test(priority = 7, description = "To test the functionality of Insurance Buy")
	public void Test_Verify_InsuranceBuy_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_InsuranceBuy_Functionality();

	}
	
	@Test(priority = 8, description = "To test the functionality of Insurance Buy purchase confirmation screen")
	public void Test_Verify_InsuranceBuy_PurchaseConfirmationScreen_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		buyimpl.verify_InsuranceBuy_PurchaseConfirmationScreen_Functionality();

	}
	
	
	
}
