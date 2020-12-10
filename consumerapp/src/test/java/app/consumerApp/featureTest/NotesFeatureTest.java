package app.consumerApp.featureTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.appium.BusinessLibrary.BusinessClass;
import app.appium.GenericLibrary.AppGenericLibrary;
import app.appium.GenericLibrary.DriverIgnit;
import app.consumerApp.test.NotesImplementation;

public class NotesFeatureTest extends DriverIgnit {
	AppGenericLibrary appgenericlib = new AppGenericLibrary();
	BusinessClass businesscls = new BusinessClass();
	NotesImplementation notesimpl = new NotesImplementation();
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		appLaunch();
		businesscls.enable_Toggle();
		appgenericlib = new AppGenericLibrary();
		
		
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		appgenericlib = new AppGenericLibrary();
		appgenericlib.login_Functionality();
		
		
	}
	
	@BeforeMethod
	public void Test_SetupVariables() throws EncryptedDocumentException, InvalidFormatException, IOException {
		notesimpl.setupVariables();

	}
	
	@Test(priority = 1, description = "To test the UI of Notes page")
	public void Test_Verify_Notes_UI()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		notesimpl.verify_Notes_UI();

	}
	
	@Test(priority = 2, description = "To test the functionality of Add notes")
	public void Test_Verify_AddNotes_Functionality()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		notesimpl.verify_AddNotes_Functionality();

	}
	
	@Test(priority = 3, description = "To test Functionality and UI of notes screen after adding notes")
	public void Test_Verify_Functionality_AfterAddingNotes()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		notesimpl.verify_Functionality_AfterAddingNotes();

	}
	
	@Test(priority = 4, description = "To test Functionality and UI of notes in Product details screen")
	public void Test_Verify_NotesFunctionality_In_ProductDetails()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		notesimpl.verify_NotesFunctionality_In_ProductDetails();

	}
	
	
}
