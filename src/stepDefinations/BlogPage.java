package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPage {

	@Before(order=1)
	public void beforeCucumber1()
	{
		System.out.println("Before1");
	}
	@Before(order=2)
	public void beforeCucumber2()
	{
		System.out.println("Before2");
	}
	@BeforeStep
	public void beforeStepCucumber()
	{
		System.out.println("Before Step");
	}
	@Given("user is in Blog page")
	public void userInBlogPage()
	{
		System.out.println("Given Section");
	}
	@When("user enter data in search field")
	public void userEnterData()
	{
		System.out.println("When section");
	}
	@Then("data should appear in search field")
	public void dataShouldAppear()
	{
		System.out.println("Then section");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step");
	}
	@After(order=1)
	public void after1()
	{
		System.out.println("After1");
	}
	@After(order=2)
	public void after2()
	{
		System.out.println("After2");
	}
	
}
