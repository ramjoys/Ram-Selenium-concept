package TESTNGG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test(timeOut=2000)
	public void infiniteLoopTest()
	{
		int i=1;
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
			
		
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String s="100A";
		Integer.parseInt(s);
		
		System.out.println("Test passed without exception thrown");
		
	}
	
	
	
	
	
	
}
