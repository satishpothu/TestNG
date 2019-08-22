package TestNGframework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo13 {
	
	public WebDriver driver;
	
	@Test
	public void testcase() throws MalformedURLException
	{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver =  new RemoteWebDriver(new URL("http://9.195.12.86:4444/wd/hub "),capabilities);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
		 	 	 	
		 	
		
		
				
	}
	

}
