package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LandingPage;
import util.BrowserFactory;

public class LandingPageTest {
WebDriver driver;
@Test
public void pagetitle() {
	driver=BrowserFactory.init();
	
	LandingPage page = PageFactory.initElements(driver, LandingPage.class);
	page.verfiypagetitle();
	
	BrowserFactory.tearDown();
}
}
