package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.LoginPage_PF;

public class LoginPage_PFSteps {
	
	WebDriver driver;
	LoginPage_PF loginpf;
	
    @Given("chrome browser is open")
    public void openBrowser()
    {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    }
    
    @And("user is on the login page")
    public void loginPage()
    {
    	driver.get("https://example.testproject.io/web/");
    }
    
    @When("^user enters the (.*) and (.*)$")
    public void enterCredentials(String username,String password)
    {
    	loginpf = new LoginPage_PF(driver);
    	loginpf.enterUsername(username);
    	loginpf.enterPassword(password);
    }
    
    @And("click on login button")
    public void clickLogin()
    {
    	loginpf.clickOnLogin();
    }
    
    @Then("user is redirect to form page")
    public void formPage()
    {
    	System.out.println(driver.getPageSource().contains("TestProject Example page"));
    }

}
