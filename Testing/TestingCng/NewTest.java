package TestingCng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	static WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  
		  String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			//driver.get("https://www.google.co.in/");
			
			driver.get("https://store.demoqa.com/");
		  
	 }
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//div[@id='account']")).click();
		//driver.findElement(By.id("log")).sendKeys("Ayushi");
		driver.findElement(By.xpath("//input[@id='log']")).sendKeys("Ayushi");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ayu123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	 
	  driver.close();
	  
  }

}