package Day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertions {
	@Test
	void test()
	{
		//Assert.assertEquals("xyz", "abc");
		//Assert.assertEquals(123, 456);
		//Assert.assertEquals("123", 123);
		
		//Assert.assertNotEquals(123, 123);			//Fail
		//Assert.assertNotEquals(123, 456);			//Pass
		
		//Assert.assertTrue(true);		//Pass
		//Assert.assertTrue(false); 		//Fail
		//Assert.assertTrue(1==2);			//Fail
		
		//Assert.assertFalse(1==2);		//Pass
		//Assert.assertFalse(1==1);       //Fail
		
		//Assert.fail();  //It will directly fail test case without verification
		
	}
	

}
