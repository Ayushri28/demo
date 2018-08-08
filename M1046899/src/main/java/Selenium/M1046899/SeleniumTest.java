package Selenium.M1046899;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";//saving the path of chrome in string
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
		//driver.manage().window().maximize();
		//Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//Thread.sleep(2000);
		//WebElement mobile=driver.findElement(By.linkText("Electronics"));
		//actions.moveToElement(mobile);
		//actions.moveToElement(mobile).moveToElement(driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"))).click().build().perform();
       // driver.findElement(By.xpath("//span[@class='1QZ6fC _3Lgyp8']")).click();
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		
		//driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//driver.findElement(By.xpath("//p[@class='yHn1qE']")).click();
		
//		driver.findElement(By.xpath("//ul[@class='_114Zhd'] //span[contains(text(),'Electronics')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='_3b7jyH']//img[@alt='Mi']")).click();
//		Thread.sleep(2000);
		
		WebElement hower= driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		Actions action = new Actions(driver);
		action.moveToElement(hower).perform();
		
		String cssSelector = "a[title='Mobiles']";
		//String linkText="Mobiles";
		Thread.sleep(3400);
		WebElement we=driver.findElement(By.linkText("Mobiles"));
		we.click();
		
		//driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//driver.findElement(By.xpath("//p[@class='yHn1qE']")).click();
		//try
		//{
			Thread.sleep(4000);
		//}catch(InterruptedException e)
		//{
		//	e.printStackTrace();
		//}
		driver.findElement(By.xpath("//a[@class='_29UPft'] //img[@alt='Mi']")).click();
	}

}