import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Example = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/h3"));
		js.executeScript("arguments[0].scrollIntoView(true)",Example);
		
		//to get the table id using xpath
		WebElement main =driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div"));
		
		//to get row element:
		List<WebElement> tr = main.findElements(By.tagName("tr"));
		
		//iterating each
		
		for(int i=0;i<tr.size();i++) {
			WebElement row=tr.get(i);
			
			//to get heading in that table
			List<WebElement> th =row.findElements(By.tagName("th"));
			for(int j=0;j<th.size();j++) {
				WebElement head = th.get(j);
				String text = head.getText();
			     System.out.println(text);
			}
			//to get data in table
			List<WebElement> td=row.findElements(By.tagName("td"));
			for(int k=0;k<td.size();k++) {
				WebElement data =td.get(k);
				String text1 =data.getText();
				System.out.println(text1);
			}
		}
		String url ="https://www.w3schools.com/html/html_tables.asp";
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavaScriptExecutor)driver;
		WebElement example=driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/h3"));
		js.executeScript("argument[0].scrollIntoVie(true)", example);
		
		WebElement table =driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div"));
		
		List<WebElement>tr=table.findElements(By.tagmName("tr"));
		
		//iterating each
		for(int i=0;i<tr.size();i++) {
			WebElement row=tr.get(i);
			
		}
		
		//heading
		List<WebElement>th=table.findElements(By.tagNmae("th"));
		for(int j=0;j<th.size();j++) {
			WebElement heading=th.get(j);
		}
		
		//to get data
		List<WebElement>td=table.findElements(By.tagName("td"));
		for(int k=0;k<td.size();k++) {
			WebElement td=td.get(k);
			String txt=data.getText();
			System.out.println(txt);
		}
		
		
		
		
	driver.close();
		
	}
	
	

}
