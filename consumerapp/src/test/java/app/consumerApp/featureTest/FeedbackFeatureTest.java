package app.consumerApp.featureTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.FeedbackImplementation;

public class FeedbackFeatureTest extends DriverIgnit{
	
	
	FeedbackImplementation feedbackimpl = new FeedbackImplementation();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	
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
	public void beforeMethod() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		feedbackimpl.setUpAllVariable();
	}

	
	@Test (priority =1,description= "To check the UI and functionality of Feedback module.")
	public void Test_Verify_Functionality() throws InterruptedException
	{
		feedbackimpl.verify_Functionality();
	}
	
	
    @AfterClass(alwaysRun=true)
    public void Test_After_Test () throws InterruptedException
    {
    	businesscls.LogOut();
    }
}
