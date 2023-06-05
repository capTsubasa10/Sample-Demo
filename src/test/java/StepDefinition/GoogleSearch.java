package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver;

	@Given("Launch the google chrome browser")
	public void launch_the_google_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("load the google url")
	public void load_the_google_url() {
		driver.get("https://www.google.co.in/");

	}

	@When("provide summer update in google search text box and press ENTER")
	public void provide_summer_update_in_google_search_text_box_and_press_enter() {
		driver.findElement(By.id("APjFqb")).sendKeys("Summer update", Keys.ENTER);

	}

	@Then("verify the results")
	public void verify_the_results() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	@When("take screenshot of the result page")
	public void take_screenshot_of_the_result_page() {

	}

}
