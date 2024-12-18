import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SBQns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SS241\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Get all the options of  by using Select class
	//determine total no of options available
	//select the 2nd last option by substracting 2 from total no of options 
	String str ="url";
	driver.get(str);
	driver.manage().window().maximize();
	
	//webelement initialize
	WebElement dropdownElement = driver.findElement(By.id("dropdown-id"));
	
	//dropdown element locate
	Select dropdown =new Select(dropdownElement);
	
	//get the all dropdown options
	List<WebElement>options =dropdown.getOptions();
	
	//calculate the index for 2nd last option
	int totalOptions = options.size();
	
	//select the 2nd last option
	if(totalOptions >=2) {
		dropdown.selectByIndex(5);
	}
	else {
		System.out.println("Not enough options in dropdowndown to select");
		
	}
	
	//HardAssert
	//public class HardAssertionExample{
	//@Test
	//public void testHardAsser() {
		//System.out.println("Test starts");
	//Assert.assertEquals("actualValue","expectedValue","value dont match");
	//Sysout("execution");
	
	//How will you open the Incognito chrome
	//By using chromeoption
	
	//Initializing the chrome options
	//ChromeOPtions options = new ChromeOptions();
	//options.addARguments("___");
	//Launch in incognito -- Webdriver  =new ChromeDRiver(options);
	//open website and perform actionsdriver
	}
}
//Implicit Wait:
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().timeout().implicitelyWait(20,TimeUnit.SECONDS);


//Launch the web browser
//System.setProperty("webdriver.chrome.driver","C://....exe");
//WebDriver driver=new ChromeDriver();

//How do you find Elements by using Selenium:
//driver.findElement(By.xpath("//Iframe[@src='sush']")).click();
//driver.findElement(By,id("")).senKeys("Sush"));

//How do you handle dropdowns in Selenium
//By using the SelectClass:
//WebElement dropdown = driver.findElementBy.xpath("...");
//Select sel =new Select(dropdown);
//sel.SelectByVisibleText("..");
//sel.SelectByIndex("..");
WebElement dropdown=driver.findElement(By.xpath(""));
Select sel =new sELECT(dropdown);
sel.selectByVisibleText("");
byIndex("");


//Implicit wait:Globa wait there will be no conditions
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//How do you switch between browser windows or tabs in Selenium?
//Using getWindowHandles to get all all set of windows opened by WebDriver and switchTo().window()--to switch in betwwen them
//Ans:--getWindowHandle()---get the currently opened nd focused window i.e parent window & getWindowHandles()--get the all the windows opened
//driver.get("https://www.naukri.com/");
//driver.findElement(By.xpath("//*[@id="register_Layer"]").click();
//String defaultWindow = driver.getWindowHandle();
//Set<String> AllWindows =driver.getWindowHandles();
//Iterator<String> itr = allWindows.iterator();
//itr.next(); //first windowHandle
//String childWindow=itr.next(); //second window handle
//driver.switchTo().window(childWindow)
//driver.close();
//driver.switchTo().window(defaultWindow);
//String allWindows=driver.getWindowHandle();
//Set<String> AllWindows=driver.getWindowHandles();
//Iterator<String>itr=Allwindows.Iterator();
itr.next();
driver.switchTo().window(parentwindow);
driver.switchTo().window(childWindow);

//how do you handle alerts:
aLERT-Interface

//Alert alls=driver.switchTo().alert();
//alls.accept();
//alls.dismiss();
org.openqa.selenium.Alert al=driver.switchTo().alerts()
al.accept();
al.dismiss();

//how u handle EXplicit Wait
//WAiting for specific condition

//WebDriverWait Wait =new WebDriver(driver,Duration.ofSeconds(10));
//wait.until(ExpectedCondition.visibilityofElementLocated(By.id("")));
WebDriverWait wait=new WebDriverDriver(driver,duration.ofSeconds(!0));
wait.until(ExpectedConditions.visibilityOfElementLocatedlocated(By.id(null))))

//How do perform mouse hover
//Actions act = new Actions(driver);
///WebElement element =driver.findElement(By.id(""));
//act.moveToElement(element).perform();
action act=new action(Driver);
act.moveToElement(element).perform();


//handle frames in Selenium
//driver.switchTo().frame(0) //by index
//driver.switchTo().frame("frameName"); //by Name
//driver.switchTo().frame(driver.findElement(By.id(""));
//driver.switchTo().defaultContent();

//how do you upload a file using selenium
//driver.findElement(By.xpath("")).sendKeys("location of the file ex:ss241\\downloads\\wave.jpg"); //find the choose file button then send the lication of file with file type

