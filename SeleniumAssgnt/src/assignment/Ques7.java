package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {

	public static WebDriver driver;
	public static void main(String[] args) {
		String pathChromeDriver = "C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathChromeDriver);
		driver = new ChromeDriver();
		driver.get("https://gmail.com");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mydemo12345678@gmail.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.manage().window().maximize();
		
		

	}

}
