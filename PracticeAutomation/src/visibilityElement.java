import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class visibilityElement {

	public static void main(String [] args) throws InterruptedException {
		        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				String url ="https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette";
				driver.manage().window().maximize();
				driver.get(url);
				WebElement Aboutbtn=driver.findElement(By.xpath("//*[@id=\"menu-item-53896\"]/a"));
				
				//to check whether wenelement is displayed
				boolean displayed =Aboutbtn.isDisplayed();
				System.out.println(displayed);
				
				//to check webelement is enabled
				WebElement enabled=driver.findElement(By.xpath("//*[@id=\"menu-item-6898\"]/a"));
				boolean enabled1=enabled.isEnabled();
				System.out.println(enabled1);
				
				//to check webElement is selected
				/*WebElement Select = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
				Select.click();
				//Select btn4 =new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
				driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option[3]")).click();
				Thread.sleep(2000);
				//btn4.selectByIndex(2);
				boolean selected1 =Select.isSelected();
				System.out.println(selected1);*/
				
				driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")).click();
				Thread.sleep(3000);
				WebElement country = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option[103]"));
				country.click();
				boolean selected = country.isSelected();
				System.out.println(selected);
				
			
				
				
	}
}
