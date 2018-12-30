package StudyAbroad;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.BranchPage;
import pageObjects.Menu;
import resources.base;

public class Branch extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 public BranchPage Bp;
	
	 @BeforeTest
	 public void initialize() throws IOException, InterruptedException
	 {

	 	 driver =initilizeDriver();
	 	 log.info("Driver is initialized");
	 	 driver.get(prop.getProperty("url"));
	 	 log.info("Navigated to validateEducation page");
	 	longinTest();
		log.info("LoggedIn successfully");
		Thread.sleep(1000);
		Menu mn=new Menu(driver);
		mn.getOffice().click();
	    Thread.sleep(1000);
	    BranchPage Bp=new BranchPage(driver);
	    Bp.getBranchLink().click();
	    Thread.sleep(1000);
	 }
	 
	 
	 @Test(priority = 1, enabled=true)
		public void CreateBranch() throws IOException, InterruptedException
		{
	    
	    Bp=new BranchPage(driver);
	    Bp.getBranchNew().click();
	    Thread.sleep(1000);
	    Bp.getBranchphotoupload().sendKeys("E:\\Santamonica\\Images\\SM-Kannur.jpg");
	    Thread.sleep(1000);
	    Bp.getBranchName().sendKeys("Kannur");
	    Thread.sleep(1000);
	    Bp.getBranchtypedropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchtypeselect().click();
	    Thread.sleep(1000);
	    Bp.getBranchCode().sendKeys("KAN");
	    Thread.sleep(1000);
	    Bp.getBranchActive().click();
	    Thread.sleep(1000);
	    Bp.getBranchdescription().sendKeys("With organizations on the lookout for people with top notch qualifications and skills to lead and operate in the globalised market.");
	    Thread.sleep(1000);
	    Bp.getBranchcurrencydropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchCurrencyselect().click();
	    Thread.sleep(1000);
	    Bp.getBranchstartdate().click();
	    List<WebElement> dates=driver.findElements(By.className("dtp-select-day"));
	    int count =driver.findElements(By.className("dtp-select-day")).size();

	    for(int i=0;i<count;i++)
	    {
	    String text=driver.findElements(By.className("dtp-select-day")).get(i).getText();
	    if(text.equalsIgnoreCase("01"))
	    {
	    driver.findElements(By.className("dtp-select-day")).get(i).click();
	    Thread.sleep(1000);
	    Bp.getBranchdateok().click();
	    Thread.sleep(1000);
	    break;
	    }}
	    Bp.getBranchAddress().sendKeys("1st Floor Vichithra complex, Caltex Jn");
	    Thread.sleep(1000);
	    Bp.getBranchAddressdropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchAddressSelect().click();
	    Thread.sleep(1000);
	    Bp.getBranchCountrydropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchCountrySelect().click();
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(1000);
	    Bp.getBranchStatedropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchStateSelect().click();
	    Thread.sleep(1000);
	    Bp.getBranchDistrictdropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchDistrictSelect().click();
	    Thread.sleep(1000);
	    Bp.getBranchcitydropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchcityselect().click();
	    Thread.sleep(1000);
	    Bp.getBranchLandmark().sendKeys("Opp.NS Theatre");
	    Thread.sleep(1000);
	    Bp.getBranchpostoffice().sendKeys("Kannur");
	    Thread.sleep(1000);
	    Bp.getBranchPincode().sendKeys("670001");
	    Thread.sleep(1000);
	    Bp.getBranchLatitude().sendKeys("11.8710993");
	    Thread.sleep(1000);
	    Bp.getBranchLogitutude().sendKeys("75.3675562");
	    Thread.sleep(1000);
	    Bp.getBranchTimezoneDropdown().click();
	    Thread.sleep(1000);
	    Bp.getBranchTimezoneselect().click();
	    Thread.sleep(1000);
	    Bp.getBranchcreate().click();
	    Thread.sleep(1000);
	      
}
	 @Test(priority = 2, enabled=true)
	 public void EditBranch() throws InterruptedException {
		 Bp=new BranchPage(driver);
		 Bp.getEditBranch().click();
		 Thread.sleep(1000);
		 Bp.getEditActiveBranch().click();
		 Thread.sleep(1000);
		 Bp.getEditBranchEndDate().click();
		 List<WebElement> dates=driver.findElements(By.className("dtp-select-day"));
		    int count =driver.findElements(By.className("dtp-select-day")).size();

		    for(int i=0;i<count;i++)
		    {
		    String text=driver.findElements(By.className("dtp-select-day")).get(i).getText();
		    if(text.equalsIgnoreCase("20"))
		    {
		    driver.findElements(By.className("dtp-select-day")).get(i).click();
		    Thread.sleep(1000);
		    Bp.getBranchdateok().click();
		    Thread.sleep(1000);
		    break;
		    }}
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(1000);
		    Bp.getUpdateBranch().click();
		    Thread.sleep(1000);
	 }
	 
	 
	 @Test(priority = 3, enabled=true)
	 public void ViewBranch() throws InterruptedException {
		 Bp=new BranchPage(driver);
		   Bp.getBranchview().click(); 
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(1000);
		  Bp.getBranchbreadcrumb().click();
		  Thread.sleep(1000);
	 }
	 
	 
	 
	 @Test(priority=4,enabled=true)
	 public void CreateBranchPhonenumber() throws InterruptedException {
	 Bp=new BranchPage(driver);	 
	 Bp.getBranchphoneno().click();
	 Thread.sleep(1000);
	 Bp.getBranchphonenotype().click();
	 Thread.sleep(1000);
	 Bp.getBranchselectphonenotype().click();
	 Thread.sleep(1000);
	 Bp.getBranchEnteringphoneno().sendKeys("9496768227");
	 Thread.sleep(1000);
	 Bp.getBranchCreatephoneno().click();
	 Thread.sleep(1000);
	 Bp.getBranchclosephoneno().click();
	 Thread.sleep(1000);
	 }
	 
	 @Test(priority=5,enabled=true)
	 public void EditBranchPhonenumber() throws InterruptedException {
	 Bp=new BranchPage(driver);	 
	 Bp.getBranchphoneno().click();
	 Thread.sleep(1000);
	 Bp.getBrancheditphoneno().click();
	 Thread.sleep(1000);
	 Bp.getBrancheditphonenotype().click();
	 Thread.sleep(1000);
	 Bp.getBrancheditselectphonenotype().click();
	 Thread.sleep(1000);
	 Bp.getBrancheditenteredphoneno().clear();
	 Thread.sleep(1000);
	 Bp.getBrancheditenteredphoneno().sendKeys("9442967480");
	 Thread.sleep(1000);
	 Bp.getBranchupdatephoneno().click();
	 Thread.sleep(1000);
	 Bp.getBranchclosephoneno().click();
	 Thread.sleep(1000);

	 }
	 
	 @Test(priority=6,enabled=true)
	 public void DeleteBranchPhonenumber() throws InterruptedException {
	 Bp=new BranchPage(driver);	 
	 Bp.getBranchphoneno().click();
	 Thread.sleep(1000);
	 Bp.getBranchdeletephoneno().click();
	 driver.switchTo().alert().accept();
	 Thread.sleep(1000);
	 Bp.getBranchclosephoneno().click();
	 Thread.sleep(1000);
	 }
	 
	 @Test(priority=7,enabled=true)
	 public void CreateBranchEmailId() throws InterruptedException {
	 Bp=new BranchPage(driver); 
	 Bp.getBranchEmailId().click();
	 Thread.sleep(1000);
	 Bp.getBranchemailtype().click();
	 Thread.sleep(1000);
	 Bp.getBranchemailselecttype().click();
	 Thread.sleep(1000);
	 Bp.getBranchenteremailid().sendKeys("aswathynp25@gmail.com");
	 Thread.sleep(1000);
	 Bp.getBranchCreateemail().click();
	 Thread.sleep(1000);
	 Bp.getBranchcloseemail().click();
	 Thread.sleep(1000);
	 }
	 
