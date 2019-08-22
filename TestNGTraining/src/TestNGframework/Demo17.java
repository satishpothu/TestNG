package TestNGframework;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports extent;
		ExtentTest logger;
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/satish.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+ "\\extent-config.xml"));
		logger = extent.startTest("Demo17");
         System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://www.google.com/");
		logger.log(LogStatus.PASS,"Web Page opened");
		String title =  driver.getTitle();
		logger.log(LogStatus.PASS,title);
		driver.close();
		logger.log(LogStatus.FAIL,"Web browser closed");
		extent.endTest(logger);
		extent.flush();
		extent.close();
		
		
		
		
		
		
		
	}

}
