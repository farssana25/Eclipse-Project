package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingCalorieCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5Q744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");

		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("20");
		driver.findElement(By.id("cheightmeter")).clear();
		driver.findElement(By.id("cheightmeter")).sendKeys("130");
		driver.findElement(By.id("ckg")).clear();
		driver.findElement(By.id("ckg")).sendKeys("15");
		
		

	}

}
