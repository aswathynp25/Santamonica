package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validatetitle extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{

	 driver =initilizeDriver();
	 log.info("Driver is initialized");
	 driver.get(prop.getProperty("url"));
	 log.info("Navigated to validateTitle page");
}
@Test
	
	public void validateAppTitle() throws IOException
	{
	
		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.gettitle().getText(), "Meet University / Institutions Officials");
		 log.info("Successfully validated Text message");
		 log.info("Test Completed");
}
@AfterTest
public void teardown()
{
	
	driver.close();
	driver=null;
	
}
}
