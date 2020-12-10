package app.consumerApp.featureTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.LoyaltyAfterAddProductImplementation;

public class LoyaltyAfterAddProductFeatureTest extends DriverIgnit{
	
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	LoyaltyAfterAddProductImplementation loyaltyafteraddproductimpl = new LoyaltyAfterAddProductImplementation();

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
		loyaltyafteraddproductimpl.setupVariables();

	}
	
	@Test(priority = 1, description = "To check the UI and Functionality of summary screen after add product execution completed")
	public void Test_Verify_UI_And_Functionalities_After_AddProduct()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		loyaltyafteraddproductimpl.verify_UI_And_Functionalities_After_AddProduct();

	}

}
