package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CoursePage;
import pageObjects.Menu;
import pageObjects.SpecializationComponentPage;
import resources.base;

public class specializationcomponent extends base{
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
		    Thread.sleep(1000);
		    mn.getAcademic().click();
		    Thread.sleep(1000);
	       SpecializationComponentPage spc=new SpecializationComponentPage(driver);
	       
	       spc.getSpecializationComponentLink().click();
	       Thread.sleep(1000);
        }
	
	@Test(priority = 1, enabled=true)
		public void Createspecializationcomponent() throws IOException, InterruptedException
		{
       SpecializationComponentPage spc=new SpecializationComponentPage(driver);
       spc.getNewSpecializationComponent().click();
       Thread.sleep(1000);
       spc.getSpecComponentedudropdown().click();
       Thread.sleep(1000);
       spc.getSpecComponenteduselect().click();
       Thread.sleep(1000);
       spc.getSpecComponentcoursedropdown().click();
       Thread.sleep(1000);
       spc.getSpecComponentcourseselect().click();
       Thread.sleep(1000);
       spc.getSpecComponentSpecidropdown().click();
       Thread.sleep(1000);
       spc.getSpecComponentSpeciselect().click();
       Thread.sleep(1000);
       spc.getEnteringSpecializationComponentName().sendKeys("Reading");
       Thread.sleep(1000);
       spc.getCreateSpecializationcomponent().click();
       Thread.sleep(2000);
       
}
	
	@Test(priority = 2, enabled=true)
	public void Editspecializationcomponent() throws InterruptedException
	{
   SpecializationComponentPage spc=new SpecializationComponentPage(driver);
   spc.getEditSpecializationComponent().click();
   Thread.sleep(1000);
   spc.getEditingSpecializationComponentName().clear();
   Thread.sleep(1000);
   spc.getEditingSpecializationComponentName().sendKeys("Listening");
   Thread.sleep(1000);
   spc.getSpecializationcomponentUpdateButton().click();
   Thread.sleep(1000);
   
   }
	
	@Test(priority=3, enabled=true)
	public void Deletespecializationcomponent() throws InterruptedException
	{
		SpecializationComponentPage spc=new SpecializationComponentPage(driver);
		spc.getDeleteSpecializationcomponent().click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
//	@AfterTest
//	public void teardown()
//	{
//		
//		driver.close();
//		driver=null;
//		
//	}
}