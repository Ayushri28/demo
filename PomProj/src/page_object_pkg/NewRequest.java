package page_object_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewRequest extends Constant{

	public void newReq(WebDriver driver) throws InterruptedException
	{
	
		
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(1000);
		
	}
	
}