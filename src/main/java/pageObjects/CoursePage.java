package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class CoursePage {
public WebDriver driver;
	//creating the course

	By CourseLink=By.xpath("//a[@id='link-course']");
	By NewCourse=By.xpath("//a[@id='course_new']");
	By Selectedudropdown1=By.xpath("//span[@id='select2-course_education1-container']");
	By Selectedu1=By.xpath("//li[contains(.,'Bachelor')]");
	By EnteringCourseName1=By.xpath("//input[@id='course_1']");
	By CourseAdd1=By.xpath("//a[@id='create_course']");
	By Selectedudropdown2=By.xpath("//span[@id='select2-course_education2-container']");
	By Selectedu2=By.xpath("//li[contains(.,'Masters')]");
	By EnteringCourseName2=By.xpath("//input[@id='course_2']");		
	By CourseAdd2=By.xpath("//a[@id='create_course']");
	By CourseNewDelete3=By.xpath("//a[@id='3']");
	By CourseCreateButton=By.xpath("//button[@id='course_create']");		
			
	By Coursecreatedsuccessmsg=By.xpath("//h2[contains(.,'Course created successfully')]");
	
	
	//Editing the course
	By CourseClickedit=By.xpath("//table[@id='DataTables_Table_0']//tr[contains(., 'Testing1')]/td[4]/a[1]");
	By Courseupdatedsuccessmsg=By.xpath("//h2[contains(.,'Course updated successfully')]");
	
	
	//Deleting the course
	By CourseClickdelete=By.xpath("//table[@id='DataTables_Table_0']//tr[contains(., 'Testing1')]/td[4]/a[2]");
	By Coursedeletededsuccessmsg=By.xpath("//h2[contains(.,'Course deleted successfully')]");

	
	
	public CoursePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getCourseLink()
	{
		return driver.findElement(CourseLink);
	}

	public WebElement getCourseNew() {
		return driver.findElement(NewCourse);
	}
	
	public WebElement getSelectedudropdown1() {
		return driver.findElement(Selectedudropdown1);
	}
	
	public WebElement getSelectedu1() {
		return driver.findElement(Selectedu1);
	}
	
	public WebElement getEnteringCourseName1() {
		return driver.findElement(EnteringCourseName1);
	}
	
	public WebElement getCourseAdd1() {
		return driver.findElement(CourseAdd1);
	}
	public WebElement getSelectedudropdown2() {
		return driver.findElement(Selectedudropdown2);
	}
	public WebElement getSelectedu2() {
		return driver.findElement(Selectedu2);
	}
	public WebElement getEnteringCourseName2() {
		return driver.findElement(EnteringCourseName2);
	}
	public WebElement getCourseAdd2() {
		return driver.findElement(CourseAdd2);
	}
	public WebElement getCourseNewDelete3() {
		return driver.findElement(CourseNewDelete3);
	}
	public WebElement getCourseCreateButton() {
		return driver.findElement(CourseCreateButton);
	}
	
	public WebElement getCoursecreatedsuccessmsg() {
		return driver.findElement(Coursecreatedsuccessmsg);
	}
	
	//Editing the education
	public WebElement getCourseClickedit() {
		return driver.findElement(CourseClickedit);
	}
	
	public WebElement getCourseupdatedsuccessmsg() {
		return driver.findElement(Courseupdatedsuccessmsg);
	}
	
	//Deleting the education
	
	public WebElement getCourseClickdelete() {
		return driver.findElement(CourseClickdelete);
	}
	
	public WebElement getCoursedeletededsuccessmsg() {
		return driver.findElement(Coursedeletededsuccessmsg);
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
}

