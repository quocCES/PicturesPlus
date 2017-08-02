package TestModules;

import org.testng.annotations.Test;
import Actions.Signin_action;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TM_signin {
	
	Signin_action signinAction = new Signin_action();
	WebDriver driver;
	
		//Test case TC_042
  @Test(priority=3)
  //Verify that user can login successfully when inputting valid data for all fields.
  public void TC_042() throws InterruptedException  {
	  
	  	Thread.sleep(5000);

		signinAction.SigninPP(driver, "hoang.nguyen@mailinator.com", "12345678");
		
		signinAction.check_page(driver, "actual_result", "My Account | Picture Plus");
		
  }

	//Test case TC_043
	@Test(priority=1)
	  
	  //Verify that user can NOT login with blank all fields
	  public void TC_043() {
		  
		  signinAction.SigninPP(driver, "", "");
		  signinAction.check_message(driver, "actual_result", "This is a required field.");
		  
	  }
	
	//Test case TC_044
	@Test(priority = 2)
	
	//Verify that user can NOT login with invalid email format
	public void TC_044() {
		
		signinAction.SigninPP(driver,"linh@@mailinator.com","12345678");
		
		signinAction.check_message(driver, "actual_result", "Please enter a valid email address. For example johndoe@domain.com.");
		
		}
		
	
	@BeforeTest
	public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "/home/code-engine-studio/selenium/chromedriver");
		  driver = new ChromeDriver();
		  driver.get("https://picturesplus.com/customer/account/login/");
		  driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Test done!");
		  driver.quit();

	}
}


