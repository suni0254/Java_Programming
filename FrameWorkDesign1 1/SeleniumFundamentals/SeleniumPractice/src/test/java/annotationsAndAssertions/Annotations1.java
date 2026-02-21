package annotationsAndAssertions;

import org.testng.annotations.*;

/*Hierarchy
BeforeSuite -> BeforeTest -> BeforeClass -> BeforeMethod -> Test <- AfterMethod <- AfterClass <- AfterTest <- AfterSuite
*/

public class Annotations1 {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Printed from Before Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Printed from After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Printed from Before Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Printed from Before Suite");
    }

    @Test(priority = 1)
    public void firstTest() {
        System.out.println("This is 1st Test");
    }
}
