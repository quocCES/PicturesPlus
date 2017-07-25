package TestModules;

import org.testng.annotations.Test;
import java.sql.Driver;
import Actions.GeneralActions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import Interfaces.SignUpPage;

public class TM_signUp {
  
	WebDriver driver;
	GeneralActions generalActions = new GeneralActions();
	
	@BeforeTest
  	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/home/code-engine-studio/Downloads/chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://picturesplus.com/customer/account/create/";
		driver.get(baseUrl);
	}
	
	@Test
	//TC_034 Verify that user can NOT submit with invalid email format
  	public void TC_034() {
		generalActions.signUpPP(driver, "Test", "Ut", "testAuto!&^*^!@#@mailinator.com", "12345678", "12345678");
		String expectedMessage = "Please enter a valid email address. For example johndoe@domain.com.";
		String message = driver.findElement(By.xpath("//*[@id=\"advice-validate-email-email_address\"]")).getText();
		Assert.assertEquals(expectedMessage, message);
	}

	@Test(priority=1)
	//TC_036 Verify that user can NOT submit with blank all fields
	public void TC_036() {
		driver.navigate().refresh();
		generalActions.signUpPP(driver, "", "", "", "", "");
		String expectedMessage = "This is a required field.";
		String message = driver.findElement(By.className("validation-advice")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
	@Test(priority=2)
	//TC_038 Verify that user can NOT submit when one of required fields is blank
	public void TC_038() {
		driver.navigate().refresh();
		generalActions.signUpPP(driver, "Test", "", "testAuto14@mailinator.com", "12345678", "12345678");
		String expectedMessage = "This is a required field.";
		String message = driver.findElement(By.xpath("//*[@id=\"advice-required-entry-lastname\"]")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
	
	@Test(priority=3)
	//TC_039 Verify that when user clicks on 'Back' links in 'Sign Up' page the login page is displayed
	public void TC_039() {
		driver.findElement(By.xpath(SignUpPage.txt_Back_xpath)).click();
		Assert.assertTrue(driver.getTitle().trim().equals("Customer Login | Picture Plus"));
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div[2]/button")).click();
	}
	
	@Test(priority=4)
	//TC_037 Verify that user can create an account successfully when inputting valid data for all fields.
	public void TC_037() {
		generalActions.signUpPP(driver, "Test", "Ut", "testAuto23@mailinator.com", "12345678", "12345678");
		Assert.assertTrue(driver.getTitle().trim().equals("My Account | Picture Plus"));
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