//how to upload the jpg file from selenium project:
//String projectPath =System.getProperty("user.dir");
//driver.findElement(By.id("uploadfile").sendKeys(projectPath+"\\files\\waves.jpg");

//types of exceptions in selenium:
/*NosuchElementException:when element cannot be found.
timeout exception: exceeded waiting
ElementVisibleException:element is not present
WebDriver Exception: when webdriver is unable to perform action.*/

//maximize window
//driver.manage().window().maximize();


//Take Screenshot:Interface
//File screenshot =((TakesScreenshot))driver).getScreenshotAs(OutputType.FILE);
///FileUtils.copyFiles(screenshot,newFile(".png"));
//File Screenshot =((takesscreenshtot)driver)getScreenshotAS(Outputtype.FILE)
//FileUtils.copyFiles(screenshpt,newfile?(""));

----------------------------------------------------------------

//Waits:Implicit Wait
//driver.manage().timeouts().implicitlyWAit(10,TimeUnit.SECONDS);

//Explicit Wait:
//WebdriverWait wait = new WebDriverWait(driver,20);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));

//Implicit wait:
	//driver.manage().timeouts().implicitelyWait(10,TimeUnit.SECONDS)
	
//Explicit Wait:
//WEBDRIVER Wait =new Webdriver(driver,20);
//wait.Until(ExpectedConditions,visibilityOfElemeentLocated(By.id("")));
		
		
//how do u handle dropdowns in selenium:
WebElement dropdown =driver.findElement(By.id(""));		
Select sel =new Select(dropdown);
sel.selectByvisibleText("");

//handle windows:
String url ="";
driver.get(url);
driver.manage().window().maximize();
String defaultWindow = driver.getWindowHandle();
Set<String> AllWindows =driver.getWindowHandles();
Iterator<String> itr =Allwindows.Iterator();
itr.next(); //first window handle
String childWindow =itr.next();
driver.switchTo().window(defaultWindow);
driver.switchTo().window(Allwindows);

String url="";
driver.get(url);
driver.manage().window().maximize();
String defaultWindow =driver.getWindowHandle();
String AllWindows=driver.getwindowHandles();
Iterator <String> itr=AllWindows.iterator();
itr.next();
String ChildWindow =itr.next();
itr.next();
driver.switchTo().window(defaultWindow);
driver.switchTo().window(AllWindows);

//how do you handle alerts
Alert-interface
Alert alert =driver.switchTo().alert();
alert.accept();
alert.dismiss();

//how do you perform Actions
WebElement dp=driver.findElement(By.id(""));
Action act =new Action(driver);
act.MoveToElement(dp).perform(); //mouse hover
act.contextClick(dp).perform(); //rightclick
WebElement source =driver.findElement(By.id(""));
WebElement dest=driver.findElement(By.id(""));
act.dragAndDrop(source,dest).perform();
act.doubleClick().perform(); //doubleclick

