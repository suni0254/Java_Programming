package Day4_TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	void pqr()
	{
		System.out.println("This is pqr from class2");
	}
	
	
	@AfterTest
	void at()
	{
		System.out.println("This is after test method");
	}

}
