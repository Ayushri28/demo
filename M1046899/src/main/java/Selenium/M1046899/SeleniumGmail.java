package Selenium.M1046899;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGmail {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		driver.get("https://www.gmail.com");
		//driver.findElement(By.xpath("//div[@class='whsOnd zHQkBf']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shrivastavaayushi28@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(), 'Compose')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id=':q2']")).sendKeys("saurabh@qatechhub.com");
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
        driver.findElement(By.xpath("//div[@id=':qp']")).sendKeys("Test Mail");
        
        
        
	}

}