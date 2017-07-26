package Interfaces;

public interface ContactPage {
	
	//FirstName textbox
	String txt_firtName_xpath = "//input[@id='firstname']";
	
	//LastName textbox
	String txt_lastName_xpath = "//input[@id='lastname']";
	
	//Email textbox
	String txt_email_xpath = "//input[@id='email']";
	
	//Subject textbox
	String txt_subject_xpath = "//input[@id='subject']";
	
	//Message textbox
	String txt_Message_xpath = "//*[@id=\"me\"]";
	
	//Button submit
	String txt_submit_xpath = "//*[@id=\"contactForm\"]/div[5]/div/button";
	
	// Frequently Asked Questions link
	String txt_faqLink_xpath = "//div[2]/div/div/div[1]/div/div/div[1]/div[2]/div/div/a[3]";
	
	//websales@picturesplus.com link
	String txt_websales_xpath = "//div[2]/div/div/div[1]/div/div/div[1]/div[2]/div/div/a[1]";
}
