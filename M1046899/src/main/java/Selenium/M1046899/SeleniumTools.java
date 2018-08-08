package Selenium.M1046899;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTools {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		String path="C:\\\\Users\\\\M1046899\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[contains(text(),'DEMO SITES']")).click();
		WebElement hover=driver.findElement(By.xpath("//span[@class='menu-text']"));
		Actions action=new Actions(driver);
		action.moveToElement(hover).perform();
		
		String cssSelector="span[class='menu-text']";
		Thread.sleep(3400);
		WebElement we=driver.findElement(By.linkText("DEMO SITES"));
		we.click();
		
		//String cssSelector1="span[class='menu-text']";
		Thread.sleep(3400);
		
		WebElement we1=driver.findElement(By.linkText("E-Commerce Demo Site"));
		we1.click();
		
		

	}

}