import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String []args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
        //Single Frame:
		WebElement singFrame =driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
        //driver.manage().timeouts();
		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi");
		WebElement iframeTextbox=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
	    //iframeTextbox.clear();
		
		//Multiple frame
		WebElement NestedFrame=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		NestedFrame.click();
		
		
		       //switch to outer iframe
				WebElement OuterFrame =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
				driver.switchTo().frame("OuterFrame");
				
		       //Switch to inner frame:
				WebElement InnerFrame =driver.findElement(By.xpath("iframe[@src=\"SingleFrame.html']"));
				driver.switchTo().frame("InnerFrame");
				
              //Actions inside innerframe
				WebElement iframeTextbox1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
				Thread.sleep(2000);
				iframeTextbox1.sendKeys("Test");
				
		
}
}
