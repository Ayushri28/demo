package Selenium.M1046899;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAmazon {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//h2[@data-attribute='Redmi 5 (Gold, 32GB)']//ancestor::li[@id='result_4']")).click();
		driver.findElement(By.id("//div[@class='a-row a-spacing-mini']//ancestor::li[@id='result_4']")).click();
		//driver.findElement(By.xpath("//div[@class='a-row a-spacing-none']//ancestor::li[@id='result_4']")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//driver.findElement(By.xpath("//h2[@data-attribute='Asian shoes Wonder-13 Grey Firozi Mesh Kids Shoes']")).click();
		
		//driver.findElement(By.xpath("//div[@class='_3b7jyH']"));
	}
}