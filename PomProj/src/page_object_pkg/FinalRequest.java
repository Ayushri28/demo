package page_object_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FinalRequest extends Constant{
	
	public void FinalReq(WebDriver driver) throws InterruptedException
	{
		
		 WebElement datebox=driver.findElement(By.xpath("//input[@id='txtFromDate']"));
		 datebox.sendKeys("03/09/2018");
		 datebox.sendKeys(Keys.TAB);
		 WebElement datebox1=driver.findElement(By.xpath("//input[@id='txtToDate']"));
		 datebox1.sendKeys("03/09/2018");
		 datebox1.sendKeys(Keys.TAB);
		 driver.findElement(By.xpath("//textarea[@id='requestorComments']")).sendKeys("outing");
		 
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

}
