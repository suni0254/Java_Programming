import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlingTablesParameter {
    WebDriver driver;
    public String headerValue = "Email";

    @Test
    public void getDataFromTable() {


        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
       /* WebElement tableLastNameData = driver
                .findElement(By
                        .xpath("//table[@id='table1']/descendant::span[text()='Last Name']/ancestor::table/tbody/tr[1]/td[1]"));

        String lastName = tableLastNameData.getText();
        System.out.println(lastName);*/
        Assert.assertEquals(getData("Last Name"), "Smith");
        getHeaderItemList();
        getIndexOfHeaderItem("Email");
    }

    public String getData(String headerName) {
        WebElement tableLastNameData = driver
                .findElement(By
                        .xpath("//table[@id='table1']/descendant::span[text()='" + headerName + "']/ancestor::table/tbody/tr[1]/td"));

        System.out.println(tableLastNameData.getText());
        return tableLastNameData.getText();
    }

    public List<String> getHeaderItemList() {
        List<WebElement> headerList = driver.findElements(By.cssSelector("#table1 thead  tr  th"));
        List<String> headerNames = new ArrayList<>();

        for (int i = 0; i < headerList.size(); i++) {
            headerNames.add(headerList.get(i).getText());
        }
        System.out.println(headerNames);
        // if you want Index you write below 2 lines
        int index=headerNames.indexOf("Last Name");
        System.out.println("index ::" +index);
        return headerNames;


    }

    public int getIndexOfHeaderItem(String item){
        List<WebElement>headerList=driver.findElements(By.cssSelector("#table1 thead  tr  th"));
        List<String>headerNames=new ArrayList<>();

        for(int i=0; i<headerList.size(); i++){
            headerNames.add(headerList.get(i).getText());
        }
        System.out.println(headerNames);
        int index =headerNames.indexOf(item);
        System.out.println("index::"+index);
        return index;
    }


 // pass the Index value
    public String getData1(String headerName,int index) {
        WebElement tableLastNameData = driver
                .findElement(By
                        .xpath("//table[@id='table1']/descendant::span[text()='" + headerName + "']/ancestor::table/tbody/tr[1]/td["+index+"]"));

        System.out.println(tableLastNameData.getText());
        return tableLastNameData.getText();
    }



}
