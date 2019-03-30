package demo1.driver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class PracticeP {

	public WebDriver driver;

	public static Logger log1= Logger.getLogger(Log.class.getName()); 


@Test(priority=1, enabled=true)
public static void practiceTest() throws Exception
{
	
	DOMConfigurator.configure("log4j.xml");
	
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"//driver//chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"driver//chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:/Users/Vaio/git/Gittest1/driver/chromedriver.exe" );
	 driver= new ChromeDriver();
log1.info("run it");
   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    log1.info("wait done");
	driver.get("https://www.facebook.com");
log1.info("open browser");
//driver.quit();

        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("p");
	
	WebElement e1=driver.findElement(By.id("day"));
	Select s2= new Select(e1);
	s2.selectByValue("2");
	log1.info("d");
	driver.quit();	
}
	/*
	//WebElement e2=driver.findElement(By.id("month"));
	Select s3= new Select(driver.findElement(By.id("month")));
	s3.selectByVisibleText("Mar");
	log1.info("month");
	
	//WebElement e3=driver.findElement(By.id("year"));
	Select s4= new Select(driver.findElement(By.id("year")));
	s4.selectByValue("1999");
	log1.info("year");
	
}
	/*
public void readData()
{


	PracticeP p=new PracticeP();
	p.selectData(, value);
	
	


}
	
	*/
	/*[@name='birthday_day']
	/*[@name=birthday_month']
	 *///*[@name='birthday_month']
	 ////*[@name='birthday_year']
	
	
	



@Test(enabled=false)
public static void practiceTestIE()
{
	/*System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"//driver//chromedriver.exe" );*/
	
	//WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"driver//chromedriver.exe");
	System.setProperty("webdriver.ie.driver","C:/Users/Vaio/git/Gittest1/driver/IEDriverServer.exe" );
	WebDriver driver = new InternetExplorerDriver();
   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   
	driver.get("https://www.facebook.com");

	driver.quit();
}


/*
	public static void radioButton()
	{
	//System.setProperty("webdriver.chrome.driver","C:/Users/Vaio/git/Gittest1/driver/chromedriver.exe" );
	WebDriver driver = new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	driver.get("http://toolsqa.com/automation-practice-form");
	
	List<WebElement> wb=driver.findElements(By.name("sex"));
	
	 boolean value= false;
	  value=wb.get(0).isSelected();
	  if(value==true)
	  {
		  wb.get(1).click();
	  }
	  else
	  {
		  wb.get(0).click();
	  }
	  
*/	  
	//driver.quit();

@Test(enabled=false)
			public static void buttonmp()
			{
				// Create a new instance of the FireFox driver
				WebDriver driver = new FirefoxDriver();
				
				// Put an Implicit wait, 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				// Launch the URL
				driver.get("https://www.facebook.com");
				
				
				List<WebElement> wb=driver.findElements(By.xpath("//*[@name='sex']"));
				boolean bvalue=false;
	
				
				bvalue=wb.get(0).isSelected();
				
				if(bvalue==false )
					
				{
					wb.get(1).click();
				}
				else
				{
					wb.get(0).click();
			}
				
			}
@Test(enabled=false)
	public static void screenSlider()
	{
				
			}
}
	