//how do you handle frames:
you can switch to frame using by its  index,name and webElement
driver.switchTo().frame(0);
driver.switchTo().frame("Sushma");
driver.switchTo().frame("driver.findElement(By.id(""));"
driver.switchTo().defaultContent();

driver.switchTo().frame(0);
driver.switchTo().frame(frameName);
driver.switchTo().frame(driver.findElement(BY.id(""));
driver.switchTo().defaultContent();



how do you upload file in selenium:
driver.findElement(By.id("")).sendKeys("ss241\\download\\wave.jpg");


String ProjectPath = System.getProperty("user.dir");
driver.findElement(By.id("uploadFile")).sendKeys(projectPath+ "files\\waves.jpg");

TakesScreenshot:
	File Screenshot =((TakesScreenshot))driver).getScreenshot(OutputType.File);
FileUtils.copyFile(screenshot,newpath(".png"));

File screenshot =((TakesScreenshot)driver).getScreenshotAs(outputtype.File);
FileUtils.copyFile(screenshot,newpath("")),getScrrenshotAs(outputtype.File);
FileUtils.copyFile(screenshot,new path(".png"));

File scrrenshot =((Takesscreenshot)driver)



//implicit wait:
driver.manage().timeouts().implicitelyWait(10,TimeUnit.SECONDS);
Explicit wait:
	WebDriver wait =new Webdriver(driver,10);
wait.until(ExpectedConditions,visibilityofElementLocated(By.id(""));

//how to handle dropdowns in selenium:
by using select class
WebElement dropdown = driver.findElement(By.id(""));
Select sel=new Select(dropdown);
sel.SelectByIndex(0);
sel.selectByvisibleText("");

//Actions 
WebElement asyc =driver.findElement(By.id(""));
Action act =new Actions(driver);
act.moveToElement(asy).perform();
act.contextClick(asyc).perform();
act.doubleClick(asyc).perform();

WebElement sour =driver.findElement(By.id(""));
WebElement dest =driver.findElemenet(By.id(""));
act.dragAndDrop(sour,dest).perform();

//how handle browser windows or table
String defaultwindow=driver.getWindowHandle();
Set<String>AllWindows=driver.getWindowHandles();
Iterator<String>itr=Allwindows<Iterator>;
itr.next();
String childWindow=itr.next();
itr.next();
driver.switchTo().window(defaultWindow);
driver.switchTo().window(allWindows);


Alert-Interface
driver.findElement(By.xpath("")).click();
Alert Al=driver.switchTo().Alert();
Al.accept();
Al.dismiss();

//how do u handle frames;
driver.switchTo().frame(0);
driver.switchTo().frame("ByValue");
driver.switchTo().frame(By.id);
driver.switchTo().defaultContent();

//upload file
driver.findElement(By.id("")).sendKeys("")

//upload file in Selenium project
String path=System.getProperty("user.dir");
driver.findElement(By.id("").senDkeys(projectPath"src\\file\\wave.jpg"))

//TakesScreenshot
File screenshot=((TakesScreeenshot)driver).getScreenshotAs(outputType.FILE);
File utils=copyFile(screenshot,newPath(".png"));
Fileutils.copyFile(src).newPath(".png")

//
public class reverse{
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.chrome, "c://...chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		String url="";
		driver.get(url);
		driver.manage().window().maximize();
		
		//iMPLICIT WAIT:
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Explicitely WAit:
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.waitUntil(ExpectedCondition.visibilityofElement(LocatedBy.xpath(""));
		
		//dropdowns
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select sel=new Select(dropdown);
		sel.selectByIndex(0)
		sel.selectByValue("");
		sel.deselectByVisibleText("")
		
		
		//how do u handle window
		String url="";
		driver.get(url);
		String defaultWindow=driver.getWindowHandle();
		Set<String> AllWindows =driver.getWindowHandles();
		Iterator<String> itr=Allwindows.Iterator;
		itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(defaultWindow);
		
		//aLERTS
		Alert al=driver.switchTo().alerts();
		al.accept();
	    al.sendKeys();
		al.dismiss();
		
		//Actions
		Actions act =new Actions(driver);
		WebElement ash=driver.findElement(By.xpath(childWindow));
		act.moveToElement(ash).perform();//hover
		act.contextClick(ash).perform();//right click
		act.dragAndDro(souyr,dest).perform();//drag and drip
		act.doubleClick(ash).perform();
		
		WebElement innerframe=dr;
		driver.switchTo().frame();
		driver.switchTo().deafultCONTENT();
		
		//UPLOAD FILE:
		driver.findElement(By.xpath("UPLOADfILE")).SENDkEYS("LOCN OF FILE.JPG")
		
		IN ECLIPSE:
			String projectPath=driver.getProperty("user.dir");
		driver.findElement(by.xpath("").sendKeys(projectPath+ "src\\test\\img.png"));
		
		
		//sCREENSHOT:
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
			FileUtils.copyFile(src).newFile(".png"); or File Handler
			File src=((TakesScreenshot)driver).getScreenshotAs(outputtype.File)
			FileUtils.copyFile(src).newFile(".png")
			
			//JavaScriptExecutor
			JaVAsCRIPTeXECUTOR JS1=(JavaScriptExecutor)driver
			WebElement txtScroll=driver.findElement(By.xpath(""));
			js1.executeScript("arguments[0].scrollIntoView(true)",txtscroll)
			
			public class StringContainsVowels{
				public static void main(String []args) {
					System.out.println(stringContainsVowels("HELLO"));
					System.out.println(stringContainsVowels("HELLO"));
				}
				public static boolean stringContains(String input) {
					return input.toLowerCase().matches(".*[aeiou].*");
				}
			}
}





//implicit wait
	driver.manage().timeouts().implicitelyWait(20,TimeUnit.SECONDS);
	
	//Exp
	WebDriverWait wait =new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.waitUntilVisibilityofElement(LocatedBy.xpath(""));
	
	//maximize
	driver.manage().window().maximize();
	
	//DropDOwn:
	WebElement dropdown=driver.findElement(By.xpath(""));
	Select sel=new Select(dropdown);
	sel.selectByIndex();
	sel.selectByVisibleText("");
	sel.selectByValue("");
	
	//Switching b/w tabs
	String defaultWindow = driver.getWindowHandle();
	Set<String> AllWindows=driver.getWindowHandles();
	Iterator<String> itr =Allwindows.Iterator();
	itr.next();
	StringchildWindows = itr.next();
	driver.switchTo().window(deafultWindow);
	driver.switchTo().window(AllWindows);
	
	//Alerts
	Alert al =driver.switchTo().alerts();
	al.accepts();
	al.dismiss();
	
	
	//Actions
	Action act=new Action(driver);
	WebElement ash =driver.findElement(By.xpath(""));
	act.moveToElement(ash).perform();//mousehover
	act.contextClick(ash).perform();//rightclick
	act.doubleClick(ash).perform();//doubleclick
	act.dragAndDrp(sour,dest).perform(); //dragAndDrop
	
	
	//upload file
	driver.findElement(By.xpath("")).sendKeys("");
	
	String projectPath =driver.getProperty("user.dir");
	driver.findElement(By.xpath("")).sendKeys(projectPath+ ".jpg");
	
	//frames
	WebElement innerframe =driver.findElement("");
	driver.switchTo.frame(innerframe);
	driver.switchTo().defaultContent();
	
	//TakesScreenshot
	File src=((TakesScreenshot)driver).getScreenshotAs(outputtype.File);
	FileUtils.copyFile(src).newFile(".jpg");
	File dest ="c:ss\\".jpg
    Files.copy(src,dest);
	Syso("taken Screenshot")
	
	//Visibility of Element
	WebELement abutbtn=driver.findElement(By.xpath(""));
	boolean displayed =abtbtn.isDisplayed();
	System.out.println(displayed);
	boolean enabled =abtbtn.isEnabled();
	System.out.println(enabled1);
	boolean selected=abtbtn.isSelected();
	System.out.println(selected);
	
	//scrollIntoview:
	WebElement txtscroll=driver.findElement(By.id(""));
	JavascriptExecutor js =(JavaScriptExecutor)driver;
	js.executeScript("arguments[0].scrollInoView(true)", txtscroll);
	
	
//how can we send the text without using sendkeys:
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.getElementByid('login').value=Text nll");
    
    //Explain how you will login into site if it is showing any authentication popoup for username nd password:
    WebDriver wait =new WebDriver(driver,10);
    Alert al=wait.until(ExpectedConditions.alertIsPresent());
    alert.authenticateusing(newUser nd password("username","pswd"));
    
    
    //explain how you can find broken links in page by using selenium webdriver
    wwl
    
    
    


System.setProperty("webdriver.chrome.driver", "locn of chromedriver");
    String url="";
    driver.get(url);
    driver.manage().window().maximize();
    //implicit wait
    driver.manage().timeouts().implicitelyWait(TimeUnit.SECONDS);
    
    WebDriver Wait=new WebDriverWait(driver,10);
    wait.waitUntile(ExpectedCondition.visibility of ElementLocated(by.id(""));
    
    //dropdowns:
    WebElement dropdown=driver.findElement(By.id(""));
    Select sel=new Select(dropdown);
    sel.selectByIndex(0);
    sel.selectByVisibleText("s");
    sel.selectByValue("");
    
    //windows
    String parentwindow=driver.getWindowHandle();
    Set<String>Allwindows=driver.getWindowHandles();
    Iterator<String>itr=AllWindows.Iterator();
    itr.next();
    childWindow ch=itr.next();
    driver.switchTo.window(parentWindow);
    driver.switchTo.window(ChildWindow);
    
    //alerts
    org.openqa.selenium.Alert al=driver.switchTo().alerts();
    al.accept();
    al.dismiss();
    al.getText();
    al.sendKeys(parentwindow);
    
    //Actions:
    Actions act =new ACtions(driver);
    WebElement ash =driver.findElement(By.id(""));
    act.moveToElement(Ash).perform();//hover
    //double click act.doubleClick(ash).perform();
    right click
    act.contextClick(ash).perform();upf
    
    //upload file
    WebElement upf=driver.findElement(By.id(""));
    upfs.sendKeys("");
    
    or
    String projectPath=driver.getProperty("user.dir");
    projectpath.sendkeys(projectpath+ ".jpg");
    
    
    //screenshot:
    File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.File);
    FileUtiles.copyFile(screeenshot,newFile(".png"));
    
    driver.switchTo().frame(mainFRame);
    driver.switchTo().defaultContent();
    
    WebElement abt =driver.find
    		Boolean displayed=abt.isDisplayed();
    
    















