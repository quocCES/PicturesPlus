package Interfaces;

public interface SignUpPage {
	
	//firstName textbox
	String txt_FirstName_xpath = "//input[@id='firstname']";
	
	//lastName textbox
	String txt_LastName_xpath = "//input[@id='lastname']";
	
	//email textbox
	String txt_EmailAddress_xpath = "//input[@id='email_address']";
	
	//password textbox
	String txt_Password_xpath = "//input[@id='password']";
			
	//Confirm password textbox
	String txt_ConfirmPwd_xpath = "//input[@id='confirmation']";

	//Submit button
	String txt_Submit_xpath = "//button[@title='Submit']";
	
	//back link
	String txt_Back_xpath = "//a[@class='back-link']";
	
	//Warning wrong email Message
	String txt_WarningWrongEmail_xpath = "//*[@id='advice-validate-email-email_address']";
	
	//Warning blank message
	String txt_WarningBlank_xpath = "//div[@class='validation-advice']";

}
