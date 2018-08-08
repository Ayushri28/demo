package utility_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constant {
	
	//static WebDriver driver;
	public static String url="https://corpapps.mindtree.com/ams";
	
	public void c( WebDriver driver)
	{
		
	
		 String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			
		
		
		
	}
	
	

}
