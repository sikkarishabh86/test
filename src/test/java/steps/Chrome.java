package steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
	
	WebDriver driver;
	
	Properties prop;
	
	String env = System.getenv("ENV1");
	
	@Before
	public void setup() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
		prop.load(fis);
		
	}
	
	@Given("chrome is open")
	public void chrome_is_open() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	    System.out.println(System.getenv("ENV"));
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
