package page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verfiypagetitle() {
		Assert.assertEquals(driver.getTitle(), "Selenium Practice Form", "Title page not found!!");
	}

}
