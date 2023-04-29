package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {
	
	WebDriver driver;
	public amazonPage(WebDriver dr) {
	   this.driver = dr;
	   PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBar;
	
	
	@FindBy(xpath ="//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	public void enterTextonSearchBar(String product) {
		searchBar.sendKeys(product);
	}
	
	public void clickOnsearchButton() {
		searchButton.click();
	}

}
