package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques13 {

	
		
		//static WebDriver driver;
		public static void main(String args[])
		{
			String path ="C:\\Users\\M1046820\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver = new ChromeDriver();
			 driver.get("http://toolsqa.com/automation-practice-table/");
			 List<WebElement> a=driver.findElements(By.xpath("//tr[@class='odd']"));
			 for(WebElement b:a)
			 {
				System.out.println(b.getText()); 
			 }
			String s= driver.findElement(By.xpath("//table[@class='tsc_table_s13']//td[contains(text(),'Dubai')]")).getText();
			 System.out.println(s);
			 
		}

	}


