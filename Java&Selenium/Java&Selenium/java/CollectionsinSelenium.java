import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsinSelenium {
    public static WebDriver driver;

    @Test
    public void SampleColletion() {
        String application = "https://money.rediff.com/gainers/bse/daily/groupa";
        String application1="https://www.naukri.com/";
        setup(application1);
        SetUsage();
        String xpathList="//a[contains(text(),'Hatsun Agro Prod')]/parent::td/ancestor::tr/preceding-sibling::tr";
        ElementListUsage(xpathList);
        driver.quit();

    }

    private static void setup(String application1) {
        driver = new ChromeDriver();
        driver.get(application1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    public static void ElementListUsage(String xpath) {
        List<WebElement> precedingSblings = driver.findElements(By.xpath(xpath));
        Iterator<WebElement> itr = precedingSblings.iterator();
        String value = "";
        int i = 1;
        while (itr.hasNext()) {
            WebElement element = itr.next();
            value = element.getText();
            System.out.println("Element getText: " + value);


            //       }
       /* String value="";
        List<String> element = new ArrayList<>();
        for (int i=0; i<=precedingSblings.size(); i++) {
            element.add(precedingSblings.get(i).getText());
        }
        System.out.println("Element getText: "+ value );
    }*/
        }
    }

    public static void SetUsage(){
        String parentWindowHandles = driver.getWindowHandle();
        Set<String>childWindowHandles=driver.getWindowHandles();
        String childWindow="";
        Iterator<String>itr=childWindowHandles.iterator();
        while (itr.hasNext()){
            childWindow=itr.next();
            System.out.println("child window handle: " +childWindow);

            if(!parentWindowHandles.equals(childWindow)){
                driver.switchTo().window(childWindow);
                System.out.println("child window title: "+driver.getTitle());
            }
              else
                System.out.println("This is Parent Wndow, its tittle: "+driver.getTitle());
              driver.switchTo().defaultContent();
        }
    }
}