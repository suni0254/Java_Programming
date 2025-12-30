package Day4_TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class3 {
	@Test
	void xyz()
	{
		System.out.println("This is xyz from Class3");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite");
	}

}
