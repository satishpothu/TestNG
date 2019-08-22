package TestNGframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo15 {

	
@Test(priority =2 )
public void A()
{
	
Assert.assertEquals("satish", "satish");

}
	
@Test(priority =3,dependsOnMethods = "A")	
public void B()
{
	System.out.println("B");
}
	
@Test	
public void C()
{
	System.out.println("C");
}

@Test(priority =1)	
public void D()
{
	System.out.println("D");
}

	
	
	
	
	
	
	
	
}
