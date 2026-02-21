import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class calenders {
    WebDriver driver;
    public String headerValue = "Email";

    @Test
    public void getDataFromTable() {


        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        List<WebElement> monthAndYear=driver.findElements(By.cssSelector(".DayPicker-Months  .DayPicker-Caption  div"));
         getListOfItems(monthAndYear);
    }

    public  List<String>getListOfItems(List<WebElement>elements){
        List<String>itemsList=new ArrayList<>();

        for(int i=0;i<elements.size();i++){
            itemsList.add(elements.get(i).getText());
        }
        System.out.println("itemsList ::"+itemsList);
        return itemsList;
    }

//    public void selectDate(){
//        WebElement element=driver.
//                findElement(By.xpath(""))
//    }


}
//.DayPicker-Months  .DayPicker-Caption  div