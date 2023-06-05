package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class SecondGoogle {
	WebDriver driver;

	@Given("Open the browser")
	public void open_the_browser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Given("Load the google.in url")
	public void load_the_google_in_url() {
		driver.get("https://www.google.co.in/");
	}

	@When("Pass the input as laptop inside the search text box and press enter")
	public void pass_the_input_as_laptop_inside_the_search_text_box_and_press_enter() {
		driver.findElement(By.id("APjFqb")).sendKeys("LAPTOP", Keys.ENTER);
	}

	@Then("display the results and verify")
	public void display_the_results_and_verify() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("take the screenshot")
	public void take_the_screenshot() {
		
	}

}
