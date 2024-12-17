import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotssssss {

	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url ="https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
		driver.manage().window().maximize();
		
		TakesScreenshot sc= (TakesScreenshot)driver;
		
		//take screenshot
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Copy from src and save it in destination in folder
		
		File dest= new File("C:\\Users\\SS241\\Downloads\\Screenshot_Selenium\\img1.jpg");
		Files.copy(src,dest);
		System.out.println("Screenshot saved" +dest.getAbsolutePath());
		
	
}
}
File src =((TakesScreenshot)driver).getScreenshotAs(outputtype.File);
File dest=new File("new path.jpg");
fILES.COPY(SRC,DEST)