@Test(priority=8,enabled=true)
public void EditBranchEmailId() throws InterruptedException {
	Bp.getBrancheditEmailId().click();
	Thread.sleep(1000);
	Bp.getBranchclickemailId().click();
	Thread.sleep(1000);
	Bp.getBrancheditemailtype().click();
	Thread.sleep(1000);
	Bp.getBrancheditemailselecttype().click();
	Thread.sleep(1000);
	Bp.getBranchupdateemailid().clear();
	Thread.sleep(1000);
	Bp.getBranchupdateemailid().sendKeys("aswathy04@gmail.com");
	Thread.sleep(1000);
	Bp.getBranchclickupdateemail().click();
	Thread.sleep(1000);
	Bp.getBrancheditcloseemail().click();
	Thread.sleep(1000);	
} 

@Test(priority=9,enabled=true)
public void DeleteBranchEmailId() throws InterruptedException {
Bp=new BranchPage(driver);	 
Bp.getBrancheditEmailId().click();
Thread.sleep(1000);
Bp.getBranchDeleteemailId().click();
driver.switchTo().alert().accept();
Thread.sleep(1000);
Bp.getBrancheditcloseemail().click();
Thread.sleep(1000);
}
	 
	 @Test(priority=10,enabled=true)
	 public void DeleteBranch() throws InterruptedException {
	 Bp=new BranchPage(driver); 
	 Bp.getBranchDelete().click();
	 driver.switchTo().alert().accept();
	 Thread.sleep(5000);
	 }
	 
	 @Test(priority=11,enabled=true)
	 public void AssignBranchIncharge() throws InterruptedException {
		 Bp=new BranchPage(driver);
		 Bp.getBranchIncharge().click();
		 Thread.sleep(1000);
		 Bp.getBranchinchargedropdown().click();
		 Thread.sleep(1000);
		 Bp.getBranchselectincharge().click();
		 Thread.sleep(1000);
		 Bp.getBranchAssignincharge().click();
		 Thread.sleep(1000); 
	 }
	 
	 @Test(priority=12,enabled=true)
	 public void DeleteBranchIncharge() throws InterruptedException {
		 Bp=new BranchPage(driver);
		 Bp.getDeleteBranchIncharge().click();
		 Thread.sleep(1000);
		 }
	 
	 @AfterTest
	 public void teardown()
	 {
	 	
	 	driver.close();
	 	driver=null;
	 	
	 }
	 }
