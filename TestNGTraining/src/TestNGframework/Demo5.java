package TestNGframework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo5 {
	
	WebDriver driver;	
	@Before
	
	public void b() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("www.google.com");
		 
		
		
	}
	
	
	@Test
	 public void t()
	 
	 {
		
		
		System.out.println("This is my test method");
		
	 }
	 
	
	@After
	public void at()
	{
		
		System.out.println("This is my after test method");
		
	}
	
	
	
	
	

}
