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
