package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterFeature {
	WebDriver driver;
	
	@Given("Twitter website is launched")
	public void twitter_website_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
	}

	@When("Twitter username bar is visible")
	public void twitter_username_bar_is_visible() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("text")).isDisplayed()); 
	}

	@When("enter Twitter username {string}")
	public void enter_Twitter_username(String string) {
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys(string);
	}

	@When("Twitter Password bar is visible")
	public void twitter_Password_bar_is_visible() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("password")).isDisplayed()); 
	}

	@When("enter Twiter password {string}")
	public void enter_Twiter_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}
	
	@When("click on Next button")
	public void click_on_Next_button() {
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	@When("Next button is visible")
	public void next_button_is_visible() {
		System.out.println(driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed()); 
	}
	@Then("close the twitter page")
	public void close_the_twitter_page() {
	    driver.close();
	}




}
