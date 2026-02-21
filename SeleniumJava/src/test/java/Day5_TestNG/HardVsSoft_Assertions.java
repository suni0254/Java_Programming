package Day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class HardVsSoft_Assertions {
	
	/*
	@Test
	void test_hardAssertions()
	{
		System.out.println("abc");
		System.out.println("def");
		
		Assert.assertEquals(123, 1237);
		
		System.out.println("ghi");
		System.out.println("xyz");
	}
	*/
	
	
	@Test
	void test_softAssertions()
	{
		System.out.println("abc");
		System.out.println("def");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(123, 1237);
		
		System.out.println("ghi");
		System.out.println("xyz");
		sa.assertAll(); 		//Mandatory  If we dont use 'assertAll()' then the test method will be 'PASS'
	}
	
}
