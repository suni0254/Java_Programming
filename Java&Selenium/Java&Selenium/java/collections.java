// what is collections?
//collections is  a framework provided by java
//This framework provide many interfaces and their implemented classes in order to store group of objects(elements) in a single entity.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;
public class collections {
@Test
     public void SampleCollection(){
          ChromeDriver driver = new ChromeDriver();
          driver.get("https://rahulshettyacademy.com/AutomationPractice/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          driver.manage().window().maximize();

     String[] Names ={"Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty","Rahul Shetty"};

          List<String>Table= new ArrayList<>();
          List<WebElement>sampleTable=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[text()='Rahul Shetty']"));
          String value ="";
          for (int i=0; i<sampleTable.size(); i++){
               Table.add(sampleTable.get(i).getText());
          }
          System.out.println(Table);

         // insert an element
     Table.add(0,"Naresh");
     System.out.println(Table);

          //remove
//          Table.remove(9);
//          System.out.println(Table);

//     List<String>expectedNames= Arrays.asList(Names);
//     Assert.assertEquals(Table,expectedNames,"Atcual msg not equal to Expected");
     driver.quit();
       }

}
