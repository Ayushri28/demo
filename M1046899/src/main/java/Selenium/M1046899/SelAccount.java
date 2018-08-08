package Selenium.M1046899;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelAccount {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.get("https://store.demoqa.com/");
		driver.findElement(By.xpath("//div[@id='account']")).click();
		//driver.findElement(By.id("log")).sendKeys("Ayushi");
		driver.findElement(By.xpath("//input[@id='log']")).sendKeys("Ayushi");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ayu123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
