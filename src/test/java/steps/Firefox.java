package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {
	
	WebDriver driver;
	
	@Given("firefox is open")
	public void firefox_is_open() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	}

	@Then("close the firefox")
	public void close_the_firefox() {
	    driver.close();
	}

}
