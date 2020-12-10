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
import app.consumerApp.test.MyPaymentsImplementation;

public class MyPaymentsFeatureTest extends DriverIgnit  {

	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	MyPaymentsImplementation mypaymentimpl = new MyPaymentsImplementation();
	
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
		mypaymentimpl.setupVariables();

	}
	
	@Test(priority = 1, description = "To test the UI and functionality of payment pending screen")
	public void Test_Verify_UI_Functionality_For_PendingScreen()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		mypaymentimpl.verify_UI_Functionality_For_PendingScreen();

	}
	
	@Test(priority = 2, description = "To test the UI and functionality of payment History screen")
	public void Test_Verify_UI_Functionality_For_HistoryScreen()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		mypaymentimpl.verify_UI_Functionality_For_HistoryScreen();

	}
}
