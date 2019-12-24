package TESTNGG;

import org.testng.annotations.Test;

public class Dependsonxml {

		
		@Test(groups = {"FirstGroup"})
		public void Test1()
		{
			System.out.println("Test1 method");
			
		}
		

		@Test(groups = {"SecondGroup"})
		public void Test2()
		{
			
		System.out.println(4/0);
		}
		
	}


