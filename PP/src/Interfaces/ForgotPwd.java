package Interfaces;

public interface ForgotPwd {

	//email textbox
	String txt_email_xpath = "//input[@id='email_address']";
	
	//Back to login button
	String txt_backLink_xpath = "//*[@id=\"form-validate\"]/div[2]/p[2]";
	
	//Submit button
	String txt_submit_xpath = "//button[@title='Submit']";
}
