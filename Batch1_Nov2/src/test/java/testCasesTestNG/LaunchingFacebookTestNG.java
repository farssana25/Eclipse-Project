package testCasesTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchingFacebookTestNG {

	WebDriver driver;

	@BeforeTest
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void launchFacebook() {
		driver.findElement(By.id("email")).sendKeys("farz");
		driver.findElement(By.id("pass")).sendKeys("passContainer");
	}

	@AfterTest
	public void closeFacebook() {
		driver.close();
	}

}
