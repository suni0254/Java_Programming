package annotationsAndAssertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations2 {

    @AfterMethod
    public void afterMethod() {
        System.out.println("Printed from After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Printed from Before Class");
    }

    @Test(priority = 2)
    public void secondTest() {
        System.out.println("This is 2nd Test");
    }
}
