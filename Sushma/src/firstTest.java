import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class firstTest {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		//set the location of chrome because to execute in chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*String url="https://www.guru99.com";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		//driver.quit();
		
		
		//locators:
		//if you want to perform any action you can use this locator this will find the same path and perform the action
       //whatever present in webpage is webelement ex text,link etc,,
		//By id,By name,By linkText,By xpath,By css selector,By class name,By tagname
		
		//WebElement search = driver.findElement(By.name("search"));
		//search.sendKeys("smoke testing");
		//driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[1]")).click();
		
		Actions act =new Actions(driver);
		WebElement softwaretesting =driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[1]/div[2]/div/div[2]/span[1]/a/img"));
		act.moveToElement(softwaretesting).perform();
		Thread.sleep(4000);
		act.doubleClick(softwaretesting).perform();
		
		
		String url2 = "https://demo.automationtesting.in/Static.html";
		driver.get(url2);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"Accepted Elements\"]")).click();
		//driver.manage().timeouts();		
		WebElement sour = driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		act.dragAndDrop(sour, dest).perform();
		Thread.sleep(2000);
		WebElement sour1 = driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
		WebElement dest1 = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		act.dragAndDrop(sour1, dest1).perform();
		Thread.sleep(2000);
		WebElement sour2 = driver.findElement(By.xpath("//*[@id=\"node\"]"));
		WebElement dest2 = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		act.dragAndDrop(sour2, dest2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sour2, dest2).perform();
		Thread.sleep(5000);
		Thread.sleep(4000);
		//driver.close();
		
		driver.get("https://www.greenstechnologys.com/");
		Actions act2=new Actions(driver); //action declarartion
		Robot r= new Robot(); //robot declaration
		//WebElement course =driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
		//act.moveToElement(course).perform();
		//Thread.sleep(5000);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_UP);//
		//driver.close();
		
		int i;
		for (i=0;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Accept
		//simple alert:
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);	
		
		Alert alert= driver.switchTo().alert(); //performing simple alert clicking ok
		
		alert.accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		alert.dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		alert.sendKeys("Sushma");
		alert.accept();*/
		
		//Javascript Executor:
		/*String url5 = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url5);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtScroll = driver.findElement(By.xpath("//*[@id=\"login\"]/ul/li[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",txtScroll);
		//pass values in textbox
		Thread.sleep(3000);
		WebElement txtEmail = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','student')",txtEmail);
		//retrieve the user entered text
		Object object = js.executeScript("return arguments[0].getAttribute('value')",txtEmail);
		//upcasting
		String s1 = (String)object;
		System.out.println(s1);
		Thread.sleep(3000);
		WebElement txtPass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','Password123')",txtPass);
		//button click using javascript
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		js.executeScript("arguments[0].click()",btnLogin);
		Thread.sleep(2000);
		
		//Takes screenshot:
		//type casting
		//TakesScreenshot ts =(TakesScreenshot)driver;
		
		//take screenshot
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Copy from src and save it in destination in folder
		File dest = new File("C:\\Users\\SS241\\Downloads\\Screenshot_Selenium\\img.jpg");
		Files.copy(src,dest);
		System.out.println("Screenshot taken and saved:" +dest.getAbsolutePath());*/
		
		//Visiblity of webelement
		//isEnabled,isDisplayed,isSelected
		/*driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[2]/h1"));
		
		//to check whether wenelement is displayed
		/*boolean displayed =btn.isDisplayed();
		System.out.println(displayed);
		
		//to check webelement is enabled
		//WebElement enabled=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[2]/h1"));
		boolean enabled=btn.isEnabled();
		System.out.println(enabled);
		
		//webelement is selected
		WebElement selected=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select selected2 =new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		Thread.sleep(2000);
		selected2.selectByIndex(3);
		boolean select =selected.isSelected();
	    System.out.println(select);
	    driver.close();*/
	    
	    //frames:
	    /*driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("Customer ID/User ID");*/
		
	    //windows handling:
	   /*String url="https://www.google.com";
	   driver.get(url);
	   driver.manage().window().maximize();
	   String parentid =driver.getWindowHandle();
	   System.out.println(parentid);
	  Set<String> childid= driver.getWindowHandles();
	  System.out.println(childid);
	  
	  String parentid1=driver.getWindowHandle();
	  Set<String> childid1=driver.getWindowHandles();*/
	  
	  /*driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw9Km3BhDjARIsAGUb4nwlJX12P_AnKpH2jl-8V1JDDXDjvf6Hyvp5G_87ftcD8lffPOcgOxYaAqI_EALw_wcB&gclsrc=aw.ds");
	  //whoever come first parent having get handle,having string
	  driver.manage().window().maximize();
	 
	   
       WebElement google= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/p/a[1]"));
	   google.click();
	   String parentid=driver.getWindowHandle();
	   System.out.println(parentid);
	   Set<String> childid=driver.getWindowHandles();
	   System.out.println(childid);
	   //driver.close();
	   
	  //to switch into child window
	   for(String allWind: childid) {
		   if(!(parentid.equals(allWind))){
			   driver.switchTo().window(allWind);
			   Thread.sleep(3000);
			   
		   }
	
	   }
	   
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/p/a[1]")).click();
	   driver.switchTo().defaultContent(); */
		
	
	   
	   
	   
	   
	}

}
