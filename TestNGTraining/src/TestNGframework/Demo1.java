package TestNGframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo1 {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("This is the before suite");
	}
	
@Test
public void T()

{
	System.out.println("This is my first Test");
}
  @BeforeTest
  public void f() {
	  
	  System.out.println("This is first method");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("before method of first class");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method of first class");
	  
  }

  @BeforeClass
  public void beforeClass() {
	 System.out.println("Before class of first one ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After first class of first one");
  }

}
