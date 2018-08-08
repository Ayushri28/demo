package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques16 {

	
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		
		String pathChromeDriver = "C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathChromeDriver);
		driver= new ChromeDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000); 
		
		driver.switchTo().frame("iframeResult");
		
		//driver.findElement(By.xpath("//div[@id='iframecontainer']//button[@onclick='myFunction()']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		//System.out.println("hello"+driver.findElement(By.xpath("//div[@id='container'] //div[@id=\"iframecontainer\"] //iframe[@id='iframeResult']")).getText());
		
	}
}