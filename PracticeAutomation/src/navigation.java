import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String url2 = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url2);
		
		
		driver.navigate().to("https://www.guru99.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
		//driver.navigate().to("url");
		//driver.navigate().forward();//refresh() back()}

}
