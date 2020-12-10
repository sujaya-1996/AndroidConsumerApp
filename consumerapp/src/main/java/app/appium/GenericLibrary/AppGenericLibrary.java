package app.appium.GenericLibrary;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.BusinessLibrary.CommonElementPage;
import app.appium.BusinessLibrary.ConstantVaribale;
import app.appium.PageFactory.LoginPage;
import app.appium.PageFactory.ServiceRequestPage;

public class AppGenericLibrary extends DriverIgnit
{
	
	LoginPage loginpage;
	BusinessClass businesscls = new BusinessClass();
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	ServiceRequestPage srpage;
	CommonElementPage cmnelementpage;
	ExcelLibrary excelLib;
	String currentTime;

	String countryFlag;
	
	String consumerMobileNumber;
	String referrer_Mobile_Number;
	
	
	public void login_Functionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		loginpage = new LoginPage(driver);
		businesscls = new BusinessClass();
		andrdCmnUtil = new AndroidCommonUtil();
		excelLib = new ExcelLibrary();
		countryFlag = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 2, 1);
		consumerMobileNumber = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 1, 1);
		businesscls.select_for_countryCode(countryFlag);
		loginpage.write_on_mobileNumberEditBox(consumerMobileNumber);
		loginpage.click_GetOTP_Button();
		loginpage.clickOn_OTPBOX();
		andrdCmnUtil.Write_On_Keypad("123456");
		andrdCmnUtil.Hide_Keyboard();
		loginpage.clickOn_LogIn_Signup();
		
	}
	
	public void login_Functionality_For_ReferralActivity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		loginpage = new LoginPage(driver);
		businesscls = new BusinessClass();
		andrdCmnUtil = new AndroidCommonUtil();
		countryFlag = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,ConstantVaribale.LOGIN_TESTDATA_SHEETNAME, 2, 1);
		referrer_Mobile_Number = ExcelLibrary.getStringExcelTestData(ConstantVaribale.EXCEL_FILE_PATH,ConstantVaribale.LOYALTYPOINTS_TESTDATA_SHEETNAME, 5, 1);
		businesscls.select_for_countryCode(countryFlag);
		loginpage.write_on_mobileNumberEditBox(referrer_Mobile_Number);
		loginpage.click_GetOTP_Button();
		loginpage.clickOn_OTPBOX();
		andrdCmnUtil.Write_On_Keypad("123456");
		andrdCmnUtil.Hide_Keyboard();
		loginpage.clickOn_LogIn_Signup();
		
	}
	
	public void logout_Functionality(String visibleText) throws InterruptedException
	{
		cmnelementpage = new CommonElementPage(driver);
		cmnelementpage.clickOn_More_Option();
		andrdCmnUtil.scrollAndClick(visibleText);
		cmnelementpage.clickOn_Ok_On_Popup();
	}
	

	public void clickOn_DK_On_GridView ()
	{
		cmnelementpage = new CommonElementPage(driver);
		cmnelementpage.click_On_dk_Image_On_GridView();
		
	}
	
	public String check_Toolbar_Title_Text()
	{
		cmnelementpage = new CommonElementPage(driver);
		String check_Value_From_Toolbar_Title_Text = cmnelementpage.read_From_Toolbar_Title();
		return check_Value_From_Toolbar_Title_Text;
	}
	
	public void clickOn_MyDXcard () throws InterruptedException
	{
		cmnelementpage = new CommonElementPage(driver);
		cmnelementpage.clickOn_Show_MyDxcard_Field();
	}
	
	public void tearDown() 
	{
		driver.quit();
	}
	
	public static String getCurrentTime(String timeFormat)
	{
		// "HH.mm.ss"
		SimpleDateFormat time_formatter = new SimpleDateFormat(timeFormat);
		String current_time_str = time_formatter.format(System.currentTimeMillis());
		System.out.println("The current time is "+current_time_str);
		return current_time_str;
	}
	
	public static String systemCurrentDate(String dateFormatFromExcel) 
	{
		DateFormat dateFormat = new SimpleDateFormat(dateFormatFromExcel);
		Date date = new Date();
		String sysDate = dateFormat.format(date);
		System.out.println("Current Date Taken From System " + sysDate);
		return sysDate;
	}
	
	public String getDateAndTimeCombination()
	{
		String time = getCurrentTime("mm" );
		//String[] time1= time.split(":");
		System.out.println("Only Minute is "+ time);
		int extebndedMin = Integer.parseInt(time) + 01;
		System.out.println("The Extended Minute is : "+ extebndedMin);
		
		System.out.println("The ssystem Current time is : "+ extebndedMin);
		
		String date = systemCurrentDate("MMM dd, yyyy"+ " "+ "HH:"+extebndedMin+" aa");
		//String date1 = date.replace("AM", "am").replace("PM","pm");
		System.out.println("The Final Date and Time is : "+date );
		return date;
		
	}
	
	public String timeManupulation() {
		currentTime = getCurrentTime("HH:mm");
		 String[] time = currentTime.split ( ":" );
		   int hour = (Integer.parseInt ( time[0].trim()));
		   int min = Integer.parseInt ( time[1].trim() );
		   String newMin = "02";
		   int n = (min + Integer.parseInt(newMin))%60;
		   System.out.println("n is "+ n);
		   String LatestTime = (Integer.toString(hour) + ":"+Integer.toString(n));
		   
	    System.out.println("The time taken from system is "+ LatestTime);
	    return LatestTime;
	}
}
