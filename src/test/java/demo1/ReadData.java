package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Parameters;







public class ReadData {
	
		
	public static WebDriver driver ;
	
	
	
	@Test()

	@Parameters({"browsername"})
	
	
	public static void geadDataFromPeremeter(String browsername)
	
	

	{
	if( browsername.equalsIgnoreCase("mozzila"))
	{
	 
		 driver = new FirefoxDriver();	
		 
		 Reporter.log("mozila is open");
		
	}
	else if (browsername.equalsIgnoreCase("chrome"))
	{
	
	 System.setProperty("webdriver.chrome.driver", System.getProperty("D:\\selanium class\\crmproject\\drivers\\chromedriver.exe"));
	
	 driver= new ChromeDriver();
	 Reporter.log("Chrome is open");
	
	
	}

	driver.get("https://www.facebook.com");
	
	 Reporter.log("testing is done");
	
	// If the browser is Firefox, then do this
/*
	  if(browsername.equalsIgnoreCase("mozzila")) {

		  driver = new FirefoxDriver();

	  // If browser is IE, then do this	  

	  }else if (browsername.equalsIgnoreCase("chrome"))
		{
			
			 System.setProperty("webdriver.chrome.driver", System.getProperty("D:\\selanium class\\crmproject\\drivers\\chromedriver.exe"));
			
			WebDriver driver= new ChromeDriver();

	  } 

	  // Doesn't the browser type, lauch the Website

	  driver.get("https://www.facebook.com"); 
	*/
	
	}
}
