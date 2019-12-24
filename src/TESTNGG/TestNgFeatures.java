package TESTNGG;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
		@Test
	public void loginTest()
	{
		
		System.out.println("Login Test:"+Thread.currentThread().getId());
		 		
		
	}
	
	@Test
	public void homePageTest()
	{
		System.out.println("HomePage Test:"+Thread.currentThread().getId());
		
		
	}
	
	@Test
	public void searchPageTest()
	{
		System.out.println("searchpage Test:"+Thread.currentThread().getId());
		
	}
	
	
	
	
	
}
