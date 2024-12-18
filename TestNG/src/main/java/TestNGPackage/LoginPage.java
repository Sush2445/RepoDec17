package TestNGPackage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	@Test(priority=1)
	void loginPage() throws InterruptedException {
		driver=new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\eclipse-workspace\\TestNg\\src\\test\\resources\\drivers\\chromedriver.exe");
					    driver = new ChromeDriver();
						driver.manage().window().maximize();
						Thread.sleep(3000);
					   //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
						driver.navigate().to("https://practicetestautomation.com/practice-test-login");
						//SoftAssert softassert=new SoftAssert();
						String Title1 =driver.getTitle();
						System.out.println(Title1);
						String Title2= "Test Login | Practice Test Automation";
						System.out.println(Title2);
						//Assert.assertEquals("Title1","Title2");
						Assert.assertFalse(Title1==Title2);
						//softassert.assertAll();
	}
		
		
	@Test(priority=2)
	void user_scroll_down() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtscroll = driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtscroll);	
		Thread.sleep(3000);
		
		
		
	}
	@Test(priority=3)
	void user_enters_credentials() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		Thread.sleep(3000);
		
		
	}
	@Test(priority=4)
	void submit() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=5)
	void navigation_to_homePage() {
		
		driver.getPageSource().contains("Logged In Successfully");
        driver.close();
	}
}