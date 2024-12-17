import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url ="https://www.guru99.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		//To get title
		String title =driver.getTitle();
		System.out.println(title);
		
		//To get url
		String url1 =driver.getCurrentUrl();
		System.out.println(url1);
		
		//Locators:
		driver.findElement(By.name("search")).sendKeys("smoke Testing");
		driver.findElement(By.className("gsc-search-button")).click();
	    //driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[1]")).click();
		
		driver.close();
		
		
		
	}

}
