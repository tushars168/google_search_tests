package advancdCelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Object timeUnit;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement cloA = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement cloB = driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(cloA, cloB).build().perform();
        act.dragAndDropBy(cloA, 100, 100).build().perform();
        
        Thread.sleep(5000);
        
        driver.quit();

	}

}
