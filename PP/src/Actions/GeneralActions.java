package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Interfaces.ContactPage;
import Interfaces.SignUpPage;
import Interfaces.ForgotPwd;
import Interfaces.ReadyMadeFrames;

public class GeneralActions {
	SignUpPage signUpPage = new SignUpPage() {};
	ContactPage contactPage = new ContactPage() {};
	ForgotPwd forgotPwd = new ForgotPwd() {};
	ReadyMadeFrames readyMadeFrames = new ReadyMadeFrames() {};
	
	public void signUpPP(WebDriver driver, String firstName, String lastName, String email, String Password, String confirmPwd) {
		//Input data on all fields
		driver.findElement(By.xpath(signUpPage.txt_FirstName_xpath)).sendKeys(firstName);
		driver.findElement(By.xpath(signUpPage.txt_LastName_xpath)).sendKeys(lastName);
		driver.findElement(By.xpath(signUpPage.txt_EmailAddress_xpath)).sendKeys(email);
		driver.findElement(By.xpath(signUpPage.txt_Password_xpath)).sendKeys(Password);
		driver.findElement(By.xpath(signUpPage.txt_ConfirmPwd_xpath)).sendKeys(confirmPwd);
		//click submit button
		driver.findElement(By.xpath(signUpPage.txt_Submit_xpath)).click();
	}
	
	public void contactPP(WebDriver driver, String FirstName, String LastName, String Email, String Subject, String Message) {
		//Input data on all fields
		driver.findElement(By.xpath(ContactPage.txt_firtName_xpath)).sendKeys(FirstName);
		driver.findElement(By.xpath(ContactPage.txt_lastName_xpath)).sendKeys(LastName);
		driver.findElement(By.xpath(ContactPage.txt_email_xpath)).sendKeys(Email);
		driver.findElement(By.xpath(ContactPage.txt_subject_xpath)).sendKeys(Subject);
		driver.findElement(By.xpath(ContactPage.txt_Message_xpath)).sendKeys(Message);
		//Click button submit
		driver.findElement(By.xpath(ContactPage.txt_submit_xpath)).click();
	}
	
	public void forgotPwd(WebDriver driver, String email) {
		//Input data on email field
		driver.findElement(By.xpath(ForgotPwd.txt_email_xpath)).sendKeys(email);
		//Click button submit
		driver.findElement(By.xpath(ForgotPwd.txt_submit_xpath)).click();
	}
	
	public void readyMadeFrames(WebDriver driver) {
		//filter style
		driver.findElement(By.xpath(ReadyMadeFrames.txt_AllStyle_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_KoaStyle_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_ModernStyle_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_DisstreesedStyle_xpath));
		
		//filter color
		driver.findElement(By.xpath(ReadyMadeFrames.txt_AllColor_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_Gray_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_Black_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_Red_xpath)).click();
		driver.findElement(By.xpath(ReadyMadeFrames.txt_White_xpath)).click();
		
		
	}
	
}
