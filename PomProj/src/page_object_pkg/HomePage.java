package page_object_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility_pkg.Constant;

public class HomePage extends Constant {

	
	
	public void home(WebDriver driver)
	{
		driver.get(Constant.url);
		driver.findElement(By.xpath("//img[@class='purple']//ancestor::li")).click(); 
		
		
	}
}
