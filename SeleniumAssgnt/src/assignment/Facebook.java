package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		String pathChromeDriver="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",pathChromeDriver);
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.findElement(By.id("email"));
		System.out.println("Email tab present");
		driver.findElement(By.id("email")).sendKeys("7064266780");
		driver.findElement(By.id("pass"));
		System.out.println("Password tab present");
		driver.findElement(By.id("pass")).sendKeys("aaaaaaa");
		Thread.sleep(3000);
		String s=driver.findElement(By.id("email")).getText();
		System.out.println(s);
		if(s.equals("7064266780"))
			System.out.println("Verified mail id");
		else
			System.out.println("Not same");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		

	}

}

