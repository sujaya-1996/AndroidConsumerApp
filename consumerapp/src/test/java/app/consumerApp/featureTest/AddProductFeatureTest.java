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
import app.consumerApp.test.AddProductImplementation;

public class AddProductFeatureTest extends DriverIgnit {

	BusinessClass businesscls = new BusinessClass();
	AddProductImplementation addproductimpl = new AddProductImplementation();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();

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
		addproductimpl.setupVariables();

	}

	@Test(priority = 1, description = "To check the UI and functionality of Add product Till supercategory selection")
	public void Test_Verify_UI_And_Functionaity_For_AddProduct_Till_SupercategorySelection()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		addproductimpl.verify_UI_And_Functionaity_For_AddProduct_Till_SupercategorySelection();

	}
	
	@Test(priority = 2, description = "To check the UI and functionality of AddProductThroughScanInvoice")
	public void Test_Verify_UI_And_Functionaity_AddProductThroughScanInvoice()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		addproductimpl.verify_UI_And_Functionaity_AddProductThroughScanInvoice();

	}
	
	@Test(priority = 3, description = "To check the UI and functionality of SelectSubcategoryScreen")
	public void Test_Verify_UI_Functionality_For_SelectSubcategoryScreen()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		addproductimpl.verify_UI_Functionality_For_SelectSubcategoryScreen();

	}
	
	@Test(priority = 4, description = "To check the UI and functionality of SelectBrandScreen")
	public void Test_Verify_UI_Functionality_For_SelectBrandScreen()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		addproductimpl.verify_UI_Functionality_For_SelectBrandScreen();

	}
	
	@Test(priority = 5, description = "To check the UI and functionality of ModelNumberScreen")
	public void Test_Verify_UI_Functionality_For_ModelNumberScreen()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		addproductimpl.verify_UI_Functionality_For_ModelNumberScreen();

	}

}
