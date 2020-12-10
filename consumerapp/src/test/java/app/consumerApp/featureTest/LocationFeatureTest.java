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
import app.consumerApp.test.LocationImplementation;

public class LocationFeatureTest extends DriverIgnit {

	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	LocationImplementation locationsimpl = new LocationImplementation();

	@BeforeTest
	public void beforeTest()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		appLaunch();
		businesscls.enable_Toggle();
		appgenericlib = new AppGenericLibrary();

	}

	@BeforeClass
	public void beforeClass()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		appgenericlib = new AppGenericLibrary();
		appgenericlib.login_Functionality();

	}

	@BeforeMethod
	public void Test_SetupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		locationsimpl.setupVariables();

	}

	@Test(priority = 1, description = "To test the UI and functionality of locations page")
	public void Test_Verify_Locations_UI_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		locationsimpl.verify_Locations_UI_Functionality();

	}
}
