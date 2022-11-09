package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CalculatorAssignmentFeature {
	WebDriver driver;
	String actualTitle;
	String expectedTitle;
	
	@Given("user launch BMI Calculator URL")
	public void user_launch_BMI_Calculator_URL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net");
	}

	@Given("user validate title of the current page")
	public void user_validate_title_of_the_current_page() {
		actualTitle = driver.getTitle();
		expectedTitle ="Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Actual Title: " +actualTitle);
		    System.out.println("Expected Title: " +expectedTitle);
		    System.out.println("Title Matched");
		}else
			System.out.println("Title didn't match");
		//System.out.println(driver.getTitle());
	}

	@When("user click on BMI Calculator")
	public void user_click_on_BMI_Calculator() {
	    driver.findElement(By.xpath("//a[text()='BMI Calculator']")).click();
	}
	
	@When("user validate title of the current page again")
	public void user_validate_title_of_the_current_page_again() {
		actualTitle = driver.getTitle();
		expectedTitle ="BMI Calculator";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Actual Title: " +actualTitle);
		    System.out.println("Expected Title: " +expectedTitle);
		    System.out.println("Title Matched");
		}else
			System.out.println("Title didn't match");
	}


	@When("user enters {string} {string} and {string}")
	public void user_enters_and(String age, String height, String weight) {
		driver.findElement(By.name("cage")).clear();
	    driver.findElement(By.name("cage")).sendKeys(age);
	    driver.findElement(By.name("cheightmeter")).clear();
	    driver.findElement(By.name("cheightmeter")).sendKeys(height);
	    driver.findElement(By.name("ckg")).clear();
	    driver.findElement(By.name("ckg")).sendKeys(weight);
	}

	@Then("User click on Calculate button")
	public void user_click_on_Calculate_button() {
	    driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	}

	@Then("user gets the BMI result value")
	public void user_gets_the_BMI_result_value() {
		System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']/b")).getText());
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	    driver.close();
	}

}
