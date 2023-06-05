package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class Input {
	WebDriver driver;

	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Given("load the url of google")
	public void load_the_url_of_google() {
		driver.get("https://www.google.co.in/");
	}

	@When("provide the input as {string} and press enter")
	public void provide_the_input_as_and_press_enter(String data) {
		driver.findElement(By.id("APjFqb")).sendKeys(data, Keys.ENTER);
	}

	@Then("Count and Verify the results")
	public void count_and_verify_the_results() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}
