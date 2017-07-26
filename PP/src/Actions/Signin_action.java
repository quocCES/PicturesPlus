package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Interfaces.SigninPage;

public class Signin_action {
	
	SigninPage signinpage = new SigninPage() ;
	
	
	public void SigninPP(WebDriver driver, String email, String password) {
		
		driver.findElement(By.xpath(signinpage.email_xpath)).clear();
		
		driver.findElement(By.xpath(signinpage.email_xpath)).sendKeys(email);
		
		driver.findElement(By.xpath(signinpage.password_xpath)).clear();
		
		driver.findElement(By.xpath(signinpage.password_xpath)).sendKeys(password);
		
		driver.findElement(By.xpath(signinpage.signin_button_xpath)).click();
				
		}

	public void check_message(WebDriver driver, String actual_result, String expected_result) {
		
		actual_result = driver.findElement(By.className(signinpage.error_message_class)).getText();
		
		Assert.assertEquals(actual_result, expected_result);
		Assert.assertTrue(actual_result.contains(expected_result));
	}
	
		public void check_page(WebDriver driver, String actual_result, String expected_result) {
		
			actual_result = driver.getTitle();
		
		Assert.assertEquals(actual_result, expected_result);
		Assert.assertTrue(actual_result.contains(expected_result));
	}
}
	

