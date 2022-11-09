package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookFeature {
	
	WebDriver driver;
	@Given("Facebook website is launched")
	public void facebook_website_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@When("username bar is visible")
	public void username_bar_is_visible() {
		System.out.println(driver.findElement(By.name("email")).isDisplayed()); 
	}

	@When("enter username {string}")
	public void enter_username(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@When("Password bar is visible")
	public void password_bar_is_visible() {
		System.out.println(driver.findElement(By.name("email")).isDisplayed()); 
	}

	@When("enter password {string}")
	public void enter_password(String string) {
		driver.findElement(By.id("pass")).sendKeys(string);
	}
	
	@Then("close the facebook page")
	public void close_the_facebook_page() {
	    driver.close();
	}
}


