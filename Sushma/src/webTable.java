import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Example = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/h3"));
		js.executeScript("arguments[0].scrollIntoView(true)",Example);
		
		//find the table
		WebElement main =driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div"));
		
		//to get rows elements using tagname
		List<WebElement> tr = main.findElements(By.tagName("tr"));
		
		//iterating each row:
		for (int i=0;i<tr.size();i++) {
			WebElement row = tr.get(i);
			
			///to get heading in that table
			List<WebElement> th = main.findElements(By.tagName("th"));
			for(int j=0;j<th.size();j++) {
				WebElement head = th.get(j);
				String text = head.getText();
				System.out.println(text);			
			}
			
			//to get data in that table
			List<WebElement> td = main.findElements(By.tagName("td"));
			for(int j=0;j<td.size();j++) {
				WebElement data = td.get(j);
				String text1 = data.getText();
				System.out.print(driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div")).getText()+ " ");
				System.out.println( );	
			}	
	 
				
				}
		
				
		//CSS VALUE:
		
		

		
			}
	
		
	}


