import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement Next =driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]"));
		
		
		
		
	}

}
