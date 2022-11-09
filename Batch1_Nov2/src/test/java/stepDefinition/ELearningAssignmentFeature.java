package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ELearningAssignmentFeature {
	WebDriver driver;
	@Given("user launch elearning URL")
	public void user_launch_elearning_URL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
	}

	@Given("user click on sign up link")
	public void user_click_on_sign_up_link() {
	    driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
	}

	@When("user fill up all the mandotory fields")
	public void user_fill_up_all_the_mandotory_fields() {
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("def");
		driver.findElement(By.name("email")).sendKeys("abc.def@gmail.com");
		driver.findElement(By.name("username")).sendKeys("sitha1357");
		driver.findElement(By.name("pass1")).sendKeys("abcdef@123");
		driver.findElement(By.name("pass2")).sendKeys("abcdef@123");
		
	}

	@When("user click on register button")
	public void user_click_on_register_button() {
		driver.findElement(By.name("submit")).click();
	}
	
	@When("user verify next button in visible")
	public void user_verify_next_button_in_visible() {
	    //driver.findElement(By.name("next")).isDisplayed();
	    System.out.println("Next button is visible: " +driver.findElement(By.name("next")).isDisplayed());
	}

	@When("user click on next button")
	public void user_click_on_next_button() {
		driver.findElement(By.name("next")).click();
	}
	
	@Then("user click on name dropdown")
	public void user_click_on_name_dropdown() {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	}
	
	@Then("user click on profile")
	public void user_click_on_profile() {
		driver.findElement(By.xpath("//a[text()=' Profile']")).click();
	}

	@Then("user click on messages")
	public void user_click_on_messages() {
		driver.findElement(By.xpath("//li[@class='messages-icon ']")).click();
	}
	@Then("user clcik on compose message")
	public void user_clcik_on_compose_message() {
		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	}
	
	@Then("user fill up all mandatory boxes")
	public void user_fill_up_all_mandatory_boxes() {
		driver.findElement(By.name("title")).sendKeys("Random Message");
	}

	@Then("user click on send message button")
	public void user_click_on_send_message_button() {
		driver.findElement(By.xpath("//button[@name='compose']")).click(); 
	}
	@When("user click on edit profile")
	public void user_click_on_edit_profile() {
		driver.findElement(By.xpath("//em[@class='fa fa-edit']")).click();
	}

	@Then("user edit first name and last name and add phone details")
	public void user_edit_first_name_and_last_name_and_add_phone_details() {
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("def");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
	}

	@Then("click on save settings")
	public void click_on_save_settings() {
		driver.findElement(By.name("apply_change")).click();
	}

}
