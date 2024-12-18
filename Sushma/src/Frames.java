import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://demo.automationtesting.in/Frames.html");
		/*driver.manage().window().maximize();
		driver.manage().timeouts();
		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.switchTo().frame("singleframe");
		WebElement iframeTextbox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		Thread.sleep(5000);
		//iframeTextbox.clear();
		//Thread.sleep(5000);
		iframeTextbox.sendKeys("Automation Testing");*/
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		//switch to outer iframe
		WebElement outerIframe =  driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerIframe);
		
		//switch to inner iframe
		WebElement innerIframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerIframe);
		
		//Actions inside innerframe
		WebElement iframeTextbox1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		Thread.sleep(2000);
		iframeTextbox1.sendKeys("Test");
		
		//switch back
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.close();
		
}
}
