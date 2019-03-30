package demo1.driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class SeleniumTestOnGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", System.getProperty("D:\\selanium class\\crmproject\\drivers\\chromedriver.exe"));
		
		WebDriver  driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		// Reporter.log("Chrome is open");
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		
//driver.findElement(By.xpath("//ul[@role='listbox']//li"));
		List<WebElement> wb=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[class='sbqs_c']"));
		System.out.println(wb.size());
        
		for(int i=0;i<=wb.size(); i++)
		{
	System.out.println(wb.get(i).getText().contains("webdriver"));
	if((wb.get(i).getText().contains("webdriver")))
		wb.get(i).click();
	break;
		
		
		
		
	}
	}
}
