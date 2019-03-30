package demo1.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderG {

@Test
public void gbLogin()
{

	
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"driver//chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:/Users/Vaio/git/Gittest1/driver/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
//log1.info("run it");
   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   driver.get("https://www.goibibo.com"); 
   // class="form-control inputTxtLarge widgetCalenderTxt"

   driver.findElement(By.xpath("//*[@class='form-control inputTxtLarge widgetCalenderTxt']")).click();
   
   driver.findElement(By.xpath("//*[@id='fare_20190215']")).click();
 //*[@id='fare_20190215']
   //*[@class='form-control inputTxtLarge widgetCalenderTxt']
 //  log1.info("wait done");
	//driver.get("https://www.facebook.com");
//log1.info("open browser");
//driver.quit();
	
}
}
