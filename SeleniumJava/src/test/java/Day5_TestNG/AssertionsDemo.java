package Day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionsDemo {
	@Test
	void testTitle()
	{
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		
		//Without Assertions
		/*
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		*/
		
		/*
		//With Assertions without using conditional statements
		Assert.assertEquals(exp_title, act_title);
		*/
		
		//With Assertions with using conditional statements
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
	}
	
}
