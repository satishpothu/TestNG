package TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo10 {
	
	WebDriver driver;
	@BeforeTest()
	public void BT()
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@Test(groups = {"Smoke"},dependsOnGroups = "TestCase2" )
	public void Testcase1()
	{
		System.out.println("This is my first test");
	
	}
	
	@Test(groups = {"Satish"},priority = 1,enabled =  true,dependsOnMethods = "Testcase1")
	public void testcase2()
	
	
	
	{
		System.out.println("This is my Second test");
		
		
	}
	
	@Test(groups = {"Smoke"},priority = 3)
	public void testcase3()
	
	{
		System.out.println("This is my third test");
		
		
	}
	
	@AfterTest
	public void AT()
	
	{
		driver.close();
		
		
	}
	
	
}
