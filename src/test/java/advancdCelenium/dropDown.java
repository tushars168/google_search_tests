package advancdCelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select s = new Select(dropDown);
		// selecting by Index
		//s.selectByIndex(1);
		// selecting Value
		//s.selectByValue("2");
		// selecting by Text
		List<WebElement> allItems = s.getOptions();
		
		for(int i =0; i < allItems.size(); i++) {
			System.out.println(allItems.get(i).getText());
			
		}
	}
}
