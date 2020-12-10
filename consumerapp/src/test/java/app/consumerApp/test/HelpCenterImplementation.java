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
import app.appium.PageFactory.HelpCenterPageFactory;

public class HelpCenterImplementation extends DriverIgnit {

	CommonElementPage cmnelementpage;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	ExcelLibrary excelLib;
	HelpCenterPageFactory helpcenterpage;
	String first_Question;
	String first_Subquestion;
	String first_Sub_sub_Question;
	String first_Sub_sub_Answer;
	String second_Sub_sub_Question;
	String second_Sub_sub_Answer;
	String second_Subquestion;
	String second_Subanswer;
	String second_Question;
	String second_Answer;
	String module_Header;
	String last_Question;

	public void setUpAllVariable() throws EncryptedDocumentException, InvalidFormatException, IOException {

		cmnelementpage = new CommonElementPage(driver);
		helpcenterpage = new HelpCenterPageFactory(driver);
		excelLib = new ExcelLibrary();
		first_Question = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 1, 1);
		first_Subquestion = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 2, 1);
		first_Sub_sub_Question = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 3, 1);
		first_Sub_sub_Answer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 4, 1);
		second_Sub_sub_Question = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 5, 1);
		second_Sub_sub_Answer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 6, 1);
		second_Subquestion = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 7, 1);
		second_Subanswer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 8, 1);
		second_Question = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 9, 1);
		second_Answer = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 10, 1);
		module_Header = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 11, 1);
		last_Question = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,
				ConstantVaribale.HELPCENTER_TESTDATA_SHEETNAME, 12, 1);

	}

	public void verify_UI_And_Functionality() throws InterruptedException {
		
		cmnelementpage.clickOn_More_Option();
		try {
		andrdCmnUtil.scrollAndClick("Help center");
		}catch (Exception e) {
			System.out.println("No Need to Scroll");
		}

		// To assert the tool-bar title of Help center screen
		String Helpcenter_Toolbar_Title = cmnelementpage.read_From_Toolbar_Title();
		String expected_Result_ToolbarTitle = module_Header;
		String actual_Result_ToolbarTitle = Helpcenter_Toolbar_Title;
		Assert.assertEquals(actual_Result_ToolbarTitle, expected_Result_ToolbarTitle);
		System.out.println("HelpCenter toolbar title got verified successfully:" + actual_Result_ToolbarTitle);
		andrdCmnUtil.implicit_Wait();

		// To assert the first question
		String value_From_First_Question = helpcenterpage.read_value_From_First_Question();
		String expected_Result1 = first_Question;
		String actual_Result1 = value_From_First_Question;
		Assert.assertEquals(actual_Result1, expected_Result1);
		System.out.println("First question got verified successfully:" + actual_Result1);
		andrdCmnUtil.implicit_Wait();

		// To click on the First question, to go to next screen
		helpcenterpage.click_On_FirstQuestion();

		// To assert the first question
		String value_From_First_Question_On_NextScreen = helpcenterpage.read_value_From_First_Question();
		String expected_Result2 = first_Question;
		String actual_Result2 = value_From_First_Question_On_NextScreen;
		Assert.assertEquals(actual_Result2, expected_Result2);
		System.out.println("First question got verified successfully, on the next screen:" + actual_Result2);
		andrdCmnUtil.implicit_Wait();

		// To assert the second question
		String value_From_Second_Question = helpcenterpage.read_value_From_Second_Question();
		String expected_Result3 = first_Subquestion;
		String actual_Result3 = value_From_Second_Question;
		Assert.assertEquals(actual_Result3, expected_Result3);
		System.out.println("first_Subquestion got verified successfully:" + actual_Result3);
		andrdCmnUtil.implicit_Wait();

		// To click on the First question, to go to next screen
		helpcenterpage.click_On_FirstQuestion();

		// To assert the second question
		String value_From_Second_Question_On_NextScreen = helpcenterpage.read_value_From_Second_Question();
		String expected_Result4 = first_Sub_sub_Question;
		String actual_Result4 = value_From_Second_Question_On_NextScreen;
		Assert.assertEquals(actual_Result4, expected_Result4);
		System.out.println("first_Sub_sub_Question got verified successfully:" + actual_Result4);
		andrdCmnUtil.implicit_Wait();

		// To assert the first answer description
		String value_From_First_Answer = helpcenterpage.read_Value_From_First_Answer();
		String expected_Result5 = first_Sub_sub_Answer;
		String actual_Result5 = value_From_First_Answer;
		Assert.assertEquals(actual_Result5, expected_Result5);
		System.out.println("first_Sub_sub_Answer got verified successfully:" + actual_Result5);
		andrdCmnUtil.implicit_Wait();

		// To assert the third question
		String value_From_Third_Question = helpcenterpage.read_Value_From_Third_Question();
		String expected_Result6 = second_Sub_sub_Question;
		String actual_Result6 = value_From_Third_Question;
		Assert.assertEquals(actual_Result6, expected_Result6);
		System.out.println("second_Sub_sub_Question got verified successfully:" + actual_Result6);
		andrdCmnUtil.implicit_Wait();

		// To assert the Second answer description
		String value_From_Second_Answer = helpcenterpage.read_Value_From_Second_Answer();
		String expected_Result7 = second_Sub_sub_Answer;
		String actual_Result7 = value_From_Second_Answer;
		Assert.assertEquals(actual_Result7, expected_Result7);
		System.out.println("second_Sub_sub_Answer got verified successfully:" + actual_Result7);
		andrdCmnUtil.implicit_Wait();

		// To click on the First question, to go to next screen
		helpcenterpage.click_On_FirstQuestion();

		// To assert the last question on the last screen
		String value_From_Query_On_LastScreen = helpcenterpage.read_Value_From_Query_On_LastScreen();
		String expected_Result8 = first_Sub_sub_Question;
		String actual_Result8 = value_From_Query_On_LastScreen;
		Assert.assertEquals(actual_Result8, expected_Result8);
		System.out.println("Last screen query got verified successfully:" + actual_Result8);
		andrdCmnUtil.implicit_Wait();

		// To assert the suggestion label on the last screen
		String value_From_Suggestion_label = helpcenterpage.read_Value_From_Suggestion_label();
		String expected_Result9 = "Our Suggestion";
		String actual_Result9 = value_From_Suggestion_label;
		Assert.assertEquals(actual_Result9, expected_Result9);
		System.out.println("Last screen suggestion got verified successfully:" + actual_Result9);
		andrdCmnUtil.implicit_Wait();

		// To assert the solution text on the last screen
		String value_From_Solution_Text = helpcenterpage.read_Value_From_Solution_Text();
		String expected_Result10 = first_Sub_sub_Answer;
		String actual_Result10 = value_From_Solution_Text;
		Assert.assertEquals(actual_Result10, expected_Result10);
		System.out.println("Last screen Solution got verified successfully:" + actual_Result10);
		andrdCmnUtil.implicit_Wait();

		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(2000);

		System.out.println("Came back to the previous screen successfully.");

		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(2000);

		System.out.println("Came back to the previous screen successfully.");

		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(2000);

		System.out.println("Came back to the main screen successfully.");

		// To assert the second question in the main screen
		String value_From_Second_Question1 = helpcenterpage.read_value_From_Second_Question();
		String expected_Result11 = second_Question;
		String actual_Result11 = value_From_Second_Question1;
		Assert.assertEquals(actual_Result11, expected_Result11);
		System.out.println("second_Question got verified successfully, on the main screen." + actual_Result11);
		andrdCmnUtil.implicit_Wait();

		// To click on the second question, to go to next screen
		helpcenterpage.click_On_SecondQuestion();

		// To assert the last question on the last screen, for second question on main
		// screen
		String value_From_Query_On_LastScreen1 = helpcenterpage.read_Value_From_Query_On_LastScreen();
		String expected_Result12 = second_Question;
		String actual_Result12 = value_From_Query_On_LastScreen1;
		Assert.assertEquals(actual_Result12, expected_Result12);
		System.out.println("Last screen query got verified successfully:" + actual_Result12);
		andrdCmnUtil.implicit_Wait();

		// To assert the suggestion label on the last screen
		String value_From_Suggestion_label1 = helpcenterpage.read_Value_From_Suggestion_label();
		String expected_Result13 = "Our Suggestion";
		String actual_Result13 = value_From_Suggestion_label1;
		Assert.assertEquals(actual_Result13, expected_Result13);
		System.out.println("Last screen suggestion got verified successfully:" + actual_Result13);
		andrdCmnUtil.implicit_Wait();

		// To assert the solution text on the last screen
		String value_From_Solution_Text1 = helpcenterpage.read_Value_From_Solution_Text();
		String expected_Result14 = second_Answer;
		String actual_Result14 = value_From_Solution_Text1;
		Assert.assertEquals(actual_Result14, expected_Result14);
		System.out.println("second_Answer Solution got verified successfully:" + actual_Result14);
		andrdCmnUtil.implicit_Wait();

		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(2000);

		System.out.println("Came back to the main screen successfully.");
		
		//To assert the third question in the main screen
		String value_From_Third_Question1 = helpcenterpage.read_Value_From_Third_Question();
		String expected_Result15 = last_Question;
		String actual_Result15 = value_From_Third_Question1;
		Assert.assertEquals(actual_Result15, expected_Result15);
		System.out.println("last_Question got verified successfully, on the main screen." + actual_Result15);
		andrdCmnUtil.implicit_Wait();
		
		// To click on the third question, to go to next screen
		helpcenterpage.click_On_ThirdQuestion();
		
		cmnelementpage.click_allowAccess_Popup_For_Attachmnets_();
		
		System.out.println("Its showing the mail options to send any helpdesk query, properly.");
		
		cmnelementpage.clickOn_CancelButton();
		Thread.sleep(2000);
		
		andrdCmnUtil.Click_DeviceBackButton();
		Thread.sleep(2000);
		
		cmnelementpage.clickOn_dk_Option_On_Footer();
		Thread.sleep(2000);
		

	}

}
