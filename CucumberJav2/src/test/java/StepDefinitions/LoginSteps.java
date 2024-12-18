/*package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {
	WebDriver driver=null;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
  	    System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\eclipse-workspace\\CucumberJav2\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

	}

	@When("user scroll down")
	public void user_scroll_down() {
		// Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtScroll1= driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)",txtScroll1);
		throw new io.cucumber.java.PendingException();
		
	}
	@And("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		Thread.sleep(3000);
		System.out.println("user enters username and password");
	}

	@And("click on submit button")
	public void click_on_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		System.out.println("click on submit button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.getPageSource().contains("Logged In Successfully");
		System.out.println("user is navigated to home page");
	}

}
*/

package StepDefinitions;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginSteps {
	
	WebDriver driver = null;
 
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\eclipse-workspace\\CucumberJav2\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		
	}
 
	@When("user scroll down")
	public void user_scroll_down() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtscroll = driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtscroll);	
		Thread.sleep(3000);
		
	}
		
	
	@And("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		Thread.sleep(3000);
	}
	
	@And("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
	}
 
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		driver.getPageSource().contains("Logged In Successfully");
        driver.close();
	}
}
 
