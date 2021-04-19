package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.InputFormPage;
import page.LandingPage;
import util.BrowserFactory;
import util.ExcelReader;

public class InputFormTest {
	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\info.xlsx");
	String firstname = exlread.getCellData("Info", "FirstName", 2);
	String lastname = exlread.getCellData("Info", "LastName", 2);
	String date = exlread.getCellData("Info", "Date", 2);
	String country = exlread.getCellData("Info", "Country", 2);
	String Commands = exlread.getCellData("Info", "Commands", 2);

	@Test
	public void usershouldabletofilloutform() {
		driver = BrowserFactory.init();

		LandingPage page = PageFactory.initElements(driver, LandingPage.class);
		page.verfiypagetitle();

		InputFormPage form = PageFactory.initElements(driver, InputFormPage.class);
		form.firstname(firstname);
		form.lastname(lastname);
		form.gender();
		form.experince();
		form.date(date);
		form.profesion();
		form.tools();
		form.country(country);
		form.commands(Commands);
		form.save();
		BrowserFactory.tearDown();
	}
}