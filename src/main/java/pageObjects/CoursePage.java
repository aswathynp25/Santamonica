package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class CoursePage {
public WebDriver driver;
	
	By CourseLink=By.id("link-course");
	By NewCourse=By.id("course_new");
	By Selectedudropdown=By.id("course_education_id");
	By EnteringCourseName=By.id("course_name");
	By Proficiency=By.xpath("//span[@class='switch']/label[1]/span");
	By Clickoncourse=By.id("course_create");
	By Coursecreatedsuccessmsg=By.xpath("//h2[contains(.,'Course deleted successfully')]");
	
	By CourseClickedit=By.xpath("//table[@id='DataTables_Table_0']//tr[contains(., 'Testing1')]/td[4]/a[1]");
	By Courseupdatedsuccessmsg=By.xpath("//h2[contains(.,'Course updated successfully')]");
	
	
	
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
	
	public WebElement getSelectedudropdown() {
		return driver.findElement(Selectedudropdown);
	}
	
	public WebElement getEnteringCourseName() {
		return driver.findElement(EnteringCourseName);
	}
	public WebElement getProficiency() {
		return driver.findElement(Proficiency);
	}
	
	public WebElement getClickoncourse() {
		return driver.findElement(Clickoncourse);
	}
	
	public WebElement getCoursecreatedsuccessmsg() {
		return driver.findElement(Coursecreatedsuccessmsg);
	}
	public WebElement getCourseClickedit() {
		return driver.findElement(CourseClickedit);
	}
	
	public WebElement getCourseupdatedsuccessmsg() {
		return driver.findElement(Courseupdatedsuccessmsg);
	}
	
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

