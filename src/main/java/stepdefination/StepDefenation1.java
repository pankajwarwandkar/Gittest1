package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenation1 {

	
	
	WebDriver driver;
	//You can implement missing steps with the snippets below:

		@Given("^Open firefox and start application$")
		public void open_firefox_and_start_application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   driver =new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("https://www.facebook.com/");
		}

		@When("^I enter valid username and valid password$")
		public void i_enter_valid_username_and_valid_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.xpath(".//*[@data-testid='royal_email']")).sendKeys("data");;
		   driver.findElement(By.xpath(".//*[@data-testid='royal_email' ]/following::input[1]")).sendKeys("data");
		   
		   //*[@data-testid='royal_email' ]/following::input[1];
		   
		}

		@Then("^user should be able to login successfully$")
		public void user_should_be_able_to_login_successfully() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@data-testid='royal_email' ]/following::input[2]")).click();
			
			
			//*[@data-testid='royal_email' ]/following::input[2]
		}

}
