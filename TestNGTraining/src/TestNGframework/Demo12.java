package TestNGframework;

import org.testng.annotations.Test;

public class Demo12 {

	
	@Test(timeOut = 3000)
	public void tescase() throws InterruptedException
	{
		
	System.out.println("welcome to session");
	Thread.sleep(4000);
	System.out.println("Selenium");
	
	}
	
	
	
}
