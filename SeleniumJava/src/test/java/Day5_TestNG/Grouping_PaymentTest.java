package Day5_TestNG;

import org.testng.annotations.Test;

public class Grouping_PaymentTest {
	
	@Test(priority =1, groups = {"sanity", "regression","functional"})
	void paymentInRupees()
	{
		System.out.println("This is payment in Rupees");
	}
	
	@Test(priority =2,groups = {"sanity", "regression","functional"})
	void paymentInDollars()
	{
		System.out.println("This is payment in Dollars");
	}

}
