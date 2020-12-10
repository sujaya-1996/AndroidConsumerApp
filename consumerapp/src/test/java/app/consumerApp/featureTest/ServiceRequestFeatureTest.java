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
import app.consumerApp.test.ServiceRequestImplementation;

public class ServiceRequestFeatureTest extends DriverIgnit
{
	
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	ServiceRequestImplementation srimpl = new ServiceRequestImplementation();
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
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		srimpl.setUpAllVariable();
	}

	@Test (priority =1,description= "To check the UI of SR screen when there is no SR details")
	public void Test_verify_UI () throws InterruptedException
	{
		srimpl.verify_UI();
	}
	
	@Test (priority =2,description= "To test the scenario of raising the new request with already configured primary address")
	public void Test_raiseNewRequest1 () throws InterruptedException
	{
		srimpl.raiseNewRequest1();
	}
	
	@Test (priority =3,description= "To verify the conversation screen, when the SR has already been raised")
	public void Test_verifyConversationScreen () throws InterruptedException
	{
		srimpl.verifyConversationScreen();
	}
	
	@Test (priority =4,description= "To test the scenario of creating SR by changing the address")
	public void Test_raiseNewRequest2 () throws InterruptedException
	{
		srimpl.raiseNewRequest2();
	}
	
	@Test (priority =5,description= "To test the scenario of Replying back on The SR")
	public void Test_serviecRequest_Reply () throws InterruptedException
	{
		srimpl.serviecRequest_Reply();
	}
	
	@Test (priority =6,description= "To test the attachment and schedule date&time functionality while creating the new request")
	public void Test_VerifyAttachment_And_ScheduleDateTime () throws InterruptedException
	{
		srimpl.verifyAttachment_And_ScheduleDateTime();
	}
	
    @AfterClass(alwaysRun=true)
    public void Test_After_Test () throws InterruptedException
    {
    	businesscls.LogOut();
    }
	

	

}
