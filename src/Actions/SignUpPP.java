package Actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Interfaces.SignUpPage;

public class SignUpPP {
	
	SignUpPage signUpPage = new SignUpPage() {};
	public void signUpPP(WebDriver driver, String firstName, String lastName, String email, String Password, String confirmPwd) {
		//Input data on all fields
		driver.findElement(By.xpath(SignUpPage.txt_FirstName_xpath)).sendKeys(firstName);
		driver.findElement(By.xpath(SignUpPage.txt_LastName_xpath)).sendKeys(lastName);
		driver.findElement(By.xpath(SignUpPage.txt_EmailAddress_xpath)).sendKeys(email);
		driver.findElement(By.xpath(SignUpPage.txt_Password_xpath)).sendKeys(Password);
		driver.findElement(By.xpath(SignUpPage.txt_ConfirmPwd_xpath)).sendKeys(confirmPwd);
		//click submit button
		driver.findElement(By.xpath(SignUpPage.txt_Submit_xpath)).click();
	}
	//Check warning message when input wrong email format
	public void checkWarningWrongEmail(WebDriver driver, String actualResult, String expectedMessage) {
		actualResult = driver.findElement(By.xpath(SignUpPage.txt_WarningWrongEmail_xpath)).getText();
		Assert.assertEquals(actualResult, expectedMessage);
	}
	
	//Check warning blank 
	public void checkWarningblank(WebDriver driver, String actualResult, String expectedMessage) {
		actualResult = driver.findElement(By.xpath(SignUpPage.txt_WarningBlank_xpath)).getText();
		Assert.assertEquals(actualResult, expectedMessage);
	}
}
