package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Interfaces.ContactPage;

public class ContactPP {
	ContactPage contactPage = new ContactPage() {};
	
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
}
