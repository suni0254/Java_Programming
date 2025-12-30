package Day1_Selenium;

import java.time.Duration;
import java.util.ResourceBundle.Control;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		Actions act = new Actions(driver);
		WebElement sourceText = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		sourceText.sendKeys("WELCOME");
		//CTRL+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		//CTRL+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		//TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		//CTRL+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();



	}

}
