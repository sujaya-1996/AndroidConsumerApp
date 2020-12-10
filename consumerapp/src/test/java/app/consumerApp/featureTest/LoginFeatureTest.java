package app.consumerApp.featureTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.LoginFlowImplementation;

public class LoginFeatureTest extends DriverIgnit
{
	LoginFlowImplementation loginFlw = new LoginFlowImplementation();
	BusinessClass businesscls = new BusinessClass();
	//AppGenericLibrary appgenericlib = new AppGenericLibrary();
	
	@BeforeClass
	public void beforeTest() throws InterruptedException, MalformedURLException
	{
		appLaunch();
		businesscls.enable_Toggle();
		//appgenericlib = new AppGenericLibrary();
		
		
	}
	
	@BeforeMethod
	public void setup_All_Variable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		loginFlw.setUpAllVariable();
		
		
	}
	
    @Test (priority=1, description= "To check the positive flow upon doing the signup functionality")
    public void check_signupPossitiveFlow() throws InterruptedException
    {
    	loginFlw.signupPossitiveFlow();
    	
    }
    
    @Test (priority=2, description=  "To do the login flow, with the Registered mobile number and creating the password")
    public void check_login_Password_Set () throws InterruptedException 
    {
    	try{
    		businesscls.enable_Toggle();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Toggle button is not showing.");
    	
    	}
    	loginFlw.login_Password_Set();
    }
    
    @Test (priority = 3, description= "To log into the application using login using password and changing the password")
    public void check_login_Change_Password () throws InterruptedException
    {
    	businesscls.enable_Toggle();
    	loginFlw.login_Change_Passowrd();
    }
    
    @AfterClass(alwaysRun=true)
    public void Test_After_Test () throws InterruptedException
    {
    	businesscls.LogOut();
    }
    		
    
 }
