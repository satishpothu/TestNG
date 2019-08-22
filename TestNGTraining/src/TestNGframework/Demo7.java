package TestNGframework;

import org.testng.annotations.Test;

public class Demo7 {
	
	@Test(priority=1)
	public void A()
	
	{
		
		System.out.println("1");
	}
	
	@Test(priority=2)
	public void B()
	{
		System.out.println("2");
	}
	
	@Test(priority=3)
	public void C()
	{
		System.out.println("3");
	}

	@Test
	public void D()
	{
		System.out.println("4");
		
	}
	
	@Test
	public void E()
	{
		System.out.println("5");
		
		
	}
	
}
