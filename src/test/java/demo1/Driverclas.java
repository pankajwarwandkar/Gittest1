package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Driverclas {


	public static void main(String args[])
	{
	
	String path= "D:\\selanium class\\crmproject\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.wpengine.com");
	
	
	}
}
