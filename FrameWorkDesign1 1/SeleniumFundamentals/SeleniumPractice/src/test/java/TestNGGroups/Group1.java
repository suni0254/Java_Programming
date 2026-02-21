package TestNGGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group1 {

    @Test(priority = 1, groups = {"Java"})
    public void loops() {
        System.out.println("Done with Loops of Java");
    }

    @Test(priority = 2, dependsOnMethods = {"loops"}, groups = {"Java", "Python"})
    public void oops() {
        System.out.println("From Java and Python");
    }

    @Test(priority = 3, dependsOnMethods = {"loops", "oops"}, groups = {"Java", "Python"})
    public void variables() {
        System.out.println("From Java and Python");
    }

    @Test(priority = 4, dependsOnMethods = {"variables"}, groups = {"Python"})
    public void collections() {
        System.out.println("need to start python");
        Assert.fail();
    }
}
