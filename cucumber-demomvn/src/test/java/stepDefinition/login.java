package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class login {
	WebDriver driver;

	@Given("I login to the application")
	public void i_login_to_the_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PadmajaNayak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter valid name {string}")
	public void i_enter_valid_name(String name) {
		driver.findElement(By.id("txtUsername")).sendKeys(name);
	}

	@When("I enter valid password {string}")
	public void i_enter_valid_password(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("I should see username as {string}")
	public void i_should_see_username_as(String username) {
		String actual = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(username, actual);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[text()='Logout']"));
		driver.quit();
	}
}
