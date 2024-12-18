

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url ="https://www.greenstechnologys.com/";
		driver.get(url);
		Actions act =new Actions(driver);
		Robot rb =new Robot();
		WebElement course = driver.findElement(By.id("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
		act.moveToElement(course).perform();
		act.contextClick().perform();
		
	}

}
