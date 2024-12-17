import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValues {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]"));
		String color=Next.getCssValue("color");
		System.out.println(color);
		System.out.println("font-size");
		System.out.println("color");
		System.out.println("font-weight");
		System.out.println("text-align");
		System.out.println("background-color");
		
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:blue')",Next);
		driver.close();
		
		
		
	}

}
