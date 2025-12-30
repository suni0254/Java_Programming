package Day3_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1) Login ---@BeforeMethod----will execute multiple times before each test method in a class
2) Search---@test
3) Logout---@AfterMethod-----will execute multiple times after each test method in a class
4) Login
5) Advanced Search---@test
6) Logout
 */

public class AnnotationDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}

	@Test(priority=1)
	void search()
	{
		System.out.println("This is search");
	}

	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("This is advanced search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}

}
