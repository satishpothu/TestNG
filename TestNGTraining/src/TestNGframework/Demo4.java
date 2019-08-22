package TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {

	WebDriver driver;
	
 @BeforeTest
  public void bt()
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");

	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("www.google.com");
	 
  }
	
	@Test
	public void t()
	{
		
		String title = driver.getTitle();
	     System.out.println(title);
		
		
	}
	
	@AfterTest
	public void at()
	{
		
		driver.close();
	}
	
	
	
	
}
