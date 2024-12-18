import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public class CssValue {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			//String url="https://www.guru99.com";
			//driver.get(url);
			
			//IMPLICIT WAIT:
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//WebElement SearchBar =driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/h1"));
			//SearchBar.sendKeys("testing");
			//driver.close();
			
			//Explicit Wait:
			//String url1="https://www.guru99.com";
			//driver.get(url1);
			//driver.manage().window().maximize();
			/*driver.findElement(By.xpath("//*[@id=\"kt-accordion-header-994548\"]")).click();
			WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.findElement(By.xpath("//*[@id=\"java_technologies\"]/li[1]/a")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"post-478\"]/div/header/h1")));
			//driver.findElement(By.xpath("//*[@id=\"post-194\"]/div/header/h1"));*/
			
			//driver.findElement(By.xpath("//*[@id=\"menu-item-3174\"]/a/span/span/span/svg")).click();
			//webdriver wait
			//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"post-478\"]/div/header/h1")));
			//driver.findElement(By.xpath("//*[@id=\"menu-item-4681\"]/a")).click();
			
			//driver.close()	;	
			String url2="https://www.guru99.com";
			driver.get(url2);
			driver.manage().window().maximize();
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[1]/div[2]/div/h3")));
			driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[1]/div[2]/div/div[2]/span[1]/a/img")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"post-1299\"]/div/header/h1")));
			driver.findElement(By.xpath("//*[@id=\"post-1299\"]/div/header/div/div[2]/div/div/a[3]")).click();
			driver.close();
			
			
			
			
			
			

}
}
}
