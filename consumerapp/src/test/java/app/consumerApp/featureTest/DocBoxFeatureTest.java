package app.consumerApp.featureTest;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.DocBoxImplementation;


public class DocBoxFeatureTest extends DriverIgnit
{
	DocBoxImplementation dbimpl = new DocBoxImplementation();
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
		dbimpl.setUpAllVariable();
	}

	@Test (priority =1,description= "To check the UI of Docbox screen when there is no Invoice/Documents details")
	public void Test_verify_UI() throws InterruptedException
	{
		dbimpl.verify_UI();
	}
	
	@Test (priority =2,description= "To check the Add/delete/preview/share attachment functionalities")
	public void Test_add_Invoice_Document_Files() throws InterruptedException
	{
		dbimpl.add_Invoice_Document_Files();
	}
	
    @AfterClass(alwaysRun=true)
    public void Test_After_Test () throws InterruptedException
    {
    	businesscls.LogOut();
    }
	
//	@AfterSuite 
//	public void Test_LogOut() throws InterruptedException
//	{
//		dbimpl.LogOut();
//		driver.closeApp();
//	}
	
	
	


}
