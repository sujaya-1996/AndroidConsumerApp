package app.appium.GenericLibrary;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverIgnit 
{

	public static AndroidDriver driver;

	
	public void appLaunch() throws MalformedURLException, InterruptedException 
	{

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("noReset", false);
		//caps.setCapability("autoGrantPermissions", true);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 4A");
		caps.setCapability(MobileCapabilityType.UDID, "5da15a77d140");
		
		//caps.setCapability("autoDismissAlerts", true);
		//caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);
		caps.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
		caps.setCapability(MobileCapabilityType.APP,
				"D:\\SampleProject\\consumerapp\\src\\main\\java\\APK\\Nhance_B2C-5.21.1v.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		ScreenOrientation size = driver.getOrientation();
		System.out.println("Size of App is : " + size);
		Thread.sleep(10000);
	}


}
