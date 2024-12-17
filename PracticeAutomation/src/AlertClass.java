import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	String url="http://demo.automationtesting.in/Alerts.html";
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	Alert al = driver.switchTo().alert();
	al.accept();


//Confirm Alert:cancel/accept
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
Thread.sleep(3000);
Alert al1= driver.switchTo().alert();
//al1.accept();
al1.dismiss();


//Confirm Alert:Sending Text
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
Alert al2=driver.switchTo().alert();
Thread.sleep(2000);
al2.sendKeys("Sushma");
Thread.sleep(2000);
al2.accept();
//driver.close();



}
}