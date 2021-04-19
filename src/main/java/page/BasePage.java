package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public void WaitForElement(WebDriver driver, int TimesInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, TimesInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public int RandomNums(int nums) {
		Random rnd = new Random();
		int gennum = rnd.nextInt(nums);
		return gennum;

	}
	public void SelectDropDown(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
}
