package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initilizeDriver() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream("E:\\Santamonica\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	//execute in chrome driver
	
	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aswathy\\Downloads\\Znew\\chromedriver.exe");
		driver= new ChromeDriver();
			
		
	}
	//execute in firefox code
	else if (browserName.equals("firefox"))
	{
		 driver= new FirefoxDriver();
		
	}
	
	else if (browserName.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\Aswathy\\Downloads\\Znew\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	}
	

	
	
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	return driver;


	}
	
	public void longinTest() throws InterruptedException {
		LandingPage l=new LandingPage(driver);
		//l.getprofilepic().click();
		Thread.sleep(2000);
	    l.getSignin().click();
	    Thread.sleep(2000);
	   	LoginPage lp=new LoginPage(driver);
	    lp.getusername().sendKeys("admin@sm.in");
	    lp.getpassword().sendKeys("sm1234");
	    lp.getlogin().click();
	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Santamonica\\src\\main\\java\\resources\\screenshot\\test\\"+result+"screenshot.png"));
		
	}
	
	}

