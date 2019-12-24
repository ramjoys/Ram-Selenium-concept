import org.testng.TestNG;

import TESTNGG.GoogleTest;



public class ExecutableRunner {

	static TestNG testNg;
	
	public static void main(String[] args) {
	
		
		testNg=new TestNG();
		testNg.setTestClasses(new Class[] {GoogleTest.class});
		testNg.run();

		

	}

}
