import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSelenium {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://www.browserstack.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Actions Act= new Actions(driver);
		WebElement asyc =driver.findElement(By.xpath("//*[@id=\"signupModalProductButton\"]"));
		//Act.moveToElement(asyc).click();
		Act.contextClick(asyc).perform();
		Act.doubleClick(asyc).perform();
		//Act.contextClick(asyc).perform();
		
		String url2="https://demo.automationtesting.in/Static.html";
		driver.get(url2);
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		Act.dragAndDrop(source, dest).perform();
		
		//moveToElement
		//dragAndDrop
		//sendKeys
		//doubleclick
		//contextClick
		
		
		
		
		
		
		
		
	}

}
