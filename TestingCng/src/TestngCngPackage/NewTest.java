package TestngCngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class NewTest {
	 static WebDriver driver;
	 @BeforeSuite
	 public void b()
	 {
		 String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
			
			driver.get("https://store.demoqa.com/");
			 
	 }
  @Test
  public void f() {
	  driver.findElement(By.xpath("//div[@id='account']")).click();
			//driver.findElement(By.id("log")).sendKeys("Ayushi");
			driver.findElement(By.xpath("//input[@id='log']")).sendKeys("Ayushi");
	  
  }
  
 
  @Test
  public void g()
  {
	
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ayu123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
  }
  
  @AfterSuite
  public void a() {
	  driver.close();
  }
	  
  public static void main(String args[])
  {

	  NewTest ob= new NewTest();
	  ob.f();
	  ob.g();
  }
  


}