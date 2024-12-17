
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.Set;
	 
	public class Windowhandle {
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path of the chromedriver executable
	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	 
	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	 
	        // Navigate to Naukri website
	      driver.get("https://www.naukri.com/");
	        
	        // Store the ID of the parent window
	        String parentWindow = driver.getWindowHandle();
	 
	        // Assuming there is a link or button that opens a new child window, click it
	        WebElement childWindowLink = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a/div"));
	        childWindowLink.click();
	 
	        // Get all window handles
	        Set<String> allWindows = driver.getWindowHandles();
	 
	        // Iterate through window handles
	        for (String windowHandle : allWindows) {
	            if (!windowHandle.equals(parentWindow)) {
	                // Switch to child window
	                driver.switchTo().window(windowHandle);
	                
	                // Perform operations on the child window
	                System.out.println("Title of child window: " + driver.getTitle());
	                
	                // Close the child window
	                driver.close();
	            }
	        }
	         Thread.sleep(5000);
	        // Switch back to the parent window
	        driver.switchTo().window(parentWindow);
	 
	        // Perform operations on the parent window
	        System.out.println("Title of parent window: " + driver.getTitle());
	 
	        // Close the parent window
	        //driver.quit();
	    }
	
		
		
		
	}
	

