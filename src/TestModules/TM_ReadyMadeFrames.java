package TestModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actions.GeneralActions;
import Interfaces.ReadyMadeFrames;

public class TM_ReadyMadeFrames {
	WebDriver driver;
	GeneralActions generalActions = new GeneralActions();
	
	@BeforeTest
  	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/home/code-engine-studio/selenium/chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://picturesplus.com/frame-it/ready-made-frames/";
		driver.get(baseUrl);
	}
	
	@Test
	public void Filter() {
		generalActions.readyMadeFrames(driver);
	}
	
	@Test(priority=1)
	public void frameDetail() throws Exception {
		//wait for element appear 
		WebElement myWait = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ReadyMadeFrames.txt_KoaVenner_xpath)));
		driver.findElement(By.xpath(ReadyMadeFrames.txt_KoaVenner_xpath)).click();
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
