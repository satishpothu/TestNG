package TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	
	WebDriver driver;
	@Test
	public void test() {
	String expectedTitle = driver.getTitle();
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void test1() {
		String expectedTitle = "Satish";
		String actualTitle = "Satish121";
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	
	@BeforeTest
	public void	beforeTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://google.com");
	}
	
	@AfterTest
	public void at()
	{
		
		driver.close();
		
	}
	
		
		
		
	}
	


