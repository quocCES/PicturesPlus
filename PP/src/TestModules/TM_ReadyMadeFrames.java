package TestModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actions.GeneralActions;

public class TM_ReadyMadeFrames {
	WebDriver driver;
	GeneralActions generalActions = new GeneralActions();
	
	@BeforeTest
  	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/home/code-engine-studio/Downloads/chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://picturesplus.com/frame-it/ready-made-frames/";
		driver.get(baseUrl);
	}
	
	@Test
	public void Filter() {
		generalActions.readyMadeFrames(driver);
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
