package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitin {
	WebDriver driver;
	
	@Given("^user is already on the login page$")
	public void user_is_already_on_the_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");		
		
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password()
	{
		driver.findElement(By.name("email")).sendKeys("vbreddy1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Icloud#12321");
	}
	
	@Then("^user clicks on Login button$")
     public void user_clicks_on_login_button()
     {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
     }
	
	@And("user is on home page")
	public void user_is_on_homepage()
	{
		Assert.assertEquals("Cogmento CRM", driver.getTitle());
	}
}
