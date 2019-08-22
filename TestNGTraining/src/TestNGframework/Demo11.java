package TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo11{
	WebDriver driver;
	@Parameters("mybrowser")
	@BeforeTest	
	public void launch(String mybrowser)
	{
	   if(mybrowser.equalsIgnoreCase("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\SatishPothu\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		   driver = new FirefoxDriver();
		   
		      
	   }   
		 
	   else if(mybrowser.equalsIgnoreCase("chromedriver"));
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
		    
	   }
	   
		
	}


@Test
  public void f() {
	
	driver.get("https://www.google.com");
	String title  = driver.getTitle();
	System.out.println(title);
			
  }




@AfterTest()
public void at()
{
	
driver.close();
System.out.println("Both the browsers has been closed");

}

}