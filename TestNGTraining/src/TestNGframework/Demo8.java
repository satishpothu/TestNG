package TestNGframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo8 {

	@Test
	public void A()
	{
	String exp = "Satish";
	String act = "Satish1";
	Assert.assertEquals(exp, act);
	}
	@Test(dependsOnMethods = "A", enabled = true)
	public void B()
	{
	String exp = "Satish";
	String act = "Sunil";
	Assert.assertEquals(exp, act);
	}
	@Test
	public void C()
	{
	String exp = "Satish";
	String act = "Sunil";
	Assert.assertEquals(exp, act);
	}
}
