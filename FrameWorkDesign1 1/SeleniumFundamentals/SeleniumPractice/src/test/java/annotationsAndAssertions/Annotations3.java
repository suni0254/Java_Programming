package annotationsAndAssertions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotations3 {
    @Test(priority = 3)
    public void thirdTest() {
        System.out.println("This is 3rd Test");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("Printed from After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Printed from After Test");
    }
}
