package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class EducationPage extends base  {
public WebDriver driver;
	By Education=By.linkText("Education");
	By EducationNew=By.id("education_new");
	By Educationtxt1=By.id("education_name_1");
	By Educationprof1=By.xpath("//div[@id='add_education_scroll']/div/div/div/div/div[1]/div/div[2]/div/div/label/span");
	By Educationadd1=By.id("button_1" );
	By Educationtxt2=By.id("education_2");
	By Educationadd2=By.id("button_2");
	By Educationtxt3=By.id("education_3");
	By Clickcreateeducation=By.id("education_create");
	By EduCreatedSuccessfulmsg=By.xpath("//h2[contains(.,'Education created successfully')]");
	
	
	
	By Editeducation=By.xpath("//table[@id='DataTables_Table_0']//tr[contains(., 'Testing 1')]/td[3]/a[1]");
	By EditEduName=By.id("education_name");
	By Clickupdateedu=By.id("education_update");
	By EdueditedSuccessfulmsg=By.xpath("//h2[contains(.,'Education updated successfully')]");
	
	
	By Clickdeleteedu=By.xpath("//table[@id='DataTables_Table_0']//tr[contains(., 'Testing 2')]/td[3]/a[2]");
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
	
	public WebElement getEducationtxt3() {
		return driver.findElement(Educationtxt3);
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
	
