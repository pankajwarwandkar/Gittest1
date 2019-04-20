package demo1.driver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Log {
	
  public Logger log= Logger.getLogger(Log.class.getName()); 
	//private static Logger log= Logger.getLogger(Log.class.getName());
@Test
public  void startTest()
{
	
	System.setProperty("webdriver.chrome.driver","C:/Users/Vaio/git/Gittest1/driver/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	log.info("launch driver");
	driver.get("https://www.facebook.com/");
	log.info("pankaj");
	driver.close();
}

}
