package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques11 {

	public static void main(String[] args) throws InterruptedException {
		
		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       //WebElement basetable=driver.findElement(By.tagName("table"));
		//Thread.sleep(1000);
		//WebElement tablerow=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/table/tbody/tr[2]/td[3]"));
		WebElement tablerow=driver.findElement(By.xpath("//table[@class='tsc_table_s13'] //tr[1] //td[2]"));
		Thread.sleep(1000);
		String cell=tablerow.getText();
		
		System.out.println(cell);
		Thread.sleep(5000);
		//WebElement d=driver.findElement(By.xpath("//table[@class='tsc_table_s13'] //tr[1] //td[6]"));
		//d.click();
		//driver.findElement(By.xpath("//a[@href='#']//ancestor::table[@class='tsc_table_s13']")).click();
		WebElement tablerow1=driver.findElement(By.xpath("//table[@class='tsc_table_s13'] //tr[1] //td[6]"));
		tablerow1.click();
		Thread.sleep(1000);
		//String cell1=tablerow1.getText();
		
		//driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click(); 
		
		
		//System.out.println(cell1);
	}

}