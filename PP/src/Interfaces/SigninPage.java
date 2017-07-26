package Interfaces;

public class SigninPage {
	
	//Email text box
	public String email_xpath = ".//*[@id='email']";
	
	//Password text box
	public String password_xpath = ".//*[@id='pass']";
	
	//SignIn button
	public String signin_button_xpath = ".//*[@id='send2']";
	
	//Create an account button
	public String createAccount_button_xpath = ".//*[@id='login-form']/div[2]/div[2]/button";
	
	//Error message
	public String error_message_class = "validation-advice";

}



