package app.appium.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.appium.GenericLibrary.AndroidCommonUtil;

public class HelpCenterPageFactory {

	public WebDriver driver;
	AndroidCommonUtil andrdCmnUtil = new AndroidCommonUtil();
	String value_From_First_Question;
	String value_From_Second_Question;
	String value_From_Third_Question;
	String value_From_Query_On_LastScreen;
	String value_From_Suggestion_label;
	String value_From_Solution_Text;
	String value_From_First_Answer;
	String value_From_Second_Answer;
	String value_From_Third_Answer;
	
	public HelpCenterPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// To assert the first question
	@FindBy(id = "topic_tv")
	private List<WebElement> first_Question;

	public String read_value_From_First_Question() {
		for (int i = 0; i < first_Question.size();) {
			value_From_First_Question = first_Question.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_First_Question;
	}
	
	// To click on the First question, to go to next screen
	@FindBy(id = "next_button")
	private List<WebElement> click_FirstQuestion;

	public void click_On_FirstQuestion() {
		for (int i = 0; i < click_FirstQuestion.size();) {
			click_FirstQuestion.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}
	
	// To assert the second question
	@FindBy(id = "topic_tv")
	private List<WebElement> second_Question;

	public String read_value_From_Second_Question() {
		for (int i = 1; i < second_Question.size();) {
			value_From_Second_Question = second_Question.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Second_Question;
	}
	
	// To click on the second question, to go to next screen
	@FindBy(id = "next_button")
	private List<WebElement> click_SecondQuestion;

	public void click_On_SecondQuestion() {
		for (int i = 1; i < click_SecondQuestion.size();) {
			click_SecondQuestion.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}
	
	// To assert the third question
	@FindBy(id = "topic_tv")
	private List<WebElement> third_Question;

	public String read_Value_From_Third_Question() {
		for (int i = 2; i < third_Question.size();) {
			value_From_Third_Question = third_Question.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Third_Question;
	}
	
	// To click on the third question, to go to next screen
	@FindBy(id = "next_button")
	private List<WebElement> click_ThirdQuestion;

	public void click_On_ThirdQuestion() {
		for (int i = 2; i < click_ThirdQuestion.size();) {
			click_ThirdQuestion.get(i).click();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		
	}

	
	// To assert the last question on the last screen
	@FindBy(id = "query_tv")
	private List<WebElement> query_On_LastScreen;

	public String read_Value_From_Query_On_LastScreen() {
		for (int i = 0; i < query_On_LastScreen.size();) {
			value_From_Query_On_LastScreen = query_On_LastScreen.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Query_On_LastScreen;
	}
	
	// To assert the suggestion label on the last screen
	@FindBy(id = "suggestion_label")
	private List<WebElement> suggestion_label;

	public String read_Value_From_Suggestion_label() {
		for (int i = 0; i < suggestion_label.size();) {
			value_From_Suggestion_label = suggestion_label.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Suggestion_label;
	}
	
	// To assert the solution text on the last screen
	@FindBy(id = "solution_tv")
	private List<WebElement> solution_text;

	public String read_Value_From_Solution_Text() {
		for (int i = 0; i < solution_text.size();) {
			value_From_Solution_Text = solution_text.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Solution_Text;
	}
	
	// To assert the first answer description
	@FindBy(id = "desc_tv")
	private List<WebElement> first_Answer;

	public String read_Value_From_First_Answer() {
		for (int i = 0; i < first_Answer.size();) {
			value_From_First_Answer = first_Answer.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_First_Answer;
	}
	
	// To assert the Second answer description
	@FindBy(id = "desc_tv")
	private List<WebElement> second_Answer;

	public String read_Value_From_Second_Answer() {
		for (int i = 1; i < second_Answer.size();) {
			value_From_Second_Answer = second_Answer.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Second_Answer;
	}
	
	
	// To assert the third answer description
	@FindBy(id = "desc_tv")
	private List<WebElement> third_Answer;

	public String read_Value_From_Third_Answer() {
		for (int i = 2; i < third_Question.size();) {
			value_From_Third_Answer = third_Answer.get(i).getText();
			andrdCmnUtil.implicit_Wait();
			break;

		}
		return value_From_Third_Answer;
	}
	
	
	
	
	
}
