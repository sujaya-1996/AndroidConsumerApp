package app.appium.GenericLibrary;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidCommonUtil extends DriverIgnit {

	// To scroll down till its finding the visible text and click on that
	public void scrollAndClick(String visibleText) {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
		implicit_Wait();
	}

	// To scroll down till its finding the resource id
	public void scrollDownTillAttribute(String elementID) {
		try {

			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(false).instance(0)).scrollIntoView(new UiSelector().resourceId(\""
							+ elementID + "\"))");
		} catch (Exception e) {
			System.out.println("Cannot scroll further");
		}
	}

	// To scroll down till its finding the visible text
	public void scrollAndClickTillVissibleText(String tillvisibleText) {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ tillvisibleText + "\").instance(0))");
		implicit_Wait();
	}

	public void deletingDataFromEditBoxUsingKeyboardKey(int n) {
		for (int i = 0; i < n; i++) {
			driver.longPressKey(new KeyEvent(AndroidKey.DEL));
		}
	}

	// To navigate back to the previous screen
	public void Click_DeviceBackButton() {
		driver.navigate().back();
		implicit_Wait();
	}

	// To get the keyboard to enter numbers
	public void Write_On_Keypad(String number) {
		driver.getKeyboard().sendKeys(number);
		implicit_Wait();
	}

	// To hide the keyboard
	public void Hide_Keyboard() {
		driver.hideKeyboard();
		implicit_Wait();

	}

	// To implement the implicit-wait
	public void implicit_Wait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	// To take the current system time
	public String systemTime() {
		String time = driver.getDeviceTime();
		return time;
	}

	// To do the horizontal scroll (can be used for mobile app menu scrolling)
	public void scrollHorizontal(WebElement el, WebDriver driver) {
		WebElement panel = el;

		Dimension dimension = panel.getSize();

		int Anchor = panel.getSize().getHeight() / 2;

		Double scrollwidthStart = dimension.getWidth() * 0.9;
		int scrollStart = scrollwidthStart.intValue();

		Double scrollwidthEnd = dimension.getWidth() * 0.7;
		int scrollEnd = scrollwidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(scrollEnd, Anchor))
				.release().perform();

	}

}