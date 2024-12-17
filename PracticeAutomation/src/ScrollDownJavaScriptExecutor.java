import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownJavaScriptExecutor {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url ="https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
		driver.manage().window().maximize();
		
		/*JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement txtScroll= driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)",txtScroll);	
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();*/
		
		//Note:--- use . after arguments not,
		//upcasting
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		WebElement txtScroll1= driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js1.executeScript("arguments[0].scrollIntoView(true)",txtScroll1);
		WebElement txtEmail =driver.findElement(By.xpath("//*[@id=\"username\"]"));
		js1.executeScript("arguments[0].setAttribute('value','student')",txtEmail);
		Object object = js1.executeScript("return arguments[0].getAttribute('value')", txtEmail);
		
		//upcasting
		String s1=(String)object;
		System.out.println(s1);
		WebElement txtPass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		js1.executeScript("arguments[0].setAttribute('value','Password123')", txtPass);
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		js1.executeScript("arguments[0].click()", Login);
		
		
	}

		
	}


