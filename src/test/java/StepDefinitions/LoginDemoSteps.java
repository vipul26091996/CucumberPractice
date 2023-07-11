package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {
	
	static WebDriver driver;
	
	@Given("browser is open")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@And("user is on login page")
	public void loginPage()
	{
		driver.get("https://example.testproject.io/web/");
	}
	
	@When("user enters username and password")
	public void enterCredentials()
	{
		driver.findElement(By.id("name")).sendKeys("Vipul");
		driver.findElement(By.id("password")).sendKeys("12345");
	}
	
	@And("user clicks on login")
	public void login()
	{
		driver.findElement(By.id("login")).click();
	}
	
	@Then("user is navigated to the test form")
	public void testForm()
	{
		System.out.println(driver.getPageSource().contains("TestProject Example page"));
		driver.quit();
	}

}
