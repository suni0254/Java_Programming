package Day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo {
	@Test(priority = 1)
	void startCar()
	{
		System.out.println("Car is started");
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods = {"startCar"})
	void driveCar()
	{
		System.out.println("Car is driving");
	}
	
	@Test(priority =3,dependsOnMethods = {"driveCar"})
	void stopCar()
	{
		System.out.println("Car is stopped");
	}
	
	@Test(priority =4,dependsOnMethods = {"stopCar"})
	void parkCar()
	{
		System.out.println("Car is parked");
	}

}
