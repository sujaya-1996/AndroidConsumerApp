package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.LoyaltyPageFactory;

public class LoyaltyAfterAddProductImplementation extends DriverIgnit {
	
	CommonElementPage cmnelementpage;
	LoyaltyPageFactory loyaltypage;
	ExcelLibrary excelLib;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	String referee_Points_Before_AddProduct;
	String referee_LifeTimeEarnings_Before_AddProduct;
	
	public void setupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		excelLib = new ExcelLibrary();
		cmnelementpage = new CommonElementPage(driver);
		loyaltypage = new LoyaltyPageFactory(driver);
		referee_Points_Before_AddProduct = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 7, 1);
		referee_LifeTimeEarnings_Before_AddProduct = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 8, 1);

	}
	public void verify_UI_And_Functionalities_After_AddProduct() throws InterruptedException{
		
		Thread.sleep(3000);
		cmnelementpage.clickOn_More_Option();
		andrdCmnUtil.scrollAndClick("Loyalty points");
		
		// To assert the Earned Label in summary screen
		String ValueFrom_Earnedlabel_In_SummaryScreen = loyaltypage.read_ValueFrom_Earnedlabel_In_SummaryScreen();
		String expectedValue_In_Summary_Screen1 = "EARNED";
		String actualValue_In_Summary_Screen1 = ValueFrom_Earnedlabel_In_SummaryScreen;
		Assert.assertEquals(actualValue_In_Summary_Screen1, expectedValue_In_Summary_Screen1);
		System.out.println(
				"Earned Label in summary screen has been asserted successfully: " + actualValue_In_Summary_Screen1);
		andrdCmnUtil.implicit_Wait();
		
		// To assert the Earning Activity Text
		String ValueFrom_SourceOfPoint_In_SummaryScreen = loyaltypage
				.read_ValueFrom_SourceOfPoint_In_SummaryScreen();
		String expectedValue_In_Summary_Screen2 = "Add Product";
		String actualValue_In_Summary_Screen2 = ValueFrom_SourceOfPoint_In_SummaryScreen;
		Assert.assertEquals(actualValue_In_Summary_Screen2, expectedValue_In_Summary_Screen2);
		System.out.println("Add Product Label in summary screen has been asserted successfully: "
				+ actualValue_In_Summary_Screen2);
		andrdCmnUtil.implicit_Wait();
		
		// To convert the Recent activity earned points in summary screen to integer value
		String earnedPointsBy_AddProduct = loyaltypage.readFrom_Points_In_SummaryScreen();
		int int_EarnedPointsBy_AddProduct = Integer.parseInt(earnedPointsBy_AddProduct);
		
		// To convert the referee points before addproduct into integer value
		int referee_Int_Points_Before_AddProduct= Integer.parseInt(referee_Points_Before_AddProduct);
		
		// To assert the Integer converted loyalty balance points in summary screen 
		int Actual_Loyalty_Balance = loyaltypage.read_int_Value_From_LoyaltyBalancePoints_In_SummaryScreen();
		
		// To verify whether the Add product activity points has been added to the loyalty balance or not!!
		int expected_Loyalty_Balance = (int_EarnedPointsBy_AddProduct + referee_Int_Points_Before_AddProduct);
		
		int expectedValue_In_Summary_Screen3 = expected_Loyalty_Balance;
		int actualValue_In_Summary_Screen3 = Actual_Loyalty_Balance;
		Assert.assertEquals(actualValue_In_Summary_Screen3, expectedValue_In_Summary_Screen3);
		System.out.println("Add product activity points has been added to the loyalty balance in summary screen and has been asserted successfully: "
				+ actualValue_In_Summary_Screen3);
		andrdCmnUtil.implicit_Wait();
		
		// To convert the Lieftime earning points to integer
		int int_Lifetime_Earning_points_Before_AddProduct = Integer.parseInt(referee_LifeTimeEarnings_Before_AddProduct);
		
		// To check whether the lifetime earnings is showing correct or not, after add product!!
		int Expected_LifetimeEarnings = (int_Lifetime_Earning_points_Before_AddProduct + int_EarnedPointsBy_AddProduct);
		
		String Actual_LifetimeEarnings = loyaltypage.read_ValueFrom_lifetimeEarningsPoints_In_SummaryScreen();
		int Actual_Int_LifetimeEarnings = Integer.parseInt(Actual_LifetimeEarnings);
		
		int expectedValue_In_Summary_Screen4 = Expected_LifetimeEarnings;
		int actualValue_In_Summary_Screen4 = Actual_Int_LifetimeEarnings;
		Assert.assertEquals(actualValue_In_Summary_Screen4, expectedValue_In_Summary_Screen4);
		System.out.println("Lifetime earnings on summary screen has been asserted successfully: "
				+ actualValue_In_Summary_Screen4);
		andrdCmnUtil.implicit_Wait();
		
		System.out.println("All the scenarios are working fine");
		
		
		
	}
}
