package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPagePOM;

public class LoginPagePOMSteps {
	
	WebDriver driver;
	LoginPagePOM login_POM;
	
	@Given("open browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		login_POM = new LoginPagePOM(driver);
	}
	
	@And("user on login page")
	public void loginPage()
	{
		driver.get("https://example.testproject.io/web/");
	}
	
	@When("^user enter (.*) and (.*)$")
	public void enterCredentials(String username,String password)
	{
		
		login_POM.enterUsername(username);
		login_POM.enterPassword(password);
	}
	
	@And("user click on login button")
	public void loginButton()
	{
		login_POM.clickLogin();
	}
	
	@Then("user is navigated to the form")
	public void testForm()
	{
		System.out.println(driver.getPageSource().contains("TestProject Example page"));
	}

}
