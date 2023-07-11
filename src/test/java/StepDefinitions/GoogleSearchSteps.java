/*
package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	static WebDriver driver;
	
	@Given("browser is open")
	public void openBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@And("user is on google search page")
	public void searchGoogle()
	{
		driver.get("https://www.google.com/");
	}
	
	
	@When("user enters a text in search box")
	public void enterText()
	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation Step by Step");
	}
	
	@And("hits enter")
	public void hitsEnter()
	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	}
	
	
	@Then("user is navigated to search results")
	public void searchResult()
	{
		driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");
		driver.quit();
	}

}

*/
