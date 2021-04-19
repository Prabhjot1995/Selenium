package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormPage extends BasePage {
	WebDriver driver;

	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement FIRST_NAME_FEILD;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement LAST_NAME_FEILD;
	@FindBy(xpath = "//input[@id='sex-0']")
	WebElement GENDER_FEILD;
	@FindBy(xpath = "//input[@id='exp-6']")
	WebElement EXPERINCE_FEILD;
	@FindBy(xpath = "//input[@id='datepicker']")
	WebElement DATE_FEILD;
	@FindBy(xpath = "//input[@id='profession-1']")
	WebElement PROFESSION_FEILD;
	@FindBy(xpath = "//input[@id='tool-2']")
	WebElement TOOLS_FEILD;
	@FindBy(xpath = "//select[@id='continents']")
	WebElement COUNTRY_DROPDOWN;
	@FindBy(xpath = "//select[@id='selenium_commands']")
	WebElement COMMANDS_DROPDOWN;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement SUBMIT_BUTTON;

	public void firstname(String name) {
		FIRST_NAME_FEILD.sendKeys(name);
	}

	public void lastname(String last) {
		LAST_NAME_FEILD.sendKeys(last);
	}

	public void gender() {
		GENDER_FEILD.click();
	}

	public void experince() {
		EXPERINCE_FEILD.click();
	}

	public void date(String date) {
		DATE_FEILD.sendKeys(date);
	}

	public void profesion() {
		PROFESSION_FEILD.click();
	}

	public void tools() {
		TOOLS_FEILD.click();
	}

	public void country(String value) {
		SelectDropDown(COUNTRY_DROPDOWN, value);
	}

	public void commands(String value) {
		SelectDropDown(COMMANDS_DROPDOWN, value);
	}

	public void save() {
		SUBMIT_BUTTON.click();
	}

}
