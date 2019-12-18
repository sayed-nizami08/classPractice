package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestEnvironment {
	
	WebDriver driver;
	

	@Given("^User is on Tek School of America Web Page$")
	public void user_is_on_Tek_School_of_America_Web_Page() throws Throwable {
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tekschoolofamerica.com");
	}

	@When("^User Navigates to Test Environment$")
	public void user_Navigates_to_Test_Environment() throws Throwable {
		
		driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
	}

	
	@Then("^TEK SCHOOL is displayed$")
	public void tek_SCHOOL_is_displayed() throws Throwable {
	   String testEnvironment = driver.getTitle();
	   
	 System.out.println(testEnvironment);
	   
	}


}
