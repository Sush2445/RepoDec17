import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Next=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]"));
		String color=Next.getCssValue("color");
		System.out.println(color);
		
		//Highlighting text:
		WebElement txtHighlight = driver.findElement(By.xpath("//*[@id=\"main\"]/p[1]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow')",txtHighlight);
		
		//Navigation commands:
		String url2 = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url2);
		
		driver.navigate().to("https://www.guru99.com");
		Thread.sleep(3000);
		driver.navigate().back(); //go to previous page(move to w3 school)
		Thread.sleep(3000);
		driver.navigate().forward();//(move to guru99)
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
	}
}
