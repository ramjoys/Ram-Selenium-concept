package TESTNGG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderconcept {
	
	
	@Test(dataProvider = "dp")
	
	public void value(String n, String s)
	
	{
		System.out.println(n+" "+s);
		
	}
	
	@DataProvider
	
	public Object[][] dp()
	{
		return new Object[][]
				{
			
			new Object[] {"Ram", "Kani"}
			
				};
		
			}
	

}
