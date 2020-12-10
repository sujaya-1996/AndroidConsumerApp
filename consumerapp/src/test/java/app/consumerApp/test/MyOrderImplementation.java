package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.MyOrderPageFactory;

public class MyOrderImplementation extends DriverIgnit {

	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	ExcelLibrary excelLib;
	MyOrderPageFactory myorderspage;
	String value_From_OrderID_Of_Insurance;
	String value_From_OrderID_Of_Accessory;
	String insurance_Name;
	String insurance_Status;
	String accessory_Name;
	String accessory_Status;
	String insurance_OrderID;
	String accessory_OrderID;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		myorderspage = new MyOrderPageFactory(driver);
		excelLib = new ExcelLibrary();

		insurance_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 3, 1);
		insurance_Status = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 4, 1);
		accessory_Name = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 5, 1);
		accessory_Status = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 6, 1);

	}

	public void verify_UI()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage.clickOn_More_Option();
		try {
			andrdCmnUtil.scrollAndClick("My Orders");
		} catch (Exception e) {
			System.out.println("No Need to Scroll");
		}

		// To assert the tool-bar title of Myorders screen
		String myorders_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = "MY ORDERS";
		String actual_Result_ToolbarTitle = myorders_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("MyOrders toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To check the product image of the first item (insurance)
		boolean value_From_productImage_Of_Insurance = myorderspage.check_Value_From_productImage_Of_Insurance();
		if (value_From_productImage_Of_Insurance == true) {

			System.out.println("Its showing the Insurance image properly." + value_From_productImage_Of_Insurance);

			// To write the order id of the insurance on the excel sheet
			value_From_OrderID_Of_Insurance = myorderspage.read_value_From_OrderID_Of_Insurance();
			ExcelLibrary.writeStringTestDataInExcelSheet(ConstantVaribale.EXCEL_FILE_PATH,
					ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 1, 1, value_From_OrderID_Of_Insurance);
			Thread.sleep(2000);

			// To assert the name of the first item (insurance)
			String value_From_Name_Of_Insurance = myorderspage.read_Value_From_Name_Of_Insurance();
			String expected_Result1 = insurance_Name;
			String actual_Result1 = value_From_Name_Of_Insurance;
			Assert.assertEquals(actual_Result1, expected_Result1);
			System.out.println("Insurance name got verified successfully:" + actual_Result1);
			andrdCmnUtil.implicit_Wait();

			// To assert the order type of the first item (insurance)
			String value_From_orderType_Of_Insurance = myorderspage.read_Value_From_orderType_Of_Insurance();
			String expected_Result2 = "Insurance";
			String actual_Result2 = value_From_orderType_Of_Insurance;
			Assert.assertEquals(actual_Result2, expected_Result2);
			System.out.println("Order Type got verified successfully:" + actual_Result2);
			andrdCmnUtil.implicit_Wait();

			// To assert the order status label of the first item (insurance)
			String value_From_orderStatusLabel_Of_Insurance = myorderspage
					.read_Value_From_orderStatusLabel_Of_Insurance();
			String expected_Result3 = "Status -  ";
			String actual_Result3 = value_From_orderStatusLabel_Of_Insurance;
			Assert.assertEquals(actual_Result3, expected_Result3);
			System.out.println("Order status label got verified successfully:" + actual_Result3);
			andrdCmnUtil.implicit_Wait();

			// To assert the order status of the first item (insurance)
			String value_From_orderStatus_Of_Insurance = myorderspage.read_Value_From_orderStatus_Of_Insurance();
			String expected_Result4 = insurance_Status;
			String actual_Result4 = value_From_orderStatus_Of_Insurance;
			Assert.assertEquals(actual_Result4, expected_Result4);
			System.out.println("Order status got verified successfully:" + actual_Result4);
			andrdCmnUtil.implicit_Wait();

			// To check the product image of the second item (Accessory)
			boolean value_From_productImage_Of_Accessory = myorderspage.check_Value_From_productImage_Of_Accessory();
			if (value_From_productImage_Of_Accessory == true) {

				System.out.println("Its showing the Accessory image properly." + value_From_productImage_Of_Accessory);

				// To write the order id of the Accessory on the excel sheet
				value_From_OrderID_Of_Accessory = myorderspage.read_value_From_OrderID_Of_Accessory();
				ExcelLibrary.writeStringTestDataInExcelSheet(ConstantVaribale.EXCEL_FILE_PATH,
						ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 2, 1, value_From_OrderID_Of_Accessory);
				Thread.sleep(2000);

				// To assert the name of the second item (Accessory)
				String value_From_Name_Of_Accessory = myorderspage.read_Value_From_Name_Of_Accessory();
				String expected_Result5 = accessory_Name;
				String actual_Result5 = value_From_Name_Of_Accessory;
				Assert.assertEquals(actual_Result5, expected_Result5);
				System.out.println("Accessory name got verified successfully:" + actual_Result5);
				andrdCmnUtil.implicit_Wait();

				// To assert the order type of the second item (Accessory)
				String value_From_orderType_Of_Accessory = myorderspage.read_Value_From_orderType_Of_Accessory();
				String expected_Result6 = "Accessory";
				String actual_Result6 = value_From_orderType_Of_Accessory;
				Assert.assertEquals(actual_Result6, expected_Result6);
				System.out.println("Order Type got verified successfully for Accessory:" + actual_Result6);
				andrdCmnUtil.implicit_Wait();

				// To assert the order type label of the second item (Accessory)
				String value_From_orderStatusLabel_Of_Accessory = myorderspage
						.read_Value_From_orderStatusLabel_Of_Accessory();
				String expected_Result7 = "Status -  ";
				String actual_Result7 = value_From_orderStatusLabel_Of_Accessory;
				Assert.assertEquals(actual_Result7, expected_Result7);
				System.out.println("Order status label got verified successfully, for accessory:" + actual_Result7);
				andrdCmnUtil.implicit_Wait();

				// To assert the order status of the second item (Accessory)
				String value_From_OrderStatus_Of_Accessory = myorderspage.read_Value_From_OrderStatus_Of_Accessory();
				String expected_Result8 = accessory_Status;
				String actual_Result8 = value_From_OrderStatus_Of_Accessory;
				Assert.assertEquals(actual_Result8, expected_Result8);
				System.out.println("Order status got verified successfully, for accessory:" + actual_Result8);
				andrdCmnUtil.implicit_Wait();
				Thread.sleep(4000);

			} else {

				System.out.println("Its not showing the Accessory image." + value_From_productImage_Of_Accessory);
			}

		} else {
			System.out.println("Its not showing the Insurance image." + value_From_productImage_Of_Insurance);
		}

	}

	public void verify_Functionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		excelLib = new ExcelLibrary();
		insurance_OrderID = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 1, 1);
		accessory_OrderID = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.MYORDERS_TESTDATA_SHEETNAME, 2, 1);

		// To click on the go arrow of the first item (insurance)
		myorderspage.click_On_GoArrow_Of_Insurance();
		Thread.sleep(3000);

		// // To assert the tool-bar title of Insurance screen
		// String Insurance_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		// String expected_Result_ToolbarTitle = insurance_OrderID;
		// String actual_Result_ToolbarTitle = Insurance_Toolbar_Title;
		// Assert.assertEquals(actual_Result_ToolbarTitle,
		// expected_Result_ToolbarTitle);
		// System.out.println("Insurance toolbar title got verified successfully:" +
		// actual_Result_ToolbarTitle);
		// andrdCmnUtil.implicit_Wait();

		// To check the product image of the first item (insurance)
		boolean value_From_productImage_Of_Insurance = myorderspage.check_Value_From_productImage_Of_Insurance();
		if (value_From_productImage_Of_Insurance == true) {

			System.out.println("Its showing the Insurance image properly." + value_From_productImage_Of_Insurance);

			// To assert the name of the first item (insurance)
			String value_From_Name_Of_Insurance = myorderspage.read_Value_From_Name_Of_Insurance();
			String expected_Result1 = insurance_Name;
			String actual_Result1 = value_From_Name_Of_Insurance;
			Assert.assertEquals(actual_Result1, expected_Result1);
			System.out.println("Insurance name got verified successfully:" + actual_Result1);
			andrdCmnUtil.implicit_Wait();

			// To assert the order type of the first item (insurance)
			String value_From_orderType_Of_Insurance = myorderspage.read_Value_From_orderType_Of_Insurance();
			String expected_Result2 = "Insurance";
			String actual_Result2 = value_From_orderType_Of_Insurance;
			Assert.assertEquals(actual_Result2, expected_Result2);
			System.out.println("Order Type got verified successfully:" + actual_Result2);
			andrdCmnUtil.implicit_Wait();

			// To assert the order status label of the first item (insurance)
			String value_From_orderStatusLabel_Of_Insurance = myorderspage
					.read_Value_From_orderStatusLabel_Of_Insurance();
			String expected_Result3 = "Status -  ";
			String actual_Result3 = value_From_orderStatusLabel_Of_Insurance;
			Assert.assertEquals(actual_Result3, expected_Result3);
			System.out.println("Order status label got verified successfully:" + actual_Result3);
			andrdCmnUtil.implicit_Wait();

			// To assert the order status of the first item (insurance)
			String value_From_orderStatus_Of_Insurance = myorderspage.read_Value_From_orderStatus_Of_Insurance();
			String expected_Result4 = insurance_Status;
			String actual_Result4 = value_From_orderStatus_Of_Insurance;
			Assert.assertEquals(actual_Result4, expected_Result4);
			System.out.println("Order status got verified successfully:" + actual_Result4);
			andrdCmnUtil.implicit_Wait();

			andrdCmnUtil.Click_DeviceBackButton();
			Thread.sleep(4000);

			// To click on the go arrow of the Second item (Accessory)
			myorderspage.click_On_GoArrow_Of_Accessory();
			Thread.sleep(3000);

			// // To assert the tool-bar title of Accessory screen
			// String Accessory_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
			// String expected_Result_ToolbarTitle1 = accessory_OrderID;
			// String actual_Result_ToolbarTitle1 = Accessory_Toolbar_Title;
			// Assert.assertEquals(actual_Result_ToolbarTitle1,
			// expected_Result_ToolbarTitle1);
			// System.out.println("Accessory toolbar title got verified successfully:" +
			// actual_Result_ToolbarTitle1);
			// andrdCmnUtil.implicit_Wait();

			// To check the product image of the second item (Accessory)
			boolean value_From_productImage_Of_Accessory = myorderspage.check_Value_From_productImage_Of_Insurance();
			if (value_From_productImage_Of_Accessory == true) {

				System.out.println("Its showing the Accessory image properly." + value_From_productImage_Of_Accessory);

				// To assert the name of the second item (Accessory)
				String value_From_Name_Of_Accessory = myorderspage.read_Value_From_Name_Of_Insurance();
				String expected_Result5 = accessory_Name;
				String actual_Result5 = value_From_Name_Of_Accessory;
				Assert.assertEquals(actual_Result5, expected_Result5);
				System.out.println("Accessory name got verified successfully:" + actual_Result5);
				andrdCmnUtil.implicit_Wait();

				// To assert the order type of the second item (Accessory)
				String value_From_orderType_Of_Accessory = myorderspage.read_Value_From_orderType_Of_Insurance();
				String expected_Result6 = "Accessory";
				String actual_Result6 = value_From_orderType_Of_Accessory;
				Assert.assertEquals(actual_Result6, expected_Result6);
				System.out.println("Order Type got verified successfully for Accessory:" + actual_Result6);
				andrdCmnUtil.implicit_Wait();

				// To assert the order type label of the second item (Accessory)
				String value_From_orderStatusLabel_Of_Accessory = myorderspage
						.read_Value_From_orderStatusLabel_Of_Insurance();
				String expected_Result7 = "Status -  ";
				String actual_Result7 = value_From_orderStatusLabel_Of_Accessory;
				Assert.assertEquals(actual_Result7, expected_Result7);
				System.out.println("Order status label got verified successfully, for accessory:" + actual_Result7);
				andrdCmnUtil.implicit_Wait();

				// To assert the order status of the second item (Accessory)
				String value_From_OrderStatus_Of_Accessory = myorderspage.read_Value_From_orderStatus_Of_Insurance();
				String expected_Result8 = accessory_Status;
				String actual_Result8 = value_From_OrderStatus_Of_Accessory;
				Assert.assertEquals(actual_Result8, expected_Result8);
				System.out.println("Order status got verified successfully, for accessory:" + actual_Result8);
				andrdCmnUtil.implicit_Wait();
				Thread.sleep(4000);
				
				andrdCmnUtil.Click_DeviceBackButton();
				Thread.sleep(3000);
				
				andrdCmnUtil.Click_DeviceBackButton();
				Thread.sleep(3000);
				
				cmnelementpage.clickOn_dk_Option_On_Footer();
				Thread.sleep(3000);
				
			} else {
				System.out.println("Its not showing the Accessory image." + value_From_productImage_Of_Accessory);
			}

		} else {
			System.out.println("Its not showing the Insurance image." + value_From_productImage_Of_Insurance);
		}

	}

}
