package seleniumProjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome", "C:/Software/drivers/chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//driver.navigate().to("https://demoqa.com/browser-windows/");
		//driver.wait(1000);
		
		//driver.findElement(By.xpath("//div[@id='tabButtonWrapper']/following-sibling::div[1]/child::button")).click();
		
		List<WebElement> radiobtncount = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiobtncount.size());
		driver.close();
		
	}

}
