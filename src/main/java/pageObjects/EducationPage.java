package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class EducationPage extends base  {
public WebDriver driver;

//creating the Education

	By Education=By.xpath("//a[@id='link-education']");
	By EducationNew=By.xpath("//a[@id='education_new']");
	By Educationtxt1=By.xpath("//input[@id='education_1']");
	By Educationprof1=By.xpath("//div[@id='1_div']/div[2]/div/div/label/span");
	By Educationadd1=By.xpath("//a[@id='create_education']");
	By Educationtxt2=By.xpath("//input[@id='education_2']");
	By Educationadd2=By.xpath("//div/a[@id='create_education']");
	By Educationdelete3=By.xpath("//a[@id='3']");
	By Clickcreateeducation=By.xpath("//button[@id='education_create']");
	By EduCreatedSuccessfulmsg=By.xpath("//h2[contains(.,'Education created successfully')]");
	
	//Editing the Education
	
	By Editeducation=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'testing1')]/td[3]/a[1]");
	By EditEduName=By.xpath("//input[@id='education_name']");
	By Clickupdateedu=By.xpath("//button[@id='education_update']");
	By EdueditedSuccessfulmsg=By.xpath("//h2[contains(.,'Education updated successfully')]");
	
	//Deleting the Education
	
	By Clickdeleteedu=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'AAAAA')]/td[3]/a[2]");
	By EdudeletedSuccessfulmsg=By.xpath("//h2[contains(.,'Education deleted successfully')]");
	

	public EducationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getEducation() {
		return driver.findElement(Education);
	}
	
	public WebElement getnewEducation() {
		return driver.findElement(EducationNew);
	}
	
	public WebElement getEducationtxt1() {
		return driver.findElement(Educationtxt1);
	}
	
	public WebElement getEducationprof1() {
		return driver.findElement(Educationprof1);
	}
	
	public WebElement getEducationadd1() {
		return driver.findElement(Educationadd1);
	}
	
	public WebElement getEducationtxt2() {
		return driver.findElement(Educationtxt2);
	}
	
	public WebElement getEducationadd2() {
		return driver.findElement(Educationadd2);
	}
	
	public WebElement getEducationdelete3() {
		return driver.findElement(Educationdelete3);
	}
	
	public WebElement getClickcreateeducation() {
		return driver.findElement(Clickcreateeducation);
	}
	
	public WebElement getEduCreatedSuccessfulmg() {
		return driver.findElement(EduCreatedSuccessfulmsg);
	}	
	
	
	
	public WebElement getEditEducation() {
		return driver.findElement(Editeducation);
	}
	public WebElement getEditEduName() {
		return driver.findElement(EditEduName);
	}
	public WebElement getClickupdateedu() {
	return driver.findElement(Clickupdateedu);}
	
	public WebElement getEdueditedSuccessfulmsg() {
		return driver.findElement(EdueditedSuccessfulmsg);
	}
	
	public WebElement getClickdeleteedu() {
		return driver.findElement(Clickdeleteedu);
	
}
	public WebElement getEdudeletedSuccessfulmsg() {
		return driver.findElement(EdudeletedSuccessfulmsg);
	}
}
	
