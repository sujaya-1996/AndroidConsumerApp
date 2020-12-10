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
import app.consumerApp.test.ProfileImplementation;

public class ProfileFeatureTest extends DriverIgnit
{
	
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	ProfileImplementation prflimpl= new ProfileImplementation();
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
		appgenericlib.login_Functionality();
		appgenericlib = new AppGenericLibrary();
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		prflimpl.setUpAllVariable();
	}
	
	@Test (priority =1,description= "To check the UI of My profile screen when there are no details configured")
	public void Test_verify_UI () throws InterruptedException
	{
		prflimpl.verify_UI();
	}
	
	@Test (priority =2,description= "To configure the details in My profile")
	public void Test_Configure_Details () throws InterruptedException
	{
		prflimpl.configure_Details();
	}
	
	@Test (priority =3,description= "To check the configured profile data and Change mobile number flow")
	public void Test_Change_MobileNumber () throws Exception
	{
		prflimpl.change_MobileNumber();
	}
	
	/*@Test (priority =4,description= "To check the configured profile data and Change EmailID flow")
	public void Test_Change_EmaiID () throws Exception
	{
		prflimpl.change_EmaiID();
	}*/
	
	
	@AfterClass(alwaysRun=true)
    public void Test_After_Test () throws InterruptedException
    {
    	businesscls.LogOut();
    }
	
	
	
	

}
