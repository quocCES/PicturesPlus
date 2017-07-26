package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Interfaces.ForgotPwd;

public class ForgotPassword {
	
	ForgotPwd forgotPwd = new ForgotPwd() {};
	public void forgotPwd(WebDriver driver, String email) {
		//Input data on email field
		driver.findElement(By.xpath(ForgotPwd.txt_email_xpath)).sendKeys(email);
		//Click button submit
		driver.findElement(By.xpath(ForgotPwd.txt_submit_xpath)).click();
	}
}