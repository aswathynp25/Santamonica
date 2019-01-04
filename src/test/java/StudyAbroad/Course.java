package StudyAbroad;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CoursePage;
import pageObjects.Menu;
import resources.base;

public class Course extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{

		 driver =initilizeDriver();
		 log.info("Driver is initialized");
		 driver.get(prop.getProperty("url"));
		 log.info("Navigated to validateEducation page");
		 longinTest();
		 log.info("LoggedIn successfully");
		 Thread.sleep(5000);
			
		 Menu mn=new Menu(driver);
		 log.info("Clicking on Setup");
		 mn.getSetup().click();
		 Thread.sleep(500);
		 mn.getAcademic().click();
		 Thread.sleep(500);
	     CoursePage cp=new CoursePage(driver);
	     cp.getCourseLink().click();
	     Thread.sleep(500);
	}
	@Test(priority = 1, enabled=true)	
		public void CreateCourse() throws IOException, InterruptedException
	   {
       CoursePage cp=new CoursePage(driver);
       cp.getCourseNew().click();
       Thread.sleep(500);
       cp.getSelectedudropdown1().click();
       Thread.sleep(500);
       cp.getSelectedu1().click();
       Thread.sleep(500);
       cp.getEnteringCourseName1().sendKeys("Hotel Management");
       Thread.sleep(500);
       cp.getCourseAdd1().click();
       Thread.sleep(500);
       cp.getSelectedudropdown2().click();
       Thread.sleep(500);
       cp.getSelectedu2().click();
       Thread.sleep(500);
       cp.getEnteringCourseName2().sendKeys("Architecture");
       Thread.sleep(500);
       WebElement element=driver.findElement(By.xpath("//a[@id='create_course']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    	Thread.sleep(3000);
       cp.getCourseNewDelete3().click();
       Thread.sleep(100);
       cp.getCourseCreateButton().click();
       Thread.sleep(500);
       
       
       
       
       
       
       
//     ................................................................................................................  
//       WebElement msg1=cp.getCoursecreatedsuccessmsg();
//	   String text1=msg1.getText();
//	    System.out.println(text1);
//	String expectedText1 = "CreateCourse";
//    assertEquals(text1,expectedText1);
//    log.info("Course created Successfully , toaster message is shown");
//	Thread.sleep(2000);	 
}
//	@Test(priority=2,enabled=true)
//	public void updateCourse() throws InterruptedException {
//		CoursePage cp=new CoursePage(driver);
//		cp.getCourseClickedit().click();
//		Thread.sleep(2000);
//		cp.getSelectedudropdown().click();
//		Thread.sleep(2000);
	//}
	
}