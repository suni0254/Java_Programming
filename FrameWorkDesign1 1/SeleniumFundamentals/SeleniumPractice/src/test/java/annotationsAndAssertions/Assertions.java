package annotationsAndAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    @Test
    public void assertion() {
        String s1 = "Testing";
        String s2 = "testing";

        //This way(Conditional Statements without Assertions) Test case definitely gets passed
        if(s1.equals(s2)) {
            System.out.println("Passed");
            Assert.assertTrue(true);
        }

        else {
            System.out.println("Failed");
            Assert.assertFalse(false);
        }

        //This way it fails
        Assert.assertEquals(s1, s2);
    }
}
