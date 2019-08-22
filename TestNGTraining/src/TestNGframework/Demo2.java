package TestNGframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Demo2 {
	
	@AfterSuite
	public void as() {
		
		System.out.println("This is the after suite");
	}
	
	
  @AfterTest
  public void f() {
	  
	  System.out.println("This method belongs to second class");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("second one before class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Second one after class");
  }
  
  
}
