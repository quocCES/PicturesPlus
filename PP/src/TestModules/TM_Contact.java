package TestModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actions.GeneralActions;

public class TM_Contact {
	WebDriver driver;
	GeneralActions generalActions = new GeneralActions();
	
	@BeforeTest
  	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/home/code-engine-studio/Downloads/chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://picturesplus.com/about-us/contact-us/";
		driver.get(baseUrl);
	}
	
	//TC_026 Verify that user can NOT submit with blank all fields
	@Test
	public void TC_026() {
		generalActions.contactPP(driver, "", "", "", "", "");
		String expectedMessage = "This is a required field.";
		String message = driver.findElement(By.className("validation-advice")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
	
	//TC_028 Verify that user can NOT submit with invalid format email 
	@Test(priority=1)
	public void TC_028() {
		generalActions.contactPP(driver, "Test", "Ut", "ContactAut!@##@mailinator.com", "I am testing", "Hi");
		String expectedMessage = "Please enter a valid email address. For example johndoe@domain.com.";
		String message = driver.findElement(By.xpath("//*[@id=\"advice-validate-email-email\"]")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
	
	//TC_029 Verify that user can NOT submit when one of required fields is blank
	@Test(priority=2)
	public void TC_029() {
		driver.navigate().refresh();
		generalActions.contactPP(driver, "Test", "", "ContactAut!@##@mailinator.com", "I am testing", "Hi");
		String expectedMessage = "This is a required field.";
		String message = driver.findElement(By.xpath("//*[@id=\"advice-required-entry-lastname\"]")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
	
	//TC_025 Verify that user can submit successfully when inputting valid data for all required fields
	@Test(priority=3)
	public void TC_025() {
		driver.navigate().refresh();
		generalActions.contactPP(driver, "Test", "Ut", "ContactAuto@mailinator.com", "I am testing", "Hi");
		String expectedMessage = "Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.";
		String message = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/ul/li")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
