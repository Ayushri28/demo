package Selenium.M1046899;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.xpath("//div[@class='iUmrbN']"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		driver.findElement(By.id("//input[@type='q']"));
		
		
	}

}
