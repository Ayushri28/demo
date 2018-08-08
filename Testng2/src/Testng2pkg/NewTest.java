package Testng2pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	static WebDriver driver;
	
	
	 @BeforeMethod
	  public void beforeMethod() {
		  
		  String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			driver.get("https://corpapps.mindtree.com/ams");
	  }
	 
  @Test
  public void f() throws InterruptedException {
	 driver.findElement(By.xpath("//img[@class='purple']//ancestor::li")).click(); 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Thread.sleep(1000);
	 WebElement datebox=driver.findElement(By.xpath("//input[@id='txtFromDate']"));
	 datebox.sendKeys("03/09/2018");
	 datebox.sendKeys(Keys.TAB);
	 WebElement datebox1=driver.findElement(By.xpath("//input[@id='txtToDate']"));
	 datebox1.sendKeys("03/09/2018");
	 datebox1.sendKeys(Keys.TAB);
	 driver.findElement(By.xpath("//textarea[@id='requestorComments']")).sendKeys("outing");
//	 Select type=new Select(driver.findElement(By.xpath("//select[@id='ddlRequestType']")));
//	 type.SelectByIndex(1);
	 
	 Select type = new Select(driver.findElement(By.xpath("//select[@id='ddlRequestType']")));
	 type.selectByIndex(1);
	 Thread.sleep(1000);
	  Select fromTime=new Select(driver.findElement(By.xpath("//select[@id='drpFromTime']")));
	 // fromType.selectByVisibleText("5:30 PM");
	 fromTime.selectByIndex(1);
	 Thread.sleep(1000);
	 
	 Select toTime=new Select(driver.findElement(By.xpath("//select[@id='drpToTime']")));
	 toTime.selectByIndex(4);
	 Thread.sleep(1000);
	 WebElement radio1= driver.findElement(By.xpath("//input[@id='chkBoxDinner']"));
	 radio1.click();
	 
	 Thread.sleep(1);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(2000);
  }
 

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }
  
  public static void main(String args[]) throws InterruptedException
  {
	  
	  NewTest ob=new NewTest();
	  ob.f();
	    
	  
  }

}
