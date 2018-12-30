package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Menu;
import pageObjects.SpecializationPage;
import resources.base;

public class Specialization extends base{
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
	       SpecializationPage sp=new SpecializationPage(driver);
	       sp.getSpecializationLink().click();
	       Thread.sleep(2000);
	}
	@Test(priority = 1, enabled=true)	
		public void CreateSpecialization() throws IOException, InterruptedException
		{
       SpecializationPage sp=new SpecializationPage(driver);
       sp.getSpecializationNew().click();
       Thread.sleep(2000);
       sp.getSpecializationedudropdown().click();
       Thread.sleep(2000);
       sp.getSpecializationeduselect().click();
       Thread.sleep(2000);
       
       sp.getSpecializationcoursedropdown().click();
       Thread.sleep(2000);
       sp.getSpecializationcourseselect().click();
       Thread.sleep(2000);
       
       sp.getEnteringSpecializationName().sendKeys("Automobile Engineering");
       Thread.sleep(2000);
       
       sp.getSpecValidfrom().click();
       Thread.sleep(2000);
       sp.getSpecValidfromselect().click();
       Thread.sleep(2000);
       
       sp.getSpeciValidityMonths().sendKeys("48");
       Thread.sleep(2000);
       
       sp.getSpeciCalculationtype().click();
       Thread.sleep(2000);
       sp.getSpeciCalculationtypeselect().click();
       Thread.sleep(2000);
       
       sp.getSpecResulttype().click();
       Thread.sleep(2000);
       
       sp.getSpecResulttypeSelect().click();
       Thread.sleep(2000);
       
       sp.getClickCreateSpecialization().click();
       Thread.sleep(2000);
       
}
	@Test(priority=2,enabled=true)
	public void EditSpecialization() throws InterruptedException {
		SpecializationPage sp=new SpecializationPage(driver);	
		sp.getEditSpecialization().click();
		Thread.sleep(2000);
		sp.getEditSpecializationName().clear();
		Thread.sleep(2000);
		sp.getEditSpecializationName().sendKeys("Aeronautical Engineering");
		Thread.sleep(2000);
		sp.getUpdateSpecialization().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3,enabled=true)
	public void DeleteSpecialzation() throws InterruptedException {
		SpecializationPage sp=new SpecializationPage(driver);	
		sp.getDeleteSpecialization().click();	
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	}
