package TestModules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Interfaces.ForgotPwd;
import Interfaces.SignUpPage;
import Actions.GeneralActions;

public class TM_ForgotPwd {
	
	WebDriver driver;
	GeneralActions generalActions = new GeneralActions();
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/home/code-engine-studio/selenium/chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://picturesplus.com/customer/account/forgotpassword/";
		driver.get(baseUrl);
	}
	
	//Tc_051 Verify that user can NOT submit with blank 'Email Address' field.
	@Test
	public void TC_051() {
		generalActions.forgotPwd(driver, "");
		String expectedMessage = "This is a required field.";
		String message = driver.findElement(By.xpath("//*[@id=\"advice-required-entry-email_address\"]")).getText();
		Assert.assertEquals(expectedMessage, message);
		}
	
	@Test(priority=1)
	//TC_053 Verify that the 'Login' page is displayed when user click on 'Back to Login' link
	public void TC_053() {
		driver.findElement(By.xpath(ForgotPwd.txt_backLink_xpath)).click();
		Assert.assertTrue(driver.getTitle().trim().equals("Customer Login | Picture Plus"));
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/div[2]/a")).click();
	}
			
	//Tc_050 Verify that user can submit successfully with valid 'Email Address' field.
	@Test(priority=2)
	public void TC_050() {
		driver.navigate().refresh();
		generalActions.forgotPwd(driver, "autotTest@mailiantor.com");
		Assert.assertTrue(driver.getTitle().trim().equals("Customer Login | Picture Plus"));
		String expectedMessage = "If there is an account associated with autotTest@mailiantor.com you will receive an email with a link to reset your password.";
		String message = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li")).getText();
		Assert.assertEquals(expectedMessage, message);
	}
		
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
