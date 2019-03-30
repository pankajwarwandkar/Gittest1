package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


@Test
public class Xpath12 {

	
	public void readXpath()
	{
	
WebDriver driver= new FirefoxDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("(//*[@id='confirm-passwd']/div[1]/div/div[1]/input//preceding::input[1][@type='text'])")).sendKeys("pankaj");
		
	}
	}
	

