package baseClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    WebDriver driver;
    public BaseClass(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String randomAlphabet() {
        String randAlphabet = RandomStringUtils.randomAlphabetic(5);

        return randAlphabet;
    }

    public String randomNumeric() {
        String randNumeric = RandomStringUtils.randomNumeric(3);

        return randNumeric;
    }

    public String randomAlphaNumeric() {
        String randAlphaNumeric = RandomStringUtils.randomAlphanumeric(8);

        return randAlphaNumeric;
    }
}
