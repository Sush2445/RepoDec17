import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	    public static void main(String[] args) throws InterruptedException {
	    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    	WebDriver driver = new ChromeDriver();
	    	String url="https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette";
			driver.get(url);
			driver.manage().window().maximize();
			WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
			Select s=new Select(dropDown);
			s.selectByIndex(8);
			Thread.sleep(3000);
			//s.deselectByIndex(2);
			//Thread.sleep(3000);
			s.selectByValue("AND");
			Thread.sleep(3000);
			s.selectByVisibleText("Albania");
			Thread.sleep(3000);
			
			driver.close();
			
	    }
}
