import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]"));
		Next.click();
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//*[@id=\"java_technologies\"]/li[1]/a")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/h")));
		driver.close();		

}
}
