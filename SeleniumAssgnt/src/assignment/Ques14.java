package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques14 {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pathChromeDriver = "C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathChromeDriver);
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[@title='QFX K11 Basic Feature Dual Sim Mobile Phone (Black)']")).click();
	}
}