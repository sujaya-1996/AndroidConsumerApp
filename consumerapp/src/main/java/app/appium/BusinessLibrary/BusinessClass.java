package app.appium.BusinessLibrary;

import app.appium.GenericLibrary.AndroidCommonUtil;
import app.appium.GenericLibrary.DriverIgnit;
import app.appium.PageFactory.LoginPage;

public class BusinessClass extends DriverIgnit {

	LoginPage loginPage;
	AndroidCommonUtil andrdCmnUtil;
	CommonElementPage cmnelementpage;

	public void enable_Toggle() throws InterruptedException {
		try {
			loginPage = new LoginPage(driver);
			andrdCmnUtil = new AndroidCommonUtil();
			//Thread.sleep(4000);
			loginPage.click_On_androidOkayBtn();
			Thread.sleep(4000);
			loginPage.click_On_androidToggleButton();
			Thread.sleep(4000);
			andrdCmnUtil.implicit_Wait();
			loginPage.click_On_androidBackButton();
			andrdCmnUtil.implicit_Wait();
		} catch (Exception e) {
			
			System.out.println("Enable toggle button is not showing, so the flow will continue.");
		}
	}

	public void select_for_countryCode(String Country_flag) throws InterruptedException {
		loginPage = new LoginPage(driver);
		andrdCmnUtil = new AndroidCommonUtil();
		Thread.sleep(4000);
		loginPage.click_On_CountryCode();
		andrdCmnUtil.implicit_Wait();
		Thread.sleep(2000);
		loginPage.click_On_countryScreen_Cancel_button();
		andrdCmnUtil.implicit_Wait();
		loginPage.click_On_CountryCode();
		andrdCmnUtil.implicit_Wait();
		loginPage.click_On_countryScreen_SearchIcon();
		andrdCmnUtil.implicit_Wait();
		loginPage.write_On_countryScreen_searchField(Country_flag);
		andrdCmnUtil.implicit_Wait();
		Thread.sleep(3000);
		loginPage.clickOn_countryScreen_cross_Icon();
		andrdCmnUtil.implicit_Wait();
		loginPage.clickOn_countryScreen_Back_Button();
		andrdCmnUtil.implicit_Wait();
		loginPage.click_On_countryScreen_SearchIcon();
		andrdCmnUtil.implicit_Wait();
		loginPage.write_On_countryScreen_searchField(Country_flag);
		andrdCmnUtil.implicit_Wait();
		loginPage.select_countryScreen_CountryFlag();
		andrdCmnUtil.implicit_Wait();
	}

	public void select_MyDXCard() throws InterruptedException {
		loginPage = new LoginPage(driver);
		cmnelementpage = new CommonElementPage(driver);
		andrdCmnUtil = new AndroidCommonUtil();

		cmnelementpage.clickOn_Show_MyDxcard_Field();

	}

	public void LogOut() throws InterruptedException {
		// tearDown();
		cmnelementpage = new CommonElementPage(driver);
		// To scroll down to the logout option
		cmnelementpage.clickOn_More_Option();
		andrdCmnUtil.scrollAndClick("Logout");

		// To click on the ok button of the success pop-up
		cmnelementpage.clickOn_Ok_On_Popup();
		System.out.println("Logout performed");
		System.out.println(" Successfully done with the logout functionality");
	}

	public void selectNextMonthsDate_From_calendar() {
		cmnelementpage = new CommonElementPage(driver);
		cmnelementpage.clickOn_CalendarNext_Button();
		cmnelementpage.clickOn_Select_Any_ParticularDate();
		cmnelementpage.clickOn_CalendarOK_Button();
	}

	public void selectCurrentDate_From_Calendar() {
		cmnelementpage = new CommonElementPage(driver);
		cmnelementpage.clickOn_CalendarOK_Button();
	}
}
