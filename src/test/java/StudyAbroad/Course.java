package StudyAbroad;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
		 Thread.sleep(2000);
			
		 Menu mn=new Menu(driver);
		 log.info("Clicking on Setup");
		 mn.getSetup().click();
		 Thread.sleep(2000);
		 mn.getAcademic().click();
		 Thread.sleep(2000);
	     CoursePage cp=new CoursePage(driver);
	     cp.getCourseLink().click();
	     Thread.sleep(2000);
	}
	@Test(priority = 1, enabled=true)	
		public void CreateCourse() throws IOException, InterruptedException
	   {
       CoursePage cp=new CoursePage(driver);
       cp.getCourseNew().click();
       Thread.sleep(2000);
       Select s=new Select(cp.getSelectedudropdown());
       s.selectByValue("1");
       Thread.sleep(2000);
       cp.getEnteringCourseName().sendKeys("Testing1");
       Thread.sleep(2000);
       cp.getProficiency().click();
       Thread.sleep(2000);
       cp.getClickoncourse().click();
       Thread.sleep(2000);
//       
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