package TestNGGroups;

import org.testng.annotations.Test;

public class Group3 {

    @Test(priority = 1, groups = {"Selenium"})
    public void webDriver() {
        System.out.println("Selenium Webdriver");
    }

    @Test(priority = 2, groups = {"Selenium", "Java"})
    public void assertions() {
        System.out.println("Java Selenium");
    }
}
