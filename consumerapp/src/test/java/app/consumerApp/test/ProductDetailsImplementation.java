package app.consumerApp.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.GenericLibrary.ExcelLibrary;
import app.appium.PageFactory.ProductDetailsPageFactory;

public class ProductDetailsImplementation extends DriverIgnit {

	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	ExcelLibrary excelLib;
	ProductDetailsPageFactory productdetailspage;
	String countryCode;
	String dkCount;
	String dkName;
	String product_Category;
	String product_Subcategory;
	String model_Number;
	String product_Manufacturer;
	String Seller;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		productdetailspage = new ProductDetailsPageFactory(driver);
		excelLib = new ExcelLibrary();
		countryCode = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 1, 1);
		dkCount = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 2, 1);
		dkName = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 3, 1);
		product_Category = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 4, 1);
		product_Subcategory = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 5, 1);
		model_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 6, 1);
		product_Manufacturer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 7, 1);
		Seller = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.PRODUCTDETAILS_TESTDATA_SHEETNAME, 8, 1);

	}
	
	public void verify_UI() {
		
		
		
	}
}
