package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFeature {
	
	WebDriver driver;
	
	@Given("Google website is launched")
	public void google_website_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@When("search bar is visible")
	public void search_bar_is_visible() {
	  System.out.println(driver.findElement(By.name("q")).isDisplayed()); 
	}

	@Then("enter text farz")
	public void enter_text_farz() {
	    driver.findElement(By.name("q")).sendKeys("farz");
	}


}
