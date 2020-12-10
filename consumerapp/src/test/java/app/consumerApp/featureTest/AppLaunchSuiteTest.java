package app.consumerApp.featureTest;

import java.net.MalformedURLException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.DriverIgnit;

public class AppLaunchSuiteTest extends DriverIgnit {
	
	BusinessClass businesscls = new BusinessClass();
	
	@BeforeSuite
	public void beforeSuite() throws MalformedURLException, InterruptedException
	{
		businesscls.appLaunch();
	}
	
//	@Test(priority=1)
//	public void executeTheBeforSuiteMethod() throws MalformedURLException, InterruptedException
//	{
//		try {
//		beforeSuite();
//		}catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
//	}

}
