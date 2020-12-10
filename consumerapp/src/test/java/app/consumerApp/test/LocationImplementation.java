package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.LocationPageFactory;

public class LocationImplementation extends DriverIgnit {

	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	CommonElementPage cmnelementpage;
	LocationPageFactory locationspage;
	ExcelLibrary excelLib;
	String location_Address;
	String location_Distance;

	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		locationspage = new LocationPageFactory(driver);
		excelLib = new ExcelLibrary();
		location_Address = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOCATIONS_TESTDATA_SHEETNAME, 1, 1);
		location_Distance = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOCATIONS_TESTDATA_SHEETNAME, 2, 1);

	}

	public void verify_Locations_UI_Functionality() throws InterruptedException {
		cmnelementpage.click_On_dk_Image_On_GridView();
//		//WebElement panel = driver.findElement(By.xpath("//android.widget.TextView[@text='SERVICE REQUEST']"));
//		WebElement panel = driver.findElement(By.id("dyna_menu_icon"));
		//andrdCmnUtil.scrollHorizontal(panel, driver);
		locationspage.click_On_Location_Module_On_MobileAppMenu();
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		Thread.sleep(8000);

		// To assert the tool-bar title of Notes screen
		String buy_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "LOCATION";
		String actual_Result_ToolbarTitle = buy_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("Locations toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To check the location emoji is showing or not!!
		boolean value_For_Location_Emoji = locationspage.read_From_Value_For_Location_Emoji();
		if (value_For_Location_Emoji == true) {
			System.out.println("Location emoji is showing:" + value_For_Location_Emoji);

			// To check the distance emoji is showing or not!!
			boolean value_For_Distnace_Emoji = locationspage.read_From_Value_For_Distnace_Emoji();
			if (value_For_Distnace_Emoji == true) {
				System.out.println("Distance emoji is showing:" + value_For_Distnace_Emoji);

				// To assert the address from the card
				String value_From_Address_On_The_Card = locationspage.read_Value_From_Address_On_The_Card();
				String expected_Result1 = location_Address;
				String actual_Result1 = value_From_Address_On_The_Card;
				Assert.assertEquals(actual_Result1, expected_Result1);
				System.out.println("Location address got verified successfully:" + actual_Result1);
				andrdCmnUtil.implicit_Wait();

				// To assert the distance on the card
				String value_From_Distance_On_The_Card = locationspage.read_Value_From_Distance_On_The_Card();
				String expected_Result2 = location_Distance;
				String actual_Result2 = value_From_Distance_On_The_Card;
				Assert.assertEquals(actual_Result2, expected_Result2);
				System.out.println("Location distance got verified successfully:" + actual_Result2);
				andrdCmnUtil.implicit_Wait();

				// To click on the my location button
				locationspage.click_On_MyLocation_Button();
				Thread.sleep(4000);

				// To click on the address card, which will navigate to google maps.
				locationspage.click_On_Address_Card();
				Thread.sleep(4000);

				System.out.println("Screen got navigated to google maps successfully.");
				Thread.sleep(10000);

				andrdCmnUtil.Click_DeviceBackButton();
				
				// To assert the address from the card
				String value_From_Address_On_The_Card1 = locationspage.read_Value_From_Address_On_The_Card();
				String expected_Result4 = location_Address;
				String actual_Result4 = value_From_Address_On_The_Card1;
				Assert.assertEquals(actual_Result4, expected_Result4);
				System.out.println("Location adress address got verified successfully:, after clicking on the back button on"
						+ "google maps. Screen navigation working properly.:" + actual_Result4);
				andrdCmnUtil.implicit_Wait();

				// To assert the distance on the card
				String value_From_Distance_On_The_Card1 = locationspage.read_Value_From_Distance_On_The_Card();
				String expected_Result3 = location_Distance;
				String actual_Result3 = value_From_Distance_On_The_Card1;
				Assert.assertEquals(actual_Result3, expected_Result3);
				System.out.println("Location distance got verified successfully, after clicking on the back button on"
						+ "google maps. Screen navigation working properly.:" + actual_Result3);
				andrdCmnUtil.implicit_Wait();
				
				andrdCmnUtil.Click_DeviceBackButton();

			} else {
				System.out.println("Distance emoji is not showing." + value_For_Distnace_Emoji);
			}

		} else {
			System.out.println("Location emoji is not showing." + value_For_Location_Emoji);
		}

	}

}
