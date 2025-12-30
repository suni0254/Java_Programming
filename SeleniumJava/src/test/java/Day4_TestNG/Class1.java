package Day4_TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	void abc()
	{
		System.out.println("This is abc from class1");
	}
	
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test method");
	}

}
