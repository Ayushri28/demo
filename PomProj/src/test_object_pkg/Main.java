package test_object_pkg;

import org.openqa.selenium.WebDriver;

import utility_pkg.Constant;
import page_object_pkg.FinalRequest;
import page_object_pkg.HomePage;
import page_object_pkg.NewRequest;

public class Main {
	
	//static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 Constant ob1=new Constant();
		 HomePage ob2=new HomePage();
		 NewRequest ob3=new NewRequest();
		 FinalRequest ob4=new FinalRequest();
		 
		 String url="https://corpapps.mindtree.com/ams";
		 
		 ob1.c(url, driver);
		 ob2.home(driver);
		 ob3.newReq(driver);
		 ob4.FinalReq(driver);
		 
		 
		 
		
		

	}

}