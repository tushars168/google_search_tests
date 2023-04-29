package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.amazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.amazonPage;

public class searchProducts extends amazonBase {
	
	amazonPage ap;
	
	@Given("i am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		
	launchBrowser();
		
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String product_name) {
	    ap= new amazonPage(driver);
	    ap.enterTextonSearchBar(product_name);
	   
	}

	@When("i click on the search button")
	public void i_click_on_the_search_button() {

ap= new amazonPage(driver);
ap.clickOnsearchButton();

//hi hi
	}

	@Then("i can see the serach result successfully")
	public void i_can_see_the_serach_result_successfully() {
	    
		
	}

}
