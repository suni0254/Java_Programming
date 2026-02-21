package TestNGGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

    @Test(priority = 1)
    public void login() {
        System.out.println("Logged in successfully");
        Assert.fail();
    }

    @Test(priority = 2, dependsOnMethods = {"login"})
    public void selectField() {
        System.out.println("Field selected");
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login", "selectField"})
    public void logout() {
        System.out.println("Application logged out");
        Assert.assertTrue(true);
    }
}
