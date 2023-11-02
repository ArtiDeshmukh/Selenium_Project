package stepDefinations;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage {
	public static WebDriver driver;
	@Given("Browser is already opened") 
	public void startChrome()
	{
		System.setProperty("webdriver.driver.chrome", "C:/Software/drivers/chromedriver.exe");		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("User is in home page")
	public void navigateSearchPage()
	{
		
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@When("User enter valid {string} in seach field")
	public void userEnterValidDate(String product)
	{
		driver.findElement(By.name("search")).sendKeys(product);
	}
	
	@And("User click on search button")
	public void clickSearch()
	{
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
	}
	
	
	@Then("Product {string} should list down")
	public void verifyProduct(String product)
	{
	assertTrue(driver.findElement(By.xpath(".//a[text()='"+product+"']")).isDisplayed());	
	
	}
	
	@Given("Closed opened")
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Given("Smoke Testing")
	public void smokeTest()
	{
		System.out.println("Smoke Testing");
	}
}
