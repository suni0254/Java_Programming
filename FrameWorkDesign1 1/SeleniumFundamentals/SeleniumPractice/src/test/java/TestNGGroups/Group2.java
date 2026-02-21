package TestNGGroups;

import org.testng.annotations.Test;

public class Group2 {
    @Test(priority = 1, groups = {"Python", "Selenium"})
    public void conditional() {
        System.out.println("statements from python");
    }

    @Test(priority = 2, groups = {"Java"})
    public void stringBuilder() {
        System.out.println("Java dependent");
    }
}
