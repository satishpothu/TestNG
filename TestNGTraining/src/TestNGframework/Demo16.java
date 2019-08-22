package TestNGframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo16 {

	
@Test
public void A()
{
	
Assert.assertEquals("satish", "siva");

}
	
@Test(priority = 2)	
public void B()
{
	System.out.println("B");
}
	
@Test()	
public void C()
{
	System.out.println("C");
}

@Test(priority =1,dependsOnMethods ="A",alwaysRun =true)	
public void D()
{
	System.out.println("D");
}

	
	
	
	
	
	
	
	
}
